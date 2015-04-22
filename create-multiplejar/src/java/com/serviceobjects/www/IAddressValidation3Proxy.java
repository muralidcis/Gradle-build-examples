package com.serviceobjects.www;

public class IAddressValidation3Proxy implements com.serviceobjects.www.IAddressValidation3 {
  private String _endpoint = null;
  private com.serviceobjects.www.IAddressValidation3 iAddressValidation3 = null;
  
  public IAddressValidation3Proxy() {
    _initIAddressValidation3Proxy();
  }
  
  public IAddressValidation3Proxy(String endpoint) {
    _endpoint = endpoint;
    _initIAddressValidation3Proxy();
  }
  
  private void _initIAddressValidation3Proxy() {
    try {
      iAddressValidation3 = (new com.serviceobjects.www.AddressValidation3Locator()).getsoap();
      if (iAddressValidation3 != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iAddressValidation3)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iAddressValidation3)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iAddressValidation3 != null)
      ((javax.xml.rpc.Stub)iAddressValidation3)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.serviceobjects.www.IAddressValidation3 getIAddressValidation3() {
    if (iAddressValidation3 == null)
      _initIAddressValidation3Proxy();
    return iAddressValidation3;
  }
  
  public com.serviceobjects.www.DPVAddressResponse validateAddressWithDPV_GETXML(java.lang.String address, java.lang.String address2, java.lang.String city, java.lang.String state, java.lang.String postalCode, java.lang.String licenseKey) throws java.rmi.RemoteException{
    if (iAddressValidation3 == null)
      _initIAddressValidation3Proxy();
    return iAddressValidation3.validateAddressWithDPV_GETXML(address, address2, city, state, postalCode, licenseKey);
  }
  
  public com.serviceobjects.www.DPVAddressResponse validateAddressWithDPV_QUERYGETXML(java.lang.String address, java.lang.String address2, java.lang.String city, java.lang.String state, java.lang.String postalCode, java.lang.String licenseKey) throws java.rmi.RemoteException{
    if (iAddressValidation3 == null)
      _initIAddressValidation3Proxy();
    return iAddressValidation3.validateAddressWithDPV_QUERYGETXML(address, address2, city, state, postalCode, licenseKey);
  }
  
  public com.serviceobjects.www.DPVAddressResponse validateAddressWithDPV_GETJSON(java.lang.String address, java.lang.String address2, java.lang.String city, java.lang.String state, java.lang.String postalCode, java.lang.String licenseKey) throws java.rmi.RemoteException{
    if (iAddressValidation3 == null)
      _initIAddressValidation3Proxy();
    return iAddressValidation3.validateAddressWithDPV_GETJSON(address, address2, city, state, postalCode, licenseKey);
  }
  
  public com.serviceobjects.www.DPVAddressResponse validateAddressWithDPV_POST(java.lang.String address, java.lang.String address2, java.lang.String city, java.lang.String state, java.lang.String postalCode, java.lang.String licenseKey) throws java.rmi.RemoteException{
    if (iAddressValidation3 == null)
      _initIAddressValidation3Proxy();
    return iAddressValidation3.validateAddressWithDPV_POST(address, address2, city, state, postalCode, licenseKey);
  }
  
  public com.serviceobjects.www.DPVAddressResponse validateAddressWithDPV_PUT(java.lang.String address, java.lang.String address2, java.lang.String city, java.lang.String state, java.lang.String postalCode, java.lang.String licenseKey) throws java.rmi.RemoteException{
    if (iAddressValidation3 == null)
      _initIAddressValidation3Proxy();
    return iAddressValidation3.validateAddressWithDPV_PUT(address, address2, city, state, postalCode, licenseKey);
  }
  
