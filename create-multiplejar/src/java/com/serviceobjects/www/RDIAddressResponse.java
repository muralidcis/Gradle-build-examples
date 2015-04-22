/**
 * RDIAddressResponse.java
 *
 * This file was auto-generated from WSDL by the Apache Axis 1.4 Apr 22, 2006
 * (06:55:48 PDT) WSDL2Java emitter.
 */
package com.serviceobjects.www;

public class RDIAddressResponse implements java.io.Serializable {

    private com.serviceobjects.www.RDIAddress RDIAddress;
    private com.serviceobjects.www.AV3Error error;

    public RDIAddressResponse() {
    }

    public RDIAddressResponse(
            com.serviceobjects.www.RDIAddress RDIAddress,
            com.serviceobjects.www.AV3Error error) {
        this.RDIAddress = RDIAddress;
        this.error = error;
    }

    /**
     * Gets the RDIAddress value for this RDIAddressResponse.
     *
     * @return RDIAddress
     */
    public com.serviceobjects.www.RDIAddress getRDIAddress() {
        return RDIAddress;
    }

    /**
     * Sets the RDIAddress value for this RDIAddressResponse.
     *
     * @param RDIAddress
     */
    public void setRDIAddress(com.serviceobjects.www.RDIAddress RDIAddress) {
        this.RDIAddress = RDIAddress;
    }

    /**
     * Gets the error value for this RDIAddressResponse.
     *
     * @return error
     */
    public com.serviceobjects.www.AV3Error getError() {
        return error;
    }

    /**
     * Sets the error value for this RDIAddressResponse.
     *
     * @param error
     */
    public void setError(com.serviceobjects.www.AV3Error error) {
        this.error = error;
    }
    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RDIAddressResponse)) {
            return false;
        }
        RDIAddressResponse other = (RDIAddressResponse) obj;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true
                && ((this.RDIAddress == null && other.getRDIAddress() == null)
                || (this.RDIAddress != null
                && this.RDIAddress.equals(other.getRDIAddress())))
                && ((this.error == null && other.getError() == null)
                || (this.error != null
                && this.error.equals(other.getError())));
        __equalsCalc = null;
        return _equals;
    }
    private boolean __hashCodeCalc = false;

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRDIAddress() != null) {
            _hashCode += getRDIAddress().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(RDIAddressResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.serviceobjects.com", "RDIAddressResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RDIAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "RDIAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.serviceobjects.com", "RDIAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "Error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.serviceobjects.com", "AV3Error"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return new org.apache.axis.encoding.ser.BeanSerializer(
                _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return new org.apache.axis.encoding.ser.BeanDeserializer(
                _javaType, _xmlType, typeDesc);
    }
}
