//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.16 at 03:14:49 PM EDT 
//


package com.cruat.tools.liquibase.meta;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for onChangeLogPreconditionOnSqlOutput.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="onChangeLogPreconditionOnSqlOutput">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TEST"/>
 *     &lt;enumeration value="FAIL"/>
 *     &lt;enumeration value="IGNORE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "onChangeLogPreconditionOnSqlOutput")
@XmlEnum
public enum OnChangeLogPreconditionOnSqlOutput {

    TEST,
    FAIL,
    IGNORE;

    public String value() {
        return name();
    }

    public static OnChangeLogPreconditionOnSqlOutput fromValue(String v) {
        return valueOf(v);
    }

}