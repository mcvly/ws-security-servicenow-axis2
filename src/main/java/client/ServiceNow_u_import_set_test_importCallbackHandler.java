/**
 * ServiceNow_u_import_set_test_importCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package client;


/**
 *  ServiceNow_u_import_set_test_importCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class ServiceNow_u_import_set_test_importCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public ServiceNow_u_import_set_test_importCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public ServiceNow_u_import_set_test_importCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for get method
     * override this method for handling normal response from get operation
     */
    public void receiveResultget(
        client.ServiceNow_u_import_set_test_importStub.GetResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from get operation
     */
    public void receiveErrorget(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deleteMultiple method
     * override this method for handling normal response from deleteMultiple operation
     */
    public void receiveResultdeleteMultiple(java.lang.String result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deleteMultiple operation
     */
    public void receiveErrordeleteMultiple(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deleteRecord method
     * override this method for handling normal response from deleteRecord operation
     */
    public void receiveResultdeleteRecord(java.lang.String result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deleteRecord operation
     */
    public void receiveErrordeleteRecord(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for insertMultiple method
     * override this method for handling normal response from insertMultiple operation
     */
    public void receiveResultinsertMultiple(
        client.ServiceNow_u_import_set_test_importStub.InsertResponse_type0[] result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from insertMultiple operation
     */
    public void receiveErrorinsertMultiple(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getKeys method
     * override this method for handling normal response from getKeys operation
     */
    public void receiveResultgetKeys(
        client.ServiceNow_u_import_set_test_importStub.GetKeysResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getKeys operation
     */
    public void receiveErrorgetKeys(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getRecords method
     * override this method for handling normal response from getRecords operation
     */
    public void receiveResultgetRecords(
        client.ServiceNow_u_import_set_test_importStub.GetRecordsResult_type0[] result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getRecords operation
     */
    public void receiveErrorgetRecords(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for insert method
     * override this method for handling normal response from insert operation
     */
    public void receiveResultinsert(
        client.ServiceNow_u_import_set_test_importStub.InsertResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from insert operation
     */
    public void receiveErrorinsert(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for update method
     * override this method for handling normal response from update operation
     */
    public void receiveResultupdate(java.lang.String result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from update operation
     */
    public void receiveErrorupdate(java.lang.Exception e) {
    }
}
