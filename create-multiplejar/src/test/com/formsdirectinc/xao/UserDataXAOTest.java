/*
 * UserDataXAOTest.java
 * JUnit based test
 *
 * Created on May 6, 2008, 1:35 PM
 */

package com.formsdirectinc.xao;

import junit.framework.*;
import java.io.StringWriter;
import org.xml.sax.InputSource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.Marshaller;
import javax.xml.bind.MarshalException;
import org.apache.log4j.*;
import com.jamonapi.*;

/**
 *
 * @author rajesh
 */
public class UserDataXAOTest extends TestCase {
    
    public UserDataXAOTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(UserDataXAOTest.class);
        
        return suite;
    }

    /**
     * Test of getInstance method, of class com.formsdirectinc.xao.UserDataXAO.
     */
    public void testGetInstance() {
        System.out.println("getInstance");
        
        UserDataXAO expResult = null;
        UserDataXAO result = UserDataXAO.getInstance();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unmarshalXML method, of class com.formsdirectinc.xao.UserDataXAO.
     */
    public void testUnmarshalXML() throws Exception {
        System.out.println("unmarshalXML");
        
        String packageName = "";
        String className = "";
        InputSource is = null;
        UserDataXAO instance = new UserDataXAO();
        
        Object expResult = null;
        Object result = instance.unmarshalXML(packageName, className, is);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of marshalObject method, of class com.formsdirectinc.xao.UserDataXAO.
     */
    public void testMarshalObject() throws Exception {
        System.out.println("marshalObject");
        
        String packageName = "";
        Object obj = null;
        UserDataXAO instance = new UserDataXAO();
        
        String expResult = "";
        String result = instance.marshalObject(packageName, obj);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class com.formsdirectinc.xao.UserDataXAO.
     */
    public void testMain() throws Exception {
        System.out.println("main");
        
        String[] args = null;
        
        UserDataXAO.main(args);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