  public com.serviceobjects.www.DPVAddressResponse validateAddressWithDPV_DELETE(java.lang.String address, java.lang.String address2, java.lang.String city, java.lang.String state, java.lang.String postalCode, java.lang.String licenseKey) throws java.rmi.RemoteException{
    if (iAddressValidation3 == null)
      _initIAddressValidation3Proxy();
    return iAddressValidation3.validateAddressWithDPV_DELETE(address, address2, city, state, postalCode, licenseKey);
  }
  
  public com.serviceobjects.www.DPVAddressResponse validateAddressWithDPV(java.lang.String address, java.lang.String address2, java.lang.String city, java.lang.String state, java.lang.String postalCode, java.lang.String licenseKey) throws java.rmi.RemoteException{
    if (iAddressValidation3 == null)
      _initIAddressValidation3Proxy();
    return iAddressValidation3.validateAddressWithDPV(address, address2, city, state, postalCode, licenseKey);
  }
  
  public com.serviceobjects.www.SuiteLinkResponse validateAddressWithSLK_GETXML(java.lang.String businessName, java.lang.String address, java.lang.String address2, java.lang.String city, java.lang.String state, java.lang.String postalCode, java.lang.String licenseKey) throws java.rmi.RemoteException{
    if (iAddressValidation3 == null)
      _initIAddressValidation3Proxy();
    return iAddressValidation3.validateAddressWithSLK_GETXML(businessName, address, address2, city, state, postalCode, licenseKey);
  }
  
  public com.serviceobjects.www.SuiteLinkResponse validateAddressWithSLK_QUERYGETXML(java.lang.String businessName, java.lang.String address, java.lang.String address2, java.lang.String city, java.lang.String state, java.lang.String postalCode, java.lang.String licenseKey) throws java.rmi.RemoteException{
    if (iAddressValidation3 == null)
      _initIAddressValidation3Proxy();
    return iAddressValidation3.validateAddressWithSLK_QUERYGETXML(businessName, address, address2, city, state, postalCode, licenseKey);
  }
  
  public com.serviceobjects.www.SuiteLinkResponse validateAddressWithSLK_GETJSON(java.lang.String businessName, java.lang.String address, java.lang.String address2, java.lang.String city, java.lang.String state, java.lang.String postalCode, java.lang.String licenseKey) throws java.rmi.RemoteException{
    if (iAddressValidation3 == null)
      _initIAddressValidation3Proxy();
    return iAddressValidation3.validateAddressWithSLK_GETJSON(businessName, address, address2, city, state, postalCode, licenseKey);
  }
  
  public com.serviceobjects.www.SuiteLinkResponse validateAddressWithSLK_POST(java.lang.String businessName, java.lang.String address, java.lang.String address2, java.lang.String city, java.lang.String state, java.lang.String postalCode, java.lang.String licenseKey) throws java.rmi.RemoteException{
    if (iAddressValidation3 == null)
      _initIAddressValidation3Proxy();
    return iAddressValidation3.validateAddressWithSLK_POST(businessName, address, address2, city, state, postalCode, licenseKey);
  }
  
  public com.serviceobjects.www.SuiteLinkResponse validateAddressWithSLK_PUT(java.lang.String businessName, java.lang.String address, java.lang.String address2, java.lang.String city, java.lang.String state, java.lang.String postalCode, java.lang.String licenseKey) throws java.rmi.RemoteException{
    if (iAddressValidation3 == null)
      _initIAddressValidation3Proxy();
    return iAddressValidation3.validateAddressWithSLK_PUT(businessName, address, address2, city, state, postalCode, licenseKey);
  }
  
  public com.serviceobjects.www.SuiteLinkResponse validateAddressWithSLK_DELETE(java.lang.String businessName, java.lang.String address, java.lang.String address2, java.lang.String city, java.lang.String state, java.lang.String postalCode, java.lang.String licenseKey) throws java.rmi.RemoteException{
    if (iAddressValidation3 == null)
      _initIAddressValidation3Proxy();
    return iAddressValidation3.validateAddressWithSLK_DELETE(businessName, address, address2, city, state, postalCode, licenseKey);
  }
  
