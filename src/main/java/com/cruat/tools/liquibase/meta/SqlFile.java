//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.16 at 03:14:49 PM EDT 
//


package com.cruat.tools.liquibase.meta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="path" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="stripComments" type="{http://www.liquibase.org/xml/ns/dbchangelog}booleanExp" />
 *       &lt;attribute name="splitStatements" type="{http://www.liquibase.org/xml/ns/dbchangelog}booleanExp" />
 *       &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" default="UTF-8" />
 *       &lt;attribute name="endDelimiter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="relativeToChangelogFile" type="{http://www.liquibase.org/xml/ns/dbchangelog}booleanExp" />
 *       &lt;attribute name="dbms" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "sqlFile")
public class SqlFile {

    @XmlAttribute(name = "path", required = true)
    protected String path;
    @XmlAttribute(name = "stripComments")
    protected String stripComments;
    @XmlAttribute(name = "splitStatements")
    protected String splitStatements;
    @XmlAttribute(name = "encoding")
    protected String encoding;
    @XmlAttribute(name = "endDelimiter")
    protected String endDelimiter;
    @XmlAttribute(name = "relativeToChangelogFile")
    protected String relativeToChangelogFile;
    @XmlAttribute(name = "dbms")
    protected String dbms;

    /**
     * Gets the value of the path property.
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
     * Sets the value of the path property.
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
     * Gets the value of the stripComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStripComments() {
        return stripComments;
    }

    /**
     * Sets the value of the stripComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStripComments(String value) {
        this.stripComments = value;
    }

    /**
     * Gets the value of the splitStatements property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplitStatements() {
        return splitStatements;
    }

    /**
     * Sets the value of the splitStatements property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplitStatements(String value) {
        this.splitStatements = value;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        if (encoding == null) {
            return "UTF-8";
        } else {
            return encoding;
        }
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * Gets the value of the endDelimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDelimiter() {
        return endDelimiter;
    }

    /**
     * Sets the value of the endDelimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDelimiter(String value) {
        this.endDelimiter = value;
    }

    /**
     * Gets the value of the relativeToChangelogFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelativeToChangelogFile() {
        return relativeToChangelogFile;
    }

    /**
     * Sets the value of the relativeToChangelogFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelativeToChangelogFile(String value) {
        this.relativeToChangelogFile = value;
    }

    /**
     * Gets the value of the dbms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbms() {
        return dbms;
    }

    /**
     * Sets the value of the dbms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbms(String value) {
        this.dbms = value;
    }

}
