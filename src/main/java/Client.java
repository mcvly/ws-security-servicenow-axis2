import java.rmi.RemoteException;

import client.ServiceNow_u_import_set_test_importStub;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.HttpTransportProperties;


public class Client {

    public static void main(String[] args) throws Exception {

        ConfigurationContext ctx = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);

        ServiceNow_u_import_set_test_importStub stub = new ServiceNow_u_import_set_test_importStub(ctx);

        // configure and engage Rampart
        ServiceClient client = stub._getServiceClient();
        client.engageModule("rampart");

        auth(client);

        client.getAxisService().getPolicySubject().attachPolicy(new PolicyCreator().createPolicy());

        ServiceNow_u_import_set_test_importStub.Record_type0 record_type0 = new
            ServiceNow_u_import_set_test_importStub.Record_type0();
        record_type0.setU_id("8786");

        ServiceNow_u_import_set_test_importStub.InsertResponse_type0[] insertResponse_type0s = new
            ServiceNow_u_import_set_test_importStub.InsertResponse_type0[0];
        try {
            insertResponse_type0s = stub.insertMultiple(
                new ServiceNow_u_import_set_test_importStub.Record_type0[]{record_type0});
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        System.out.println(insertResponse_type0s);


    }

    private static void auth(ServiceClient client) {
        Options options = client.getOptions();

        HttpTransportProperties.Authenticator auth = new HttpTransportProperties.Authenticator();
        auth.setPreemptiveAuthentication(true);
        auth.setUsername("admin");
        auth.setPassword("xxx");
        options.setProperty(HTTPConstants.AUTHENTICATE, auth);
    }


}