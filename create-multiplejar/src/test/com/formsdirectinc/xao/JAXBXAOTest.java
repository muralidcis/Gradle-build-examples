/*
 * JAXBXAOTest.java
 * JUnit based test
 *
 * Created on May 13, 2008, 4:29 PM
 */

package com.formsdirectinc.xao;

import junit.framework.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.UnmarshallerHandler;
import org.xml.sax.InputSource;
import com.formsdirectinc.schema.application.model.*;
import org.apache.log4j.*;
import com.jamonapi.*;
import javax.xml.bind.Marshaller;
import javax.xml.bind.MarshalException;
import javax.xml.bind.JAXBElement;
import javax.xml.transform.sax.SAXSource;

/**
 *
 * @author rajesh
 */
public class JAXBXAOTest extends TestCase {
    
    public JAXBXAOTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    /**
     * Test of getInstance method, of class com.formsdirectinc.xao.JAXBXAO.
     */
    public void testGetInstance() {
        System.out.println("getInstance");
        
        JAXBXAO expResult = null;
        JAXBXAO result = JAXBXAO.getInstance();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnmarshalObject method, of class com.formsdirectinc.xao.JAXBXAO.
     */
    public void testGetUnmarshalObject() throws Exception {
        System.out.println("getUnmarshalObject");
        
        String packageName = "";
        Class<Object> className = null;
        InputSource is = null;
        JAXBXAO instance = new JAXBXAO();
        
        JAXBElement<Object> expResult = null;
        JAXBElement<Object> result = instance.getUnmarshalObject(packageName, className, is);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
