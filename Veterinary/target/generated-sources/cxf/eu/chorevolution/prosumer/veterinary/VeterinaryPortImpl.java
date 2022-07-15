
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package eu.chorevolution.prosumer.veterinary;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2017-07-20T16:47:23.904+02:00
 * Generated source version: 3.1.6
 * 
 */

@javax.jws.WebService(
                      serviceName = "VeterinaryService",
                      portName = "VeterinaryPort",
                      targetNamespace = "http://eu.chorevolution.farmbusinessstartup/veterinary",
                      wsdlLocation = "file:/Users/claudio/Workspaces/chorevolution-studio-bundle-runtime/Veterinary/src/main/resources/Veterinary.wsdl",
                      endpointInterface = "eu.chorevolution.prosumer.veterinary.VeterinaryPT")
                      
public class VeterinaryPortImpl implements VeterinaryPT {

    private static final Logger LOG = Logger.getLogger(VeterinaryPortImpl.class.getName());

    /* (non-Javadoc)
     * @see eu.chorevolution.prosumer.veterinary.VeterinaryPT#farmHealthcareRegistration(eu.chorevolution.prosumer.veterinary.FarmRegistrationNotificationType  parameters )*
     */
    public eu.chorevolution.prosumer.veterinary.FarmRegistrationNotificationReturnType farmHealthcareRegistration(FarmRegistrationNotificationType parameters) { 
        LOG.info("Executing operation farmHealthcareRegistration");
        System.out.println(parameters);
        try {
            eu.chorevolution.prosumer.veterinary.FarmRegistrationNotificationReturnType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see eu.chorevolution.prosumer.veterinary.VeterinaryPT#sendFarmSiteInspectionResponse(eu.chorevolution.prosumer.veterinary.SendRequestType  parameters )*
     */
    public eu.chorevolution.prosumer.veterinary.FarmSiteInspectionResponseReturnType sendFarmSiteInspectionResponse(SendRequestType parameters) { 
        LOG.info("Executing operation sendFarmSiteInspectionResponse");
        System.out.println(parameters);
        try {
            eu.chorevolution.prosumer.veterinary.FarmSiteInspectionResponseReturnType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see eu.chorevolution.prosumer.veterinary.VeterinaryPT#farmOpeningSiteInspectionRequest(eu.chorevolution.prosumer.veterinary.FarmSiteInspectionRequestType  parameters )*
     */
    public eu.chorevolution.prosumer.veterinary.FarmSiteInspectionRequestReturnType farmOpeningSiteInspectionRequest(FarmSiteInspectionRequestType parameters) { 
        LOG.info("Executing operation farmOpeningSiteInspectionRequest");
        System.out.println(parameters);
        try {
            eu.chorevolution.prosumer.veterinary.FarmSiteInspectionRequestReturnType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
