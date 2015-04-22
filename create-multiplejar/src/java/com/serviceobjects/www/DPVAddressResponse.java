/**
 * DPVAddressResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.serviceobjects.www;

public class DPVAddressResponse  implements java.io.Serializable {
    private com.serviceobjects.www.DPVAddress DPVAddress;

    private com.serviceobjects.www.AV3Error error;

    public DPVAddressResponse() {
    }

    public DPVAddressResponse(
           com.serviceobjects.www.DPVAddress DPVAddress,
           com.serviceobjects.www.AV3Error error) {
           this.DPVAddress = DPVAddress;
           this.error = error;
    }


    /**
     * Gets the DPVAddress value for this DPVAddressResponse.
     * 
     * @return DPVAddress
     */
    public com.serviceobjects.www.DPVAddress getDPVAddress() {
        return DPVAddress;
    }


    /**
     * Sets the DPVAddress value for this DPVAddressResponse.
     * 
     * @param DPVAddress
     */
    public void setDPVAddress(com.serviceobjects.www.DPVAddress DPVAddress) {
        this.DPVAddress = DPVAddress;
    }


    /**
     * Gets the error value for this DPVAddressResponse.
     * 
     * @return error
     */
    public com.serviceobjects.www.AV3Error getError() {
        return error;
    }


    /**
     * Sets the error value for this DPVAddressResponse.
     * 
     * @param error
     */
    public void setError(com.serviceobjects.www.AV3Error error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DPVAddressResponse)) return false;
        DPVAddressResponse other = (DPVAddressResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DPVAddress==null && other.getDPVAddress()==null) || 
             (this.DPVAddress!=null &&
              this.DPVAddress.equals(other.getDPVAddress()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError())));
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
        if (getDPVAddress() != null) {
            _hashCode += getDPVAddress().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DPVAddressResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.serviceobjects.com", "DPVAddressResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DPVAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "DPVAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.serviceobjects.com", "DPVAddress"));
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
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
