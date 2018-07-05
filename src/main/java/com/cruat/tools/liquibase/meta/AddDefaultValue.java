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
 *       &lt;attGroup ref="{http://www.liquibase.org/xml/ns/dbchangelog}tableNameAttribute"/>
 *       &lt;attribute name="columnName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="columnDataType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="defaultValueNumeric" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="defaultValueDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="defaultValueBoolean" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="defaultValueComputed" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="defaultValueSequenceNext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "addDefaultValue")
public class AddDefaultValue {

    @XmlAttribute(name = "columnName", required = true)
    protected String columnName;
    @XmlAttribute(name = "columnDataType")
    protected String columnDataType;
    @XmlAttribute(name = "defaultValue")
    protected String defaultValue;
    @XmlAttribute(name = "defaultValueNumeric")
    protected String defaultValueNumeric;
    @XmlAttribute(name = "defaultValueDate")
    protected String defaultValueDate;
    @XmlAttribute(name = "defaultValueBoolean")
    protected String defaultValueBoolean;
    @XmlAttribute(name = "defaultValueComputed")
    protected String defaultValueComputed;
    @XmlAttribute(name = "defaultValueSequenceNext")
    protected String defaultValueSequenceNext;
    @XmlAttribute(name = "catalogName")
    protected String catalogName;
    @XmlAttribute(name = "schemaName")
    protected String schemaName;
    @XmlAttribute(name = "tableName", required = true)
    protected String tableName;

    /**
     * Gets the value of the columnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * Sets the value of the columnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnName(String value) {
        this.columnName = value;
    }

    /**
     * Gets the value of the columnDataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnDataType() {
        return columnDataType;
    }

    /**
     * Sets the value of the columnDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnDataType(String value) {
        this.columnDataType = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the defaultValueNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValueNumeric() {
        return defaultValueNumeric;
    }

    /**
     * Sets the value of the defaultValueNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValueNumeric(String value) {
        this.defaultValueNumeric = value;
    }

    /**
     * Gets the value of the defaultValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValueDate() {
        return defaultValueDate;
    }

    /**
     * Sets the value of the defaultValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValueDate(String value) {
        this.defaultValueDate = value;
    }

    /**
     * Gets the value of the defaultValueBoolean property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValueBoolean() {
        return defaultValueBoolean;
    }

    /**
     * Sets the value of the defaultValueBoolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValueBoolean(String value) {
        this.defaultValueBoolean = value;
    }

    /**
     * Gets the value of the defaultValueComputed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValueComputed() {
        return defaultValueComputed;
    }

    /**
     * Sets the value of the defaultValueComputed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValueComputed(String value) {
        this.defaultValueComputed = value;
    }

    /**
     * Gets the value of the defaultValueSequenceNext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValueSequenceNext() {
        return defaultValueSequenceNext;
    }

    /**
     * Sets the value of the defaultValueSequenceNext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValueSequenceNext(String value) {
        this.defaultValueSequenceNext = value;
    }

    /**
     * Gets the value of the catalogName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogName() {
        return catalogName;
    }

    /**
     * Sets the value of the catalogName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogName(String value) {
        this.catalogName = value;
    }

    /**
     * Gets the value of the schemaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * Sets the value of the schemaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaName(String value) {
        this.schemaName = value;
    }

    /**
     * Gets the value of the tableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableName(String value) {
        this.tableName = value;
    }

}
