
package eu.chorevolution.prosumer.veterinary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per farmSiteInspectionRequestType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="farmSiteInspectionRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="choreographyId" type="{http://eu.chorevolution.farmbusinessstartup/veterinary}choreographyInstanceRequest"/&gt;
 *         &lt;element name="senderParticipantName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="receiverParticipantName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="choreographyTaskName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="inputMessageName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="inputMessageData" type="{http://eu.chorevolution.farmbusinessstartup/veterinary}farmSiteInspectionRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "farmSiteInspectionRequestType", propOrder = {
    "choreographyId",
    "senderParticipantName",
    "receiverParticipantName",
    "choreographyTaskName",
    "inputMessageName",
    "inputMessageData"
})
public class FarmSiteInspectionRequestType {

    @XmlElement(required = true)
    protected ChoreographyInstanceRequest choreographyId;
    @XmlElement(required = true)
    protected String senderParticipantName;
    @XmlElement(required = true)
    protected String receiverParticipantName;
    @XmlElement(required = true)
    protected String choreographyTaskName;
    @XmlElement(required = true)
    protected String inputMessageName;
    @XmlElement(required = true)
    protected FarmSiteInspectionRequest inputMessageData;

    /**
     * Recupera il valore della proprietà choreographyId.
     * 
     * @return
     *     possible object is
     *     {@link ChoreographyInstanceRequest }
     *     
     */
    public ChoreographyInstanceRequest getChoreographyId() {
        return choreographyId;
    }

    /**
     * Imposta il valore della proprietà choreographyId.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoreographyInstanceRequest }
     *     
     */
    public void setChoreographyId(ChoreographyInstanceRequest value) {
        this.choreographyId = value;
    }

    /**
     * Recupera il valore della proprietà senderParticipantName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderParticipantName() {
        return senderParticipantName;
    }

    /**
     * Imposta il valore della proprietà senderParticipantName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderParticipantName(String value) {
        this.senderParticipantName = value;
    }

    /**
     * Recupera il valore della proprietà receiverParticipantName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverParticipantName() {
        return receiverParticipantName;
    }

    /**
     * Imposta il valore della proprietà receiverParticipantName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverParticipantName(String value) {
        this.receiverParticipantName = value;
    }

    /**
     * Recupera il valore della proprietà choreographyTaskName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChoreographyTaskName() {
        return choreographyTaskName;
    }

    /**
     * Imposta il valore della proprietà choreographyTaskName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChoreographyTaskName(String value) {
        this.choreographyTaskName = value;
    }

    /**
     * Recupera il valore della proprietà inputMessageName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputMessageName() {
        return inputMessageName;
    }

    /**
     * Imposta il valore della proprietà inputMessageName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputMessageName(String value) {
        this.inputMessageName = value;
    }

    /**
     * Recupera il valore della proprietà inputMessageData.
     * 
     * @return
     *     possible object is
     *     {@link FarmSiteInspectionRequest }
     *     
     */
    public FarmSiteInspectionRequest getInputMessageData() {
        return inputMessageData;
    }

    /**
     * Imposta il valore della proprietà inputMessageData.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmSiteInspectionRequest }
     *     
     */
    public void setInputMessageData(FarmSiteInspectionRequest value) {
        this.inputMessageData = value;
    }

}
