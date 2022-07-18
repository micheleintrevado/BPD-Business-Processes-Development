
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package eu.chorevolution.prosumer.registryoffice;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2022-07-17T21:51:04.220+02:00
 * Generated source version: 3.1.6
 * 
 */

@javax.jws.WebService(
                      serviceName = "RegistryOfficeService",
                      portName = "RegistryOfficePort",
                      targetNamespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice",
                      wsdlLocation = "file:/C:/Users/gianl/Desktop/BPD/RegistryOffice/src/main/resources/RegistryOffice.wsdl",
                      endpointInterface = "eu.chorevolution.prosumer.registryoffice.RegistryOfficePT")
                      
public class RegistryOfficePortImpl implements RegistryOfficePT {

    private static final Logger LOG = Logger.getLogger(RegistryOfficePortImpl.class.getName());

    /* (non-Javadoc)
     * @see eu.chorevolution.prosumer.registryoffice.RegistryOfficePT#receiveFarmRegistrationResponse(eu.chorevolution.prosumer.registryoffice.ReceiveFarmRegistrationResponseType  parameters )*
     */
    public eu.chorevolution.prosumer.registryoffice.ReceiveFarmRegistrationResponseReturnType receiveFarmRegistrationResponse(ReceiveFarmRegistrationResponseType parameters) { 
        LOG.info("Executing operation receiveFarmRegistrationResponse");
        System.out.println(parameters);
        try {
            eu.chorevolution.prosumer.registryoffice.ReceiveFarmRegistrationResponseReturnType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see eu.chorevolution.prosumer.registryoffice.RegistryOfficePT#sendFarmBusinessCodeStartupNotification(eu.chorevolution.prosumer.registryoffice.SendRequestType  parameters )*
     */
    public eu.chorevolution.prosumer.registryoffice.FarmBusinessCodeStartupNotificationReturnType sendFarmBusinessCodeStartupNotification(SendRequestType parameters) { 
        LOG.info("Executing operation sendFarmBusinessCodeStartupNotification");
        System.out.println(parameters);
        try {
            eu.chorevolution.prosumer.registryoffice.FarmBusinessCodeStartupNotificationReturnType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see eu.chorevolution.prosumer.registryoffice.RegistryOfficePT#sendFarmRegistrationNotification(eu.chorevolution.prosumer.registryoffice.SendRequestType  parameters )*
     */
    public eu.chorevolution.prosumer.registryoffice.FarmRegistrationNotificationReturnType sendFarmRegistrationNotification(SendRequestType parameters) { 
        LOG.info("Executing operation sendFarmRegistrationNotification");
        System.out.println(parameters);
        try {
            eu.chorevolution.prosumer.registryoffice.FarmRegistrationNotificationReturnType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see eu.chorevolution.prosumer.registryoffice.RegistryOfficePT#sendFarmRegistrationRequest(eu.chorevolution.prosumer.registryoffice.SendRequestType  parameters )*
     */
    public eu.chorevolution.prosumer.registryoffice.FarmRegistrationRequestReturnType sendFarmRegistrationRequest(SendRequestType parameters) { 
        LOG.info("Executing operation sendFarmRegistrationRequest");
        System.out.println(parameters);
        try {
            eu.chorevolution.prosumer.registryoffice.FarmRegistrationRequestReturnType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see eu.chorevolution.prosumer.registryoffice.RegistryOfficePT#farmOpening(eu.chorevolution.prosumer.registryoffice.FarmOpeningNotificationType  parameters )*
     */
    public eu.chorevolution.prosumer.registryoffice.FarmOpeningNotificationReturnType farmOpening(FarmOpeningNotificationType parameters) { 
        LOG.info("Executing operation farmOpening");
        System.out.println(parameters);
        try {
            eu.chorevolution.prosumer.registryoffice.FarmOpeningNotificationReturnType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
