//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.08 at 06:06:43 PM IST 
//


package org.stackspace.webfaces.config2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.stackspace.webfaces.config2 package. 
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

    private final static QName _WebFaces_QNAME = new QName("http://www.stackspace.org/webfaces/config-2.0", "web-faces");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.stackspace.webfaces.config2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WebFaces }
     * 
     */
    public WebFaces createWebFaces() {
        return new WebFaces();
    }

    /**
     * Create an instance of {@link CommandConfig }
     * 
     */
    public CommandConfig createCommandConfig() {
        return new CommandConfig();
    }

    /**
     * Create an instance of {@link Forward }
     * 
     */
    public Forward createForward() {
        return new Forward();
    }

    /**
     * Create an instance of {@link CommandConfigs }
     * 
     */
    public CommandConfigs createCommandConfigs() {
        return new CommandConfigs();
    }

    /**
     * Create an instance of {@link GlobalForwards }
     * 
     */
    public GlobalForwards createGlobalForwards() {
        return new GlobalForwards();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebFaces }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.stackspace.org/webfaces/config-2.0", name = "web-faces")
    public JAXBElement<WebFaces> createWebFaces(WebFaces value) {
        return new JAXBElement<WebFaces>(_WebFaces_QNAME, WebFaces.class, null, value);
    }

}
