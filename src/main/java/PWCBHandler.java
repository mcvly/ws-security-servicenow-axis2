import java.io.IOException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

public class PWCBHandler implements CallbackHandler {

    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {

        for (Callback callback : callbacks) {
            // To use the private key to sign messages, we need to provide
            // the private key password
            WSPasswordCallback pwcb = (WSPasswordCallback) callback;
            if (pwcb.getIdentifier().equals("mobichord")) pwcb.setPassword("mobichord");
        }
    }

}