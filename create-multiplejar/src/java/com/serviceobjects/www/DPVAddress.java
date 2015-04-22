/**
 * DPVAddress.java
 *
 * This file was auto-generated from WSDL by the Apache Axis 1.4 Apr 22, 2006
 * (06:55:48 PDT) WSDL2Java emitter.
 */
package com.serviceobjects.www;

public class DPVAddress implements java.io.Serializable {

    private java.lang.String address;
    private java.lang.String city;
    private java.lang.String state;
    private java.lang.String zip;
    private java.lang.String address2;
    private java.lang.String barcodeDigits;
    private java.lang.String carrierRoute;
    private java.lang.String congressCode;
    private java.lang.String countyCode;
    private java.lang.String countyName;
    private java.lang.String fragmentHouse;
    private java.lang.String fragmentPreDir;
    private java.lang.String fragmentStreet;
    private java.lang.String fragmentSuffix;
    private java.lang.String fragmentPostDir;
    private java.lang.String fragmentUnit;
    private java.lang.String fragment;
    private java.lang.String fragmentPMBPrefix;
    private java.lang.String fragmentPMBNumber;
    private java.lang.String DPV;
    private java.lang.String DPVDesc;
    private java.lang.String DPVNotes;
    private java.lang.String DPVNotesDesc;
    private java.lang.String corrections;
    private java.lang.String correctionsDesc;
    private java.lang.String debug;
    private boolean validated = false;

    public DPVAddress() {
    }

