import java.util.Properties;
import javax.xml.namespace.QName;

import org.apache.neethi.All;
import org.apache.neethi.ExactlyOne;
import org.apache.neethi.Policy;
import org.apache.rampart.policy.model.CryptoConfig;
import org.apache.rampart.policy.model.RampartConfig;
import org.apache.ws.secpolicy.WSSPolicyException;
import org.apache.ws.secpolicy.model.*;

public class PolicyCreator {

    private final String certPath;
    private final String certPass;
    private final String certUser;
    private final String pwCbClass;

    public PolicyCreator() {
        certPath = "/home/rmalyona/cert/mobichord.jks";
        certPass = "mobichord";
        certUser = "mobichord";
        pwCbClass = "PWCBHandler";
    }

    public Policy createPolicy() throws WSSPolicyException {
        Policy policy = new Policy(null, "http://schemas.xmlsoap.org/ws/2004/09/policy");
        policy.addAttribute(new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0"
            + ".xsd", "Id"), "SigOnly");

        All all = new All();
        all.getPolicyComponents().add(createAsymmetricBinding());
        all.getPolicyComponents().add(createWss10());
        all.getPolicyComponents().add(createSignedEncryptedParts());
        all.getPolicyComponents().add(createRampartConfig());

        ExactlyOne exactlyOne = new ExactlyOne();
        exactlyOne.addPolicyComponent(all);

        policy.addPolicyComponent(exactlyOne);

        return policy;
    }

    private AsymmetricBinding createAsymmetricBinding() throws WSSPolicyException {
        AsymmetricBinding binding = new AsymmetricBinding(1);
        InitiatorToken initiatorToken = new InitiatorToken(1);

        X509Token token = new X509Token(1);
        token.setRequireThumbprintReference(true);
        token.setTokenVersionAndType("WssX509V3Token10");

        initiatorToken.setInitiatorToken(token);
        binding.setInitiatorToken(initiatorToken);

        RecipientToken recipientToken = new RecipientToken(1);
        recipientToken.setReceipientToken(token);
        binding.setRecipientToken(recipientToken);

        AlgorithmSuite algorithmSuite = new AlgorithmSuite(1);
        algorithmSuite.setAlgorithmSuite("TripleDesRsa15");
        binding.setAlgorithmSuite(algorithmSuite);

        binding.setProtectionOrder("SignBeforeEncrypting");
        return binding;
    }

    private RampartConfig createRampartConfig() {
        RampartConfig rampartConfig = new RampartConfig();
        rampartConfig.setUser(certUser);
        rampartConfig.setEncryptionUser(certUser);
        rampartConfig.setPwCbClass(pwCbClass);

        CryptoConfig sigCrypto = new CryptoConfig();
        sigCrypto.setProvider("org.apache.ws.security.components.crypto.Merlin");

        Properties props = new Properties();
        props.setProperty("org.apache.ws.security.crypto.merlin.keystore.type", "JKS");
        props.setProperty("org.apache.ws.security.crypto.merlin.file", certPath);
        props.setProperty("org.apache.ws.security.crypto.merlin.keystore.password", certPass);

        sigCrypto.setProp(props);

        rampartConfig.setSigCryptoConfig(sigCrypto);
        return rampartConfig;
    }

    private Wss10 createWss10() {
        Wss10 wss10 = new Wss10(1);
        wss10.setMustSupportRefKeyIdentifier(true);
        wss10.setMustSupportRefIssuerSerial(true);
        return wss10;
    }

    private SignedEncryptedParts createSignedEncryptedParts() {
        SignedEncryptedParts part = new SignedEncryptedParts(true, 1);
        part.setBody(true);
        return part;
    }
}
