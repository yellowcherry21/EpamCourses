//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.16 at 07:03:41 AM EET 
//


package ua.epam.sergiishapoval.projects.xmlxsd.voucher;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for touristVoucher complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="touristVoucher">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{}type"/>
 *         &lt;element name="country" type="{}oneLanguageString"/>
 *         &lt;element name="numberDaysNights" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="transport" type="{}transport"/>
 *         &lt;element name="hotelProps" type="{}hotelProps"/>
 *         &lt;element name="cost" type="{}price"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "touristVoucher", propOrder = {
    "type",
    "country",
    "numberDaysNights",
    "transport",
    "hotelProps",
    "cost"
})
public class TouristVoucher {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Type type;
    @XmlElement(required = true)
    protected String country;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberDaysNights;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Transport transport;
    @XmlElement(required = true)
    protected HotelProps hotelProps;
    @XmlElement(required = true)
    protected Price cost;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setType(Type value) {
        this.type = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the numberDaysNights property.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *     
     */
    public BigInteger getNumberDaysNights() {
        return numberDaysNights;
    }

    /**
     * Sets the value of the numberDaysNights property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *     
     */
    public void setNumberDaysNights(BigInteger value) {
        this.numberDaysNights = value;
    }

    /**
     * Gets the value of the transport property.
     * 
     * @return
     *     possible object is
     *     {@link Transport }
     *     
     */
    public Transport getTransport() {
        return transport;
    }

    /**
     * Sets the value of the transport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transport }
     *     
     */
    public void setTransport(Transport value) {
        this.transport = value;
    }

    /**
     * Gets the value of the hotelProps property.
     * 
     * @return
     *     possible object is
     *     {@link HotelProps }
     *     
     */
    public HotelProps getHotelProps() {
        return hotelProps;
    }

    /**
     * Sets the value of the hotelProps property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelProps }
     *     
     */
    public void setHotelProps(HotelProps value) {
        this.hotelProps = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setCost(Price value) {
        this.cost = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    @Override
    public String toString() {
        return "TouristVoucher{" +
                "type=" + type +
                ", country='" + country + '\'' +
                ", numberDaysNights=" + numberDaysNights +
                ", transport=" + transport +
                ", hotelProps=" + hotelProps +
                ", cost=" + cost +
                ", id='" + id + '\'' +
                '}';
    }
}
