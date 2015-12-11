/**
 * ServiceNow_u_import_set_test_importStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package client;


/*
 *  ServiceNow_u_import_set_test_importStub java implementation
 */
public class ServiceNow_u_import_set_test_importStub extends org.apache.axis2.client.Stub {
    private static int counter = 0;
    protected org.apache.axis2.description.AxisOperation[] _operations;

    //hashmaps to keep the fault mapping
    private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private java.util.HashMap faultMessageMap = new java.util.HashMap();
    private javax.xml.namespace.QName[] opNameArray = null;

    /**
     *Constructor that takes in a configContext
     */
    public ServiceNow_u_import_set_test_importStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public ServiceNow_u_import_set_test_importStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
        //To populate AxisService
        populateAxisService();
        populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,
                _service);

        _serviceClient.getOptions()
                      .setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
    }

    /**
     * Default Constructor
     */
    public ServiceNow_u_import_set_test_importStub(
        org.apache.axis2.context.ConfigurationContext configurationContext)
        throws org.apache.axis2.AxisFault {
        this(configurationContext,
            "https://dev239.service-now.com/u_import_set_test_import.do?SOAP");
    }

    /**
     * Default Constructor
     */
    public ServiceNow_u_import_set_test_importStub()
        throws org.apache.axis2.AxisFault {
        this("https://dev239.service-now.com/u_import_set_test_import.do?SOAP");
    }

    /**
     * Constructor taking the target endpoint
     */
    public ServiceNow_u_import_set_test_importStub(
        java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint);
    }

    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (counter > 99999) {
            counter = 0;
        }

        counter = counter + 1;

        return java.lang.Long.toString(java.lang.System.currentTimeMillis()) +
        "_" + counter;
    }

    private void populateAxisService() throws org.apache.axis2.AxisFault {
        //creating the Service with a unique name
        _service = new org.apache.axis2.description.AxisService(
                "ServiceNow_u_import_set_test_import" + getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[8];

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://www.service-now.com/u_import_set_test_import", "get"));
        _service.addOperation(__operation);

        _operations[0] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://www.service-now.com/u_import_set_test_import",
                "deleteMultiple"));
        _service.addOperation(__operation);

        _operations[1] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://www.service-now.com/u_import_set_test_import",
                "deleteRecord"));
        _service.addOperation(__operation);

        _operations[2] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://www.service-now.com/u_import_set_test_import",
                "insertMultiple"));
        _service.addOperation(__operation);

        _operations[3] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://www.service-now.com/u_import_set_test_import", "getKeys"));
        _service.addOperation(__operation);

        _operations[4] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://www.service-now.com/u_import_set_test_import",
                "getRecords"));
        _service.addOperation(__operation);

        _operations[5] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://www.service-now.com/u_import_set_test_import", "insert"));
        _service.addOperation(__operation);

        _operations[6] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://www.service-now.com/u_import_set_test_import", "update"));
        _service.addOperation(__operation);

        _operations[7] = __operation;
    }

    //populates the faults
    private void populateFaults() {
    }

    /**
     * Auto generated method signature
     *
     * @see client.ServiceNow_u_import_set_test_import#get
     * @param get89
     */
    public client.ServiceNow_u_import_set_test_importStub.GetResponse get(
        java.lang.String sys_id90, java.lang.String __use_view91)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
            _operationClient.getOptions()
                            .setAction("http://www.service-now.com/u_import_set_test_import/get");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            client.ServiceNow_u_import_set_test_importStub.Get dummyWrappedType = null;
            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    sys_id90, __use_view91, dummyWrappedType,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://www.service-now.com/u_import_set_test_import",
                            "get")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    client.ServiceNow_u_import_set_test_importStub.GetResponse.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (client.ServiceNow_u_import_set_test_importStub.GetResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "get"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "get"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "get"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see client.ServiceNow_u_import_set_test_import#startget
     * @param get89
     */
    public void startget(java.lang.String sys_id90,
        java.lang.String __use_view91,
        final client.ServiceNow_u_import_set_test_importCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
        _operationClient.getOptions()
                        .setAction("http://www.service-now.com/u_import_set_test_import/get");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        client.ServiceNow_u_import_set_test_importStub.Get dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                sys_id90, __use_view91, dummyWrappedType,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "http://www.service-now.com/u_import_set_test_import",
                        "get")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                client.ServiceNow_u_import_set_test_importStub.GetResponse.class,
                                getEnvelopeNamespaces(resultEnv));
                        callback.receiveResultget((client.ServiceNow_u_import_set_test_importStub.GetResponse) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorget(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(), "get"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(), "get"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(), "get"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass, null);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorget(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorget(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorget(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorget(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorget(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorget(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorget(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorget(f);
                                }
                            } else {
                                callback.receiveErrorget(f);
                            }
                        } else {
                            callback.receiveErrorget(f);
                        }
                    } else {
                        callback.receiveErrorget(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorget(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[0].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[0].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     *
     * @see client.ServiceNow_u_import_set_test_import#deleteMultiple
     * @param deleteMultiple114
     */
    public java.lang.String deleteMultiple(java.lang.String sys_class_name115,
        java.lang.String sys_created_by116, java.lang.String sys_created_on117,
        java.lang.String sys_id118, java.math.BigInteger sys_import_row119,
        java.lang.String sys_import_set120,
        java.lang.String sys_import_state121,
        java.lang.String sys_import_state_comment122,
        java.math.BigInteger sys_mod_count123,
        java.lang.String sys_row_error124,
        java.lang.String sys_target_sys_id125,
        java.lang.String sys_target_table126,
        java.lang.String sys_transform_map127,
        java.lang.String sys_updated_by128, java.lang.String sys_updated_on129,
        java.lang.String template_import_log130, java.lang.String u_1131,
        java.lang.String u_1_record_1132, java.lang.String u_id133,
        java.lang.String u_record134, java.lang.String u_record_1135)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
            _operationClient.getOptions()
                            .setAction("http://www.service-now.com/u_import_set_test_import/deleteMultiple");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            client.ServiceNow_u_import_set_test_importStub.DeleteMultiple dummyWrappedType =
                null;
            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    sys_class_name115, sys_created_by116, sys_created_on117,
                    sys_id118, sys_import_row119, sys_import_set120,
                    sys_import_state121, sys_import_state_comment122,
                    sys_mod_count123, sys_row_error124, sys_target_sys_id125,
                    sys_target_table126, sys_transform_map127,
                    sys_updated_by128, sys_updated_on129,
                    template_import_log130, u_1131, u_1_record_1132, u_id133,
                    u_record134, u_record_1135, dummyWrappedType,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://www.service-now.com/u_import_set_test_import",
                            "deleteMultiple")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    client.ServiceNow_u_import_set_test_importStub.DeleteMultipleResponse.class,
                    getEnvelopeNamespaces(_returnEnv));

            return getDeleteMultipleResponseCount((client.ServiceNow_u_import_set_test_importStub.DeleteMultipleResponse) object);
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "deleteMultiple"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "deleteMultiple"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "deleteMultiple"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see client.ServiceNow_u_import_set_test_import#startdeleteMultiple
     * @param deleteMultiple114
     */
    public void startdeleteMultiple(java.lang.String sys_class_name115,
        java.lang.String sys_created_by116, java.lang.String sys_created_on117,
        java.lang.String sys_id118, java.math.BigInteger sys_import_row119,
        java.lang.String sys_import_set120,
        java.lang.String sys_import_state121,
        java.lang.String sys_import_state_comment122,
        java.math.BigInteger sys_mod_count123,
        java.lang.String sys_row_error124,
        java.lang.String sys_target_sys_id125,
        java.lang.String sys_target_table126,
        java.lang.String sys_transform_map127,
        java.lang.String sys_updated_by128, java.lang.String sys_updated_on129,
        java.lang.String template_import_log130, java.lang.String u_1131,
        java.lang.String u_1_record_1132, java.lang.String u_id133,
        java.lang.String u_record134, java.lang.String u_record_1135,
        final client.ServiceNow_u_import_set_test_importCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
        _operationClient.getOptions()
                        .setAction("http://www.service-now.com/u_import_set_test_import/deleteMultiple");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        client.ServiceNow_u_import_set_test_importStub.DeleteMultiple dummyWrappedType =
            null;
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                sys_class_name115, sys_created_by116, sys_created_on117,
                sys_id118, sys_import_row119, sys_import_set120,
                sys_import_state121, sys_import_state_comment122,
                sys_mod_count123, sys_row_error124, sys_target_sys_id125,
                sys_target_table126, sys_transform_map127, sys_updated_by128,
                sys_updated_on129, template_import_log130, u_1131,
                u_1_record_1132, u_id133, u_record134, u_record_1135,
                dummyWrappedType,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "http://www.service-now.com/u_import_set_test_import",
                        "deleteMultiple")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                client.ServiceNow_u_import_set_test_importStub.DeleteMultipleResponse.class,
                                getEnvelopeNamespaces(resultEnv));
                        callback.receiveResultdeleteMultiple(getDeleteMultipleResponseCount(
                                (client.ServiceNow_u_import_set_test_importStub.DeleteMultipleResponse) object));
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrordeleteMultiple(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(),
                                            "deleteMultiple"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "deleteMultiple"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "deleteMultiple"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass, null);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrordeleteMultiple(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrordeleteMultiple(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrordeleteMultiple(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrordeleteMultiple(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrordeleteMultiple(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrordeleteMultiple(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrordeleteMultiple(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrordeleteMultiple(f);
                                }
                            } else {
                                callback.receiveErrordeleteMultiple(f);
                            }
                        } else {
                            callback.receiveErrordeleteMultiple(f);
                        }
                    } else {
                        callback.receiveErrordeleteMultiple(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrordeleteMultiple(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[1].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[1].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     *
     * @see client.ServiceNow_u_import_set_test_import#deleteRecord
     * @param deleteRecord138
     */
    public java.lang.String deleteRecord(java.lang.String sys_id139)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
            _operationClient.getOptions()
                            .setAction("http://www.service-now.com/u_import_set_test_import/deleteRecord");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            client.ServiceNow_u_import_set_test_importStub.DeleteRecord dummyWrappedType =
                null;
            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    sys_id139, dummyWrappedType,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://www.service-now.com/u_import_set_test_import",
                            "deleteRecord")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    client.ServiceNow_u_import_set_test_importStub.DeleteRecordResponse.class,
                    getEnvelopeNamespaces(_returnEnv));

            return getDeleteRecordResponseCount((client.ServiceNow_u_import_set_test_importStub.DeleteRecordResponse) object);
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "deleteRecord"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "deleteRecord"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "deleteRecord"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see client.ServiceNow_u_import_set_test_import#startdeleteRecord
     * @param deleteRecord138
     */
    public void startdeleteRecord(java.lang.String sys_id139,
        final client.ServiceNow_u_import_set_test_importCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
        _operationClient.getOptions()
                        .setAction("http://www.service-now.com/u_import_set_test_import/deleteRecord");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        client.ServiceNow_u_import_set_test_importStub.DeleteRecord dummyWrappedType =
            null;
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                sys_id139, dummyWrappedType,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "http://www.service-now.com/u_import_set_test_import",
                        "deleteRecord")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                client.ServiceNow_u_import_set_test_importStub.DeleteRecordResponse.class,
                                getEnvelopeNamespaces(resultEnv));
                        callback.receiveResultdeleteRecord(getDeleteRecordResponseCount(
                                (client.ServiceNow_u_import_set_test_importStub.DeleteRecordResponse) object));
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrordeleteRecord(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(), "deleteRecord"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "deleteRecord"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "deleteRecord"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass, null);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrordeleteRecord(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrordeleteRecord(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrordeleteRecord(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrordeleteRecord(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrordeleteRecord(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrordeleteRecord(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrordeleteRecord(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrordeleteRecord(f);
                                }
                            } else {
                                callback.receiveErrordeleteRecord(f);
                            }
                        } else {
                            callback.receiveErrordeleteRecord(f);
                        }
                    } else {
                        callback.receiveErrordeleteRecord(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrordeleteRecord(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[2].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[2].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     *
     * @see client.ServiceNow_u_import_set_test_import#insertMultiple
     * @param insertMultiple142
     */
    public client.ServiceNow_u_import_set_test_importStub.InsertResponse_type0[] insertMultiple(
        client.ServiceNow_u_import_set_test_importStub.Record_type0[] record143)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
            _operationClient.getOptions()
                            .setAction("http://www.service-now.com/u_import_set_test_import/insertMultiple");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            client.ServiceNow_u_import_set_test_importStub.InsertMultiple dummyWrappedType =
                null;
            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    record143, dummyWrappedType,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://www.service-now.com/u_import_set_test_import",
                            "insertMultiple")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    client.ServiceNow_u_import_set_test_importStub.InsertMultipleResponse.class,
                    getEnvelopeNamespaces(_returnEnv));

            return getInsertMultipleResponseInsertResponse((client.ServiceNow_u_import_set_test_importStub.InsertMultipleResponse) object);
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "insertMultiple"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "insertMultiple"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "insertMultiple"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see client.ServiceNow_u_import_set_test_import#startinsertMultiple
     * @param insertMultiple142
     */
    public void startinsertMultiple(
        client.ServiceNow_u_import_set_test_importStub.Record_type0[] record143,
        final client.ServiceNow_u_import_set_test_importCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
        _operationClient.getOptions()
                        .setAction("http://www.service-now.com/u_import_set_test_import/insertMultiple");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        client.ServiceNow_u_import_set_test_importStub.InsertMultiple dummyWrappedType =
            null;
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                record143, dummyWrappedType,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "http://www.service-now.com/u_import_set_test_import",
                        "insertMultiple")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                client.ServiceNow_u_import_set_test_importStub.InsertMultipleResponse.class,
                                getEnvelopeNamespaces(resultEnv));
                        callback.receiveResultinsertMultiple(getInsertMultipleResponseInsertResponse(
                                (client.ServiceNow_u_import_set_test_importStub.InsertMultipleResponse) object));
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorinsertMultiple(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(),
                                            "insertMultiple"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "insertMultiple"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "insertMultiple"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass, null);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorinsertMultiple(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorinsertMultiple(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorinsertMultiple(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorinsertMultiple(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorinsertMultiple(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorinsertMultiple(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorinsertMultiple(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorinsertMultiple(f);
                                }
                            } else {
                                callback.receiveErrorinsertMultiple(f);
                            }
                        } else {
                            callback.receiveErrorinsertMultiple(f);
                        }
                    } else {
                        callback.receiveErrorinsertMultiple(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorinsertMultiple(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[3].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[3].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     *
     * @see client.ServiceNow_u_import_set_test_import#getKeys
     * @param getKeys146
     */
    public client.ServiceNow_u_import_set_test_importStub.GetKeysResponse getKeys(
        java.lang.String sys_class_name147, java.lang.String sys_created_by148,
        java.lang.String sys_created_on149,
        java.math.BigInteger sys_import_row150,
        java.lang.String sys_import_set151,
        java.lang.String sys_import_state152,
        java.lang.String sys_import_state_comment153,
        java.math.BigInteger sys_mod_count154,
        java.lang.String sys_row_error155,
        java.lang.String sys_target_sys_id156,
        java.lang.String sys_target_table157,
        java.lang.String sys_transform_map158,
        java.lang.String sys_updated_by159, java.lang.String sys_updated_on160,
        java.lang.String template_import_log161, java.lang.String u_1162,
        java.lang.String u_1_record_1163, java.lang.String u_id164,
        java.lang.String u_record165, java.lang.String u_record_1166,
        java.lang.String __use_view167, java.lang.String __encoded_query168,
        java.lang.String __limit169, java.lang.String __first_row170,
        java.lang.String __last_row171) throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
            _operationClient.getOptions()
                            .setAction("http://www.service-now.com/u_import_set_test_import/getKeys");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            client.ServiceNow_u_import_set_test_importStub.GetKeys dummyWrappedType =
                null;
            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    sys_class_name147, sys_created_by148, sys_created_on149,
                    sys_import_row150, sys_import_set151, sys_import_state152,
                    sys_import_state_comment153, sys_mod_count154,
                    sys_row_error155, sys_target_sys_id156,
                    sys_target_table157, sys_transform_map158,
                    sys_updated_by159, sys_updated_on160,
                    template_import_log161, u_1162, u_1_record_1163, u_id164,
                    u_record165, u_record_1166, __use_view167,
                    __encoded_query168, __limit169, __first_row170,
                    __last_row171, dummyWrappedType,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://www.service-now.com/u_import_set_test_import",
                            "getKeys")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    client.ServiceNow_u_import_set_test_importStub.GetKeysResponse.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (client.ServiceNow_u_import_set_test_importStub.GetKeysResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "getKeys"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "getKeys"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "getKeys"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see client.ServiceNow_u_import_set_test_import#startgetKeys
     * @param getKeys146
     */
    public void startgetKeys(java.lang.String sys_class_name147,
        java.lang.String sys_created_by148, java.lang.String sys_created_on149,
        java.math.BigInteger sys_import_row150,
        java.lang.String sys_import_set151,
        java.lang.String sys_import_state152,
        java.lang.String sys_import_state_comment153,
        java.math.BigInteger sys_mod_count154,
        java.lang.String sys_row_error155,
        java.lang.String sys_target_sys_id156,
        java.lang.String sys_target_table157,
        java.lang.String sys_transform_map158,
        java.lang.String sys_updated_by159, java.lang.String sys_updated_on160,
        java.lang.String template_import_log161, java.lang.String u_1162,
        java.lang.String u_1_record_1163, java.lang.String u_id164,
        java.lang.String u_record165, java.lang.String u_record_1166,
        java.lang.String __use_view167, java.lang.String __encoded_query168,
        java.lang.String __limit169, java.lang.String __first_row170,
        java.lang.String __last_row171,
        final client.ServiceNow_u_import_set_test_importCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
        _operationClient.getOptions()
                        .setAction("http://www.service-now.com/u_import_set_test_import/getKeys");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        client.ServiceNow_u_import_set_test_importStub.GetKeys dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                sys_class_name147, sys_created_by148, sys_created_on149,
                sys_import_row150, sys_import_set151, sys_import_state152,
                sys_import_state_comment153, sys_mod_count154,
                sys_row_error155, sys_target_sys_id156, sys_target_table157,
                sys_transform_map158, sys_updated_by159, sys_updated_on160,
                template_import_log161, u_1162, u_1_record_1163, u_id164,
                u_record165, u_record_1166, __use_view167, __encoded_query168,
                __limit169, __first_row170, __last_row171, dummyWrappedType,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "http://www.service-now.com/u_import_set_test_import",
                        "getKeys")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                client.ServiceNow_u_import_set_test_importStub.GetKeysResponse.class,
                                getEnvelopeNamespaces(resultEnv));
                        callback.receiveResultgetKeys((client.ServiceNow_u_import_set_test_importStub.GetKeysResponse) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorgetKeys(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(), "getKeys"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(), "getKeys"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(), "getKeys"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass, null);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorgetKeys(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorgetKeys(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorgetKeys(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorgetKeys(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorgetKeys(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorgetKeys(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorgetKeys(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorgetKeys(f);
                                }
                            } else {
                                callback.receiveErrorgetKeys(f);
                            }
                        } else {
                            callback.receiveErrorgetKeys(f);
                        }
                    } else {
                        callback.receiveErrorgetKeys(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorgetKeys(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[4].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[4].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     *
     * @see client.ServiceNow_u_import_set_test_import#getRecords
     * @param getRecords175
     */
    public client.ServiceNow_u_import_set_test_importStub.GetRecordsResult_type0[] getRecords(
        java.lang.String sys_class_name176, java.lang.String sys_created_by177,
        java.lang.String sys_created_on178, java.lang.String sys_id179,
        java.math.BigInteger sys_import_row180,
        java.lang.String sys_import_set181,
        java.lang.String sys_import_state182,
        java.lang.String sys_import_state_comment183,
        java.math.BigInteger sys_mod_count184,
        java.lang.String sys_row_error185,
        java.lang.String sys_target_sys_id186,
        java.lang.String sys_target_table187,
        java.lang.String sys_transform_map188,
        java.lang.String sys_updated_by189, java.lang.String sys_updated_on190,
        java.lang.String template_import_log191, java.lang.String u_1192,
        java.lang.String u_1_record_1193, java.lang.String u_id194,
        java.lang.String u_record195, java.lang.String u_record_1196,
        java.lang.String __use_view197, java.lang.String __encoded_query198,
        java.lang.String __limit199, java.lang.String __first_row200,
        java.lang.String __last_row201, java.lang.String __order_by202,
        java.lang.String __order_by_desc203,
        java.lang.String __exclude_columns204) throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
            _operationClient.getOptions()
                            .setAction("http://www.service-now.com/u_import_set_test_import/getRecords");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            client.ServiceNow_u_import_set_test_importStub.GetRecords dummyWrappedType =
                null;
            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    sys_class_name176, sys_created_by177, sys_created_on178,
                    sys_id179, sys_import_row180, sys_import_set181,
                    sys_import_state182, sys_import_state_comment183,
                    sys_mod_count184, sys_row_error185, sys_target_sys_id186,
                    sys_target_table187, sys_transform_map188,
                    sys_updated_by189, sys_updated_on190,
                    template_import_log191, u_1192, u_1_record_1193, u_id194,
                    u_record195, u_record_1196, __use_view197,
                    __encoded_query198, __limit199, __first_row200,
                    __last_row201, __order_by202, __order_by_desc203,
                    __exclude_columns204, dummyWrappedType,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://www.service-now.com/u_import_set_test_import",
                            "getRecords")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    client.ServiceNow_u_import_set_test_importStub.GetRecordsResponse.class,
                    getEnvelopeNamespaces(_returnEnv));

            return getGetRecordsResponseGetRecordsResult((client.ServiceNow_u_import_set_test_importStub.GetRecordsResponse) object);
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "getRecords"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "getRecords"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "getRecords"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see client.ServiceNow_u_import_set_test_import#startgetRecords
     * @param getRecords175
     */
    public void startgetRecords(java.lang.String sys_class_name176,
        java.lang.String sys_created_by177, java.lang.String sys_created_on178,
        java.lang.String sys_id179, java.math.BigInteger sys_import_row180,
        java.lang.String sys_import_set181,
        java.lang.String sys_import_state182,
        java.lang.String sys_import_state_comment183,
        java.math.BigInteger sys_mod_count184,
        java.lang.String sys_row_error185,
        java.lang.String sys_target_sys_id186,
        java.lang.String sys_target_table187,
        java.lang.String sys_transform_map188,
        java.lang.String sys_updated_by189, java.lang.String sys_updated_on190,
        java.lang.String template_import_log191, java.lang.String u_1192,
        java.lang.String u_1_record_1193, java.lang.String u_id194,
        java.lang.String u_record195, java.lang.String u_record_1196,
        java.lang.String __use_view197, java.lang.String __encoded_query198,
        java.lang.String __limit199, java.lang.String __first_row200,
        java.lang.String __last_row201, java.lang.String __order_by202,
        java.lang.String __order_by_desc203,
        java.lang.String __exclude_columns204,
        final client.ServiceNow_u_import_set_test_importCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
        _operationClient.getOptions()
                        .setAction("http://www.service-now.com/u_import_set_test_import/getRecords");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        client.ServiceNow_u_import_set_test_importStub.GetRecords dummyWrappedType =
            null;
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                sys_class_name176, sys_created_by177, sys_created_on178,
                sys_id179, sys_import_row180, sys_import_set181,
                sys_import_state182, sys_import_state_comment183,
                sys_mod_count184, sys_row_error185, sys_target_sys_id186,
                sys_target_table187, sys_transform_map188, sys_updated_by189,
                sys_updated_on190, template_import_log191, u_1192,
                u_1_record_1193, u_id194, u_record195, u_record_1196,
                __use_view197, __encoded_query198, __limit199, __first_row200,
                __last_row201, __order_by202, __order_by_desc203,
                __exclude_columns204, dummyWrappedType,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "http://www.service-now.com/u_import_set_test_import",
                        "getRecords")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                client.ServiceNow_u_import_set_test_importStub.GetRecordsResponse.class,
                                getEnvelopeNamespaces(resultEnv));
                        callback.receiveResultgetRecords(getGetRecordsResponseGetRecordsResult(
                                (client.ServiceNow_u_import_set_test_importStub.GetRecordsResponse) object));
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorgetRecords(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(), "getRecords"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "getRecords"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(),
                                                "getRecords"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass, null);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorgetRecords(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorgetRecords(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorgetRecords(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorgetRecords(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorgetRecords(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorgetRecords(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorgetRecords(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorgetRecords(f);
                                }
                            } else {
                                callback.receiveErrorgetRecords(f);
                            }
                        } else {
                            callback.receiveErrorgetRecords(f);
                        }
                    } else {
                        callback.receiveErrorgetRecords(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorgetRecords(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[5].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[5].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     *
     * @see client.ServiceNow_u_import_set_test_import#insert
     * @param insert207
     */
    public client.ServiceNow_u_import_set_test_importStub.InsertResponse insert(
        java.lang.String template_import_log208, java.lang.String u_1209,
        java.lang.String u_1_record_1210, java.lang.String u_id211,
        java.lang.String u_record212, java.lang.String u_record_1213)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
            _operationClient.getOptions()
                            .setAction("http://www.service-now.com/u_import_set_test_import/insert");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            client.ServiceNow_u_import_set_test_importStub.Insert dummyWrappedType =
                null;
            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    template_import_log208, u_1209, u_1_record_1210, u_id211,
                    u_record212, u_record_1213, dummyWrappedType,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://www.service-now.com/u_import_set_test_import",
                            "insert")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    client.ServiceNow_u_import_set_test_importStub.InsertResponse.class,
                    getEnvelopeNamespaces(_returnEnv));

            return (client.ServiceNow_u_import_set_test_importStub.InsertResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "insert"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "insert"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "insert"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see client.ServiceNow_u_import_set_test_import#startinsert
     * @param insert207
     */
    public void startinsert(java.lang.String template_import_log208,
        java.lang.String u_1209, java.lang.String u_1_record_1210,
        java.lang.String u_id211, java.lang.String u_record212,
        java.lang.String u_record_1213,
        final client.ServiceNow_u_import_set_test_importCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
        _operationClient.getOptions()
                        .setAction("http://www.service-now.com/u_import_set_test_import/insert");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        client.ServiceNow_u_import_set_test_importStub.Insert dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                template_import_log208, u_1209, u_1_record_1210, u_id211,
                u_record212, u_record_1213, dummyWrappedType,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "http://www.service-now.com/u_import_set_test_import",
                        "insert")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                client.ServiceNow_u_import_set_test_importStub.InsertResponse.class,
                                getEnvelopeNamespaces(resultEnv));
                        callback.receiveResultinsert((client.ServiceNow_u_import_set_test_importStub.InsertResponse) object);
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorinsert(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(), "insert"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(), "insert"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(), "insert"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass, null);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorinsert(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorinsert(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorinsert(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorinsert(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorinsert(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorinsert(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorinsert(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorinsert(f);
                                }
                            } else {
                                callback.receiveErrorinsert(f);
                            }
                        } else {
                            callback.receiveErrorinsert(f);
                        }
                    } else {
                        callback.receiveErrorinsert(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorinsert(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[6].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[6].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     * Auto generated method signature
     *
     * @see client.ServiceNow_u_import_set_test_import#update
     * @param update222
     */
    public java.lang.String update(java.lang.String sys_id223,
        java.lang.String template_import_log224, java.lang.String u_1225,
        java.lang.String u_1_record_1226, java.lang.String u_id227,
        java.lang.String u_record228, java.lang.String u_record_1229)
        throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
            _operationClient.getOptions()
                            .setAction("http://www.service-now.com/u_import_set_test_import/update");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;
            client.ServiceNow_u_import_set_test_importStub.Update dummyWrappedType =
                null;
            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    sys_id223, template_import_log224, u_1225, u_1_record_1226,
                    u_id227, u_record228, u_record_1229, dummyWrappedType,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "http://www.service-now.com/u_import_set_test_import",
                            "update")));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    client.ServiceNow_u_import_set_test_importStub.UpdateResponse.class,
                    getEnvelopeNamespaces(_returnEnv));

            return getUpdateResponseSys_id((client.ServiceNow_u_import_set_test_importStub.UpdateResponse) object);
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "update"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "update"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "update"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see client.ServiceNow_u_import_set_test_import#startupdate
     * @param update222
     */
    public void startupdate(java.lang.String sys_id223,
        java.lang.String template_import_log224, java.lang.String u_1225,
        java.lang.String u_1_record_1226, java.lang.String u_id227,
        java.lang.String u_record228, java.lang.String u_record_1229,
        final client.ServiceNow_u_import_set_test_importCallbackHandler callback)
        throws java.rmi.RemoteException {
        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
        _operationClient.getOptions()
                        .setAction("http://www.service-now.com/u_import_set_test_import/update");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

        addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
            "&");

        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        //Style is Doc.
        client.ServiceNow_u_import_set_test_importStub.Update dummyWrappedType = null;
        env = toEnvelope(getFactory(_operationClient.getOptions()
                                                    .getSoapVersionURI()),
                sys_id223, template_import_log224, u_1225, u_1_record_1226,
                u_id227, u_record228, u_record_1229, dummyWrappedType,
                optimizeContent(
                    new javax.xml.namespace.QName(
                        "http://www.service-now.com/u_import_set_test_import",
                        "update")));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);

        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                public void onMessage(
                    org.apache.axis2.context.MessageContext resultContext) {
                    try {
                        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                        java.lang.Object object = fromOM(resultEnv.getBody()
                                                                  .getFirstElement(),
                                client.ServiceNow_u_import_set_test_importStub.UpdateResponse.class,
                                getEnvelopeNamespaces(resultEnv));
                        callback.receiveResultupdate(getUpdateResponseSys_id(
                                (client.ServiceNow_u_import_set_test_importStub.UpdateResponse) object));
                    } catch (org.apache.axis2.AxisFault e) {
                        callback.receiveErrorupdate(e);
                    }
                }

                public void onError(java.lang.Exception error) {
                    if (error instanceof org.apache.axis2.AxisFault) {
                        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                        org.apache.axiom.om.OMElement faultElt = f.getDetail();

                        if (faultElt != null) {
                            if (faultExceptionNameMap.containsKey(
                                        new org.apache.axis2.client.FaultMapKey(
                                            faultElt.getQName(), "update"))) {
                                //make the fault by reflection
                                try {
                                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(), "update"));
                                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                                    //message class
                                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                                faultElt.getQName(), "update"));
                                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                    java.lang.Object messageObject = fromOM(faultElt,
                                            messageClass, null);
                                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                            new java.lang.Class[] { messageClass });
                                    m.invoke(ex,
                                        new java.lang.Object[] { messageObject });

                                    callback.receiveErrorupdate(new java.rmi.RemoteException(
                                            ex.getMessage(), ex));
                                } catch (java.lang.ClassCastException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorupdate(f);
                                } catch (java.lang.ClassNotFoundException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorupdate(f);
                                } catch (java.lang.NoSuchMethodException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorupdate(f);
                                } catch (java.lang.reflect.InvocationTargetException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorupdate(f);
                                } catch (java.lang.IllegalAccessException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorupdate(f);
                                } catch (java.lang.InstantiationException e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorupdate(f);
                                } catch (org.apache.axis2.AxisFault e) {
                                    // we cannot intantiate the class - throw the original Axis fault
                                    callback.receiveErrorupdate(f);
                                }
                            } else {
                                callback.receiveErrorupdate(f);
                            }
                        } else {
                            callback.receiveErrorupdate(f);
                        }
                    } else {
                        callback.receiveErrorupdate(error);
                    }
                }

                public void onFault(
                    org.apache.axis2.context.MessageContext faultContext) {
                    org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                    onError(fault);
                }

                public void onComplete() {
                    try {
                        _messageContext.getTransportOut().getSender()
                                       .cleanup(_messageContext);
                    } catch (org.apache.axis2.AxisFault axisFault) {
                        callback.receiveErrorupdate(axisFault);
                    }
                }
            });

        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

        if ((_operations[7].getMessageReceiver() == null) &&
                _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[7].setMessageReceiver(_callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);
    }

    /**
     *  A utility method that copies the namepaces from the SOAPEnvelope
     */
    private java.util.Map getEnvelopeNamespaces(
        org.apache.axiom.soap.SOAPEnvelope env) {
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();

        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
        }

        return returnMap;
    }

    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        if (opNameArray == null) {
            return false;
        }

        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;
            }
        }

        return false;
    }

    private org.apache.axiom.om.OMElement toOM(
        client.ServiceNow_u_import_set_test_importStub.Get param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(client.ServiceNow_u_import_set_test_importStub.Get.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        client.ServiceNow_u_import_set_test_importStub.GetResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(client.ServiceNow_u_import_set_test_importStub.GetResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        client.ServiceNow_u_import_set_test_importStub.DeleteMultiple param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(client.ServiceNow_u_import_set_test_importStub.DeleteMultiple.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        client.ServiceNow_u_import_set_test_importStub.DeleteMultipleResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(client.ServiceNow_u_import_set_test_importStub.DeleteMultipleResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        client.ServiceNow_u_import_set_test_importStub.DeleteRecord param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(client.ServiceNow_u_import_set_test_importStub.DeleteRecord.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        client.ServiceNow_u_import_set_test_importStub.DeleteRecordResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(client.ServiceNow_u_import_set_test_importStub.DeleteRecordResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        client.ServiceNow_u_import_set_test_importStub.InsertMultiple param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(client.ServiceNow_u_import_set_test_importStub.InsertMultiple.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        client.ServiceNow_u_import_set_test_importStub.InsertMultipleResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(client.ServiceNow_u_import_set_test_importStub.InsertMultipleResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        client.ServiceNow_u_import_set_test_importStub.GetKeys param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(client.ServiceNow_u_import_set_test_importStub.GetKeys.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        client.ServiceNow_u_import_set_test_importStub.GetKeysResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(client.ServiceNow_u_import_set_test_importStub.GetKeysResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        client.ServiceNow_u_import_set_test_importStub.GetRecords param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(client.ServiceNow_u_import_set_test_importStub.GetRecords.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        client.ServiceNow_u_import_set_test_importStub.GetRecordsResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(client.ServiceNow_u_import_set_test_importStub.GetRecordsResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        client.ServiceNow_u_import_set_test_importStub.Insert param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(client.ServiceNow_u_import_set_test_importStub.Insert.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        client.ServiceNow_u_import_set_test_importStub.InsertResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(client.ServiceNow_u_import_set_test_importStub.InsertResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        client.ServiceNow_u_import_set_test_importStub.Update param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(client.ServiceNow_u_import_set_test_importStub.Update.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        client.ServiceNow_u_import_set_test_importStub.UpdateResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(client.ServiceNow_u_import_set_test_importStub.UpdateResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory, java.lang.String param1,
        java.lang.String param2,
        client.ServiceNow_u_import_set_test_importStub.Get dummyWrappedType,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            client.ServiceNow_u_import_set_test_importStub.Get wrappedType = new client.ServiceNow_u_import_set_test_importStub.Get();

            wrappedType.setSys_id(param1);

            wrappedType.set__use_view(param2);

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(wrappedType.getOMElement(
                    client.ServiceNow_u_import_set_test_importStub.Get.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private java.lang.String getGetResponseSys_class_name(
        client.ServiceNow_u_import_set_test_importStub.GetResponse wrappedType) {
        return wrappedType.getSys_class_name();
    }

    private java.lang.String getGetResponseSys_created_by(
        client.ServiceNow_u_import_set_test_importStub.GetResponse wrappedType) {
        return wrappedType.getSys_created_by();
    }

    private java.lang.String getGetResponseSys_created_on(
        client.ServiceNow_u_import_set_test_importStub.GetResponse wrappedType) {
        return wrappedType.getSys_created_on();
    }

    private java.lang.String getGetResponseSys_id(
        client.ServiceNow_u_import_set_test_importStub.GetResponse wrappedType) {
        return wrappedType.getSys_id();
    }

    private java.math.BigInteger getGetResponseSys_import_row(
        client.ServiceNow_u_import_set_test_importStub.GetResponse wrappedType) {
        return wrappedType.getSys_import_row();
    }

    private java.lang.String getGetResponseSys_import_set(
        client.ServiceNow_u_import_set_test_importStub.GetResponse wrappedType) {
        return wrappedType.getSys_import_set();
    }

    private java.lang.String getGetResponseSys_import_state(
        client.ServiceNow_u_import_set_test_importStub.GetResponse wrappedType) {
        return wrappedType.getSys_import_state();
    }

    private java.lang.String getGetResponseSys_import_state_comment(
        client.ServiceNow_u_import_set_test_importStub.GetResponse wrappedType) {
        return wrappedType.getSys_import_state_comment();
    }

    private java.math.BigInteger getGetResponseSys_mod_count(
        client.ServiceNow_u_import_set_test_importStub.GetResponse wrappedType) {
        return wrappedType.getSys_mod_count();
    }

    private java.lang.String getGetResponseSys_row_error(
        client.ServiceNow_u_import_set_test_importStub.GetResponse wrappedType) {
        return wrappedType.getSys_row_error();
    }

    private java.lang.String getGetResponseSys_target_sys_id(
        client.ServiceNow_u_import_set_test_importStub.GetResponse wrappedType) {
        return wrappedType.getSys_target_sys_id();
    }

    private java.lang.String getGetResponseSys_target_table(
        client.ServiceNow_u_import_set_test_importStub.GetResponse wrappedType) {
        return wrappedType.getSys_target_table();
    }

    private java.lang.String getGetResponseSys_transform_map(
        client.ServiceNow_u_import_set_test_importStub.GetResponse wrappedType) {
        return wrappedType.getSys_transform_map();
    }

    private java.lang.String getGetResponseSys_updated_by(
        client.ServiceNow_u_import_set_test_importStub.GetResponse wrappedType) {
        return wrappedType.getSys_updated_by();
    }

    private java.lang.String getGetResponseSys_updated_on(
        client.ServiceNow_u_import_set_test_importStub.GetResponse wrappedType) {
        return wrappedType.getSys_updated_on();
    }

    private java.lang.String getGetResponseTemplate_import_log(
        client.ServiceNow_u_import_set_test_importStub.GetResponse wrappedType) {
        return wrappedType.getTemplate_import_log();
    }

    private java.lang.String getGetResponseU_1(
        client.ServiceNow_u_import_set_test_importStub.GetResponse wrappedType) {
        return wrappedType.getU_1();
    }

    private java.lang.String getGetResponseU_1_record_1(
        client.ServiceNow_u_import_set_test_importStub.GetResponse wrappedType) {
        return wrappedType.getU_1_record_1();
    }

    private java.lang.String getGetResponseU_id(
        client.ServiceNow_u_import_set_test_importStub.GetResponse wrappedType) {
        return wrappedType.getU_id();
    }

    private java.lang.String getGetResponseU_record(
        client.ServiceNow_u_import_set_test_importStub.GetResponse wrappedType) {
        return wrappedType.getU_record();
    }

    private java.lang.String getGetResponseU_record_1(
        client.ServiceNow_u_import_set_test_importStub.GetResponse wrappedType) {
        return wrappedType.getU_record_1();
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory, java.lang.String param1,
        java.lang.String param2, java.lang.String param3,
        java.lang.String param4, java.math.BigInteger param5,
        java.lang.String param6, java.lang.String param7,
        java.lang.String param8, java.math.BigInteger param9,
        java.lang.String param10, java.lang.String param11,
        java.lang.String param12, java.lang.String param13,
        java.lang.String param14, java.lang.String param15,
        java.lang.String param16, java.lang.String param17,
        java.lang.String param18, java.lang.String param19,
        java.lang.String param20, java.lang.String param21,
        client.ServiceNow_u_import_set_test_importStub.DeleteMultiple dummyWrappedType,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            client.ServiceNow_u_import_set_test_importStub.DeleteMultiple wrappedType =
                new client.ServiceNow_u_import_set_test_importStub.DeleteMultiple();

            wrappedType.setSys_class_name(param1);

            wrappedType.setSys_created_by(param2);

            wrappedType.setSys_created_on(param3);

            wrappedType.setSys_id(param4);

            wrappedType.setSys_import_row(param5);

            wrappedType.setSys_import_set(param6);

            wrappedType.setSys_import_state(param7);

            wrappedType.setSys_import_state_comment(param8);

            wrappedType.setSys_mod_count(param9);

            wrappedType.setSys_row_error(param10);

            wrappedType.setSys_target_sys_id(param11);

            wrappedType.setSys_target_table(param12);

            wrappedType.setSys_transform_map(param13);

            wrappedType.setSys_updated_by(param14);

            wrappedType.setSys_updated_on(param15);

            wrappedType.setTemplate_import_log(param16);

            wrappedType.setU_1(param17);

            wrappedType.setU_1_record_1(param18);

            wrappedType.setU_id(param19);

            wrappedType.setU_record(param20);

            wrappedType.setU_record_1(param21);

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(wrappedType.getOMElement(
                    client.ServiceNow_u_import_set_test_importStub.DeleteMultiple.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private java.lang.String getDeleteMultipleResponseCount(
        client.ServiceNow_u_import_set_test_importStub.DeleteMultipleResponse wrappedType) {
        return wrappedType.getCount();
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory, java.lang.String param1,
        client.ServiceNow_u_import_set_test_importStub.DeleteRecord dummyWrappedType,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            client.ServiceNow_u_import_set_test_importStub.DeleteRecord wrappedType =
                new client.ServiceNow_u_import_set_test_importStub.DeleteRecord();

            wrappedType.setSys_id(param1);

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(wrappedType.getOMElement(
                    client.ServiceNow_u_import_set_test_importStub.DeleteRecord.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private java.lang.String getDeleteRecordResponseCount(
        client.ServiceNow_u_import_set_test_importStub.DeleteRecordResponse wrappedType) {
        return wrappedType.getCount();
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        client.ServiceNow_u_import_set_test_importStub.Record_type0[] param1,
        client.ServiceNow_u_import_set_test_importStub.InsertMultiple dummyWrappedType,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            client.ServiceNow_u_import_set_test_importStub.InsertMultiple wrappedType =
                new client.ServiceNow_u_import_set_test_importStub.InsertMultiple();

            wrappedType.setRecord(param1);

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(wrappedType.getOMElement(
                    client.ServiceNow_u_import_set_test_importStub.InsertMultiple.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private client.ServiceNow_u_import_set_test_importStub.InsertResponse_type0[] getInsertMultipleResponseInsertResponse(
        client.ServiceNow_u_import_set_test_importStub.InsertMultipleResponse wrappedType) {
        return wrappedType.getInsertResponse();
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory, java.lang.String param1,
        java.lang.String param2, java.lang.String param3,
        java.math.BigInteger param4, java.lang.String param5,
        java.lang.String param6, java.lang.String param7,
        java.math.BigInteger param8, java.lang.String param9,
        java.lang.String param10, java.lang.String param11,
        java.lang.String param12, java.lang.String param13,
        java.lang.String param14, java.lang.String param15,
        java.lang.String param16, java.lang.String param17,
        java.lang.String param18, java.lang.String param19,
        java.lang.String param20, java.lang.String param21,
        java.lang.String param22, java.lang.String param23,
        java.lang.String param24, java.lang.String param25,
        client.ServiceNow_u_import_set_test_importStub.GetKeys dummyWrappedType,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            client.ServiceNow_u_import_set_test_importStub.GetKeys wrappedType = new client.ServiceNow_u_import_set_test_importStub.GetKeys();

            wrappedType.setSys_class_name(param1);

            wrappedType.setSys_created_by(param2);

            wrappedType.setSys_created_on(param3);

            wrappedType.setSys_import_row(param4);

            wrappedType.setSys_import_set(param5);

            wrappedType.setSys_import_state(param6);

            wrappedType.setSys_import_state_comment(param7);

            wrappedType.setSys_mod_count(param8);

            wrappedType.setSys_row_error(param9);

            wrappedType.setSys_target_sys_id(param10);

            wrappedType.setSys_target_table(param11);

            wrappedType.setSys_transform_map(param12);

            wrappedType.setSys_updated_by(param13);

            wrappedType.setSys_updated_on(param14);

            wrappedType.setTemplate_import_log(param15);

            wrappedType.setU_1(param16);

            wrappedType.setU_1_record_1(param17);

            wrappedType.setU_id(param18);

            wrappedType.setU_record(param19);

            wrappedType.setU_record_1(param20);

            wrappedType.set__use_view(param21);

            wrappedType.set__encoded_query(param22);

            wrappedType.set__limit(param23);

            wrappedType.set__first_row(param24);

            wrappedType.set__last_row(param25);

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(wrappedType.getOMElement(
                    client.ServiceNow_u_import_set_test_importStub.GetKeys.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private java.lang.String[] getGetKeysResponseSys_id(
        client.ServiceNow_u_import_set_test_importStub.GetKeysResponse wrappedType) {
        return wrappedType.getSys_id();
    }

    private java.lang.String getGetKeysResponseCount(
        client.ServiceNow_u_import_set_test_importStub.GetKeysResponse wrappedType) {
        return wrappedType.getCount();
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory, java.lang.String param1,
        java.lang.String param2, java.lang.String param3,
        java.lang.String param4, java.math.BigInteger param5,
        java.lang.String param6, java.lang.String param7,
        java.lang.String param8, java.math.BigInteger param9,
        java.lang.String param10, java.lang.String param11,
        java.lang.String param12, java.lang.String param13,
        java.lang.String param14, java.lang.String param15,
        java.lang.String param16, java.lang.String param17,
        java.lang.String param18, java.lang.String param19,
        java.lang.String param20, java.lang.String param21,
        java.lang.String param22, java.lang.String param23,
        java.lang.String param24, java.lang.String param25,
        java.lang.String param26, java.lang.String param27,
        java.lang.String param28, java.lang.String param29,
        client.ServiceNow_u_import_set_test_importStub.GetRecords dummyWrappedType,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            client.ServiceNow_u_import_set_test_importStub.GetRecords wrappedType =
                new client.ServiceNow_u_import_set_test_importStub.GetRecords();

            wrappedType.setSys_class_name(param1);

            wrappedType.setSys_created_by(param2);

            wrappedType.setSys_created_on(param3);

            wrappedType.setSys_id(param4);

            wrappedType.setSys_import_row(param5);

            wrappedType.setSys_import_set(param6);

            wrappedType.setSys_import_state(param7);

            wrappedType.setSys_import_state_comment(param8);

            wrappedType.setSys_mod_count(param9);

            wrappedType.setSys_row_error(param10);

            wrappedType.setSys_target_sys_id(param11);

            wrappedType.setSys_target_table(param12);

            wrappedType.setSys_transform_map(param13);

            wrappedType.setSys_updated_by(param14);

            wrappedType.setSys_updated_on(param15);

            wrappedType.setTemplate_import_log(param16);

            wrappedType.setU_1(param17);

            wrappedType.setU_1_record_1(param18);

            wrappedType.setU_id(param19);

            wrappedType.setU_record(param20);

            wrappedType.setU_record_1(param21);

            wrappedType.set__use_view(param22);

            wrappedType.set__encoded_query(param23);

            wrappedType.set__limit(param24);

            wrappedType.set__first_row(param25);

            wrappedType.set__last_row(param26);

            wrappedType.set__order_by(param27);

            wrappedType.set__order_by_desc(param28);

            wrappedType.set__exclude_columns(param29);

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(wrappedType.getOMElement(
                    client.ServiceNow_u_import_set_test_importStub.GetRecords.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private client.ServiceNow_u_import_set_test_importStub.GetRecordsResult_type0[] getGetRecordsResponseGetRecordsResult(
        client.ServiceNow_u_import_set_test_importStub.GetRecordsResponse wrappedType) {
        return wrappedType.getGetRecordsResult();
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory, java.lang.String param1,
        java.lang.String param2, java.lang.String param3,
        java.lang.String param4, java.lang.String param5,
        java.lang.String param6,
        client.ServiceNow_u_import_set_test_importStub.Insert dummyWrappedType,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            client.ServiceNow_u_import_set_test_importStub.Insert wrappedType = new client.ServiceNow_u_import_set_test_importStub.Insert();

            wrappedType.setTemplate_import_log(param1);

            wrappedType.setU_1(param2);

            wrappedType.setU_1_record_1(param3);

            wrappedType.setU_id(param4);

            wrappedType.setU_record(param5);

            wrappedType.setU_record_1(param6);

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(wrappedType.getOMElement(
                    client.ServiceNow_u_import_set_test_importStub.Insert.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private java.lang.String getInsertResponseSys_id(
        client.ServiceNow_u_import_set_test_importStub.InsertResponse wrappedType) {
        return wrappedType.getSys_id();
    }

    private java.lang.String getInsertResponseTable(
        client.ServiceNow_u_import_set_test_importStub.InsertResponse wrappedType) {
        return wrappedType.getTable();
    }

    private java.lang.String getInsertResponseDisplay_name(
        client.ServiceNow_u_import_set_test_importStub.InsertResponse wrappedType) {
        return wrappedType.getDisplay_name();
    }

    private java.lang.String getInsertResponseDisplay_value(
        client.ServiceNow_u_import_set_test_importStub.InsertResponse wrappedType) {
        return wrappedType.getDisplay_value();
    }

    private java.lang.String getInsertResponseStatus(
        client.ServiceNow_u_import_set_test_importStub.InsertResponse wrappedType) {
        return wrappedType.getStatus();
    }

    private java.lang.String getInsertResponseStatus_message(
        client.ServiceNow_u_import_set_test_importStub.InsertResponse wrappedType) {
        return wrappedType.getStatus_message();
    }

    private java.lang.String getInsertResponseError_message(
        client.ServiceNow_u_import_set_test_importStub.InsertResponse wrappedType) {
        return wrappedType.getError_message();
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory, java.lang.String param1,
        java.lang.String param2, java.lang.String param3,
        java.lang.String param4, java.lang.String param5,
        java.lang.String param6, java.lang.String param7,
        client.ServiceNow_u_import_set_test_importStub.Update dummyWrappedType,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            client.ServiceNow_u_import_set_test_importStub.Update wrappedType = new client.ServiceNow_u_import_set_test_importStub.Update();

            wrappedType.setSys_id(param1);

            wrappedType.setTemplate_import_log(param2);

            wrappedType.setU_1(param3);

            wrappedType.setU_1_record_1(param4);

            wrappedType.setU_id(param5);

            wrappedType.setU_record(param6);

            wrappedType.setU_record_1(param7);

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(wrappedType.getOMElement(
                    client.ServiceNow_u_import_set_test_importStub.Update.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private java.lang.String getUpdateResponseSys_id(
        client.ServiceNow_u_import_set_test_importStub.UpdateResponse wrappedType) {
        return wrappedType.getSys_id();
    }

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
        java.lang.Class type, java.util.Map extraNamespaces)
        throws org.apache.axis2.AxisFault {
        try {
            if (client.ServiceNow_u_import_set_test_importStub.DeleteMultiple.class.equals(
                        type)) {
                return client.ServiceNow_u_import_set_test_importStub.DeleteMultiple.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (client.ServiceNow_u_import_set_test_importStub.DeleteMultipleResponse.class.equals(
                        type)) {
                return client.ServiceNow_u_import_set_test_importStub.DeleteMultipleResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (client.ServiceNow_u_import_set_test_importStub.DeleteRecord.class.equals(
                        type)) {
                return client.ServiceNow_u_import_set_test_importStub.DeleteRecord.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (client.ServiceNow_u_import_set_test_importStub.DeleteRecordResponse.class.equals(
                        type)) {
                return client.ServiceNow_u_import_set_test_importStub.DeleteRecordResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (client.ServiceNow_u_import_set_test_importStub.Get.class.equals(
                        type)) {
                return client.ServiceNow_u_import_set_test_importStub.Get.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (client.ServiceNow_u_import_set_test_importStub.GetKeys.class.equals(
                        type)) {
                return client.ServiceNow_u_import_set_test_importStub.GetKeys.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (client.ServiceNow_u_import_set_test_importStub.GetKeysResponse.class.equals(
                        type)) {
                return client.ServiceNow_u_import_set_test_importStub.GetKeysResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (client.ServiceNow_u_import_set_test_importStub.GetRecords.class.equals(
                        type)) {
                return client.ServiceNow_u_import_set_test_importStub.GetRecords.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (client.ServiceNow_u_import_set_test_importStub.GetRecordsResponse.class.equals(
                        type)) {
                return client.ServiceNow_u_import_set_test_importStub.GetRecordsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (client.ServiceNow_u_import_set_test_importStub.GetResponse.class.equals(
                        type)) {
                return client.ServiceNow_u_import_set_test_importStub.GetResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (client.ServiceNow_u_import_set_test_importStub.Insert.class.equals(
                        type)) {
                return client.ServiceNow_u_import_set_test_importStub.Insert.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (client.ServiceNow_u_import_set_test_importStub.InsertMultiple.class.equals(
                        type)) {
                return client.ServiceNow_u_import_set_test_importStub.InsertMultiple.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (client.ServiceNow_u_import_set_test_importStub.InsertMultipleResponse.class.equals(
                        type)) {
                return client.ServiceNow_u_import_set_test_importStub.InsertMultipleResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (client.ServiceNow_u_import_set_test_importStub.InsertResponse.class.equals(
                        type)) {
                return client.ServiceNow_u_import_set_test_importStub.InsertResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (client.ServiceNow_u_import_set_test_importStub.Update.class.equals(
                        type)) {
                return client.ServiceNow_u_import_set_test_importStub.Update.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (client.ServiceNow_u_import_set_test_importStub.UpdateResponse.class.equals(
                        type)) {
                return client.ServiceNow_u_import_set_test_importStub.UpdateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }

    //https://dev239.service-now.com/u_import_set_test_import.do?SOAP
    public static class InsertResponse_type0 implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = insertResponse_type0
           Namespace URI = http://www.service-now.com/u_import_set_test_import
           Namespace Prefix = ns1
         */

        /**
         * field for Sys_id
         */
        protected java.lang.String localSys_id;

        /**
         * field for Table
         */
        protected java.lang.String localTable;

        /**
         * field for Display_name
         */
        protected java.lang.String localDisplay_name;

        /**
         * field for Display_value
         */
        protected java.lang.String localDisplay_value;

        /**
         * field for Status
         */
        protected java.lang.String localStatus;

        /**
         * field for Status_message
         */
        protected java.lang.String localStatus_message;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localStatus_messageTracker = false;

        /**
         * field for Error_message
         */
        protected java.lang.String localError_message;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localError_messageTracker = false;

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_id() {
            return localSys_id;
        }

        /**
         * Auto generated setter method
         * @param param Sys_id
         */
        public void setSys_id(java.lang.String param) {
            this.localSys_id = param;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getTable() {
            return localTable;
        }

        /**
         * Auto generated setter method
         * @param param Table
         */
        public void setTable(java.lang.String param) {
            this.localTable = param;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getDisplay_name() {
            return localDisplay_name;
        }

        /**
         * Auto generated setter method
         * @param param Display_name
         */
        public void setDisplay_name(java.lang.String param) {
            this.localDisplay_name = param;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getDisplay_value() {
            return localDisplay_value;
        }

        /**
         * Auto generated setter method
         * @param param Display_value
         */
        public void setDisplay_value(java.lang.String param) {
            this.localDisplay_value = param;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getStatus() {
            return localStatus;
        }

        /**
         * Auto generated setter method
         * @param param Status
         */
        public void setStatus(java.lang.String param) {
            this.localStatus = param;
        }

        public boolean isStatus_messageSpecified() {
            return localStatus_messageTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getStatus_message() {
            return localStatus_message;
        }

        /**
         * Auto generated setter method
         * @param param Status_message
         */
        public void setStatus_message(java.lang.String param) {
            localStatus_messageTracker = param != null;

            this.localStatus_message = param;
        }

        public boolean isError_messageSpecified() {
            return localError_messageTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getError_message() {
            return localError_message;
        }

        /**
         * Auto generated setter method
         * @param param Error_message
         */
        public void setError_message(java.lang.String param) {
            localError_messageTracker = param != null;

            this.localError_message = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);

            return factory.createOMElement(dataSource, parentQName);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/u_import_set_test_import");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":insertResponse_type0", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "insertResponse_type0", xmlWriter);
                }
            }

            namespace = "";
            writeStartElement(null, namespace, "sys_id", xmlWriter);

            if (localSys_id == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "sys_id cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSys_id);
            }

            xmlWriter.writeEndElement();

            namespace = "";
            writeStartElement(null, namespace, "table", xmlWriter);

            if (localTable == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "table cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTable);
            }

            xmlWriter.writeEndElement();

            namespace = "";
            writeStartElement(null, namespace, "display_name", xmlWriter);

            if (localDisplay_name == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "display_name cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localDisplay_name);
            }

            xmlWriter.writeEndElement();

            namespace = "";
            writeStartElement(null, namespace, "display_value", xmlWriter);

            if (localDisplay_value == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "display_value cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localDisplay_value);
            }

            xmlWriter.writeEndElement();

            namespace = "";
            writeStartElement(null, namespace, "status", xmlWriter);

            if (localStatus == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "status cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localStatus);
            }

            xmlWriter.writeEndElement();

            if (localStatus_messageTracker) {
                namespace = "";
                writeStartElement(null, namespace, "status_message", xmlWriter);

                if (localStatus_message == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "status_message cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localStatus_message);
                }

                xmlWriter.writeEndElement();
            }

            if (localError_messageTracker) {
                namespace = "";
                writeStartElement(null, namespace, "error_message", xmlWriter);

                if (localError_message == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "error_message cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localError_message);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals(
                        "http://www.service-now.com/u_import_set_test_import")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("", "sys_id"));

            if (localSys_id != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localSys_id));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "sys_id cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("", "table"));

            if (localTable != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localTable));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "table cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("", "display_name"));

            if (localDisplay_name != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localDisplay_name));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "display_name cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("", "display_value"));

            if (localDisplay_value != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localDisplay_value));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "display_value cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("", "status"));

            if (localStatus != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localStatus));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "status cannot be null!!");
            }

            if (localStatus_messageTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "status_message"));

                if (localStatus_message != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localStatus_message));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "status_message cannot be null!!");
                }
            }

            if (localError_messageTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "error_message"));

                if (localError_message != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localError_message));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "error_message cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static InsertResponse_type0 parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                InsertResponse_type0 object = new InsertResponse_type0();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"insertResponse_type0".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (InsertResponse_type0) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_id").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_id" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "table").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "table" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setTable(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "display_name").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "display_name" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setDisplay_name(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "display_value").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "display_value" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setDisplay_value(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "status").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "status" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setStatus(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "status_message").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "status_message" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setStatus_message(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "error_message").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "error_message" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setError_message(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class ExtensionMapper {
        public static java.lang.Object getTypeObject(
            java.lang.String namespaceURI, java.lang.String typeName,
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            if ("http://www.service-now.com/u_import_set_test_import".equals(
                        namespaceURI) &&
                    "getRecordsResult_type0".equals(typeName)) {
                return GetRecordsResult_type0.Factory.parse(reader);
            }

            if ("http://www.service-now.com/u_import_set_test_import".equals(
                        namespaceURI) &&
                    "insertResponse_type0".equals(typeName)) {
                return InsertResponse_type0.Factory.parse(reader);
            }

            if ("http://www.service-now.com/u_import_set_test_import".equals(
                        namespaceURI) && "record_type0".equals(typeName)) {
                return Record_type0.Factory.parse(reader);
            }

            throw new org.apache.axis2.databinding.ADBException(
                "Unsupported type " + namespaceURI + " " + typeName);
        }
    }

    public static class InsertResponse implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/u_import_set_test_import",
                "insertResponse", "ns1");

        /**
         * field for Sys_id
         */
        protected java.lang.String localSys_id;

        /**
         * field for Table
         */
        protected java.lang.String localTable;

        /**
         * field for Display_name
         */
        protected java.lang.String localDisplay_name;

        /**
         * field for Display_value
         */
        protected java.lang.String localDisplay_value;

        /**
         * field for Status
         */
        protected java.lang.String localStatus;

        /**
         * field for Status_message
         */
        protected java.lang.String localStatus_message;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localStatus_messageTracker = false;

        /**
         * field for Error_message
         */
        protected java.lang.String localError_message;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localError_messageTracker = false;

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_id() {
            return localSys_id;
        }

        /**
         * Auto generated setter method
         * @param param Sys_id
         */
        public void setSys_id(java.lang.String param) {
            this.localSys_id = param;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getTable() {
            return localTable;
        }

        /**
         * Auto generated setter method
         * @param param Table
         */
        public void setTable(java.lang.String param) {
            this.localTable = param;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getDisplay_name() {
            return localDisplay_name;
        }

        /**
         * Auto generated setter method
         * @param param Display_name
         */
        public void setDisplay_name(java.lang.String param) {
            this.localDisplay_name = param;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getDisplay_value() {
            return localDisplay_value;
        }

        /**
         * Auto generated setter method
         * @param param Display_value
         */
        public void setDisplay_value(java.lang.String param) {
            this.localDisplay_value = param;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getStatus() {
            return localStatus;
        }

        /**
         * Auto generated setter method
         * @param param Status
         */
        public void setStatus(java.lang.String param) {
            this.localStatus = param;
        }

        public boolean isStatus_messageSpecified() {
            return localStatus_messageTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getStatus_message() {
            return localStatus_message;
        }

        /**
         * Auto generated setter method
         * @param param Status_message
         */
        public void setStatus_message(java.lang.String param) {
            localStatus_messageTracker = param != null;

            this.localStatus_message = param;
        }

        public boolean isError_messageSpecified() {
            return localError_messageTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getError_message() {
            return localError_message;
        }

        /**
         * Auto generated setter method
         * @param param Error_message
         */
        public void setError_message(java.lang.String param) {
            localError_messageTracker = param != null;

            this.localError_message = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    MY_QNAME);

            return factory.createOMElement(dataSource, MY_QNAME);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/u_import_set_test_import");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":insertResponse", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "insertResponse", xmlWriter);
                }
            }

            namespace = "";
            writeStartElement(null, namespace, "sys_id", xmlWriter);

            if (localSys_id == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "sys_id cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSys_id);
            }

            xmlWriter.writeEndElement();

            namespace = "";
            writeStartElement(null, namespace, "table", xmlWriter);

            if (localTable == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "table cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTable);
            }

            xmlWriter.writeEndElement();

            namespace = "";
            writeStartElement(null, namespace, "display_name", xmlWriter);

            if (localDisplay_name == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "display_name cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localDisplay_name);
            }

            xmlWriter.writeEndElement();

            namespace = "";
            writeStartElement(null, namespace, "display_value", xmlWriter);

            if (localDisplay_value == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "display_value cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localDisplay_value);
            }

            xmlWriter.writeEndElement();

            namespace = "";
            writeStartElement(null, namespace, "status", xmlWriter);

            if (localStatus == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "status cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localStatus);
            }

            xmlWriter.writeEndElement();

            if (localStatus_messageTracker) {
                namespace = "";
                writeStartElement(null, namespace, "status_message", xmlWriter);

                if (localStatus_message == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "status_message cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localStatus_message);
                }

                xmlWriter.writeEndElement();
            }

            if (localError_messageTracker) {
                namespace = "";
                writeStartElement(null, namespace, "error_message", xmlWriter);

                if (localError_message == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "error_message cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localError_message);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals(
                        "http://www.service-now.com/u_import_set_test_import")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("", "sys_id"));

            if (localSys_id != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localSys_id));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "sys_id cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("", "table"));

            if (localTable != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localTable));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "table cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("", "display_name"));

            if (localDisplay_name != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localDisplay_name));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "display_name cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("", "display_value"));

            if (localDisplay_value != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localDisplay_value));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "display_value cannot be null!!");
            }

            elementList.add(new javax.xml.namespace.QName("", "status"));

            if (localStatus != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localStatus));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "status cannot be null!!");
            }

            if (localStatus_messageTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "status_message"));

                if (localStatus_message != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localStatus_message));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "status_message cannot be null!!");
                }
            }

            if (localError_messageTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "error_message"));

                if (localError_message != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localError_message));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "error_message cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static InsertResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                InsertResponse object = new InsertResponse();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"insertResponse".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (InsertResponse) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_id").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_id" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "table").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "table" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setTable(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "display_name").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "display_name" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setDisplay_name(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "display_value").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "display_value" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setDisplay_value(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "status").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "status" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setStatus(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "status_message").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "status_message" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setStatus_message(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "error_message").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "error_message" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setError_message(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class GetKeysResponse implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/u_import_set_test_import",
                "getKeysResponse", "ns1");

        /**
         * field for Sys_id
         * This was an Array!
         */
        protected java.lang.String[] localSys_id;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_idTracker = false;

        /**
         * field for Count
         */
        protected java.lang.String localCount;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localCountTracker = false;

        public boolean isSys_idSpecified() {
            return localSys_idTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String[]
         */
        public java.lang.String[] getSys_id() {
            return localSys_id;
        }

        /**
         * validate the array for Sys_id
         */
        protected void validateSys_id(java.lang.String[] param) {
        }

        /**
         * Auto generated setter method
         * @param param Sys_id
         */
        public void setSys_id(java.lang.String[] param) {
            validateSys_id(param);

            localSys_idTracker = param != null;

            this.localSys_id = param;
        }

        /**
         * Auto generated add method for the array for convenience
         * @param param java.lang.String
         */
        public void addSys_id(java.lang.String param) {
            if (localSys_id == null) {
                localSys_id = new java.lang.String[] {  };
            }

            //update the setting tracker
            localSys_idTracker = true;

            java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localSys_id);
            list.add(param);
            this.localSys_id = (java.lang.String[]) list.toArray(new java.lang.String[list.size()]);
        }

        public boolean isCountSpecified() {
            return localCountTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getCount() {
            return localCount;
        }

        /**
         * Auto generated setter method
         * @param param Count
         */
        public void setCount(java.lang.String param) {
            localCountTracker = param != null;

            this.localCount = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    MY_QNAME);

            return factory.createOMElement(dataSource, MY_QNAME);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/u_import_set_test_import");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":getKeysResponse", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "getKeysResponse", xmlWriter);
                }
            }

            if (localSys_idTracker) {
                if (localSys_id != null) {
                    namespace = "";

                    for (int i = 0; i < localSys_id.length; i++) {
                        if (localSys_id[i] != null) {
                            writeStartElement(null, namespace, "sys_id",
                                xmlWriter);

                            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    localSys_id[i]));

                            xmlWriter.writeEndElement();
                        } else {
                            // we have to do nothing since minOccurs is zero
                        }
                    }
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_id cannot be null!!");
                }
            }

            if (localCountTracker) {
                namespace = "";
                writeStartElement(null, namespace, "count", xmlWriter);

                if (localCount == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localCount);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals(
                        "http://www.service-now.com/u_import_set_test_import")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localSys_idTracker) {
                if (localSys_id != null) {
                    for (int i = 0; i < localSys_id.length; i++) {
                        if (localSys_id[i] != null) {
                            elementList.add(new javax.xml.namespace.QName("",
                                    "sys_id"));
                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    localSys_id[i]));
                        } else {
                            // have to do nothing
                        }
                    }
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_id cannot be null!!");
                }
            }

            if (localCountTracker) {
                elementList.add(new javax.xml.namespace.QName("", "count"));

                if (localCount != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localCount));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "count cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetKeysResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                GetKeysResponse object = new GetKeysResponse();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"getKeysResponse".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (GetKeysResponse) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    java.util.ArrayList list1 = new java.util.ArrayList();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_id").equals(
                                reader.getName())) {
                        // Process the array and step past its final element's end.
                        list1.add(reader.getElementText());

                        //loop until we find a start element that is not part of this array
                        boolean loopDone1 = false;

                        while (!loopDone1) {
                            // Ensure we are at the EndElement
                            while (!reader.isEndElement()) {
                                reader.next();
                            }

                            // Step out of this element
                            reader.next();

                            // Step to next element event.
                            while (!reader.isStartElement() &&
                                    !reader.isEndElement())
                                reader.next();

                            if (reader.isEndElement()) {
                                //two continuous end elements means we are exiting the xml structure
                                loopDone1 = true;
                            } else {
                                if (new javax.xml.namespace.QName("", "sys_id").equals(
                                            reader.getName())) {
                                    list1.add(reader.getElementText());
                                } else {
                                    loopDone1 = true;
                                }
                            }
                        }

                        // call the converter utility  to convert and set the array
                        object.setSys_id((java.lang.String[]) list1.toArray(
                                new java.lang.String[list1.size()]));
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "count" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setCount(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class Update implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/u_import_set_test_import",
                "update", "ns1");

        /**
         * field for Sys_id
         */
        protected java.lang.String localSys_id;

        /**
         * field for Template_import_log
         */
        protected java.lang.String localTemplate_import_log;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localTemplate_import_logTracker = false;

        /**
         * field for U_1
         */
        protected java.lang.String localU_1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_1Tracker = false;

        /**
         * field for U_1_record_1
         */
        protected java.lang.String localU_1_record_1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_1_record_1Tracker = false;

        /**
         * field for U_id
         */
        protected java.lang.String localU_id;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_idTracker = false;

        /**
         * field for U_record
         */
        protected java.lang.String localU_record;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_recordTracker = false;

        /**
         * field for U_record_1
         */
        protected java.lang.String localU_record_1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_record_1Tracker = false;

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_id() {
            return localSys_id;
        }

        /**
         * Auto generated setter method
         * @param param Sys_id
         */
        public void setSys_id(java.lang.String param) {
            this.localSys_id = param;
        }

        public boolean isTemplate_import_logSpecified() {
            return localTemplate_import_logTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getTemplate_import_log() {
            return localTemplate_import_log;
        }

        /**
         * Auto generated setter method
         * @param param Template_import_log
         */
        public void setTemplate_import_log(java.lang.String param) {
            localTemplate_import_logTracker = param != null;

            this.localTemplate_import_log = param;
        }

        public boolean isU_1Specified() {
            return localU_1Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_1() {
            return localU_1;
        }

        /**
         * Auto generated setter method
         * @param param U_1
         */
        public void setU_1(java.lang.String param) {
            localU_1Tracker = param != null;

            this.localU_1 = param;
        }

        public boolean isU_1_record_1Specified() {
            return localU_1_record_1Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_1_record_1() {
            return localU_1_record_1;
        }

        /**
         * Auto generated setter method
         * @param param U_1_record_1
         */
        public void setU_1_record_1(java.lang.String param) {
            localU_1_record_1Tracker = param != null;

            this.localU_1_record_1 = param;
        }

        public boolean isU_idSpecified() {
            return localU_idTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_id() {
            return localU_id;
        }

        /**
         * Auto generated setter method
         * @param param U_id
         */
        public void setU_id(java.lang.String param) {
            localU_idTracker = param != null;

            this.localU_id = param;
        }

        public boolean isU_recordSpecified() {
            return localU_recordTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_record() {
            return localU_record;
        }

        /**
         * Auto generated setter method
         * @param param U_record
         */
        public void setU_record(java.lang.String param) {
            localU_recordTracker = param != null;

            this.localU_record = param;
        }

        public boolean isU_record_1Specified() {
            return localU_record_1Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_record_1() {
            return localU_record_1;
        }

        /**
         * Auto generated setter method
         * @param param U_record_1
         */
        public void setU_record_1(java.lang.String param) {
            localU_record_1Tracker = param != null;

            this.localU_record_1 = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    MY_QNAME);

            return factory.createOMElement(dataSource, MY_QNAME);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/u_import_set_test_import");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":update", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "update", xmlWriter);
                }
            }

            namespace = "";
            writeStartElement(null, namespace, "sys_id", xmlWriter);

            if (localSys_id == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "sys_id cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSys_id);
            }

            xmlWriter.writeEndElement();

            if (localTemplate_import_logTracker) {
                namespace = "";
                writeStartElement(null, namespace, "template_import_log",
                    xmlWriter);

                if (localTemplate_import_log == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "template_import_log cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localTemplate_import_log);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_1Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_1", xmlWriter);

                if (localU_1 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_1);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_1_record_1Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_1_record_1", xmlWriter);

                if (localU_1_record_1 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1_record_1 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_1_record_1);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_idTracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_id", xmlWriter);

                if (localU_id == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_id cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_id);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_recordTracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_record", xmlWriter);

                if (localU_record == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_record);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_record_1Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_record_1", xmlWriter);

                if (localU_record_1 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record_1 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_record_1);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals(
                        "http://www.service-now.com/u_import_set_test_import")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("", "sys_id"));

            if (localSys_id != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localSys_id));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "sys_id cannot be null!!");
            }

            if (localTemplate_import_logTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "template_import_log"));

                if (localTemplate_import_log != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localTemplate_import_log));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "template_import_log cannot be null!!");
                }
            }

            if (localU_1Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_1"));

                if (localU_1 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_1));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1 cannot be null!!");
                }
            }

            if (localU_1_record_1Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_1_record_1"));

                if (localU_1_record_1 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_1_record_1));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1_record_1 cannot be null!!");
                }
            }

            if (localU_idTracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_id"));

                if (localU_id != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_id));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_id cannot be null!!");
                }
            }

            if (localU_recordTracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_record"));

                if (localU_record != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_record));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record cannot be null!!");
                }
            }

            if (localU_record_1Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_record_1"));

                if (localU_record_1 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_record_1));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record_1 cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static Update parse(javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                Update object = new Update();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"update".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (Update) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_id").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_id" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("",
                                "template_import_log").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "template_import_log" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setTemplate_import_log(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_1").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_1" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_1_record_1").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_1_record_1" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_1_record_1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_id").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_id" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_record").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_record" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_record(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_record_1").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_record_1" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_record_1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class Insert implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/u_import_set_test_import",
                "insert", "ns1");

        /**
         * field for Template_import_log
         */
        protected java.lang.String localTemplate_import_log;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localTemplate_import_logTracker = false;

        /**
         * field for U_1
         */
        protected java.lang.String localU_1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_1Tracker = false;

        /**
         * field for U_1_record_1
         */
        protected java.lang.String localU_1_record_1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_1_record_1Tracker = false;

        /**
         * field for U_id
         */
        protected java.lang.String localU_id;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_idTracker = false;

        /**
         * field for U_record
         */
        protected java.lang.String localU_record;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_recordTracker = false;

        /**
         * field for U_record_1
         */
        protected java.lang.String localU_record_1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_record_1Tracker = false;

        public boolean isTemplate_import_logSpecified() {
            return localTemplate_import_logTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getTemplate_import_log() {
            return localTemplate_import_log;
        }

        /**
         * Auto generated setter method
         * @param param Template_import_log
         */
        public void setTemplate_import_log(java.lang.String param) {
            localTemplate_import_logTracker = param != null;

            this.localTemplate_import_log = param;
        }

        public boolean isU_1Specified() {
            return localU_1Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_1() {
            return localU_1;
        }

        /**
         * Auto generated setter method
         * @param param U_1
         */
        public void setU_1(java.lang.String param) {
            localU_1Tracker = param != null;

            this.localU_1 = param;
        }

        public boolean isU_1_record_1Specified() {
            return localU_1_record_1Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_1_record_1() {
            return localU_1_record_1;
        }

        /**
         * Auto generated setter method
         * @param param U_1_record_1
         */
        public void setU_1_record_1(java.lang.String param) {
            localU_1_record_1Tracker = param != null;

            this.localU_1_record_1 = param;
        }

        public boolean isU_idSpecified() {
            return localU_idTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_id() {
            return localU_id;
        }

        /**
         * Auto generated setter method
         * @param param U_id
         */
        public void setU_id(java.lang.String param) {
            localU_idTracker = param != null;

            this.localU_id = param;
        }

        public boolean isU_recordSpecified() {
            return localU_recordTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_record() {
            return localU_record;
        }

        /**
         * Auto generated setter method
         * @param param U_record
         */
        public void setU_record(java.lang.String param) {
            localU_recordTracker = param != null;

            this.localU_record = param;
        }

        public boolean isU_record_1Specified() {
            return localU_record_1Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_record_1() {
            return localU_record_1;
        }

        /**
         * Auto generated setter method
         * @param param U_record_1
         */
        public void setU_record_1(java.lang.String param) {
            localU_record_1Tracker = param != null;

            this.localU_record_1 = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    MY_QNAME);

            return factory.createOMElement(dataSource, MY_QNAME);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/u_import_set_test_import");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":insert", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "insert", xmlWriter);
                }
            }

            if (localTemplate_import_logTracker) {
                namespace = "";
                writeStartElement(null, namespace, "template_import_log",
                    xmlWriter);

                if (localTemplate_import_log == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "template_import_log cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localTemplate_import_log);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_1Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_1", xmlWriter);

                if (localU_1 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_1);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_1_record_1Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_1_record_1", xmlWriter);

                if (localU_1_record_1 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1_record_1 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_1_record_1);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_idTracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_id", xmlWriter);

                if (localU_id == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_id cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_id);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_recordTracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_record", xmlWriter);

                if (localU_record == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_record);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_record_1Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_record_1", xmlWriter);

                if (localU_record_1 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record_1 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_record_1);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals(
                        "http://www.service-now.com/u_import_set_test_import")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localTemplate_import_logTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "template_import_log"));

                if (localTemplate_import_log != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localTemplate_import_log));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "template_import_log cannot be null!!");
                }
            }

            if (localU_1Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_1"));

                if (localU_1 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_1));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1 cannot be null!!");
                }
            }

            if (localU_1_record_1Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_1_record_1"));

                if (localU_1_record_1 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_1_record_1));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1_record_1 cannot be null!!");
                }
            }

            if (localU_idTracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_id"));

                if (localU_id != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_id));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_id cannot be null!!");
                }
            }

            if (localU_recordTracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_record"));

                if (localU_record != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_record));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record cannot be null!!");
                }
            }

            if (localU_record_1Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_record_1"));

                if (localU_record_1 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_record_1));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record_1 cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static Insert parse(javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                Insert object = new Insert();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"insert".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (Insert) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("",
                                "template_import_log").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "template_import_log" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setTemplate_import_log(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_1").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_1" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_1_record_1").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_1_record_1" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_1_record_1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_id").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_id" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_record").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_record" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_record(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_record_1").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_record_1" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_record_1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class InsertMultipleResponse implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/u_import_set_test_import",
                "insertMultipleResponse", "ns1");

        /**
         * field for InsertResponse
         * This was an Array!
         */
        protected InsertResponse_type0[] localInsertResponse;

        /**
         * Auto generated getter method
         * @return InsertResponse_type0[]
         */
        public InsertResponse_type0[] getInsertResponse() {
            return localInsertResponse;
        }

        /**
         * validate the array for InsertResponse
         */
        protected void validateInsertResponse(InsertResponse_type0[] param) {
            if ((param != null) && (param.length < 1)) {
                throw new java.lang.RuntimeException(
                    "Input values do not follow defined XSD restrictions");
            }
        }

        /**
         * Auto generated setter method
         * @param param InsertResponse
         */
        public void setInsertResponse(InsertResponse_type0[] param) {
            validateInsertResponse(param);

            this.localInsertResponse = param;
        }

        /**
         * Auto generated add method for the array for convenience
         * @param param InsertResponse_type0
         */
        public void addInsertResponse(InsertResponse_type0 param) {
            if (localInsertResponse == null) {
                localInsertResponse = new InsertResponse_type0[] {  };
            }

            java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localInsertResponse);
            list.add(param);
            this.localInsertResponse = (InsertResponse_type0[]) list.toArray(new InsertResponse_type0[list.size()]);
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    MY_QNAME);

            return factory.createOMElement(dataSource, MY_QNAME);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/u_import_set_test_import");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":insertMultipleResponse", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "insertMultipleResponse", xmlWriter);
                }
            }

            if (localInsertResponse != null) {
                for (int i = 0; i < localInsertResponse.length; i++) {
                    if (localInsertResponse[i] != null) {
                        localInsertResponse[i].serialize(new javax.xml.namespace.QName(
                                "", "insertResponse"), xmlWriter);
                    } else {
                        throw new org.apache.axis2.databinding.ADBException(
                            "insertResponse cannot be null!!");
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "insertResponse cannot be null!!");
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals(
                        "http://www.service-now.com/u_import_set_test_import")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localInsertResponse != null) {
                for (int i = 0; i < localInsertResponse.length; i++) {
                    if (localInsertResponse[i] != null) {
                        elementList.add(new javax.xml.namespace.QName("",
                                "insertResponse"));
                        elementList.add(localInsertResponse[i]);
                    } else {
                        throw new org.apache.axis2.databinding.ADBException(
                            "insertResponse cannot be null !!");
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "insertResponse cannot be null!!");
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static InsertMultipleResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                InsertMultipleResponse object = new InsertMultipleResponse();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"insertMultipleResponse".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (InsertMultipleResponse) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    java.util.ArrayList list1 = new java.util.ArrayList();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "insertResponse").equals(
                                reader.getName())) {
                        // Process the array and step past its final element's end.
                        list1.add(InsertResponse_type0.Factory.parse(reader));

                        //loop until we find a start element that is not part of this array
                        boolean loopDone1 = false;

                        while (!loopDone1) {
                            // We should be at the end element, but make sure
                            while (!reader.isEndElement())
                                reader.next();

                            // Step out of this element
                            reader.next();

                            // Step to next element event.
                            while (!reader.isStartElement() &&
                                    !reader.isEndElement())
                                reader.next();

                            if (reader.isEndElement()) {
                                //two continuous end elements means we are exiting the xml structure
                                loopDone1 = true;
                            } else {
                                if (new javax.xml.namespace.QName("",
                                            "insertResponse").equals(
                                            reader.getName())) {
                                    list1.add(InsertResponse_type0.Factory.parse(
                                            reader));
                                } else {
                                    loopDone1 = true;
                                }
                            }
                        }

                        // call the converter utility  to convert and set the array
                        object.setInsertResponse((InsertResponse_type0[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                InsertResponse_type0.class, list1));
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class GetResponse implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/u_import_set_test_import",
                "getResponse", "ns1");

        /**
         * field for Sys_class_name
         */
        protected java.lang.String localSys_class_name;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_class_nameTracker = false;

        /**
         * field for Sys_created_by
         */
        protected java.lang.String localSys_created_by;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_created_byTracker = false;

        /**
         * field for Sys_created_on
         */
        protected java.lang.String localSys_created_on;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_created_onTracker = false;

        /**
         * field for Sys_id
         */
        protected java.lang.String localSys_id;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_idTracker = false;

        /**
         * field for Sys_import_row
         */
        protected java.math.BigInteger localSys_import_row;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_import_rowTracker = false;

        /**
         * field for Sys_import_set
         */
        protected java.lang.String localSys_import_set;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_import_setTracker = false;

        /**
         * field for Sys_import_state
         */
        protected java.lang.String localSys_import_state;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_import_stateTracker = false;

        /**
         * field for Sys_import_state_comment
         */
        protected java.lang.String localSys_import_state_comment;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_import_state_commentTracker = false;

        /**
         * field for Sys_mod_count
         */
        protected java.math.BigInteger localSys_mod_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_mod_countTracker = false;

        /**
         * field for Sys_row_error
         */
        protected java.lang.String localSys_row_error;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_row_errorTracker = false;

        /**
         * field for Sys_target_sys_id
         */
        protected java.lang.String localSys_target_sys_id;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_target_sys_idTracker = false;

        /**
         * field for Sys_target_table
         */
        protected java.lang.String localSys_target_table;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_target_tableTracker = false;

        /**
         * field for Sys_transform_map
         */
        protected java.lang.String localSys_transform_map;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_transform_mapTracker = false;

        /**
         * field for Sys_updated_by
         */
        protected java.lang.String localSys_updated_by;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_updated_byTracker = false;

        /**
         * field for Sys_updated_on
         */
        protected java.lang.String localSys_updated_on;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_updated_onTracker = false;

        /**
         * field for Template_import_log
         */
        protected java.lang.String localTemplate_import_log;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localTemplate_import_logTracker = false;

        /**
         * field for U_1
         */
        protected java.lang.String localU_1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_1Tracker = false;

        /**
         * field for U_1_record_1
         */
        protected java.lang.String localU_1_record_1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_1_record_1Tracker = false;

        /**
         * field for U_id
         */
        protected java.lang.String localU_id;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_idTracker = false;

        /**
         * field for U_record
         */
        protected java.lang.String localU_record;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_recordTracker = false;

        /**
         * field for U_record_1
         */
        protected java.lang.String localU_record_1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_record_1Tracker = false;

        public boolean isSys_class_nameSpecified() {
            return localSys_class_nameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_class_name() {
            return localSys_class_name;
        }

        /**
         * Auto generated setter method
         * @param param Sys_class_name
         */
        public void setSys_class_name(java.lang.String param) {
            localSys_class_nameTracker = param != null;

            this.localSys_class_name = param;
        }

        public boolean isSys_created_bySpecified() {
            return localSys_created_byTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_created_by() {
            return localSys_created_by;
        }

        /**
         * Auto generated setter method
         * @param param Sys_created_by
         */
        public void setSys_created_by(java.lang.String param) {
            localSys_created_byTracker = param != null;

            this.localSys_created_by = param;
        }

        public boolean isSys_created_onSpecified() {
            return localSys_created_onTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_created_on() {
            return localSys_created_on;
        }

        /**
         * Auto generated setter method
         * @param param Sys_created_on
         */
        public void setSys_created_on(java.lang.String param) {
            localSys_created_onTracker = param != null;

            this.localSys_created_on = param;
        }

        public boolean isSys_idSpecified() {
            return localSys_idTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_id() {
            return localSys_id;
        }

        /**
         * Auto generated setter method
         * @param param Sys_id
         */
        public void setSys_id(java.lang.String param) {
            localSys_idTracker = param != null;

            this.localSys_id = param;
        }

        public boolean isSys_import_rowSpecified() {
            return localSys_import_rowTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getSys_import_row() {
            return localSys_import_row;
        }

        /**
         * Auto generated setter method
         * @param param Sys_import_row
         */
        public void setSys_import_row(java.math.BigInteger param) {
            localSys_import_rowTracker = param != null;

            this.localSys_import_row = param;
        }

        public boolean isSys_import_setSpecified() {
            return localSys_import_setTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_import_set() {
            return localSys_import_set;
        }

        /**
         * Auto generated setter method
         * @param param Sys_import_set
         */
        public void setSys_import_set(java.lang.String param) {
            localSys_import_setTracker = param != null;

            this.localSys_import_set = param;
        }

        public boolean isSys_import_stateSpecified() {
            return localSys_import_stateTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_import_state() {
            return localSys_import_state;
        }

        /**
         * Auto generated setter method
         * @param param Sys_import_state
         */
        public void setSys_import_state(java.lang.String param) {
            localSys_import_stateTracker = param != null;

            this.localSys_import_state = param;
        }

        public boolean isSys_import_state_commentSpecified() {
            return localSys_import_state_commentTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_import_state_comment() {
            return localSys_import_state_comment;
        }

        /**
         * Auto generated setter method
         * @param param Sys_import_state_comment
         */
        public void setSys_import_state_comment(java.lang.String param) {
            localSys_import_state_commentTracker = param != null;

            this.localSys_import_state_comment = param;
        }

        public boolean isSys_mod_countSpecified() {
            return localSys_mod_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getSys_mod_count() {
            return localSys_mod_count;
        }

        /**
         * Auto generated setter method
         * @param param Sys_mod_count
         */
        public void setSys_mod_count(java.math.BigInteger param) {
            localSys_mod_countTracker = param != null;

            this.localSys_mod_count = param;
        }

        public boolean isSys_row_errorSpecified() {
            return localSys_row_errorTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_row_error() {
            return localSys_row_error;
        }

        /**
         * Auto generated setter method
         * @param param Sys_row_error
         */
        public void setSys_row_error(java.lang.String param) {
            localSys_row_errorTracker = param != null;

            this.localSys_row_error = param;
        }

        public boolean isSys_target_sys_idSpecified() {
            return localSys_target_sys_idTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_target_sys_id() {
            return localSys_target_sys_id;
        }

        /**
         * Auto generated setter method
         * @param param Sys_target_sys_id
         */
        public void setSys_target_sys_id(java.lang.String param) {
            localSys_target_sys_idTracker = param != null;

            this.localSys_target_sys_id = param;
        }

        public boolean isSys_target_tableSpecified() {
            return localSys_target_tableTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_target_table() {
            return localSys_target_table;
        }

        /**
         * Auto generated setter method
         * @param param Sys_target_table
         */
        public void setSys_target_table(java.lang.String param) {
            localSys_target_tableTracker = param != null;

            this.localSys_target_table = param;
        }

        public boolean isSys_transform_mapSpecified() {
            return localSys_transform_mapTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_transform_map() {
            return localSys_transform_map;
        }

        /**
         * Auto generated setter method
         * @param param Sys_transform_map
         */
        public void setSys_transform_map(java.lang.String param) {
            localSys_transform_mapTracker = param != null;

            this.localSys_transform_map = param;
        }

        public boolean isSys_updated_bySpecified() {
            return localSys_updated_byTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_updated_by() {
            return localSys_updated_by;
        }

        /**
         * Auto generated setter method
         * @param param Sys_updated_by
         */
        public void setSys_updated_by(java.lang.String param) {
            localSys_updated_byTracker = param != null;

            this.localSys_updated_by = param;
        }

        public boolean isSys_updated_onSpecified() {
            return localSys_updated_onTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_updated_on() {
            return localSys_updated_on;
        }

        /**
         * Auto generated setter method
         * @param param Sys_updated_on
         */
        public void setSys_updated_on(java.lang.String param) {
            localSys_updated_onTracker = param != null;

            this.localSys_updated_on = param;
        }

        public boolean isTemplate_import_logSpecified() {
            return localTemplate_import_logTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getTemplate_import_log() {
            return localTemplate_import_log;
        }

        /**
         * Auto generated setter method
         * @param param Template_import_log
         */
        public void setTemplate_import_log(java.lang.String param) {
            localTemplate_import_logTracker = param != null;

            this.localTemplate_import_log = param;
        }

        public boolean isU_1Specified() {
            return localU_1Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_1() {
            return localU_1;
        }

        /**
         * Auto generated setter method
         * @param param U_1
         */
        public void setU_1(java.lang.String param) {
            localU_1Tracker = param != null;

            this.localU_1 = param;
        }

        public boolean isU_1_record_1Specified() {
            return localU_1_record_1Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_1_record_1() {
            return localU_1_record_1;
        }

        /**
         * Auto generated setter method
         * @param param U_1_record_1
         */
        public void setU_1_record_1(java.lang.String param) {
            localU_1_record_1Tracker = param != null;

            this.localU_1_record_1 = param;
        }

        public boolean isU_idSpecified() {
            return localU_idTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_id() {
            return localU_id;
        }

        /**
         * Auto generated setter method
         * @param param U_id
         */
        public void setU_id(java.lang.String param) {
            localU_idTracker = param != null;

            this.localU_id = param;
        }

        public boolean isU_recordSpecified() {
            return localU_recordTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_record() {
            return localU_record;
        }

        /**
         * Auto generated setter method
         * @param param U_record
         */
        public void setU_record(java.lang.String param) {
            localU_recordTracker = param != null;

            this.localU_record = param;
        }

        public boolean isU_record_1Specified() {
            return localU_record_1Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_record_1() {
            return localU_record_1;
        }

        /**
         * Auto generated setter method
         * @param param U_record_1
         */
        public void setU_record_1(java.lang.String param) {
            localU_record_1Tracker = param != null;

            this.localU_record_1 = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    MY_QNAME);

            return factory.createOMElement(dataSource, MY_QNAME);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/u_import_set_test_import");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":getResponse", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "getResponse", xmlWriter);
                }
            }

            if (localSys_class_nameTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_class_name", xmlWriter);

                if (localSys_class_name == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_class_name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_class_name);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_created_byTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_created_by", xmlWriter);

                if (localSys_created_by == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_by cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_created_by);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_created_onTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_created_on", xmlWriter);

                if (localSys_created_on == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_on cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_created_on);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_idTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_id", xmlWriter);

                if (localSys_id == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_id cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_id);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_import_rowTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_import_row", xmlWriter);

                if (localSys_import_row == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_row cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_import_row));
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_import_setTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_import_set", xmlWriter);

                if (localSys_import_set == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_set cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_import_set);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_import_stateTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_import_state", xmlWriter);

                if (localSys_import_state == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_state cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_import_state);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_import_state_commentTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_import_state_comment",
                    xmlWriter);

                if (localSys_import_state_comment == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_state_comment cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_import_state_comment);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_mod_countTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_mod_count", xmlWriter);

                if (localSys_mod_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_mod_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_mod_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_row_errorTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_row_error", xmlWriter);

                if (localSys_row_error == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_row_error cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_row_error);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_target_sys_idTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_target_sys_id",
                    xmlWriter);

                if (localSys_target_sys_id == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_target_sys_id cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_target_sys_id);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_target_tableTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_target_table", xmlWriter);

                if (localSys_target_table == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_target_table cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_target_table);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_transform_mapTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_transform_map",
                    xmlWriter);

                if (localSys_transform_map == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_transform_map cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_transform_map);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_updated_byTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_updated_by", xmlWriter);

                if (localSys_updated_by == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_by cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_updated_by);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_updated_onTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_updated_on", xmlWriter);

                if (localSys_updated_on == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_on cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_updated_on);
                }

                xmlWriter.writeEndElement();
            }

            if (localTemplate_import_logTracker) {
                namespace = "";
                writeStartElement(null, namespace, "template_import_log",
                    xmlWriter);

                if (localTemplate_import_log == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "template_import_log cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localTemplate_import_log);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_1Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_1", xmlWriter);

                if (localU_1 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_1);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_1_record_1Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_1_record_1", xmlWriter);

                if (localU_1_record_1 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1_record_1 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_1_record_1);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_idTracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_id", xmlWriter);

                if (localU_id == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_id cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_id);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_recordTracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_record", xmlWriter);

                if (localU_record == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_record);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_record_1Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_record_1", xmlWriter);

                if (localU_record_1 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record_1 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_record_1);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals(
                        "http://www.service-now.com/u_import_set_test_import")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localSys_class_nameTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_class_name"));

                if (localSys_class_name != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_class_name));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_class_name cannot be null!!");
                }
            }

            if (localSys_created_byTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_created_by"));

                if (localSys_created_by != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_created_by));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_by cannot be null!!");
                }
            }

            if (localSys_created_onTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_created_on"));

                if (localSys_created_on != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_created_on));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_on cannot be null!!");
                }
            }

            if (localSys_idTracker) {
                elementList.add(new javax.xml.namespace.QName("", "sys_id"));

                if (localSys_id != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_id));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_id cannot be null!!");
                }
            }

            if (localSys_import_rowTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_import_row"));

                if (localSys_import_row != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_import_row));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_row cannot be null!!");
                }
            }

            if (localSys_import_setTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_import_set"));

                if (localSys_import_set != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_import_set));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_set cannot be null!!");
                }
            }

            if (localSys_import_stateTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_import_state"));

                if (localSys_import_state != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_import_state));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_state cannot be null!!");
                }
            }

            if (localSys_import_state_commentTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_import_state_comment"));

                if (localSys_import_state_comment != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_import_state_comment));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_state_comment cannot be null!!");
                }
            }

            if (localSys_mod_countTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_mod_count"));

                if (localSys_mod_count != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_mod_count));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_mod_count cannot be null!!");
                }
            }

            if (localSys_row_errorTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_row_error"));

                if (localSys_row_error != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_row_error));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_row_error cannot be null!!");
                }
            }

            if (localSys_target_sys_idTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_target_sys_id"));

                if (localSys_target_sys_id != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_target_sys_id));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_target_sys_id cannot be null!!");
                }
            }

            if (localSys_target_tableTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_target_table"));

                if (localSys_target_table != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_target_table));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_target_table cannot be null!!");
                }
            }

            if (localSys_transform_mapTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_transform_map"));

                if (localSys_transform_map != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_transform_map));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_transform_map cannot be null!!");
                }
            }

            if (localSys_updated_byTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_updated_by"));

                if (localSys_updated_by != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_updated_by));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_by cannot be null!!");
                }
            }

            if (localSys_updated_onTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_updated_on"));

                if (localSys_updated_on != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_updated_on));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_on cannot be null!!");
                }
            }

            if (localTemplate_import_logTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "template_import_log"));

                if (localTemplate_import_log != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localTemplate_import_log));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "template_import_log cannot be null!!");
                }
            }

            if (localU_1Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_1"));

                if (localU_1 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_1));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1 cannot be null!!");
                }
            }

            if (localU_1_record_1Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_1_record_1"));

                if (localU_1_record_1 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_1_record_1));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1_record_1 cannot be null!!");
                }
            }

            if (localU_idTracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_id"));

                if (localU_id != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_id));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_id cannot be null!!");
                }
            }

            if (localU_recordTracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_record"));

                if (localU_record != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_record));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record cannot be null!!");
                }
            }

            if (localU_record_1Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_record_1"));

                if (localU_record_1 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_record_1));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record_1 cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                GetResponse object = new GetResponse();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"getResponse".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (GetResponse) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_class_name").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_class_name" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_class_name(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_created_by").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_created_by" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_created_by(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_created_on").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_created_on" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_created_on(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_id").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_id" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_import_row").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_import_row" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_import_row(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_import_set").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_import_set" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_import_set(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_import_state").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_import_state" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_import_state(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("",
                                "sys_import_state_comment").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_import_state_comment" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_import_state_comment(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_mod_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_mod_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_mod_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_row_error").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_row_error" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_row_error(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("",
                                "sys_target_sys_id").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_target_sys_id" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_target_sys_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_target_table").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_target_table" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_target_table(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("",
                                "sys_transform_map").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_transform_map" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_transform_map(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_updated_by").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_updated_by" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_updated_by(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_updated_on").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_updated_on" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_updated_on(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("",
                                "template_import_log").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "template_import_log" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setTemplate_import_log(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_1").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_1" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_1_record_1").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_1_record_1" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_1_record_1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_id").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_id" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_record").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_record" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_record(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_record_1").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_record_1" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_record_1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class GetRecords implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/u_import_set_test_import",
                "getRecords", "ns1");

        /**
         * field for Sys_class_name
         */
        protected java.lang.String localSys_class_name;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_class_nameTracker = false;

        /**
         * field for Sys_created_by
         */
        protected java.lang.String localSys_created_by;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_created_byTracker = false;

        /**
         * field for Sys_created_on
         */
        protected java.lang.String localSys_created_on;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_created_onTracker = false;

        /**
         * field for Sys_id
         */
        protected java.lang.String localSys_id;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_idTracker = false;

        /**
         * field for Sys_import_row
         */
        protected java.math.BigInteger localSys_import_row;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_import_rowTracker = false;

        /**
         * field for Sys_import_set
         */
        protected java.lang.String localSys_import_set;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_import_setTracker = false;

        /**
         * field for Sys_import_state
         */
        protected java.lang.String localSys_import_state;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_import_stateTracker = false;

        /**
         * field for Sys_import_state_comment
         */
        protected java.lang.String localSys_import_state_comment;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_import_state_commentTracker = false;

        /**
         * field for Sys_mod_count
         */
        protected java.math.BigInteger localSys_mod_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_mod_countTracker = false;

        /**
         * field for Sys_row_error
         */
        protected java.lang.String localSys_row_error;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_row_errorTracker = false;

        /**
         * field for Sys_target_sys_id
         */
        protected java.lang.String localSys_target_sys_id;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_target_sys_idTracker = false;

        /**
         * field for Sys_target_table
         */
        protected java.lang.String localSys_target_table;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_target_tableTracker = false;

        /**
         * field for Sys_transform_map
         */
        protected java.lang.String localSys_transform_map;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_transform_mapTracker = false;

        /**
         * field for Sys_updated_by
         */
        protected java.lang.String localSys_updated_by;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_updated_byTracker = false;

        /**
         * field for Sys_updated_on
         */
        protected java.lang.String localSys_updated_on;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_updated_onTracker = false;

        /**
         * field for Template_import_log
         */
        protected java.lang.String localTemplate_import_log;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localTemplate_import_logTracker = false;

        /**
         * field for U_1
         */
        protected java.lang.String localU_1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_1Tracker = false;

        /**
         * field for U_1_record_1
         */
        protected java.lang.String localU_1_record_1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_1_record_1Tracker = false;

        /**
         * field for U_id
         */
        protected java.lang.String localU_id;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_idTracker = false;

        /**
         * field for U_record
         */
        protected java.lang.String localU_record;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_recordTracker = false;

        /**
         * field for U_record_1
         */
        protected java.lang.String localU_record_1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_record_1Tracker = false;

        /**
         * field for __use_view
         */
        protected java.lang.String local__use_view;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local__use_viewTracker = false;

        /**
         * field for __encoded_query
         */
        protected java.lang.String local__encoded_query;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local__encoded_queryTracker = false;

        /**
         * field for __limit
         */
        protected java.lang.String local__limit;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local__limitTracker = false;

        /**
         * field for __first_row
         */
        protected java.lang.String local__first_row;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local__first_rowTracker = false;

        /**
         * field for __last_row
         */
        protected java.lang.String local__last_row;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local__last_rowTracker = false;

        /**
         * field for __order_by
         */
        protected java.lang.String local__order_by;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local__order_byTracker = false;

        /**
         * field for __order_by_desc
         */
        protected java.lang.String local__order_by_desc;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local__order_by_descTracker = false;

        /**
         * field for __exclude_columns
         */
        protected java.lang.String local__exclude_columns;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local__exclude_columnsTracker = false;

        public boolean isSys_class_nameSpecified() {
            return localSys_class_nameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_class_name() {
            return localSys_class_name;
        }

        /**
         * Auto generated setter method
         * @param param Sys_class_name
         */
        public void setSys_class_name(java.lang.String param) {
            localSys_class_nameTracker = param != null;

            this.localSys_class_name = param;
        }

        public boolean isSys_created_bySpecified() {
            return localSys_created_byTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_created_by() {
            return localSys_created_by;
        }

        /**
         * Auto generated setter method
         * @param param Sys_created_by
         */
        public void setSys_created_by(java.lang.String param) {
            localSys_created_byTracker = param != null;

            this.localSys_created_by = param;
        }

        public boolean isSys_created_onSpecified() {
            return localSys_created_onTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_created_on() {
            return localSys_created_on;
        }

        /**
         * Auto generated setter method
         * @param param Sys_created_on
         */
        public void setSys_created_on(java.lang.String param) {
            localSys_created_onTracker = param != null;

            this.localSys_created_on = param;
        }

        public boolean isSys_idSpecified() {
            return localSys_idTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_id() {
            return localSys_id;
        }

        /**
         * Auto generated setter method
         * @param param Sys_id
         */
        public void setSys_id(java.lang.String param) {
            localSys_idTracker = param != null;

            this.localSys_id = param;
        }

        public boolean isSys_import_rowSpecified() {
            return localSys_import_rowTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getSys_import_row() {
            return localSys_import_row;
        }

        /**
         * Auto generated setter method
         * @param param Sys_import_row
         */
        public void setSys_import_row(java.math.BigInteger param) {
            localSys_import_rowTracker = param != null;

            this.localSys_import_row = param;
        }

        public boolean isSys_import_setSpecified() {
            return localSys_import_setTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_import_set() {
            return localSys_import_set;
        }

        /**
         * Auto generated setter method
         * @param param Sys_import_set
         */
        public void setSys_import_set(java.lang.String param) {
            localSys_import_setTracker = param != null;

            this.localSys_import_set = param;
        }

        public boolean isSys_import_stateSpecified() {
            return localSys_import_stateTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_import_state() {
            return localSys_import_state;
        }

        /**
         * Auto generated setter method
         * @param param Sys_import_state
         */
        public void setSys_import_state(java.lang.String param) {
            localSys_import_stateTracker = param != null;

            this.localSys_import_state = param;
        }

        public boolean isSys_import_state_commentSpecified() {
            return localSys_import_state_commentTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_import_state_comment() {
            return localSys_import_state_comment;
        }

        /**
         * Auto generated setter method
         * @param param Sys_import_state_comment
         */
        public void setSys_import_state_comment(java.lang.String param) {
            localSys_import_state_commentTracker = param != null;

            this.localSys_import_state_comment = param;
        }

        public boolean isSys_mod_countSpecified() {
            return localSys_mod_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getSys_mod_count() {
            return localSys_mod_count;
        }

        /**
         * Auto generated setter method
         * @param param Sys_mod_count
         */
        public void setSys_mod_count(java.math.BigInteger param) {
            localSys_mod_countTracker = param != null;

            this.localSys_mod_count = param;
        }

        public boolean isSys_row_errorSpecified() {
            return localSys_row_errorTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_row_error() {
            return localSys_row_error;
        }

        /**
         * Auto generated setter method
         * @param param Sys_row_error
         */
        public void setSys_row_error(java.lang.String param) {
            localSys_row_errorTracker = param != null;

            this.localSys_row_error = param;
        }

        public boolean isSys_target_sys_idSpecified() {
            return localSys_target_sys_idTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_target_sys_id() {
            return localSys_target_sys_id;
        }

        /**
         * Auto generated setter method
         * @param param Sys_target_sys_id
         */
        public void setSys_target_sys_id(java.lang.String param) {
            localSys_target_sys_idTracker = param != null;

            this.localSys_target_sys_id = param;
        }

        public boolean isSys_target_tableSpecified() {
            return localSys_target_tableTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_target_table() {
            return localSys_target_table;
        }

        /**
         * Auto generated setter method
         * @param param Sys_target_table
         */
        public void setSys_target_table(java.lang.String param) {
            localSys_target_tableTracker = param != null;

            this.localSys_target_table = param;
        }

        public boolean isSys_transform_mapSpecified() {
            return localSys_transform_mapTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_transform_map() {
            return localSys_transform_map;
        }

        /**
         * Auto generated setter method
         * @param param Sys_transform_map
         */
        public void setSys_transform_map(java.lang.String param) {
            localSys_transform_mapTracker = param != null;

            this.localSys_transform_map = param;
        }

        public boolean isSys_updated_bySpecified() {
            return localSys_updated_byTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_updated_by() {
            return localSys_updated_by;
        }

        /**
         * Auto generated setter method
         * @param param Sys_updated_by
         */
        public void setSys_updated_by(java.lang.String param) {
            localSys_updated_byTracker = param != null;

            this.localSys_updated_by = param;
        }

        public boolean isSys_updated_onSpecified() {
            return localSys_updated_onTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_updated_on() {
            return localSys_updated_on;
        }

        /**
         * Auto generated setter method
         * @param param Sys_updated_on
         */
        public void setSys_updated_on(java.lang.String param) {
            localSys_updated_onTracker = param != null;

            this.localSys_updated_on = param;
        }

        public boolean isTemplate_import_logSpecified() {
            return localTemplate_import_logTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getTemplate_import_log() {
            return localTemplate_import_log;
        }

        /**
         * Auto generated setter method
         * @param param Template_import_log
         */
        public void setTemplate_import_log(java.lang.String param) {
            localTemplate_import_logTracker = param != null;

            this.localTemplate_import_log = param;
        }

        public boolean isU_1Specified() {
            return localU_1Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_1() {
            return localU_1;
        }

        /**
         * Auto generated setter method
         * @param param U_1
         */
        public void setU_1(java.lang.String param) {
            localU_1Tracker = param != null;

            this.localU_1 = param;
        }

        public boolean isU_1_record_1Specified() {
            return localU_1_record_1Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_1_record_1() {
            return localU_1_record_1;
        }

        /**
         * Auto generated setter method
         * @param param U_1_record_1
         */
        public void setU_1_record_1(java.lang.String param) {
            localU_1_record_1Tracker = param != null;

            this.localU_1_record_1 = param;
        }

        public boolean isU_idSpecified() {
            return localU_idTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_id() {
            return localU_id;
        }

        /**
         * Auto generated setter method
         * @param param U_id
         */
        public void setU_id(java.lang.String param) {
            localU_idTracker = param != null;

            this.localU_id = param;
        }

        public boolean isU_recordSpecified() {
            return localU_recordTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_record() {
            return localU_record;
        }

        /**
         * Auto generated setter method
         * @param param U_record
         */
        public void setU_record(java.lang.String param) {
            localU_recordTracker = param != null;

            this.localU_record = param;
        }

        public boolean isU_record_1Specified() {
            return localU_record_1Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_record_1() {
            return localU_record_1;
        }

        /**
         * Auto generated setter method
         * @param param U_record_1
         */
        public void setU_record_1(java.lang.String param) {
            localU_record_1Tracker = param != null;

            this.localU_record_1 = param;
        }

        public boolean is__use_viewSpecified() {
            return local__use_viewTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String get__use_view() {
            return local__use_view;
        }

        /**
         * Auto generated setter method
         * @param param __use_view
         */
        public void set__use_view(java.lang.String param) {
            local__use_viewTracker = param != null;

            this.local__use_view = param;
        }

        public boolean is__encoded_querySpecified() {
            return local__encoded_queryTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String get__encoded_query() {
            return local__encoded_query;
        }

        /**
         * Auto generated setter method
         * @param param __encoded_query
         */
        public void set__encoded_query(java.lang.String param) {
            local__encoded_queryTracker = param != null;

            this.local__encoded_query = param;
        }

        public boolean is__limitSpecified() {
            return local__limitTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String get__limit() {
            return local__limit;
        }

        /**
         * Auto generated setter method
         * @param param __limit
         */
        public void set__limit(java.lang.String param) {
            local__limitTracker = param != null;

            this.local__limit = param;
        }

        public boolean is__first_rowSpecified() {
            return local__first_rowTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String get__first_row() {
            return local__first_row;
        }

        /**
         * Auto generated setter method
         * @param param __first_row
         */
        public void set__first_row(java.lang.String param) {
            local__first_rowTracker = param != null;

            this.local__first_row = param;
        }

        public boolean is__last_rowSpecified() {
            return local__last_rowTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String get__last_row() {
            return local__last_row;
        }

        /**
         * Auto generated setter method
         * @param param __last_row
         */
        public void set__last_row(java.lang.String param) {
            local__last_rowTracker = param != null;

            this.local__last_row = param;
        }

        public boolean is__order_bySpecified() {
            return local__order_byTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String get__order_by() {
            return local__order_by;
        }

        /**
         * Auto generated setter method
         * @param param __order_by
         */
        public void set__order_by(java.lang.String param) {
            local__order_byTracker = param != null;

            this.local__order_by = param;
        }

        public boolean is__order_by_descSpecified() {
            return local__order_by_descTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String get__order_by_desc() {
            return local__order_by_desc;
        }

        /**
         * Auto generated setter method
         * @param param __order_by_desc
         */
        public void set__order_by_desc(java.lang.String param) {
            local__order_by_descTracker = param != null;

            this.local__order_by_desc = param;
        }

        public boolean is__exclude_columnsSpecified() {
            return local__exclude_columnsTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String get__exclude_columns() {
            return local__exclude_columns;
        }

        /**
         * Auto generated setter method
         * @param param __exclude_columns
         */
        public void set__exclude_columns(java.lang.String param) {
            local__exclude_columnsTracker = param != null;

            this.local__exclude_columns = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    MY_QNAME);

            return factory.createOMElement(dataSource, MY_QNAME);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/u_import_set_test_import");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":getRecords", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "getRecords", xmlWriter);
                }
            }

            if (localSys_class_nameTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_class_name", xmlWriter);

                if (localSys_class_name == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_class_name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_class_name);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_created_byTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_created_by", xmlWriter);

                if (localSys_created_by == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_by cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_created_by);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_created_onTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_created_on", xmlWriter);

                if (localSys_created_on == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_on cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_created_on);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_idTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_id", xmlWriter);

                if (localSys_id == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_id cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_id);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_import_rowTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_import_row", xmlWriter);

                if (localSys_import_row == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_row cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_import_row));
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_import_setTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_import_set", xmlWriter);

                if (localSys_import_set == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_set cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_import_set);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_import_stateTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_import_state", xmlWriter);

                if (localSys_import_state == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_state cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_import_state);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_import_state_commentTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_import_state_comment",
                    xmlWriter);

                if (localSys_import_state_comment == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_state_comment cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_import_state_comment);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_mod_countTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_mod_count", xmlWriter);

                if (localSys_mod_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_mod_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_mod_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_row_errorTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_row_error", xmlWriter);

                if (localSys_row_error == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_row_error cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_row_error);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_target_sys_idTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_target_sys_id",
                    xmlWriter);

                if (localSys_target_sys_id == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_target_sys_id cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_target_sys_id);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_target_tableTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_target_table", xmlWriter);

                if (localSys_target_table == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_target_table cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_target_table);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_transform_mapTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_transform_map",
                    xmlWriter);

                if (localSys_transform_map == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_transform_map cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_transform_map);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_updated_byTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_updated_by", xmlWriter);

                if (localSys_updated_by == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_by cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_updated_by);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_updated_onTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_updated_on", xmlWriter);

                if (localSys_updated_on == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_on cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_updated_on);
                }

                xmlWriter.writeEndElement();
            }

            if (localTemplate_import_logTracker) {
                namespace = "";
                writeStartElement(null, namespace, "template_import_log",
                    xmlWriter);

                if (localTemplate_import_log == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "template_import_log cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localTemplate_import_log);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_1Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_1", xmlWriter);

                if (localU_1 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_1);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_1_record_1Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_1_record_1", xmlWriter);

                if (localU_1_record_1 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1_record_1 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_1_record_1);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_idTracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_id", xmlWriter);

                if (localU_id == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_id cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_id);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_recordTracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_record", xmlWriter);

                if (localU_record == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_record);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_record_1Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_record_1", xmlWriter);

                if (localU_record_1 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record_1 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_record_1);
                }

                xmlWriter.writeEndElement();
            }

            if (local__use_viewTracker) {
                namespace = "";
                writeStartElement(null, namespace, "__use_view", xmlWriter);

                if (local__use_view == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "__use_view cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(local__use_view);
                }

                xmlWriter.writeEndElement();
            }

            if (local__encoded_queryTracker) {
                namespace = "";
                writeStartElement(null, namespace, "__encoded_query", xmlWriter);

                if (local__encoded_query == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "__encoded_query cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(local__encoded_query);
                }

                xmlWriter.writeEndElement();
            }

            if (local__limitTracker) {
                namespace = "";
                writeStartElement(null, namespace, "__limit", xmlWriter);

                if (local__limit == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "__limit cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(local__limit);
                }

                xmlWriter.writeEndElement();
            }

            if (local__first_rowTracker) {
                namespace = "";
                writeStartElement(null, namespace, "__first_row", xmlWriter);

                if (local__first_row == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "__first_row cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(local__first_row);
                }

                xmlWriter.writeEndElement();
            }

            if (local__last_rowTracker) {
                namespace = "";
                writeStartElement(null, namespace, "__last_row", xmlWriter);

                if (local__last_row == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "__last_row cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(local__last_row);
                }

                xmlWriter.writeEndElement();
            }

            if (local__order_byTracker) {
                namespace = "";
                writeStartElement(null, namespace, "__order_by", xmlWriter);

                if (local__order_by == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "__order_by cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(local__order_by);
                }

                xmlWriter.writeEndElement();
            }

            if (local__order_by_descTracker) {
                namespace = "";
                writeStartElement(null, namespace, "__order_by_desc", xmlWriter);

                if (local__order_by_desc == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "__order_by_desc cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(local__order_by_desc);
                }

                xmlWriter.writeEndElement();
            }

            if (local__exclude_columnsTracker) {
                namespace = "";
                writeStartElement(null, namespace, "__exclude_columns",
                    xmlWriter);

                if (local__exclude_columns == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "__exclude_columns cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(local__exclude_columns);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals(
                        "http://www.service-now.com/u_import_set_test_import")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localSys_class_nameTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_class_name"));

                if (localSys_class_name != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_class_name));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_class_name cannot be null!!");
                }
            }

            if (localSys_created_byTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_created_by"));

                if (localSys_created_by != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_created_by));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_by cannot be null!!");
                }
            }

            if (localSys_created_onTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_created_on"));

                if (localSys_created_on != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_created_on));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_on cannot be null!!");
                }
            }

            if (localSys_idTracker) {
                elementList.add(new javax.xml.namespace.QName("", "sys_id"));

                if (localSys_id != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_id));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_id cannot be null!!");
                }
            }

            if (localSys_import_rowTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_import_row"));

                if (localSys_import_row != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_import_row));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_row cannot be null!!");
                }
            }

            if (localSys_import_setTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_import_set"));

                if (localSys_import_set != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_import_set));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_set cannot be null!!");
                }
            }

            if (localSys_import_stateTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_import_state"));

                if (localSys_import_state != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_import_state));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_state cannot be null!!");
                }
            }

            if (localSys_import_state_commentTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_import_state_comment"));

                if (localSys_import_state_comment != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_import_state_comment));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_state_comment cannot be null!!");
                }
            }

            if (localSys_mod_countTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_mod_count"));

                if (localSys_mod_count != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_mod_count));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_mod_count cannot be null!!");
                }
            }

            if (localSys_row_errorTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_row_error"));

                if (localSys_row_error != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_row_error));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_row_error cannot be null!!");
                }
            }

            if (localSys_target_sys_idTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_target_sys_id"));

                if (localSys_target_sys_id != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_target_sys_id));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_target_sys_id cannot be null!!");
                }
            }

            if (localSys_target_tableTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_target_table"));

                if (localSys_target_table != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_target_table));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_target_table cannot be null!!");
                }
            }

            if (localSys_transform_mapTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_transform_map"));

                if (localSys_transform_map != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_transform_map));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_transform_map cannot be null!!");
                }
            }

            if (localSys_updated_byTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_updated_by"));

                if (localSys_updated_by != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_updated_by));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_by cannot be null!!");
                }
            }

            if (localSys_updated_onTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_updated_on"));

                if (localSys_updated_on != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_updated_on));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_on cannot be null!!");
                }
            }

            if (localTemplate_import_logTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "template_import_log"));

                if (localTemplate_import_log != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localTemplate_import_log));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "template_import_log cannot be null!!");
                }
            }

            if (localU_1Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_1"));

                if (localU_1 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_1));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1 cannot be null!!");
                }
            }

            if (localU_1_record_1Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_1_record_1"));

                if (localU_1_record_1 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_1_record_1));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1_record_1 cannot be null!!");
                }
            }

            if (localU_idTracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_id"));

                if (localU_id != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_id));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_id cannot be null!!");
                }
            }

            if (localU_recordTracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_record"));

                if (localU_record != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_record));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record cannot be null!!");
                }
            }

            if (localU_record_1Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_record_1"));

                if (localU_record_1 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_record_1));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record_1 cannot be null!!");
                }
            }

            if (local__use_viewTracker) {
                elementList.add(new javax.xml.namespace.QName("", "__use_view"));

                if (local__use_view != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            local__use_view));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "__use_view cannot be null!!");
                }
            }

            if (local__encoded_queryTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "__encoded_query"));

                if (local__encoded_query != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            local__encoded_query));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "__encoded_query cannot be null!!");
                }
            }

            if (local__limitTracker) {
                elementList.add(new javax.xml.namespace.QName("", "__limit"));

                if (local__limit != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            local__limit));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "__limit cannot be null!!");
                }
            }

            if (local__first_rowTracker) {
                elementList.add(new javax.xml.namespace.QName("", "__first_row"));

                if (local__first_row != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            local__first_row));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "__first_row cannot be null!!");
                }
            }

            if (local__last_rowTracker) {
                elementList.add(new javax.xml.namespace.QName("", "__last_row"));

                if (local__last_row != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            local__last_row));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "__last_row cannot be null!!");
                }
            }

            if (local__order_byTracker) {
                elementList.add(new javax.xml.namespace.QName("", "__order_by"));

                if (local__order_by != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            local__order_by));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "__order_by cannot be null!!");
                }
            }

            if (local__order_by_descTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "__order_by_desc"));

                if (local__order_by_desc != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            local__order_by_desc));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "__order_by_desc cannot be null!!");
                }
            }

            if (local__exclude_columnsTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "__exclude_columns"));

                if (local__exclude_columns != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            local__exclude_columns));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "__exclude_columns cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetRecords parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                GetRecords object = new GetRecords();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"getRecords".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (GetRecords) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_class_name").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_class_name" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_class_name(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_created_by").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_created_by" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_created_by(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_created_on").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_created_on" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_created_on(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_id").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_id" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_import_row").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_import_row" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_import_row(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_import_set").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_import_set" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_import_set(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_import_state").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_import_state" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_import_state(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("",
                                "sys_import_state_comment").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_import_state_comment" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_import_state_comment(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_mod_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_mod_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_mod_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_row_error").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_row_error" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_row_error(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("",
                                "sys_target_sys_id").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_target_sys_id" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_target_sys_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_target_table").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_target_table" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_target_table(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("",
                                "sys_transform_map").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_transform_map" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_transform_map(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_updated_by").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_updated_by" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_updated_by(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_updated_on").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_updated_on" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_updated_on(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("",
                                "template_import_log").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "template_import_log" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setTemplate_import_log(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_1").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_1" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_1_record_1").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_1_record_1" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_1_record_1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_id").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_id" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_record").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_record" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_record(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_record_1").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_record_1" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_record_1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "__use_view").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "__use_view" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.set__use_view(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "__encoded_query").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "__encoded_query" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.set__encoded_query(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "__limit").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "__limit" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.set__limit(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "__first_row").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "__first_row" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.set__first_row(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "__last_row").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "__last_row" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.set__last_row(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "__order_by").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "__order_by" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.set__order_by(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "__order_by_desc").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "__order_by_desc" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.set__order_by_desc(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("",
                                "__exclude_columns").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "__exclude_columns" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.set__exclude_columns(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class Record_type0 implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = record_type0
           Namespace URI = http://www.service-now.com/u_import_set_test_import
           Namespace Prefix = ns1
         */

        /**
         * field for Template_import_log
         */
        protected java.lang.String localTemplate_import_log;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localTemplate_import_logTracker = false;

        /**
         * field for U_1
         */
        protected java.lang.String localU_1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_1Tracker = false;

        /**
         * field for U_1_record_1
         */
        protected java.lang.String localU_1_record_1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_1_record_1Tracker = false;

        /**
         * field for U_id
         */
        protected java.lang.String localU_id;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_idTracker = false;

        /**
         * field for U_record
         */
        protected java.lang.String localU_record;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_recordTracker = false;

        /**
         * field for U_record_1
         */
        protected java.lang.String localU_record_1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_record_1Tracker = false;

        public boolean isTemplate_import_logSpecified() {
            return localTemplate_import_logTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getTemplate_import_log() {
            return localTemplate_import_log;
        }

        /**
         * Auto generated setter method
         * @param param Template_import_log
         */
        public void setTemplate_import_log(java.lang.String param) {
            localTemplate_import_logTracker = param != null;

            this.localTemplate_import_log = param;
        }

        public boolean isU_1Specified() {
            return localU_1Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_1() {
            return localU_1;
        }

        /**
         * Auto generated setter method
         * @param param U_1
         */
        public void setU_1(java.lang.String param) {
            localU_1Tracker = param != null;

            this.localU_1 = param;
        }

        public boolean isU_1_record_1Specified() {
            return localU_1_record_1Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_1_record_1() {
            return localU_1_record_1;
        }

        /**
         * Auto generated setter method
         * @param param U_1_record_1
         */
        public void setU_1_record_1(java.lang.String param) {
            localU_1_record_1Tracker = param != null;

            this.localU_1_record_1 = param;
        }

        public boolean isU_idSpecified() {
            return localU_idTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_id() {
            return localU_id;
        }

        /**
         * Auto generated setter method
         * @param param U_id
         */
        public void setU_id(java.lang.String param) {
            localU_idTracker = param != null;

            this.localU_id = param;
        }

        public boolean isU_recordSpecified() {
            return localU_recordTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_record() {
            return localU_record;
        }

        /**
         * Auto generated setter method
         * @param param U_record
         */
        public void setU_record(java.lang.String param) {
            localU_recordTracker = param != null;

            this.localU_record = param;
        }

        public boolean isU_record_1Specified() {
            return localU_record_1Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_record_1() {
            return localU_record_1;
        }

        /**
         * Auto generated setter method
         * @param param U_record_1
         */
        public void setU_record_1(java.lang.String param) {
            localU_record_1Tracker = param != null;

            this.localU_record_1 = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);

            return factory.createOMElement(dataSource, parentQName);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/u_import_set_test_import");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":record_type0", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "record_type0", xmlWriter);
                }
            }

            if (localTemplate_import_logTracker) {
                namespace = "";
                writeStartElement(null, namespace, "template_import_log",
                    xmlWriter);

                if (localTemplate_import_log == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "template_import_log cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localTemplate_import_log);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_1Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_1", xmlWriter);

                if (localU_1 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_1);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_1_record_1Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_1_record_1", xmlWriter);

                if (localU_1_record_1 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1_record_1 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_1_record_1);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_idTracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_id", xmlWriter);

                if (localU_id == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_id cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_id);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_recordTracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_record", xmlWriter);

                if (localU_record == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_record);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_record_1Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_record_1", xmlWriter);

                if (localU_record_1 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record_1 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_record_1);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals(
                        "http://www.service-now.com/u_import_set_test_import")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localTemplate_import_logTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "template_import_log"));

                if (localTemplate_import_log != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localTemplate_import_log));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "template_import_log cannot be null!!");
                }
            }

            if (localU_1Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_1"));

                if (localU_1 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_1));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1 cannot be null!!");
                }
            }

            if (localU_1_record_1Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_1_record_1"));

                if (localU_1_record_1 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_1_record_1));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1_record_1 cannot be null!!");
                }
            }

            if (localU_idTracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_id"));

                if (localU_id != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_id));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_id cannot be null!!");
                }
            }

            if (localU_recordTracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_record"));

                if (localU_record != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_record));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record cannot be null!!");
                }
            }

            if (localU_record_1Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_record_1"));

                if (localU_record_1 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_record_1));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record_1 cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static Record_type0 parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                Record_type0 object = new Record_type0();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"record_type0".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (Record_type0) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("",
                                "template_import_log").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "template_import_log" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setTemplate_import_log(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_1").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_1" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_1_record_1").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_1_record_1" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_1_record_1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_id").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_id" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_record").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_record" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_record(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_record_1").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_record_1" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_record_1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class GetRecordsResponse implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/u_import_set_test_import",
                "getRecordsResponse", "ns1");

        /**
         * field for GetRecordsResult
         * This was an Array!
         */
        protected GetRecordsResult_type0[] localGetRecordsResult;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localGetRecordsResultTracker = false;

        public boolean isGetRecordsResultSpecified() {
            return localGetRecordsResultTracker;
        }

        /**
         * Auto generated getter method
         * @return GetRecordsResult_type0[]
         */
        public GetRecordsResult_type0[] getGetRecordsResult() {
            return localGetRecordsResult;
        }

        /**
         * validate the array for GetRecordsResult
         */
        protected void validateGetRecordsResult(GetRecordsResult_type0[] param) {
        }

        /**
         * Auto generated setter method
         * @param param GetRecordsResult
         */
        public void setGetRecordsResult(GetRecordsResult_type0[] param) {
            validateGetRecordsResult(param);

            localGetRecordsResultTracker = param != null;

            this.localGetRecordsResult = param;
        }

        /**
         * Auto generated add method for the array for convenience
         * @param param GetRecordsResult_type0
         */
        public void addGetRecordsResult(GetRecordsResult_type0 param) {
            if (localGetRecordsResult == null) {
                localGetRecordsResult = new GetRecordsResult_type0[] {  };
            }

            //update the setting tracker
            localGetRecordsResultTracker = true;

            java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localGetRecordsResult);
            list.add(param);
            this.localGetRecordsResult = (GetRecordsResult_type0[]) list.toArray(new GetRecordsResult_type0[list.size()]);
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    MY_QNAME);

            return factory.createOMElement(dataSource, MY_QNAME);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/u_import_set_test_import");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":getRecordsResponse", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "getRecordsResponse", xmlWriter);
                }
            }

            if (localGetRecordsResultTracker) {
                if (localGetRecordsResult != null) {
                    for (int i = 0; i < localGetRecordsResult.length; i++) {
                        if (localGetRecordsResult[i] != null) {
                            localGetRecordsResult[i].serialize(new javax.xml.namespace.QName(
                                    "", "getRecordsResult"), xmlWriter);
                        } else {
                            // we don't have to do any thing since minOccures is zero
                        }
                    }
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "getRecordsResult cannot be null!!");
                }
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals(
                        "http://www.service-now.com/u_import_set_test_import")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localGetRecordsResultTracker) {
                if (localGetRecordsResult != null) {
                    for (int i = 0; i < localGetRecordsResult.length; i++) {
                        if (localGetRecordsResult[i] != null) {
                            elementList.add(new javax.xml.namespace.QName("",
                                    "getRecordsResult"));
                            elementList.add(localGetRecordsResult[i]);
                        } else {
                            // nothing to do
                        }
                    }
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "getRecordsResult cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetRecordsResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                GetRecordsResponse object = new GetRecordsResponse();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"getRecordsResponse".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (GetRecordsResponse) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    java.util.ArrayList list1 = new java.util.ArrayList();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "getRecordsResult").equals(
                                reader.getName())) {
                        // Process the array and step past its final element's end.
                        list1.add(GetRecordsResult_type0.Factory.parse(reader));

                        //loop until we find a start element that is not part of this array
                        boolean loopDone1 = false;

                        while (!loopDone1) {
                            // We should be at the end element, but make sure
                            while (!reader.isEndElement())
                                reader.next();

                            // Step out of this element
                            reader.next();

                            // Step to next element event.
                            while (!reader.isStartElement() &&
                                    !reader.isEndElement())
                                reader.next();

                            if (reader.isEndElement()) {
                                //two continuous end elements means we are exiting the xml structure
                                loopDone1 = true;
                            } else {
                                if (new javax.xml.namespace.QName("",
                                            "getRecordsResult").equals(
                                            reader.getName())) {
                                    list1.add(GetRecordsResult_type0.Factory.parse(
                                            reader));
                                } else {
                                    loopDone1 = true;
                                }
                            }
                        }

                        // call the converter utility  to convert and set the array
                        object.setGetRecordsResult((GetRecordsResult_type0[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                GetRecordsResult_type0.class, list1));
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class Get implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/u_import_set_test_import",
                "get", "ns1");

        /**
         * field for Sys_id
         */
        protected java.lang.String localSys_id;

        /**
         * field for __use_view
         */
        protected java.lang.String local__use_view;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local__use_viewTracker = false;

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_id() {
            return localSys_id;
        }

        /**
         * Auto generated setter method
         * @param param Sys_id
         */
        public void setSys_id(java.lang.String param) {
            this.localSys_id = param;
        }

        public boolean is__use_viewSpecified() {
            return local__use_viewTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String get__use_view() {
            return local__use_view;
        }

        /**
         * Auto generated setter method
         * @param param __use_view
         */
        public void set__use_view(java.lang.String param) {
            local__use_viewTracker = param != null;

            this.local__use_view = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    MY_QNAME);

            return factory.createOMElement(dataSource, MY_QNAME);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/u_import_set_test_import");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":get", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "get", xmlWriter);
                }
            }

            namespace = "";
            writeStartElement(null, namespace, "sys_id", xmlWriter);

            if (localSys_id == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "sys_id cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSys_id);
            }

            xmlWriter.writeEndElement();

            if (local__use_viewTracker) {
                namespace = "";
                writeStartElement(null, namespace, "__use_view", xmlWriter);

                if (local__use_view == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "__use_view cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(local__use_view);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals(
                        "http://www.service-now.com/u_import_set_test_import")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("", "sys_id"));

            if (localSys_id != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localSys_id));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "sys_id cannot be null!!");
            }

            if (local__use_viewTracker) {
                elementList.add(new javax.xml.namespace.QName("", "__use_view"));

                if (local__use_view != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            local__use_view));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "__use_view cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static Get parse(javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                Get object = new Get();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"get".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (Get) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_id").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_id" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "__use_view").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "__use_view" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.set__use_view(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DeleteMultipleResponse implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/u_import_set_test_import",
                "deleteMultipleResponse", "ns1");

        /**
         * field for Count
         */
        protected java.lang.String localCount;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localCountTracker = false;

        public boolean isCountSpecified() {
            return localCountTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getCount() {
            return localCount;
        }

        /**
         * Auto generated setter method
         * @param param Count
         */
        public void setCount(java.lang.String param) {
            localCountTracker = param != null;

            this.localCount = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    MY_QNAME);

            return factory.createOMElement(dataSource, MY_QNAME);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/u_import_set_test_import");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":deleteMultipleResponse", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "deleteMultipleResponse", xmlWriter);
                }
            }

            if (localCountTracker) {
                namespace = "";
                writeStartElement(null, namespace, "count", xmlWriter);

                if (localCount == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localCount);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals(
                        "http://www.service-now.com/u_import_set_test_import")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localCountTracker) {
                elementList.add(new javax.xml.namespace.QName("", "count"));

                if (localCount != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localCount));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "count cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static DeleteMultipleResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DeleteMultipleResponse object = new DeleteMultipleResponse();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"deleteMultipleResponse".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (DeleteMultipleResponse) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "count" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setCount(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DeleteRecordResponse implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/u_import_set_test_import",
                "deleteRecordResponse", "ns1");

        /**
         * field for Count
         */
        protected java.lang.String localCount;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localCountTracker = false;

        public boolean isCountSpecified() {
            return localCountTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getCount() {
            return localCount;
        }

        /**
         * Auto generated setter method
         * @param param Count
         */
        public void setCount(java.lang.String param) {
            localCountTracker = param != null;

            this.localCount = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    MY_QNAME);

            return factory.createOMElement(dataSource, MY_QNAME);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/u_import_set_test_import");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":deleteRecordResponse", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "deleteRecordResponse", xmlWriter);
                }
            }

            if (localCountTracker) {
                namespace = "";
                writeStartElement(null, namespace, "count", xmlWriter);

                if (localCount == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localCount);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals(
                        "http://www.service-now.com/u_import_set_test_import")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localCountTracker) {
                elementList.add(new javax.xml.namespace.QName("", "count"));

                if (localCount != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localCount));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "count cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static DeleteRecordResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DeleteRecordResponse object = new DeleteRecordResponse();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"deleteRecordResponse".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (DeleteRecordResponse) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "count" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setCount(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class InsertMultiple implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/u_import_set_test_import",
                "insertMultiple", "ns1");

        /**
         * field for Record
         * This was an Array!
         */
        protected Record_type0[] localRecord;

        /**
         * Auto generated getter method
         * @return Record_type0[]
         */
        public Record_type0[] getRecord() {
            return localRecord;
        }

        /**
         * validate the array for Record
         */
        protected void validateRecord(Record_type0[] param) {
            if ((param != null) && (param.length < 1)) {
                throw new java.lang.RuntimeException(
                    "Input values do not follow defined XSD restrictions");
            }
        }

        /**
         * Auto generated setter method
         * @param param Record
         */
        public void setRecord(Record_type0[] param) {
            validateRecord(param);

            this.localRecord = param;
        }

        /**
         * Auto generated add method for the array for convenience
         * @param param Record_type0
         */
        public void addRecord(Record_type0 param) {
            if (localRecord == null) {
                localRecord = new Record_type0[] {  };
            }

            java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localRecord);
            list.add(param);
            this.localRecord = (Record_type0[]) list.toArray(new Record_type0[list.size()]);
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    MY_QNAME);

            return factory.createOMElement(dataSource, MY_QNAME);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/u_import_set_test_import");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":insertMultiple", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "insertMultiple", xmlWriter);
                }
            }

            if (localRecord != null) {
                for (int i = 0; i < localRecord.length; i++) {
                    if (localRecord[i] != null) {
                        localRecord[i].serialize(new javax.xml.namespace.QName(
                                "", "record"), xmlWriter);
                    } else {
                        throw new org.apache.axis2.databinding.ADBException(
                            "record cannot be null!!");
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "record cannot be null!!");
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals(
                        "http://www.service-now.com/u_import_set_test_import")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localRecord != null) {
                for (int i = 0; i < localRecord.length; i++) {
                    if (localRecord[i] != null) {
                        elementList.add(new javax.xml.namespace.QName("",
                                "record"));
                        elementList.add(localRecord[i]);
                    } else {
                        throw new org.apache.axis2.databinding.ADBException(
                            "record cannot be null !!");
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "record cannot be null!!");
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static InsertMultiple parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                InsertMultiple object = new InsertMultiple();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"insertMultiple".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (InsertMultiple) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    java.util.ArrayList list1 = new java.util.ArrayList();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "record").equals(
                                reader.getName())) {
                        // Process the array and step past its final element's end.
                        list1.add(Record_type0.Factory.parse(reader));

                        //loop until we find a start element that is not part of this array
                        boolean loopDone1 = false;

                        while (!loopDone1) {
                            // We should be at the end element, but make sure
                            while (!reader.isEndElement())
                                reader.next();

                            // Step out of this element
                            reader.next();

                            // Step to next element event.
                            while (!reader.isStartElement() &&
                                    !reader.isEndElement())
                                reader.next();

                            if (reader.isEndElement()) {
                                //two continuous end elements means we are exiting the xml structure
                                loopDone1 = true;
                            } else {
                                if (new javax.xml.namespace.QName("", "record").equals(
                                            reader.getName())) {
                                    list1.add(Record_type0.Factory.parse(reader));
                                } else {
                                    loopDone1 = true;
                                }
                            }
                        }

                        // call the converter utility  to convert and set the array
                        object.setRecord((Record_type0[]) org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                Record_type0.class, list1));
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DeleteRecord implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/u_import_set_test_import",
                "deleteRecord", "ns1");

        /**
         * field for Sys_id
         */
        protected java.lang.String localSys_id;

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_id() {
            return localSys_id;
        }

        /**
         * Auto generated setter method
         * @param param Sys_id
         */
        public void setSys_id(java.lang.String param) {
            this.localSys_id = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    MY_QNAME);

            return factory.createOMElement(dataSource, MY_QNAME);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/u_import_set_test_import");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":deleteRecord", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "deleteRecord", xmlWriter);
                }
            }

            namespace = "";
            writeStartElement(null, namespace, "sys_id", xmlWriter);

            if (localSys_id == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "sys_id cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSys_id);
            }

            xmlWriter.writeEndElement();

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals(
                        "http://www.service-now.com/u_import_set_test_import")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            elementList.add(new javax.xml.namespace.QName("", "sys_id"));

            if (localSys_id != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localSys_id));
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "sys_id cannot be null!!");
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static DeleteRecord parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DeleteRecord object = new DeleteRecord();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"deleteRecord".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (DeleteRecord) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_id").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_id" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class GetKeys implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/u_import_set_test_import",
                "getKeys", "ns1");

        /**
         * field for Sys_class_name
         */
        protected java.lang.String localSys_class_name;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_class_nameTracker = false;

        /**
         * field for Sys_created_by
         */
        protected java.lang.String localSys_created_by;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_created_byTracker = false;

        /**
         * field for Sys_created_on
         */
        protected java.lang.String localSys_created_on;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_created_onTracker = false;

        /**
         * field for Sys_import_row
         */
        protected java.math.BigInteger localSys_import_row;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_import_rowTracker = false;

        /**
         * field for Sys_import_set
         */
        protected java.lang.String localSys_import_set;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_import_setTracker = false;

        /**
         * field for Sys_import_state
         */
        protected java.lang.String localSys_import_state;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_import_stateTracker = false;

        /**
         * field for Sys_import_state_comment
         */
        protected java.lang.String localSys_import_state_comment;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_import_state_commentTracker = false;

        /**
         * field for Sys_mod_count
         */
        protected java.math.BigInteger localSys_mod_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_mod_countTracker = false;

        /**
         * field for Sys_row_error
         */
        protected java.lang.String localSys_row_error;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_row_errorTracker = false;

        /**
         * field for Sys_target_sys_id
         */
        protected java.lang.String localSys_target_sys_id;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_target_sys_idTracker = false;

        /**
         * field for Sys_target_table
         */
        protected java.lang.String localSys_target_table;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_target_tableTracker = false;

        /**
         * field for Sys_transform_map
         */
        protected java.lang.String localSys_transform_map;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_transform_mapTracker = false;

        /**
         * field for Sys_updated_by
         */
        protected java.lang.String localSys_updated_by;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_updated_byTracker = false;

        /**
         * field for Sys_updated_on
         */
        protected java.lang.String localSys_updated_on;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_updated_onTracker = false;

        /**
         * field for Template_import_log
         */
        protected java.lang.String localTemplate_import_log;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localTemplate_import_logTracker = false;

        /**
         * field for U_1
         */
        protected java.lang.String localU_1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_1Tracker = false;

        /**
         * field for U_1_record_1
         */
        protected java.lang.String localU_1_record_1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_1_record_1Tracker = false;

        /**
         * field for U_id
         */
        protected java.lang.String localU_id;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_idTracker = false;

        /**
         * field for U_record
         */
        protected java.lang.String localU_record;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_recordTracker = false;

        /**
         * field for U_record_1
         */
        protected java.lang.String localU_record_1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_record_1Tracker = false;

        /**
         * field for __use_view
         */
        protected java.lang.String local__use_view;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local__use_viewTracker = false;

        /**
         * field for __encoded_query
         */
        protected java.lang.String local__encoded_query;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local__encoded_queryTracker = false;

        /**
         * field for __limit
         */
        protected java.lang.String local__limit;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local__limitTracker = false;

        /**
         * field for __first_row
         */
        protected java.lang.String local__first_row;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local__first_rowTracker = false;

        /**
         * field for __last_row
         */
        protected java.lang.String local__last_row;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean local__last_rowTracker = false;

        public boolean isSys_class_nameSpecified() {
            return localSys_class_nameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_class_name() {
            return localSys_class_name;
        }

        /**
         * Auto generated setter method
         * @param param Sys_class_name
         */
        public void setSys_class_name(java.lang.String param) {
            localSys_class_nameTracker = param != null;

            this.localSys_class_name = param;
        }

        public boolean isSys_created_bySpecified() {
            return localSys_created_byTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_created_by() {
            return localSys_created_by;
        }

        /**
         * Auto generated setter method
         * @param param Sys_created_by
         */
        public void setSys_created_by(java.lang.String param) {
            localSys_created_byTracker = param != null;

            this.localSys_created_by = param;
        }

        public boolean isSys_created_onSpecified() {
            return localSys_created_onTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_created_on() {
            return localSys_created_on;
        }

        /**
         * Auto generated setter method
         * @param param Sys_created_on
         */
        public void setSys_created_on(java.lang.String param) {
            localSys_created_onTracker = param != null;

            this.localSys_created_on = param;
        }

        public boolean isSys_import_rowSpecified() {
            return localSys_import_rowTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getSys_import_row() {
            return localSys_import_row;
        }

        /**
         * Auto generated setter method
         * @param param Sys_import_row
         */
        public void setSys_import_row(java.math.BigInteger param) {
            localSys_import_rowTracker = param != null;

            this.localSys_import_row = param;
        }

        public boolean isSys_import_setSpecified() {
            return localSys_import_setTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_import_set() {
            return localSys_import_set;
        }

        /**
         * Auto generated setter method
         * @param param Sys_import_set
         */
        public void setSys_import_set(java.lang.String param) {
            localSys_import_setTracker = param != null;

            this.localSys_import_set = param;
        }

        public boolean isSys_import_stateSpecified() {
            return localSys_import_stateTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_import_state() {
            return localSys_import_state;
        }

        /**
         * Auto generated setter method
         * @param param Sys_import_state
         */
        public void setSys_import_state(java.lang.String param) {
            localSys_import_stateTracker = param != null;

            this.localSys_import_state = param;
        }

        public boolean isSys_import_state_commentSpecified() {
            return localSys_import_state_commentTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_import_state_comment() {
            return localSys_import_state_comment;
        }

        /**
         * Auto generated setter method
         * @param param Sys_import_state_comment
         */
        public void setSys_import_state_comment(java.lang.String param) {
            localSys_import_state_commentTracker = param != null;

            this.localSys_import_state_comment = param;
        }

        public boolean isSys_mod_countSpecified() {
            return localSys_mod_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getSys_mod_count() {
            return localSys_mod_count;
        }

        /**
         * Auto generated setter method
         * @param param Sys_mod_count
         */
        public void setSys_mod_count(java.math.BigInteger param) {
            localSys_mod_countTracker = param != null;

            this.localSys_mod_count = param;
        }

        public boolean isSys_row_errorSpecified() {
            return localSys_row_errorTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_row_error() {
            return localSys_row_error;
        }

        /**
         * Auto generated setter method
         * @param param Sys_row_error
         */
        public void setSys_row_error(java.lang.String param) {
            localSys_row_errorTracker = param != null;

            this.localSys_row_error = param;
        }

        public boolean isSys_target_sys_idSpecified() {
            return localSys_target_sys_idTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_target_sys_id() {
            return localSys_target_sys_id;
        }

        /**
         * Auto generated setter method
         * @param param Sys_target_sys_id
         */
        public void setSys_target_sys_id(java.lang.String param) {
            localSys_target_sys_idTracker = param != null;

            this.localSys_target_sys_id = param;
        }

        public boolean isSys_target_tableSpecified() {
            return localSys_target_tableTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_target_table() {
            return localSys_target_table;
        }

        /**
         * Auto generated setter method
         * @param param Sys_target_table
         */
        public void setSys_target_table(java.lang.String param) {
            localSys_target_tableTracker = param != null;

            this.localSys_target_table = param;
        }

        public boolean isSys_transform_mapSpecified() {
            return localSys_transform_mapTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_transform_map() {
            return localSys_transform_map;
        }

        /**
         * Auto generated setter method
         * @param param Sys_transform_map
         */
        public void setSys_transform_map(java.lang.String param) {
            localSys_transform_mapTracker = param != null;

            this.localSys_transform_map = param;
        }

        public boolean isSys_updated_bySpecified() {
            return localSys_updated_byTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_updated_by() {
            return localSys_updated_by;
        }

        /**
         * Auto generated setter method
         * @param param Sys_updated_by
         */
        public void setSys_updated_by(java.lang.String param) {
            localSys_updated_byTracker = param != null;

            this.localSys_updated_by = param;
        }

        public boolean isSys_updated_onSpecified() {
            return localSys_updated_onTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_updated_on() {
            return localSys_updated_on;
        }

        /**
         * Auto generated setter method
         * @param param Sys_updated_on
         */
        public void setSys_updated_on(java.lang.String param) {
            localSys_updated_onTracker = param != null;

            this.localSys_updated_on = param;
        }

        public boolean isTemplate_import_logSpecified() {
            return localTemplate_import_logTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getTemplate_import_log() {
            return localTemplate_import_log;
        }

        /**
         * Auto generated setter method
         * @param param Template_import_log
         */
        public void setTemplate_import_log(java.lang.String param) {
            localTemplate_import_logTracker = param != null;

            this.localTemplate_import_log = param;
        }

        public boolean isU_1Specified() {
            return localU_1Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_1() {
            return localU_1;
        }

        /**
         * Auto generated setter method
         * @param param U_1
         */
        public void setU_1(java.lang.String param) {
            localU_1Tracker = param != null;

            this.localU_1 = param;
        }

        public boolean isU_1_record_1Specified() {
            return localU_1_record_1Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_1_record_1() {
            return localU_1_record_1;
        }

        /**
         * Auto generated setter method
         * @param param U_1_record_1
         */
        public void setU_1_record_1(java.lang.String param) {
            localU_1_record_1Tracker = param != null;

            this.localU_1_record_1 = param;
        }

        public boolean isU_idSpecified() {
            return localU_idTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_id() {
            return localU_id;
        }

        /**
         * Auto generated setter method
         * @param param U_id
         */
        public void setU_id(java.lang.String param) {
            localU_idTracker = param != null;

            this.localU_id = param;
        }

        public boolean isU_recordSpecified() {
            return localU_recordTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_record() {
            return localU_record;
        }

        /**
         * Auto generated setter method
         * @param param U_record
         */
        public void setU_record(java.lang.String param) {
            localU_recordTracker = param != null;

            this.localU_record = param;
        }

        public boolean isU_record_1Specified() {
            return localU_record_1Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_record_1() {
            return localU_record_1;
        }

        /**
         * Auto generated setter method
         * @param param U_record_1
         */
        public void setU_record_1(java.lang.String param) {
            localU_record_1Tracker = param != null;

            this.localU_record_1 = param;
        }

        public boolean is__use_viewSpecified() {
            return local__use_viewTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String get__use_view() {
            return local__use_view;
        }

        /**
         * Auto generated setter method
         * @param param __use_view
         */
        public void set__use_view(java.lang.String param) {
            local__use_viewTracker = param != null;

            this.local__use_view = param;
        }

        public boolean is__encoded_querySpecified() {
            return local__encoded_queryTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String get__encoded_query() {
            return local__encoded_query;
        }

        /**
         * Auto generated setter method
         * @param param __encoded_query
         */
        public void set__encoded_query(java.lang.String param) {
            local__encoded_queryTracker = param != null;

            this.local__encoded_query = param;
        }

        public boolean is__limitSpecified() {
            return local__limitTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String get__limit() {
            return local__limit;
        }

        /**
         * Auto generated setter method
         * @param param __limit
         */
        public void set__limit(java.lang.String param) {
            local__limitTracker = param != null;

            this.local__limit = param;
        }

        public boolean is__first_rowSpecified() {
            return local__first_rowTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String get__first_row() {
            return local__first_row;
        }

        /**
         * Auto generated setter method
         * @param param __first_row
         */
        public void set__first_row(java.lang.String param) {
            local__first_rowTracker = param != null;

            this.local__first_row = param;
        }

        public boolean is__last_rowSpecified() {
            return local__last_rowTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String get__last_row() {
            return local__last_row;
        }

        /**
         * Auto generated setter method
         * @param param __last_row
         */
        public void set__last_row(java.lang.String param) {
            local__last_rowTracker = param != null;

            this.local__last_row = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    MY_QNAME);

            return factory.createOMElement(dataSource, MY_QNAME);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/u_import_set_test_import");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":getKeys", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "getKeys", xmlWriter);
                }
            }

            if (localSys_class_nameTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_class_name", xmlWriter);

                if (localSys_class_name == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_class_name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_class_name);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_created_byTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_created_by", xmlWriter);

                if (localSys_created_by == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_by cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_created_by);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_created_onTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_created_on", xmlWriter);

                if (localSys_created_on == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_on cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_created_on);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_import_rowTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_import_row", xmlWriter);

                if (localSys_import_row == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_row cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_import_row));
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_import_setTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_import_set", xmlWriter);

                if (localSys_import_set == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_set cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_import_set);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_import_stateTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_import_state", xmlWriter);

                if (localSys_import_state == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_state cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_import_state);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_import_state_commentTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_import_state_comment",
                    xmlWriter);

                if (localSys_import_state_comment == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_state_comment cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_import_state_comment);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_mod_countTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_mod_count", xmlWriter);

                if (localSys_mod_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_mod_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_mod_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_row_errorTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_row_error", xmlWriter);

                if (localSys_row_error == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_row_error cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_row_error);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_target_sys_idTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_target_sys_id",
                    xmlWriter);

                if (localSys_target_sys_id == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_target_sys_id cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_target_sys_id);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_target_tableTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_target_table", xmlWriter);

                if (localSys_target_table == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_target_table cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_target_table);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_transform_mapTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_transform_map",
                    xmlWriter);

                if (localSys_transform_map == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_transform_map cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_transform_map);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_updated_byTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_updated_by", xmlWriter);

                if (localSys_updated_by == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_by cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_updated_by);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_updated_onTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_updated_on", xmlWriter);

                if (localSys_updated_on == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_on cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_updated_on);
                }

                xmlWriter.writeEndElement();
            }

            if (localTemplate_import_logTracker) {
                namespace = "";
                writeStartElement(null, namespace, "template_import_log",
                    xmlWriter);

                if (localTemplate_import_log == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "template_import_log cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localTemplate_import_log);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_1Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_1", xmlWriter);

                if (localU_1 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_1);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_1_record_1Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_1_record_1", xmlWriter);

                if (localU_1_record_1 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1_record_1 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_1_record_1);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_idTracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_id", xmlWriter);

                if (localU_id == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_id cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_id);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_recordTracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_record", xmlWriter);

                if (localU_record == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_record);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_record_1Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_record_1", xmlWriter);

                if (localU_record_1 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record_1 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_record_1);
                }

                xmlWriter.writeEndElement();
            }

            if (local__use_viewTracker) {
                namespace = "";
                writeStartElement(null, namespace, "__use_view", xmlWriter);

                if (local__use_view == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "__use_view cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(local__use_view);
                }

                xmlWriter.writeEndElement();
            }

            if (local__encoded_queryTracker) {
                namespace = "";
                writeStartElement(null, namespace, "__encoded_query", xmlWriter);

                if (local__encoded_query == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "__encoded_query cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(local__encoded_query);
                }

                xmlWriter.writeEndElement();
            }

            if (local__limitTracker) {
                namespace = "";
                writeStartElement(null, namespace, "__limit", xmlWriter);

                if (local__limit == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "__limit cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(local__limit);
                }

                xmlWriter.writeEndElement();
            }

            if (local__first_rowTracker) {
                namespace = "";
                writeStartElement(null, namespace, "__first_row", xmlWriter);

                if (local__first_row == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "__first_row cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(local__first_row);
                }

                xmlWriter.writeEndElement();
            }

            if (local__last_rowTracker) {
                namespace = "";
                writeStartElement(null, namespace, "__last_row", xmlWriter);

                if (local__last_row == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "__last_row cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(local__last_row);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals(
                        "http://www.service-now.com/u_import_set_test_import")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localSys_class_nameTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_class_name"));

                if (localSys_class_name != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_class_name));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_class_name cannot be null!!");
                }
            }

            if (localSys_created_byTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_created_by"));

                if (localSys_created_by != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_created_by));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_by cannot be null!!");
                }
            }

            if (localSys_created_onTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_created_on"));

                if (localSys_created_on != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_created_on));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_on cannot be null!!");
                }
            }

            if (localSys_import_rowTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_import_row"));

                if (localSys_import_row != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_import_row));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_row cannot be null!!");
                }
            }

            if (localSys_import_setTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_import_set"));

                if (localSys_import_set != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_import_set));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_set cannot be null!!");
                }
            }

            if (localSys_import_stateTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_import_state"));

                if (localSys_import_state != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_import_state));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_state cannot be null!!");
                }
            }

            if (localSys_import_state_commentTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_import_state_comment"));

                if (localSys_import_state_comment != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_import_state_comment));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_state_comment cannot be null!!");
                }
            }

            if (localSys_mod_countTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_mod_count"));

                if (localSys_mod_count != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_mod_count));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_mod_count cannot be null!!");
                }
            }

            if (localSys_row_errorTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_row_error"));

                if (localSys_row_error != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_row_error));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_row_error cannot be null!!");
                }
            }

            if (localSys_target_sys_idTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_target_sys_id"));

                if (localSys_target_sys_id != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_target_sys_id));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_target_sys_id cannot be null!!");
                }
            }

            if (localSys_target_tableTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_target_table"));

                if (localSys_target_table != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_target_table));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_target_table cannot be null!!");
                }
            }

            if (localSys_transform_mapTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_transform_map"));

                if (localSys_transform_map != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_transform_map));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_transform_map cannot be null!!");
                }
            }

            if (localSys_updated_byTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_updated_by"));

                if (localSys_updated_by != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_updated_by));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_by cannot be null!!");
                }
            }

            if (localSys_updated_onTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_updated_on"));

                if (localSys_updated_on != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_updated_on));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_on cannot be null!!");
                }
            }

            if (localTemplate_import_logTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "template_import_log"));

                if (localTemplate_import_log != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localTemplate_import_log));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "template_import_log cannot be null!!");
                }
            }

            if (localU_1Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_1"));

                if (localU_1 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_1));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1 cannot be null!!");
                }
            }

            if (localU_1_record_1Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_1_record_1"));

                if (localU_1_record_1 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_1_record_1));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1_record_1 cannot be null!!");
                }
            }

            if (localU_idTracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_id"));

                if (localU_id != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_id));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_id cannot be null!!");
                }
            }

            if (localU_recordTracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_record"));

                if (localU_record != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_record));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record cannot be null!!");
                }
            }

            if (localU_record_1Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_record_1"));

                if (localU_record_1 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_record_1));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record_1 cannot be null!!");
                }
            }

            if (local__use_viewTracker) {
                elementList.add(new javax.xml.namespace.QName("", "__use_view"));

                if (local__use_view != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            local__use_view));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "__use_view cannot be null!!");
                }
            }

            if (local__encoded_queryTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "__encoded_query"));

                if (local__encoded_query != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            local__encoded_query));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "__encoded_query cannot be null!!");
                }
            }

            if (local__limitTracker) {
                elementList.add(new javax.xml.namespace.QName("", "__limit"));

                if (local__limit != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            local__limit));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "__limit cannot be null!!");
                }
            }

            if (local__first_rowTracker) {
                elementList.add(new javax.xml.namespace.QName("", "__first_row"));

                if (local__first_row != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            local__first_row));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "__first_row cannot be null!!");
                }
            }

            if (local__last_rowTracker) {
                elementList.add(new javax.xml.namespace.QName("", "__last_row"));

                if (local__last_row != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            local__last_row));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "__last_row cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetKeys parse(javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                GetKeys object = new GetKeys();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"getKeys".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (GetKeys) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_class_name").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_class_name" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_class_name(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_created_by").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_created_by" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_created_by(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_created_on").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_created_on" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_created_on(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_import_row").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_import_row" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_import_row(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_import_set").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_import_set" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_import_set(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_import_state").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_import_state" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_import_state(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("",
                                "sys_import_state_comment").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_import_state_comment" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_import_state_comment(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_mod_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_mod_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_mod_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_row_error").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_row_error" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_row_error(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("",
                                "sys_target_sys_id").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_target_sys_id" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_target_sys_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_target_table").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_target_table" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_target_table(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("",
                                "sys_transform_map").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_transform_map" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_transform_map(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_updated_by").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_updated_by" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_updated_by(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_updated_on").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_updated_on" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_updated_on(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("",
                                "template_import_log").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "template_import_log" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setTemplate_import_log(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_1").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_1" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_1_record_1").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_1_record_1" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_1_record_1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_id").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_id" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_record").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_record" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_record(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_record_1").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_record_1" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_record_1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "__use_view").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "__use_view" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.set__use_view(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "__encoded_query").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "__encoded_query" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.set__encoded_query(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "__limit").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "__limit" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.set__limit(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "__first_row").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "__first_row" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.set__first_row(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "__last_row").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "__last_row" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.set__last_row(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class UpdateResponse implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/u_import_set_test_import",
                "updateResponse", "ns1");

        /**
         * field for Sys_id
         */
        protected java.lang.String localSys_id;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_idTracker = false;

        public boolean isSys_idSpecified() {
            return localSys_idTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_id() {
            return localSys_id;
        }

        /**
         * Auto generated setter method
         * @param param Sys_id
         */
        public void setSys_id(java.lang.String param) {
            localSys_idTracker = param != null;

            this.localSys_id = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    MY_QNAME);

            return factory.createOMElement(dataSource, MY_QNAME);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/u_import_set_test_import");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":updateResponse", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "updateResponse", xmlWriter);
                }
            }

            if (localSys_idTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_id", xmlWriter);

                if (localSys_id == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_id cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_id);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals(
                        "http://www.service-now.com/u_import_set_test_import")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localSys_idTracker) {
                elementList.add(new javax.xml.namespace.QName("", "sys_id"));

                if (localSys_id != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_id));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_id cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static UpdateResponse parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                UpdateResponse object = new UpdateResponse();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"updateResponse".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (UpdateResponse) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_id").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_id" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class DeleteMultiple implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://www.service-now.com/u_import_set_test_import",
                "deleteMultiple", "ns1");

        /**
         * field for Sys_class_name
         */
        protected java.lang.String localSys_class_name;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_class_nameTracker = false;

        /**
         * field for Sys_created_by
         */
        protected java.lang.String localSys_created_by;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_created_byTracker = false;

        /**
         * field for Sys_created_on
         */
        protected java.lang.String localSys_created_on;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_created_onTracker = false;

        /**
         * field for Sys_id
         */
        protected java.lang.String localSys_id;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_idTracker = false;

        /**
         * field for Sys_import_row
         */
        protected java.math.BigInteger localSys_import_row;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_import_rowTracker = false;

        /**
         * field for Sys_import_set
         */
        protected java.lang.String localSys_import_set;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_import_setTracker = false;

        /**
         * field for Sys_import_state
         */
        protected java.lang.String localSys_import_state;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_import_stateTracker = false;

        /**
         * field for Sys_import_state_comment
         */
        protected java.lang.String localSys_import_state_comment;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_import_state_commentTracker = false;

        /**
         * field for Sys_mod_count
         */
        protected java.math.BigInteger localSys_mod_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_mod_countTracker = false;

        /**
         * field for Sys_row_error
         */
        protected java.lang.String localSys_row_error;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_row_errorTracker = false;

        /**
         * field for Sys_target_sys_id
         */
        protected java.lang.String localSys_target_sys_id;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_target_sys_idTracker = false;

        /**
         * field for Sys_target_table
         */
        protected java.lang.String localSys_target_table;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_target_tableTracker = false;

        /**
         * field for Sys_transform_map
         */
        protected java.lang.String localSys_transform_map;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_transform_mapTracker = false;

        /**
         * field for Sys_updated_by
         */
        protected java.lang.String localSys_updated_by;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_updated_byTracker = false;

        /**
         * field for Sys_updated_on
         */
        protected java.lang.String localSys_updated_on;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_updated_onTracker = false;

        /**
         * field for Template_import_log
         */
        protected java.lang.String localTemplate_import_log;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localTemplate_import_logTracker = false;

        /**
         * field for U_1
         */
        protected java.lang.String localU_1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_1Tracker = false;

        /**
         * field for U_1_record_1
         */
        protected java.lang.String localU_1_record_1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_1_record_1Tracker = false;

        /**
         * field for U_id
         */
        protected java.lang.String localU_id;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_idTracker = false;

        /**
         * field for U_record
         */
        protected java.lang.String localU_record;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_recordTracker = false;

        /**
         * field for U_record_1
         */
        protected java.lang.String localU_record_1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_record_1Tracker = false;

        public boolean isSys_class_nameSpecified() {
            return localSys_class_nameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_class_name() {
            return localSys_class_name;
        }

        /**
         * Auto generated setter method
         * @param param Sys_class_name
         */
        public void setSys_class_name(java.lang.String param) {
            localSys_class_nameTracker = param != null;

            this.localSys_class_name = param;
        }

        public boolean isSys_created_bySpecified() {
            return localSys_created_byTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_created_by() {
            return localSys_created_by;
        }

        /**
         * Auto generated setter method
         * @param param Sys_created_by
         */
        public void setSys_created_by(java.lang.String param) {
            localSys_created_byTracker = param != null;

            this.localSys_created_by = param;
        }

        public boolean isSys_created_onSpecified() {
            return localSys_created_onTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_created_on() {
            return localSys_created_on;
        }

        /**
         * Auto generated setter method
         * @param param Sys_created_on
         */
        public void setSys_created_on(java.lang.String param) {
            localSys_created_onTracker = param != null;

            this.localSys_created_on = param;
        }

        public boolean isSys_idSpecified() {
            return localSys_idTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_id() {
            return localSys_id;
        }

        /**
         * Auto generated setter method
         * @param param Sys_id
         */
        public void setSys_id(java.lang.String param) {
            localSys_idTracker = param != null;

            this.localSys_id = param;
        }

        public boolean isSys_import_rowSpecified() {
            return localSys_import_rowTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getSys_import_row() {
            return localSys_import_row;
        }

        /**
         * Auto generated setter method
         * @param param Sys_import_row
         */
        public void setSys_import_row(java.math.BigInteger param) {
            localSys_import_rowTracker = param != null;

            this.localSys_import_row = param;
        }

        public boolean isSys_import_setSpecified() {
            return localSys_import_setTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_import_set() {
            return localSys_import_set;
        }

        /**
         * Auto generated setter method
         * @param param Sys_import_set
         */
        public void setSys_import_set(java.lang.String param) {
            localSys_import_setTracker = param != null;

            this.localSys_import_set = param;
        }

        public boolean isSys_import_stateSpecified() {
            return localSys_import_stateTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_import_state() {
            return localSys_import_state;
        }

        /**
         * Auto generated setter method
         * @param param Sys_import_state
         */
        public void setSys_import_state(java.lang.String param) {
            localSys_import_stateTracker = param != null;

            this.localSys_import_state = param;
        }

        public boolean isSys_import_state_commentSpecified() {
            return localSys_import_state_commentTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_import_state_comment() {
            return localSys_import_state_comment;
        }

        /**
         * Auto generated setter method
         * @param param Sys_import_state_comment
         */
        public void setSys_import_state_comment(java.lang.String param) {
            localSys_import_state_commentTracker = param != null;

            this.localSys_import_state_comment = param;
        }

        public boolean isSys_mod_countSpecified() {
            return localSys_mod_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getSys_mod_count() {
            return localSys_mod_count;
        }

        /**
         * Auto generated setter method
         * @param param Sys_mod_count
         */
        public void setSys_mod_count(java.math.BigInteger param) {
            localSys_mod_countTracker = param != null;

            this.localSys_mod_count = param;
        }

        public boolean isSys_row_errorSpecified() {
            return localSys_row_errorTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_row_error() {
            return localSys_row_error;
        }

        /**
         * Auto generated setter method
         * @param param Sys_row_error
         */
        public void setSys_row_error(java.lang.String param) {
            localSys_row_errorTracker = param != null;

            this.localSys_row_error = param;
        }

        public boolean isSys_target_sys_idSpecified() {
            return localSys_target_sys_idTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_target_sys_id() {
            return localSys_target_sys_id;
        }

        /**
         * Auto generated setter method
         * @param param Sys_target_sys_id
         */
        public void setSys_target_sys_id(java.lang.String param) {
            localSys_target_sys_idTracker = param != null;

            this.localSys_target_sys_id = param;
        }

        public boolean isSys_target_tableSpecified() {
            return localSys_target_tableTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_target_table() {
            return localSys_target_table;
        }

        /**
         * Auto generated setter method
         * @param param Sys_target_table
         */
        public void setSys_target_table(java.lang.String param) {
            localSys_target_tableTracker = param != null;

            this.localSys_target_table = param;
        }

        public boolean isSys_transform_mapSpecified() {
            return localSys_transform_mapTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_transform_map() {
            return localSys_transform_map;
        }

        /**
         * Auto generated setter method
         * @param param Sys_transform_map
         */
        public void setSys_transform_map(java.lang.String param) {
            localSys_transform_mapTracker = param != null;

            this.localSys_transform_map = param;
        }

        public boolean isSys_updated_bySpecified() {
            return localSys_updated_byTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_updated_by() {
            return localSys_updated_by;
        }

        /**
         * Auto generated setter method
         * @param param Sys_updated_by
         */
        public void setSys_updated_by(java.lang.String param) {
            localSys_updated_byTracker = param != null;

            this.localSys_updated_by = param;
        }

        public boolean isSys_updated_onSpecified() {
            return localSys_updated_onTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_updated_on() {
            return localSys_updated_on;
        }

        /**
         * Auto generated setter method
         * @param param Sys_updated_on
         */
        public void setSys_updated_on(java.lang.String param) {
            localSys_updated_onTracker = param != null;

            this.localSys_updated_on = param;
        }

        public boolean isTemplate_import_logSpecified() {
            return localTemplate_import_logTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getTemplate_import_log() {
            return localTemplate_import_log;
        }

        /**
         * Auto generated setter method
         * @param param Template_import_log
         */
        public void setTemplate_import_log(java.lang.String param) {
            localTemplate_import_logTracker = param != null;

            this.localTemplate_import_log = param;
        }

        public boolean isU_1Specified() {
            return localU_1Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_1() {
            return localU_1;
        }

        /**
         * Auto generated setter method
         * @param param U_1
         */
        public void setU_1(java.lang.String param) {
            localU_1Tracker = param != null;

            this.localU_1 = param;
        }

        public boolean isU_1_record_1Specified() {
            return localU_1_record_1Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_1_record_1() {
            return localU_1_record_1;
        }

        /**
         * Auto generated setter method
         * @param param U_1_record_1
         */
        public void setU_1_record_1(java.lang.String param) {
            localU_1_record_1Tracker = param != null;

            this.localU_1_record_1 = param;
        }

        public boolean isU_idSpecified() {
            return localU_idTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_id() {
            return localU_id;
        }

        /**
         * Auto generated setter method
         * @param param U_id
         */
        public void setU_id(java.lang.String param) {
            localU_idTracker = param != null;

            this.localU_id = param;
        }

        public boolean isU_recordSpecified() {
            return localU_recordTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_record() {
            return localU_record;
        }

        /**
         * Auto generated setter method
         * @param param U_record
         */
        public void setU_record(java.lang.String param) {
            localU_recordTracker = param != null;

            this.localU_record = param;
        }

        public boolean isU_record_1Specified() {
            return localU_record_1Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_record_1() {
            return localU_record_1;
        }

        /**
         * Auto generated setter method
         * @param param U_record_1
         */
        public void setU_record_1(java.lang.String param) {
            localU_record_1Tracker = param != null;

            this.localU_record_1 = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    MY_QNAME);

            return factory.createOMElement(dataSource, MY_QNAME);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/u_import_set_test_import");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":deleteMultiple", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "deleteMultiple", xmlWriter);
                }
            }

            if (localSys_class_nameTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_class_name", xmlWriter);

                if (localSys_class_name == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_class_name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_class_name);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_created_byTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_created_by", xmlWriter);

                if (localSys_created_by == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_by cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_created_by);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_created_onTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_created_on", xmlWriter);

                if (localSys_created_on == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_on cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_created_on);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_idTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_id", xmlWriter);

                if (localSys_id == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_id cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_id);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_import_rowTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_import_row", xmlWriter);

                if (localSys_import_row == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_row cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_import_row));
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_import_setTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_import_set", xmlWriter);

                if (localSys_import_set == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_set cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_import_set);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_import_stateTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_import_state", xmlWriter);

                if (localSys_import_state == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_state cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_import_state);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_import_state_commentTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_import_state_comment",
                    xmlWriter);

                if (localSys_import_state_comment == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_state_comment cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_import_state_comment);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_mod_countTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_mod_count", xmlWriter);

                if (localSys_mod_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_mod_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_mod_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_row_errorTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_row_error", xmlWriter);

                if (localSys_row_error == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_row_error cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_row_error);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_target_sys_idTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_target_sys_id",
                    xmlWriter);

                if (localSys_target_sys_id == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_target_sys_id cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_target_sys_id);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_target_tableTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_target_table", xmlWriter);

                if (localSys_target_table == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_target_table cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_target_table);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_transform_mapTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_transform_map",
                    xmlWriter);

                if (localSys_transform_map == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_transform_map cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_transform_map);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_updated_byTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_updated_by", xmlWriter);

                if (localSys_updated_by == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_by cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_updated_by);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_updated_onTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_updated_on", xmlWriter);

                if (localSys_updated_on == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_on cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_updated_on);
                }

                xmlWriter.writeEndElement();
            }

            if (localTemplate_import_logTracker) {
                namespace = "";
                writeStartElement(null, namespace, "template_import_log",
                    xmlWriter);

                if (localTemplate_import_log == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "template_import_log cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localTemplate_import_log);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_1Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_1", xmlWriter);

                if (localU_1 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_1);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_1_record_1Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_1_record_1", xmlWriter);

                if (localU_1_record_1 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1_record_1 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_1_record_1);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_idTracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_id", xmlWriter);

                if (localU_id == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_id cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_id);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_recordTracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_record", xmlWriter);

                if (localU_record == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_record);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_record_1Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_record_1", xmlWriter);

                if (localU_record_1 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record_1 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_record_1);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals(
                        "http://www.service-now.com/u_import_set_test_import")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localSys_class_nameTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_class_name"));

                if (localSys_class_name != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_class_name));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_class_name cannot be null!!");
                }
            }

            if (localSys_created_byTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_created_by"));

                if (localSys_created_by != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_created_by));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_by cannot be null!!");
                }
            }

            if (localSys_created_onTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_created_on"));

                if (localSys_created_on != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_created_on));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_on cannot be null!!");
                }
            }

            if (localSys_idTracker) {
                elementList.add(new javax.xml.namespace.QName("", "sys_id"));

                if (localSys_id != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_id));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_id cannot be null!!");
                }
            }

            if (localSys_import_rowTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_import_row"));

                if (localSys_import_row != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_import_row));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_row cannot be null!!");
                }
            }

            if (localSys_import_setTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_import_set"));

                if (localSys_import_set != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_import_set));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_set cannot be null!!");
                }
            }

            if (localSys_import_stateTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_import_state"));

                if (localSys_import_state != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_import_state));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_state cannot be null!!");
                }
            }

            if (localSys_import_state_commentTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_import_state_comment"));

                if (localSys_import_state_comment != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_import_state_comment));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_state_comment cannot be null!!");
                }
            }

            if (localSys_mod_countTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_mod_count"));

                if (localSys_mod_count != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_mod_count));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_mod_count cannot be null!!");
                }
            }

            if (localSys_row_errorTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_row_error"));

                if (localSys_row_error != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_row_error));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_row_error cannot be null!!");
                }
            }

            if (localSys_target_sys_idTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_target_sys_id"));

                if (localSys_target_sys_id != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_target_sys_id));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_target_sys_id cannot be null!!");
                }
            }

            if (localSys_target_tableTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_target_table"));

                if (localSys_target_table != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_target_table));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_target_table cannot be null!!");
                }
            }

            if (localSys_transform_mapTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_transform_map"));

                if (localSys_transform_map != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_transform_map));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_transform_map cannot be null!!");
                }
            }

            if (localSys_updated_byTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_updated_by"));

                if (localSys_updated_by != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_updated_by));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_by cannot be null!!");
                }
            }

            if (localSys_updated_onTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_updated_on"));

                if (localSys_updated_on != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_updated_on));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_on cannot be null!!");
                }
            }

            if (localTemplate_import_logTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "template_import_log"));

                if (localTemplate_import_log != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localTemplate_import_log));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "template_import_log cannot be null!!");
                }
            }

            if (localU_1Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_1"));

                if (localU_1 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_1));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1 cannot be null!!");
                }
            }

            if (localU_1_record_1Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_1_record_1"));

                if (localU_1_record_1 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_1_record_1));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1_record_1 cannot be null!!");
                }
            }

            if (localU_idTracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_id"));

                if (localU_id != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_id));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_id cannot be null!!");
                }
            }

            if (localU_recordTracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_record"));

                if (localU_record != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_record));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record cannot be null!!");
                }
            }

            if (localU_record_1Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_record_1"));

                if (localU_record_1 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_record_1));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record_1 cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static DeleteMultiple parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                DeleteMultiple object = new DeleteMultiple();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"deleteMultiple".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (DeleteMultiple) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_class_name").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_class_name" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_class_name(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_created_by").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_created_by" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_created_by(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_created_on").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_created_on" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_created_on(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_id").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_id" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_import_row").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_import_row" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_import_row(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_import_set").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_import_set" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_import_set(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_import_state").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_import_state" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_import_state(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("",
                                "sys_import_state_comment").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_import_state_comment" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_import_state_comment(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_mod_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_mod_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_mod_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_row_error").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_row_error" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_row_error(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("",
                                "sys_target_sys_id").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_target_sys_id" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_target_sys_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_target_table").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_target_table" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_target_table(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("",
                                "sys_transform_map").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_transform_map" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_transform_map(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_updated_by").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_updated_by" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_updated_by(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_updated_on").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_updated_on" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_updated_on(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("",
                                "template_import_log").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "template_import_log" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setTemplate_import_log(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_1").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_1" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_1_record_1").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_1_record_1" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_1_record_1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_id").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_id" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_record").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_record" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_record(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_record_1").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_record_1" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_record_1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }

    public static class GetRecordsResult_type0 implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = getRecordsResult_type0
           Namespace URI = http://www.service-now.com/u_import_set_test_import
           Namespace Prefix = ns1
         */

        /**
         * field for Sys_class_name
         */
        protected java.lang.String localSys_class_name;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_class_nameTracker = false;

        /**
         * field for Sys_created_by
         */
        protected java.lang.String localSys_created_by;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_created_byTracker = false;

        /**
         * field for Sys_created_on
         */
        protected java.lang.String localSys_created_on;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_created_onTracker = false;

        /**
         * field for Sys_id
         */
        protected java.lang.String localSys_id;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_idTracker = false;

        /**
         * field for Sys_import_row
         */
        protected java.math.BigInteger localSys_import_row;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_import_rowTracker = false;

        /**
         * field for Sys_import_set
         */
        protected java.lang.String localSys_import_set;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_import_setTracker = false;

        /**
         * field for Sys_import_state
         */
        protected java.lang.String localSys_import_state;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_import_stateTracker = false;

        /**
         * field for Sys_import_state_comment
         */
        protected java.lang.String localSys_import_state_comment;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_import_state_commentTracker = false;

        /**
         * field for Sys_mod_count
         */
        protected java.math.BigInteger localSys_mod_count;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_mod_countTracker = false;

        /**
         * field for Sys_row_error
         */
        protected java.lang.String localSys_row_error;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_row_errorTracker = false;

        /**
         * field for Sys_target_sys_id
         */
        protected java.lang.String localSys_target_sys_id;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_target_sys_idTracker = false;

        /**
         * field for Sys_target_table
         */
        protected java.lang.String localSys_target_table;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_target_tableTracker = false;

        /**
         * field for Sys_transform_map
         */
        protected java.lang.String localSys_transform_map;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_transform_mapTracker = false;

        /**
         * field for Sys_updated_by
         */
        protected java.lang.String localSys_updated_by;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_updated_byTracker = false;

        /**
         * field for Sys_updated_on
         */
        protected java.lang.String localSys_updated_on;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localSys_updated_onTracker = false;

        /**
         * field for Template_import_log
         */
        protected java.lang.String localTemplate_import_log;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localTemplate_import_logTracker = false;

        /**
         * field for U_1
         */
        protected java.lang.String localU_1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_1Tracker = false;

        /**
         * field for U_1_record_1
         */
        protected java.lang.String localU_1_record_1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_1_record_1Tracker = false;

        /**
         * field for U_id
         */
        protected java.lang.String localU_id;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_idTracker = false;

        /**
         * field for U_record
         */
        protected java.lang.String localU_record;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_recordTracker = false;

        /**
         * field for U_record_1
         */
        protected java.lang.String localU_record_1;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localU_record_1Tracker = false;

        public boolean isSys_class_nameSpecified() {
            return localSys_class_nameTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_class_name() {
            return localSys_class_name;
        }

        /**
         * Auto generated setter method
         * @param param Sys_class_name
         */
        public void setSys_class_name(java.lang.String param) {
            localSys_class_nameTracker = param != null;

            this.localSys_class_name = param;
        }

        public boolean isSys_created_bySpecified() {
            return localSys_created_byTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_created_by() {
            return localSys_created_by;
        }

        /**
         * Auto generated setter method
         * @param param Sys_created_by
         */
        public void setSys_created_by(java.lang.String param) {
            localSys_created_byTracker = param != null;

            this.localSys_created_by = param;
        }

        public boolean isSys_created_onSpecified() {
            return localSys_created_onTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_created_on() {
            return localSys_created_on;
        }

        /**
         * Auto generated setter method
         * @param param Sys_created_on
         */
        public void setSys_created_on(java.lang.String param) {
            localSys_created_onTracker = param != null;

            this.localSys_created_on = param;
        }

        public boolean isSys_idSpecified() {
            return localSys_idTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_id() {
            return localSys_id;
        }

        /**
         * Auto generated setter method
         * @param param Sys_id
         */
        public void setSys_id(java.lang.String param) {
            localSys_idTracker = param != null;

            this.localSys_id = param;
        }

        public boolean isSys_import_rowSpecified() {
            return localSys_import_rowTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getSys_import_row() {
            return localSys_import_row;
        }

        /**
         * Auto generated setter method
         * @param param Sys_import_row
         */
        public void setSys_import_row(java.math.BigInteger param) {
            localSys_import_rowTracker = param != null;

            this.localSys_import_row = param;
        }

        public boolean isSys_import_setSpecified() {
            return localSys_import_setTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_import_set() {
            return localSys_import_set;
        }

        /**
         * Auto generated setter method
         * @param param Sys_import_set
         */
        public void setSys_import_set(java.lang.String param) {
            localSys_import_setTracker = param != null;

            this.localSys_import_set = param;
        }

        public boolean isSys_import_stateSpecified() {
            return localSys_import_stateTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_import_state() {
            return localSys_import_state;
        }

        /**
         * Auto generated setter method
         * @param param Sys_import_state
         */
        public void setSys_import_state(java.lang.String param) {
            localSys_import_stateTracker = param != null;

            this.localSys_import_state = param;
        }

        public boolean isSys_import_state_commentSpecified() {
            return localSys_import_state_commentTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_import_state_comment() {
            return localSys_import_state_comment;
        }

        /**
         * Auto generated setter method
         * @param param Sys_import_state_comment
         */
        public void setSys_import_state_comment(java.lang.String param) {
            localSys_import_state_commentTracker = param != null;

            this.localSys_import_state_comment = param;
        }

        public boolean isSys_mod_countSpecified() {
            return localSys_mod_countTracker;
        }

        /**
         * Auto generated getter method
         * @return java.math.BigInteger
         */
        public java.math.BigInteger getSys_mod_count() {
            return localSys_mod_count;
        }

        /**
         * Auto generated setter method
         * @param param Sys_mod_count
         */
        public void setSys_mod_count(java.math.BigInteger param) {
            localSys_mod_countTracker = param != null;

            this.localSys_mod_count = param;
        }

        public boolean isSys_row_errorSpecified() {
            return localSys_row_errorTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_row_error() {
            return localSys_row_error;
        }

        /**
         * Auto generated setter method
         * @param param Sys_row_error
         */
        public void setSys_row_error(java.lang.String param) {
            localSys_row_errorTracker = param != null;

            this.localSys_row_error = param;
        }

        public boolean isSys_target_sys_idSpecified() {
            return localSys_target_sys_idTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_target_sys_id() {
            return localSys_target_sys_id;
        }

        /**
         * Auto generated setter method
         * @param param Sys_target_sys_id
         */
        public void setSys_target_sys_id(java.lang.String param) {
            localSys_target_sys_idTracker = param != null;

            this.localSys_target_sys_id = param;
        }

        public boolean isSys_target_tableSpecified() {
            return localSys_target_tableTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_target_table() {
            return localSys_target_table;
        }

        /**
         * Auto generated setter method
         * @param param Sys_target_table
         */
        public void setSys_target_table(java.lang.String param) {
            localSys_target_tableTracker = param != null;

            this.localSys_target_table = param;
        }

        public boolean isSys_transform_mapSpecified() {
            return localSys_transform_mapTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_transform_map() {
            return localSys_transform_map;
        }

        /**
         * Auto generated setter method
         * @param param Sys_transform_map
         */
        public void setSys_transform_map(java.lang.String param) {
            localSys_transform_mapTracker = param != null;

            this.localSys_transform_map = param;
        }

        public boolean isSys_updated_bySpecified() {
            return localSys_updated_byTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_updated_by() {
            return localSys_updated_by;
        }

        /**
         * Auto generated setter method
         * @param param Sys_updated_by
         */
        public void setSys_updated_by(java.lang.String param) {
            localSys_updated_byTracker = param != null;

            this.localSys_updated_by = param;
        }

        public boolean isSys_updated_onSpecified() {
            return localSys_updated_onTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getSys_updated_on() {
            return localSys_updated_on;
        }

        /**
         * Auto generated setter method
         * @param param Sys_updated_on
         */
        public void setSys_updated_on(java.lang.String param) {
            localSys_updated_onTracker = param != null;

            this.localSys_updated_on = param;
        }

        public boolean isTemplate_import_logSpecified() {
            return localTemplate_import_logTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getTemplate_import_log() {
            return localTemplate_import_log;
        }

        /**
         * Auto generated setter method
         * @param param Template_import_log
         */
        public void setTemplate_import_log(java.lang.String param) {
            localTemplate_import_logTracker = param != null;

            this.localTemplate_import_log = param;
        }

        public boolean isU_1Specified() {
            return localU_1Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_1() {
            return localU_1;
        }

        /**
         * Auto generated setter method
         * @param param U_1
         */
        public void setU_1(java.lang.String param) {
            localU_1Tracker = param != null;

            this.localU_1 = param;
        }

        public boolean isU_1_record_1Specified() {
            return localU_1_record_1Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_1_record_1() {
            return localU_1_record_1;
        }

        /**
         * Auto generated setter method
         * @param param U_1_record_1
         */
        public void setU_1_record_1(java.lang.String param) {
            localU_1_record_1Tracker = param != null;

            this.localU_1_record_1 = param;
        }

        public boolean isU_idSpecified() {
            return localU_idTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_id() {
            return localU_id;
        }

        /**
         * Auto generated setter method
         * @param param U_id
         */
        public void setU_id(java.lang.String param) {
            localU_idTracker = param != null;

            this.localU_id = param;
        }

        public boolean isU_recordSpecified() {
            return localU_recordTracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_record() {
            return localU_record;
        }

        /**
         * Auto generated setter method
         * @param param U_record
         */
        public void setU_record(java.lang.String param) {
            localU_recordTracker = param != null;

            this.localU_record = param;
        }

        public boolean isU_record_1Specified() {
            return localU_record_1Tracker;
        }

        /**
         * Auto generated getter method
         * @return java.lang.String
         */
        public java.lang.String getU_record_1() {
            return localU_record_1;
        }

        /**
         * Auto generated setter method
         * @param param U_record_1
         */
        public void setU_record_1(java.lang.String param) {
            localU_record_1Tracker = param != null;

            this.localU_record_1 = param;
        }

        /**
         *
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {
            org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                    parentQName);

            return factory.createOMElement(dataSource, parentQName);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
            throws javax.xml.stream.XMLStreamException,
                org.apache.axis2.databinding.ADBException {
            java.lang.String prefix = null;
            java.lang.String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                xmlWriter);

            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                        "http://www.service-now.com/u_import_set_test_import");

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":getRecordsResult_type0", xmlWriter);
                } else {
                    writeAttribute("xsi",
                        "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "getRecordsResult_type0", xmlWriter);
                }
            }

            if (localSys_class_nameTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_class_name", xmlWriter);

                if (localSys_class_name == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_class_name cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_class_name);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_created_byTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_created_by", xmlWriter);

                if (localSys_created_by == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_by cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_created_by);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_created_onTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_created_on", xmlWriter);

                if (localSys_created_on == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_on cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_created_on);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_idTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_id", xmlWriter);

                if (localSys_id == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_id cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_id);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_import_rowTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_import_row", xmlWriter);

                if (localSys_import_row == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_row cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_import_row));
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_import_setTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_import_set", xmlWriter);

                if (localSys_import_set == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_set cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_import_set);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_import_stateTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_import_state", xmlWriter);

                if (localSys_import_state == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_state cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_import_state);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_import_state_commentTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_import_state_comment",
                    xmlWriter);

                if (localSys_import_state_comment == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_state_comment cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_import_state_comment);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_mod_countTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_mod_count", xmlWriter);

                if (localSys_mod_count == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_mod_count cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_mod_count));
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_row_errorTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_row_error", xmlWriter);

                if (localSys_row_error == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_row_error cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_row_error);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_target_sys_idTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_target_sys_id",
                    xmlWriter);

                if (localSys_target_sys_id == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_target_sys_id cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_target_sys_id);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_target_tableTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_target_table", xmlWriter);

                if (localSys_target_table == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_target_table cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_target_table);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_transform_mapTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_transform_map",
                    xmlWriter);

                if (localSys_transform_map == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_transform_map cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_transform_map);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_updated_byTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_updated_by", xmlWriter);

                if (localSys_updated_by == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_by cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_updated_by);
                }

                xmlWriter.writeEndElement();
            }

            if (localSys_updated_onTracker) {
                namespace = "";
                writeStartElement(null, namespace, "sys_updated_on", xmlWriter);

                if (localSys_updated_on == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_on cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localSys_updated_on);
                }

                xmlWriter.writeEndElement();
            }

            if (localTemplate_import_logTracker) {
                namespace = "";
                writeStartElement(null, namespace, "template_import_log",
                    xmlWriter);

                if (localTemplate_import_log == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "template_import_log cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localTemplate_import_log);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_1Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_1", xmlWriter);

                if (localU_1 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_1);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_1_record_1Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_1_record_1", xmlWriter);

                if (localU_1_record_1 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1_record_1 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_1_record_1);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_idTracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_id", xmlWriter);

                if (localU_id == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_id cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_id);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_recordTracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_record", xmlWriter);

                if (localU_record == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_record);
                }

                xmlWriter.writeEndElement();
            }

            if (localU_record_1Tracker) {
                namespace = "";
                writeStartElement(null, namespace, "u_record_1", xmlWriter);

                if (localU_record_1 == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record_1 cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localU_record_1);
                }

                xmlWriter.writeEndElement();
            }

            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(
            java.lang.String namespace) {
            if (namespace.equals(
                        "http://www.service-now.com/u_import_set_test_import")) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix,
            java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,
            java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,
            java.lang.String attName, java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace,
            java.lang.String attName, javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
            }

            java.lang.String attributeValue;

            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }

            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         *  method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();

            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }

                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" +
                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }

                    namespaceURI = qnames[i].getNamespaceURI();

                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);

                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix, namespaceURI);
                        }

                        if (prefix.trim().length() > 0) {
                            stringToWrite.append(prefix).append(":")
                                         .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                }

                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter,
            java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);

                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }

                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }

                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }

            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         *
         */
        public javax.xml.stream.XMLStreamReader getPullParser(
            javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {
            java.util.ArrayList elementList = new java.util.ArrayList();
            java.util.ArrayList attribList = new java.util.ArrayList();

            if (localSys_class_nameTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_class_name"));

                if (localSys_class_name != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_class_name));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_class_name cannot be null!!");
                }
            }

            if (localSys_created_byTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_created_by"));

                if (localSys_created_by != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_created_by));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_by cannot be null!!");
                }
            }

            if (localSys_created_onTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_created_on"));

                if (localSys_created_on != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_created_on));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_created_on cannot be null!!");
                }
            }

            if (localSys_idTracker) {
                elementList.add(new javax.xml.namespace.QName("", "sys_id"));

                if (localSys_id != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_id));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_id cannot be null!!");
                }
            }

            if (localSys_import_rowTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_import_row"));

                if (localSys_import_row != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_import_row));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_row cannot be null!!");
                }
            }

            if (localSys_import_setTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_import_set"));

                if (localSys_import_set != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_import_set));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_set cannot be null!!");
                }
            }

            if (localSys_import_stateTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_import_state"));

                if (localSys_import_state != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_import_state));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_state cannot be null!!");
                }
            }

            if (localSys_import_state_commentTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_import_state_comment"));

                if (localSys_import_state_comment != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_import_state_comment));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_import_state_comment cannot be null!!");
                }
            }

            if (localSys_mod_countTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_mod_count"));

                if (localSys_mod_count != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_mod_count));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_mod_count cannot be null!!");
                }
            }

            if (localSys_row_errorTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_row_error"));

                if (localSys_row_error != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_row_error));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_row_error cannot be null!!");
                }
            }

            if (localSys_target_sys_idTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_target_sys_id"));

                if (localSys_target_sys_id != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_target_sys_id));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_target_sys_id cannot be null!!");
                }
            }

            if (localSys_target_tableTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_target_table"));

                if (localSys_target_table != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_target_table));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_target_table cannot be null!!");
                }
            }

            if (localSys_transform_mapTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_transform_map"));

                if (localSys_transform_map != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_transform_map));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_transform_map cannot be null!!");
                }
            }

            if (localSys_updated_byTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_updated_by"));

                if (localSys_updated_by != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_updated_by));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_by cannot be null!!");
                }
            }

            if (localSys_updated_onTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "sys_updated_on"));

                if (localSys_updated_on != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localSys_updated_on));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "sys_updated_on cannot be null!!");
                }
            }

            if (localTemplate_import_logTracker) {
                elementList.add(new javax.xml.namespace.QName("",
                        "template_import_log"));

                if (localTemplate_import_log != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localTemplate_import_log));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "template_import_log cannot be null!!");
                }
            }

            if (localU_1Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_1"));

                if (localU_1 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_1));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1 cannot be null!!");
                }
            }

            if (localU_1_record_1Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_1_record_1"));

                if (localU_1_record_1 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_1_record_1));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_1_record_1 cannot be null!!");
                }
            }

            if (localU_idTracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_id"));

                if (localU_id != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_id));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_id cannot be null!!");
                }
            }

            if (localU_recordTracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_record"));

                if (localU_record != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_record));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record cannot be null!!");
                }
            }

            if (localU_record_1Tracker) {
                elementList.add(new javax.xml.namespace.QName("", "u_record_1"));

                if (localU_record_1 != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            localU_record_1));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(
                        "u_record_1 cannot be null!!");
                }
            }

            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
                elementList.toArray(), attribList.toArray());
        }

        /**
         *  Factory class that keeps the parse method
         */
        public static class Factory {
            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             *                If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static GetRecordsResult_type0 parse(
                javax.xml.stream.XMLStreamReader reader)
                throws java.lang.Exception {
                GetRecordsResult_type0 object = new GetRecordsResult_type0();

                int event;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";

                try {
                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.getAttributeValue(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "type") != null) {
                        java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "type");

                        if (fullTypeName != null) {
                            java.lang.String nsPrefix = null;

                            if (fullTypeName.indexOf(":") > -1) {
                                nsPrefix = fullTypeName.substring(0,
                                        fullTypeName.indexOf(":"));
                            }

                            nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                        ":") + 1);

                            if (!"getRecordsResult_type0".equals(type)) {
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext()
                                                               .getNamespaceURI(nsPrefix);

                                return (GetRecordsResult_type0) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                            }
                        }
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    java.util.Vector handledAttributes = new java.util.Vector();

                    reader.next();

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_class_name").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_class_name" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_class_name(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_created_by").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_created_by" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_created_by(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_created_on").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_created_on" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_created_on(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_id").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_id" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_import_row").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_import_row" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_import_row(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_import_set").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_import_set" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_import_set(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_import_state").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_import_state" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_import_state(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("",
                                "sys_import_state_comment").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_import_state_comment" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_import_state_comment(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_mod_count").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_mod_count" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_mod_count(org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_row_error").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_row_error" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_row_error(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("",
                                "sys_target_sys_id").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_target_sys_id" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_target_sys_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_target_table").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_target_table" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_target_table(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("",
                                "sys_transform_map").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_transform_map" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_transform_map(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_updated_by").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_updated_by" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_updated_by(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "sys_updated_on").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "sys_updated_on" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setSys_updated_on(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("",
                                "template_import_log").equals(reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "template_import_log" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setTemplate_import_log(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_1").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_1" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_1_record_1").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_1_record_1" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_1_record_1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_id").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_id" + "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_record").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_record" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_record(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement() &&
                            new javax.xml.namespace.QName("", "u_record_1").equals(
                                reader.getName())) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "u_record_1" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        object.setU_record_1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));

                        reader.next();
                    } // End of if for expected property start element

                    else {
                    }

                    while (!reader.isStartElement() && !reader.isEndElement())
                        reader.next();

                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                            "Unexpected subelement " + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new java.lang.Exception(e);
                }

                return object;
            }
        } //end of factory class
    }
}
