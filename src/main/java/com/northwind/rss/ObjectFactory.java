//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2015.12.01 a las 12:25:49 PM CET 
//


package com.northwind.rss;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.northwind.rss package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Rss_QNAME = new QName("", "rss");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.northwind.rss
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TRss }
     * 
     */
    public TRss createTRss() {
        return new TRss();
    }

    /**
     * Create an instance of {@link TTextInput }
     * 
     */
    public TTextInput createTTextInput() {
        return new TTextInput();
    }

    /**
     * Create an instance of {@link TSource }
     * 
     */
    public TSource createTSource() {
        return new TSource();
    }

    /**
     * Create an instance of {@link TRssItem }
     * 
     */
    public TRssItem createTRssItem() {
        return new TRssItem();
    }

    /**
     * Create an instance of {@link TCategory }
     * 
     */
    public TCategory createTCategory() {
        return new TCategory();
    }

    /**
     * Create an instance of {@link TImage }
     * 
     */
    public TImage createTImage() {
        return new TImage();
    }

    /**
     * Create an instance of {@link TCloud }
     * 
     */
    public TCloud createTCloud() {
        return new TCloud();
    }

    /**
     * Create an instance of {@link TRssChannel }
     * 
     */
    public TRssChannel createTRssChannel() {
        return new TRssChannel();
    }

    /**
     * Create an instance of {@link TGuid }
     * 
     */
    public TGuid createTGuid() {
        return new TGuid();
    }

    /**
     * Create an instance of {@link TEnclosure }
     * 
     */
    public TEnclosure createTEnclosure() {
        return new TEnclosure();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TRss }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rss")
    public JAXBElement<TRss> createRss(TRss value) {
        return new JAXBElement<TRss>(_Rss_QNAME, TRss.class, null, value);
    }

}
