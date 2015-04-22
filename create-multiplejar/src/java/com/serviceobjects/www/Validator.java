
package com.serviceobjects.www;

import com.formsdirectinc.schema.basictypes.Address;
import com.google.gson.Gson;
import javax.naming.NamingException;
import org.apache.log4j.Logger;
import com.formsdirectinc.xao.ApplicationXAO;

public class Validator {

    private static final Logger LOGGER = Logger.getLogger(Validator.class);
    private static String soapAddress;
    private static String licence;
    private static String failOverSoapAddress;

    /**
     * returns a fully qualified canada address Parameter : addressStr Argument
     * Ex: {'street' : 'XXXX XXXX', 'apartmentNum' : 'XX', 'city' : 'XXXX',
     * 'state' : 'XXXX', 'zipCode' : 'XXXXXX'}
     */
    public static DPVAddress validate(String addressStr) throws Exception {
        LOGGER.debug("entered Validators validate method with the argument :" + addressStr);
        if (addressStr == null) {
            throw new IllegalArgumentException("Requested address is null");
        }
        Gson gson = new Gson();
        // We can use Address instead of writing a new class for parsing json
        Address userAddress = gson.fromJson(addressStr, Address.class);
        LOGGER.debug("requested json object is :" + userAddress);
        if (userAddress == null) {
            throw new IllegalStateException("Could not parse the requested json address");
        }

        DPVAddress standardizedAddress = new DPVAddress();
        standardizedAddress = getStandardizedAddress(userAddress).getDPVAddress();
        LOGGER.debug("response object from SOAP API is :" + standardizedAddress);
        if (userAddress.equals(standardizedAddress)) {
            LOGGER.debug("Requested address matched");
            standardizedAddress.setValidated(true);
        } else {
            standardizedAddress.setValidated(false);
        }
        return standardizedAddress;
    }

    /*
     * Returns a standardized address from Soap API
     */
    public static DPVAddressResponse getStandardizedAddress(Address address) throws Exception {

        DPVAddressResponse addressResponse = new DPVAddressResponse();
        AddressValidation3Locator soapLocator = new AddressValidation3Locator(soapAddress);
        soapLocator.setsoapEndpointAddress(soapAddress);
        IAddressValidation3 validatorSoap = soapLocator.getsoap();
        SoapStub soap = (SoapStub) validatorSoap;
        try {
            if (soapAddress == null || licence == null) {
                throw new IllegalStateException("Neither soap address nor licence not found");
            }
            LOGGER.info("ADDRESS VALIDATION - Using default soap address");
            addressResponse = soap.validateAddressWithDPV(address.getStreet(), address.getApartmentNum(), address.getCity(), address.getState(), address.getZipCode(), licence);
        } catch (Exception ex) {
            LOGGER.info("ADDRESS VALIDATION - Using FAIL OVER soap address");
            try {
                soapLocator.setsoapEndpointAddress(failOverSoapAddress);
                validatorSoap = soapLocator.getsoap();
                soap = (SoapStub) validatorSoap;
                addressResponse = soap.validateAddressWithDPV(address.getStreet(), address.getApartmentNum(), address.getCity(), address.getState(), address.getZipCode(), licence);
            } catch (Exception ex1) {
                LOGGER.error(ex1);
            }
        }
        return addressResponse;
    }

    //TOD) CHk
    private static DPVAddress consummate(DPVAddress address) {
        // for internal object comparision to set whether the address is validated
        if (address.getAddress() != null) {
            address.setAddress(address.getAddress());
        }
        //if (address.getStandardizedApartmentNo() != null) {
        //      address.setApartmentNum(address.getStandardizedApartmentNo());
        //}
        if (address.getCity() != null) {
            address.setCity(address.getCity());
        }
        if (address.getState() != null) {
            address.setState(address.getState());
        }
        if (address.getZip() != null) {
            address.setZip(address.getZip());
        }
        return address;
    }

      static {
     try {
     ApplicationXAO applicationXAO = (ApplicationXAO) new javax.naming.InitialContext().lookup("java:comp/env/applicationXAO");
     soapAddress = (String) applicationXAO.getConfigurationValue("/features/feature[@type='addressValidator']/parameters[@key='soapAddress']/value");
     failOverSoapAddress = (String) applicationXAO.getConfigurationValue("/features/feature[@type='addressValidator']/parameters[@key='failOverSoapAddress']/value");
     licence = (String) applicationXAO.getConfigurationValue("/features/feature[@type='addressValidator']/parameters[@key='key']/value");
     } catch (NamingException ex) {
     LOGGER.error(ex);
     }
        
     }
}