  public com.serviceobjects.www.SuiteLinkResponse validateAddressWithSLK(java.lang.String businessName, java.lang.String address, java.lang.String address2, java.lang.String city, java.lang.String state, java.lang.String postalCode, java.lang.String licenseKey) throws java.rmi.RemoteException{
    if (iAddressValidation3 == null)
      _initIAddressValidation3Proxy();
    return iAddressValidation3.validateAddressWithSLK(businessName, address, address2, city, state, postalCode, licenseKey);
  }
  
  public com.serviceobjects.www.RDIAddressResponse validateAddressWithRDI_GETXML(java.lang.String address, java.lang.String address2, java.lang.String city, java.lang.String state, java.lang.String postalCode, java.lang.String licenseKey) throws java.rmi.RemoteException{
    if (iAddressValidation3 == null)
      _initIAddressValidation3Proxy();
    return iAddressValidation3.validateAddressWithRDI_GETXML(address, address2, city, state, postalCode, licenseKey);
  }
  
  public com.serviceobjects.www.RDIAddressResponse validateAddressWithRDI_QUERYGETXML(java.lang.String address, java.lang.String address2, java.lang.String city, java.lang.String state, java.lang.String postalCode, java.lang.String licenseKey) throws java.rmi.RemoteException{
    if (iAddressValidation3 == null)
      _initIAddressValidation3Proxy();
    return iAddressValidation3.validateAddressWithRDI_QUERYGETXML(address, address2, city, state, postalCode, licenseKey);
  }
  
  public com.serviceobjects.www.RDIAddressResponse validateAddressWithRDI_GETJSON(java.lang.String address, java.lang.String address2, java.lang.String city, java.lang.String state, java.lang.String postalCode, java.lang.String licenseKey) throws java.rmi.RemoteException{
    if (iAddressValidation3 == null)
      _initIAddressValidation3Proxy();
    return iAddressValidation3.validateAddressWithRDI_GETJSON(address, address2, city, state, postalCode, licenseKey);
  }
  
  public com.serviceobjects.www.RDIAddressResponse validateAddressWithRDI_POST(java.lang.String address, java.lang.String address2, java.lang.String city, java.lang.String state, java.lang.String postalCode, java.lang.String licenseKey) throws java.rmi.RemoteException{
    if (iAddressValidation3 == null)
      _initIAddressValidation3Proxy();
    return iAddressValidation3.validateAddressWithRDI_POST(address, address2, city, state, postalCode, licenseKey);
  }
  
  public com.serviceobjects.www.RDIAddressResponse validateAddressWithRDI_PUT(java.lang.String address, java.lang.String address2, java.lang.String city, java.lang.String state, java.lang.String postalCode, java.lang.String licenseKey) throws java.rmi.RemoteException{
    if (iAddressValidation3 == null)
      _initIAddressValidation3Proxy();
    return iAddressValidation3.validateAddressWithRDI_PUT(address, address2, city, state, postalCode, licenseKey);
  }
  
  public com.serviceobjects.www.RDIAddressResponse validateAddressWithRDI_DELETE(java.lang.String address, java.lang.String address2, java.lang.String city, java.lang.String state, java.lang.String postalCode, java.lang.String licenseKey) throws java.rmi.RemoteException{
    if (iAddressValidation3 == null)
      _initIAddressValidation3Proxy();
    return iAddressValidation3.validateAddressWithRDI_DELETE(address, address2, city, state, postalCode, licenseKey);
  }
  
  public com.serviceobjects.www.RDIAddressResponse validateAddressWithRDI(java.lang.String address, java.lang.String address2, java.lang.String city, java.lang.String state, java.lang.String postalCode, java.lang.String licenseKey) throws java.rmi.RemoteException{
    if (iAddressValidation3 == null)
      _initIAddressValidation3Proxy();
    return iAddressValidation3.validateAddressWithRDI(address, address2, city, state, postalCode, licenseKey);
  }
  
  
}