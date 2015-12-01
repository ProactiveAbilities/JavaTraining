//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2015.12.01 a las 12:25:49 PM CET 
//


package com.northwind.rss;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Clase Java para tRssChannel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tRssChannel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}language" minOccurs="0"/>
 *         &lt;element name="copyright" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pubDate" type="{}tRfc822FormatDate" minOccurs="0"/>
 *         &lt;element name="lastBuildDate" type="{}tRfc822FormatDate" minOccurs="0"/>
 *         &lt;element name="category" type="{}tCategory" minOccurs="0"/>
 *         &lt;element name="generator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docs" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="cloud" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="ttl" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="image" type="{}tImage" minOccurs="0"/>
 *         &lt;element name="textInput" type="{}tTextInput" minOccurs="0"/>
 *         &lt;element name="skipHours" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="skipDays" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="item" type="{}tRssItem" maxOccurs="unbounded"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRssChannel", propOrder = {
    "title",
    "link",
    "description",
    "language",
    "copyright",
    "pubDate",
    "lastBuildDate",
    "category",
    "generator",
    "docs",
    "cloud",
    "ttl",
    "image",
    "textInput",
    "skipHours",
    "skipDays",
    "item",
    "any"
})
public class TRssChannel {

    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String link;
    @XmlElement(required = true)
    protected String description;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    protected String copyright;
    protected String pubDate;
    protected String lastBuildDate;
    protected TCategory category;
    protected String generator;
    @XmlSchemaType(name = "anyURI")
    protected String docs;
    protected Object cloud;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger ttl;
    protected TImage image;
    protected TTextInput textInput;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger skipHours;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger skipDays;
    @XmlElement(required = true)
    protected List<TRssItem> item;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Obtiene el valor de la propiedad title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define el valor de la propiedad title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtiene el valor de la propiedad link.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLink() {
        return link;
    }

    /**
     * Define el valor de la propiedad link.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLink(String value) {
        this.link = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Define el valor de la propiedad language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Obtiene el valor de la propiedad copyright.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * Define el valor de la propiedad copyright.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyright(String value) {
        this.copyright = value;
    }

    /**
     * Obtiene el valor de la propiedad pubDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPubDate() {
        return pubDate;
    }

    /**
     * Define el valor de la propiedad pubDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPubDate(String value) {
        this.pubDate = value;
    }

    /**
     * Obtiene el valor de la propiedad lastBuildDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastBuildDate() {
        return lastBuildDate;
    }

    /**
     * Define el valor de la propiedad lastBuildDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastBuildDate(String value) {
        this.lastBuildDate = value;
    }

    /**
     * Obtiene el valor de la propiedad category.
     * 
     * @return
     *     possible object is
     *     {@link TCategory }
     *     
     */
    public TCategory getCategory() {
        return category;
    }

    /**
     * Define el valor de la propiedad category.
     * 
     * @param value
     *     allowed object is
     *     {@link TCategory }
     *     
     */
    public void setCategory(TCategory value) {
        this.category = value;
    }

    /**
     * Obtiene el valor de la propiedad generator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerator() {
        return generator;
    }

    /**
     * Define el valor de la propiedad generator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerator(String value) {
        this.generator = value;
    }

    /**
     * Obtiene el valor de la propiedad docs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocs() {
        return docs;
    }

    /**
     * Define el valor de la propiedad docs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocs(String value) {
        this.docs = value;
    }

    /**
     * Obtiene el valor de la propiedad cloud.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCloud() {
        return cloud;
    }

    /**
     * Define el valor de la propiedad cloud.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCloud(Object value) {
        this.cloud = value;
    }

    /**
     * Obtiene el valor de la propiedad ttl.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTtl() {
        return ttl;
    }

    /**
     * Define el valor de la propiedad ttl.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTtl(BigInteger value) {
        this.ttl = value;
    }

    /**
     * Obtiene el valor de la propiedad image.
     * 
     * @return
     *     possible object is
     *     {@link TImage }
     *     
     */
    public TImage getImage() {
        return image;
    }

    /**
     * Define el valor de la propiedad image.
     * 
     * @param value
     *     allowed object is
     *     {@link TImage }
     *     
     */
    public void setImage(TImage value) {
        this.image = value;
    }

    /**
     * Obtiene el valor de la propiedad textInput.
     * 
     * @return
     *     possible object is
     *     {@link TTextInput }
     *     
     */
    public TTextInput getTextInput() {
        return textInput;
    }

    /**
     * Define el valor de la propiedad textInput.
     * 
     * @param value
     *     allowed object is
     *     {@link TTextInput }
     *     
     */
    public void setTextInput(TTextInput value) {
        this.textInput = value;
    }

    /**
     * Obtiene el valor de la propiedad skipHours.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSkipHours() {
        return skipHours;
    }

    /**
     * Define el valor de la propiedad skipHours.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSkipHours(BigInteger value) {
        this.skipHours = value;
    }

    /**
     * Obtiene el valor de la propiedad skipDays.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSkipDays() {
        return skipDays;
    }

    /**
     * Define el valor de la propiedad skipDays.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSkipDays(BigInteger value) {
        this.skipDays = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRssItem }
     * 
     * 
     */
    public List<TRssItem> getItem() {
        if (item == null) {
            item = new ArrayList<TRssItem>();
        }
        return this.item;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