    public DPVAddress(
            java.lang.String address,
            java.lang.String city,
            java.lang.String state,
            java.lang.String zip,
            java.lang.String address2,
            java.lang.String barcodeDigits,
            java.lang.String carrierRoute,
            java.lang.String congressCode,
            java.lang.String countyCode,
            java.lang.String countyName,
            java.lang.String fragmentHouse,
            java.lang.String fragmentPreDir,
            java.lang.String fragmentStreet,
            java.lang.String fragmentSuffix,
            java.lang.String fragmentPostDir,
            java.lang.String fragmentUnit,
            java.lang.String fragment,
            java.lang.String fragmentPMBPrefix,
            java.lang.String fragmentPMBNumber,
            java.lang.String DPV,
            java.lang.String DPVDesc,
            java.lang.String DPVNotes,
            java.lang.String DPVNotesDesc,
            java.lang.String corrections,
            java.lang.String correctionsDesc,
            java.lang.String debug) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.address2 = address2;
        this.barcodeDigits = barcodeDigits;
        this.carrierRoute = carrierRoute;
        this.congressCode = congressCode;
        this.countyCode = countyCode;
        this.countyName = countyName;
        this.fragmentHouse = fragmentHouse;
        this.fragmentPreDir = fragmentPreDir;
        this.fragmentStreet = fragmentStreet;
        this.fragmentSuffix = fragmentSuffix;
        this.fragmentPostDir = fragmentPostDir;
        this.fragmentUnit = fragmentUnit;
        this.fragment = fragment;
        this.fragmentPMBPrefix = fragmentPMBPrefix;
        this.fragmentPMBNumber = fragmentPMBNumber;
        this.DPV = DPV;
        this.DPVDesc = DPVDesc;
        this.DPVNotes = DPVNotes;
        this.DPVNotesDesc = DPVNotesDesc;
        this.corrections = corrections;
        this.correctionsDesc = correctionsDesc;
        this.debug = debug;
    }

    /**
     * Gets the address value for this DPVAddress.
     *
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }

    /**
     * Sets the address value for this DPVAddress.
     *
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }

    /**
     * Gets the city value for this DPVAddress.
     *
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }

    /**
     * Sets the city value for this DPVAddress.
     *
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }

    /**
     * Gets the state value for this DPVAddress.
     *
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }

    /**
     * Sets the state value for this DPVAddress.
     *
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }

    /**
     * Gets the zip value for this DPVAddress.
     *
     * @return zip
     */
    public java.lang.String getZip() {
        return zip;
    }

    /**
     * Sets the zip value for this DPVAddress.
     *
     * @param zip
     */
    public void setZip(java.lang.String zip) {
        this.zip = zip;
    }

    /**
     * Gets the address2 value for this DPVAddress.
     *
     * @return address2
     */
    public java.lang.String getAddress2() {
        return address2;
    }

    /**
     * Sets the address2 value for this DPVAddress.
     *
     * @param address2
     */
    public void setAddress2(java.lang.String address2) {
        this.address2 = address2;
    }

    /**
     * Gets the barcodeDigits value for this DPVAddress.
     *
     * @return barcodeDigits
     */
    public java.lang.String getBarcodeDigits() {
        return barcodeDigits;
    }

    /**
     * Sets the barcodeDigits value for this DPVAddress.
     *
     * @param barcodeDigits
     */
    public void setBarcodeDigits(java.lang.String barcodeDigits) {
        this.barcodeDigits = barcodeDigits;
    }

    /**
     * Gets the carrierRoute value for this DPVAddress.
     *
     * @return carrierRoute
     */
    public java.lang.String getCarrierRoute() {
        return carrierRoute;
    }

    /**
     * Sets the carrierRoute value for this DPVAddress.
     *
     * @param carrierRoute
     */
    public void setCarrierRoute(java.lang.String carrierRoute) {
        this.carrierRoute = carrierRoute;
    }

    public boolean isValidated() {
        return validated;
    }

    public void setValidated(boolean validated) {
        this.validated = validated;
    }

    /**
     * Gets the congressCode value for this DPVAddress.
     *
     * @return congressCode
     */
    public java.lang.String getCongressCode() {
        return congressCode;
    }

    /**
     * Sets the congressCode value for this DPVAddress.
     *
     * @param congressCode
     */
    public void setCongressCode(java.lang.String congressCode) {
        this.congressCode = congressCode;
    }

    /**
     * Gets the countyCode value for this DPVAddress.
     *
     * @return countyCode
     */
    public java.lang.String getCountyCode() {
        return countyCode;
    }

    /**
     * Sets the countyCode value for this DPVAddress.
     *
     * @param countyCode
     */
    public void setCountyCode(java.lang.String countyCode) {
        this.countyCode = countyCode;
    }

    /**
     * Gets the countyName value for this DPVAddress.
     *
     * @return countyName
     */
    public java.lang.String getCountyName() {
        return countyName;
    }

    /**
     * Sets the countyName value for this DPVAddress.
     *
     * @param countyName
     */
    public void setCountyName(java.lang.String countyName) {
        this.countyName = countyName;
    }

    /**
     * Gets the fragmentHouse value for this DPVAddress.
     *
     * @return fragmentHouse
     */
    public java.lang.String getFragmentHouse() {
        return fragmentHouse;
    }

    /**
     * Sets the fragmentHouse value for this DPVAddress.
     *
     * @param fragmentHouse
     */
    public void setFragmentHouse(java.lang.String fragmentHouse) {
        this.fragmentHouse = fragmentHouse;
    }

    /**
     * Gets the fragmentPreDir value for this DPVAddress.
     *
     * @return fragmentPreDir
     */
    public java.lang.String getFragmentPreDir() {
        return fragmentPreDir;
    }

    /**
     * Sets the fragmentPreDir value for this DPVAddress.
     *
     * @param fragmentPreDir
     */
    public void setFragmentPreDir(java.lang.String fragmentPreDir) {
        this.fragmentPreDir = fragmentPreDir;
    }

    /**
     * Gets the fragmentStreet value for this DPVAddress.
     *
     * @return fragmentStreet
     */
    public java.lang.String getFragmentStreet() {
        return fragmentStreet;
    }

    /**
     * Sets the fragmentStreet value for this DPVAddress.
     *
     * @param fragmentStreet
     */
    public void setFragmentStreet(java.lang.String fragmentStreet) {
        this.fragmentStreet = fragmentStreet;
    }

    /**
     * Gets the fragmentSuffix value for this DPVAddress.
     *
     * @return fragmentSuffix
     */
    public java.lang.String getFragmentSuffix() {
        return fragmentSuffix;
    }

    /**
     * Sets the fragmentSuffix value for this DPVAddress.
     *
     * @param fragmentSuffix
     */
    public void setFragmentSuffix(java.lang.String fragmentSuffix) {
        this.fragmentSuffix = fragmentSuffix;
    }

    /**
     * Gets the fragmentPostDir value for this DPVAddress.
     *
     * @return fragmentPostDir
     */
    public java.lang.String getFragmentPostDir() {
        return fragmentPostDir;
    }

    /**
     * Sets the fragmentPostDir value for this DPVAddress.
     *
     * @param fragmentPostDir
     */
    public void setFragmentPostDir(java.lang.String fragmentPostDir) {
        this.fragmentPostDir = fragmentPostDir;
    }

    /**
     * Gets the fragmentUnit value for this DPVAddress.
     *
     * @return fragmentUnit
     */
    public java.lang.String getFragmentUnit() {
        return fragmentUnit;
    }

    /**
     * Sets the fragmentUnit value for this DPVAddress.
     *
     * @param fragmentUnit
     */
    public void setFragmentUnit(java.lang.String fragmentUnit) {
        this.fragmentUnit = fragmentUnit;
    }

    /**
     * Gets the fragment value for this DPVAddress.
     *
     * @return fragment
     */
    public java.lang.String getFragment() {
        return fragment;
    }

    /**
     * Sets the fragment value for this DPVAddress.
     *
     * @param fragment
     */
    public void setFragment(java.lang.String fragment) {
        this.fragment = fragment;
    }

    /**
     * Gets the fragmentPMBPrefix value for this DPVAddress.
     *
     * @return fragmentPMBPrefix
     */
    public java.lang.String getFragmentPMBPrefix() {
        return fragmentPMBPrefix;
    }

    /**
     * Sets the fragmentPMBPrefix value for this DPVAddress.
     *
     * @param fragmentPMBPrefix
     */
    public void setFragmentPMBPrefix(java.lang.String fragmentPMBPrefix) {
        this.fragmentPMBPrefix = fragmentPMBPrefix;
    }

    /**
     * Gets the fragmentPMBNumber value for this DPVAddress.
     *
     * @return fragmentPMBNumber
     */
    public java.lang.String getFragmentPMBNumber() {
        return fragmentPMBNumber;
    }

    /**
     * Sets the fragmentPMBNumber value for this DPVAddress.
     *
     * @param fragmentPMBNumber
     */
    public void setFragmentPMBNumber(java.lang.String fragmentPMBNumber) {
        this.fragmentPMBNumber = fragmentPMBNumber;
    }

    /**
     * Gets the DPV value for this DPVAddress.
     *
     * @return DPV
     */
    public java.lang.String getDPV() {
        return DPV;
    }

    /**
     * Sets the DPV value for this DPVAddress.
     *
     * @param DPV
     */
    public void setDPV(java.lang.String DPV) {
        this.DPV = DPV;
    }

    /**
     * Gets the DPVDesc value for this DPVAddress.
     *
     * @return DPVDesc
     */
    public java.lang.String getDPVDesc() {
        return DPVDesc;
    }

    /**
     * Sets the DPVDesc value for this DPVAddress.
     *
     * @param DPVDesc
     */
    public void setDPVDesc(java.lang.String DPVDesc) {
        this.DPVDesc = DPVDesc;
    }

    /**
     * Gets the DPVNotes value for this DPVAddress.
     *
     * @return DPVNotes
     */
    public java.lang.String getDPVNotes() {
        return DPVNotes;
    }

    /**
     * Sets the DPVNotes value for this DPVAddress.
     *
     * @param DPVNotes
     */
    public void setDPVNotes(java.lang.String DPVNotes) {
        this.DPVNotes = DPVNotes;
    }

    /**
     * Gets the DPVNotesDesc value for this DPVAddress.
     *
     * @return DPVNotesDesc
     */
    public java.lang.String getDPVNotesDesc() {
        return DPVNotesDesc;
    }

    /**
     * Sets the DPVNotesDesc value for this DPVAddress.
     *
     * @param DPVNotesDesc
     */
    public void setDPVNotesDesc(java.lang.String DPVNotesDesc) {
        this.DPVNotesDesc = DPVNotesDesc;
    }

    /**
     * Gets the corrections value for this DPVAddress.
     *
     * @return corrections
     */
    public java.lang.String getCorrections() {
        return corrections;
    }

    /**
     * Sets the corrections value for this DPVAddress.
     *
     * @param corrections
     */
    public void setCorrections(java.lang.String corrections) {
        this.corrections = corrections;
    }

    /**
     * Gets the correctionsDesc value for this DPVAddress.
     *
     * @return correctionsDesc
     */
    public java.lang.String getCorrectionsDesc() {
        return correctionsDesc;
    }

    /**
     * Sets the correctionsDesc value for this DPVAddress.
     *
     * @param correctionsDesc
     */
    public void setCorrectionsDesc(java.lang.String correctionsDesc) {
        this.correctionsDesc = correctionsDesc;
    }

    /**
     * Gets the debug value for this DPVAddress.
     *
     * @return debug
     */
    public java.lang.String getDebug() {
        return debug;
    }

    /**
     * Sets the debug value for this DPVAddress.
     *
     * @param debug
     */
    public void setDebug(java.lang.String debug) {
        this.debug = debug;
    }
    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DPVAddress)) {
            return false;
        }
        DPVAddress other = (DPVAddress) obj;
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
                && ((this.address == null && other.getAddress() == null)
                || (this.address != null
                && this.address.equals(other.getAddress())))
                && ((this.city == null && other.getCity() == null)
                || (this.city != null
                && this.city.equals(other.getCity())))
                && ((this.state == null && other.getState() == null)
                || (this.state != null
                && this.state.equals(other.getState())))
                && ((this.zip == null && other.getZip() == null)
                || (this.zip != null
                && this.zip.equals(other.getZip())))
                && ((this.address2 == null && other.getAddress2() == null)
                || (this.address2 != null
                && this.address2.equals(other.getAddress2())))
                && ((this.barcodeDigits == null && other.getBarcodeDigits() == null)
                || (this.barcodeDigits != null
                && this.barcodeDigits.equals(other.getBarcodeDigits())))
                && ((this.carrierRoute == null && other.getCarrierRoute() == null)
                || (this.carrierRoute != null
                && this.carrierRoute.equals(other.getCarrierRoute())))
                && ((this.congressCode == null && other.getCongressCode() == null)
                || (this.congressCode != null
                && this.congressCode.equals(other.getCongressCode())))
                && ((this.countyCode == null && other.getCountyCode() == null)
                || (this.countyCode != null
                && this.countyCode.equals(other.getCountyCode())))
                && ((this.countyName == null && other.getCountyName() == null)
                || (this.countyName != null
                && this.countyName.equals(other.getCountyName())))
                && ((this.fragmentHouse == null && other.getFragmentHouse() == null)
                || (this.fragmentHouse != null
                && this.fragmentHouse.equals(other.getFragmentHouse())))
                && ((this.fragmentPreDir == null && other.getFragmentPreDir() == null)
                || (this.fragmentPreDir != null
                && this.fragmentPreDir.equals(other.getFragmentPreDir())))
                && ((this.fragmentStreet == null && other.getFragmentStreet() == null)
                || (this.fragmentStreet != null
                && this.fragmentStreet.equals(other.getFragmentStreet())))
                && ((this.fragmentSuffix == null && other.getFragmentSuffix() == null)
                || (this.fragmentSuffix != null
                && this.fragmentSuffix.equals(other.getFragmentSuffix())))
                && ((this.fragmentPostDir == null && other.getFragmentPostDir() == null)
                || (this.fragmentPostDir != null
                && this.fragmentPostDir.equals(other.getFragmentPostDir())))
                && ((this.fragmentUnit == null && other.getFragmentUnit() == null)
                || (this.fragmentUnit != null
                && this.fragmentUnit.equals(other.getFragmentUnit())))
                && ((this.fragment == null && other.getFragment() == null)
                || (this.fragment != null
                && this.fragment.equals(other.getFragment())))
                && ((this.fragmentPMBPrefix == null && other.getFragmentPMBPrefix() == null)
                || (this.fragmentPMBPrefix != null
                && this.fragmentPMBPrefix.equals(other.getFragmentPMBPrefix())))
                && ((this.fragmentPMBNumber == null && other.getFragmentPMBNumber() == null)
                || (this.fragmentPMBNumber != null
                && this.fragmentPMBNumber.equals(other.getFragmentPMBNumber())))
                && ((this.DPV == null && other.getDPV() == null)
                || (this.DPV != null
                && this.DPV.equals(other.getDPV())))
                && ((this.DPVDesc == null && other.getDPVDesc() == null)
                || (this.DPVDesc != null
                && this.DPVDesc.equals(other.getDPVDesc())))
                && ((this.DPVNotes == null && other.getDPVNotes() == null)
                || (this.DPVNotes != null
                && this.DPVNotes.equals(other.getDPVNotes())))
                && ((this.DPVNotesDesc == null && other.getDPVNotesDesc() == null)
                || (this.DPVNotesDesc != null
                && this.DPVNotesDesc.equals(other.getDPVNotesDesc())))
                && ((this.corrections == null && other.getCorrections() == null)
                || (this.corrections != null
                && this.corrections.equals(other.getCorrections())))
                && ((this.correctionsDesc == null && other.getCorrectionsDesc() == null)
                || (this.correctionsDesc != null
                && this.correctionsDesc.equals(other.getCorrectionsDesc())))
                && ((this.debug == null && other.getDebug() == null)
                || (this.debug != null
                && this.debug.equals(other.getDebug())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getZip() != null) {
            _hashCode += getZip().hashCode();
        }
        if (getAddress2() != null) {
            _hashCode += getAddress2().hashCode();
        }
        if (getBarcodeDigits() != null) {
            _hashCode += getBarcodeDigits().hashCode();
        }
        if (getCarrierRoute() != null) {
            _hashCode += getCarrierRoute().hashCode();
        }
        if (getCongressCode() != null) {
            _hashCode += getCongressCode().hashCode();
        }
        if (getCountyCode() != null) {
            _hashCode += getCountyCode().hashCode();
        }
        if (getCountyName() != null) {
            _hashCode += getCountyName().hashCode();
        }
        if (getFragmentHouse() != null) {
            _hashCode += getFragmentHouse().hashCode();
        }
        if (getFragmentPreDir() != null) {
            _hashCode += getFragmentPreDir().hashCode();
        }
        if (getFragmentStreet() != null) {
            _hashCode += getFragmentStreet().hashCode();
        }
        if (getFragmentSuffix() != null) {
            _hashCode += getFragmentSuffix().hashCode();
        }
        if (getFragmentPostDir() != null) {
            _hashCode += getFragmentPostDir().hashCode();
        }
        if (getFragmentUnit() != null) {
            _hashCode += getFragmentUnit().hashCode();
        }
        if (getFragment() != null) {
            _hashCode += getFragment().hashCode();
        }
        if (getFragmentPMBPrefix() != null) {
            _hashCode += getFragmentPMBPrefix().hashCode();
        }
        if (getFragmentPMBNumber() != null) {
            _hashCode += getFragmentPMBNumber().hashCode();
        }
        if (getDPV() != null) {
            _hashCode += getDPV().hashCode();
        }
        if (getDPVDesc() != null) {
            _hashCode += getDPVDesc().hashCode();
        }
        if (getDPVNotes() != null) {
            _hashCode += getDPVNotes().hashCode();
        }
        if (getDPVNotesDesc() != null) {
            _hashCode += getDPVNotesDesc().hashCode();
        }
        if (getCorrections() != null) {
            _hashCode += getCorrections().hashCode();
        }
        if (getCorrectionsDesc() != null) {
            _hashCode += getCorrectionsDesc().hashCode();
        }
        if (getDebug() != null) {
            _hashCode += getDebug().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(DPVAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.serviceobjects.com", "DPVAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "Zip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "Address2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barcodeDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "BarcodeDigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierRoute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "CarrierRoute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("congressCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "CongressCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "CountyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "CountyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fragmentHouse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "FragmentHouse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fragmentPreDir");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "FragmentPreDir"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fragmentStreet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "FragmentStreet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fragmentSuffix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "FragmentSuffix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fragmentPostDir");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "FragmentPostDir"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fragmentUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "FragmentUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fragment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "Fragment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fragmentPMBPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "FragmentPMBPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fragmentPMBNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "FragmentPMBNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DPV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "DPV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DPVDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "DPVDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DPVNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "DPVNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DPVNotesDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "DPVNotesDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corrections");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "Corrections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correctionsDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "CorrectionsDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debug");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.serviceobjects.com", "Debug"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

    @Override
    public String toString() {
        return "DPVAddress{" + "address=" + address + ", city=" + city + ", state=" + state + ", zip=" + zip + ", address2=" + address2 + ", barcodeDigits=" + barcodeDigits + ", carrierRoute=" + carrierRoute + ", congressCode=" + congressCode + ", countyCode=" + countyCode + ", countyName=" + countyName + ", fragmentHouse=" + fragmentHouse + ", fragmentPreDir=" + fragmentPreDir + ", fragmentStreet=" + fragmentStreet + ", fragmentSuffix=" + fragmentSuffix + ", fragmentPostDir=" + fragmentPostDir + ", fragmentUnit=" + fragmentUnit + ", fragment=" + fragment + ", fragmentPMBPrefix=" + fragmentPMBPrefix + ", fragmentPMBNumber=" + fragmentPMBNumber + ", DPV=" + DPV + ", DPVDesc=" + DPVDesc + ", DPVNotes=" + DPVNotes + ", DPVNotesDesc=" + DPVNotesDesc + ", corrections=" + corrections + ", correctionsDesc=" + correctionsDesc + '}';
    }
}
