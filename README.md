### Example of SerivceNow client via SOAP with WS-Security

Implementation is using Axis2 library with Rampart. `rampart.mar` must be on classpath.

The main issue is that ServiceNow doesn't send Security Header in response, so Axis2 throws exception although the 
request completed successfully. To overcome this issue some hack needed [link](http://www.coderanch.com/t/583213/Web-Services/java/Axis-Rampart-apply-security-outbound)

Patched `rampart.mar` is automatically copied to `lib` folder along with axis2 libs