//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2015.12.01 a las 12:25:49 PM CET 
//


package com.northwind.rss;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies a web service that supports the rssCloud interface which can be implemented in HTTP-POST, XML-RPC or SOAP 1.1. 
 * Its purpose is to allow processes to register with a cloud to be notified of updates to the channel, implementing a lightweight publish-subscribe protocol for RSS feeds.
 * 
 * <p>Clase Java para tCloud complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tCloud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="domain" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="path" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="registerProcedure" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="protocol" use="required" type="{}tCloudProtocol" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCloud")
public class TCloud {

    @XmlAttribute(name = "domain", required = true)
    protected String domain;
    @XmlAttribute(name = "port", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger port;
    @XmlAttribute(name = "path", required = true)
    protected String path;
    @XmlAttribute(name = "registerProcedure", required = true)
    protected String registerProcedure;
    @XmlAttribute(name = "protocol", required = true)
    protected TCloudProtocol protocol;

    /**
     * Obtiene el valor de la propiedad domain.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Define el valor de la propiedad domain.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Obtiene el valor de la propiedad port.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPort() {
        return port;
    }

    /**
     * Define el valor de la propiedad port.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPort(BigInteger value) {
        this.port = value;
    }

    /**
     * Obtiene el valor de la propiedad path.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Define el valor de la propiedad path.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Obtiene el valor de la propiedad registerProcedure.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterProcedure() {
        return registerProcedure;
    }

    /**
     * Define el valor de la propiedad registerProcedure.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterProcedure(String value) {
        this.registerProcedure = value;
    }

    /**
     * Obtiene el valor de la propiedad protocol.
     * 
     * @return
     *     possible object is
     *     {@link TCloudProtocol }
     *     
     */
    public TCloudProtocol getProtocol() {
        return protocol;
    }

    /**
     * Define el valor de la propiedad protocol.
     * 
     * @param value
     *     allowed object is
     *     {@link TCloudProtocol }
     *     
     */
    public void setProtocol(TCloudProtocol value) {
        this.protocol = value;
    }

}
