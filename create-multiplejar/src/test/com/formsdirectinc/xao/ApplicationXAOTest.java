/*
 * ApplicationXAOTest.java
 * JUnit based test
 *
 * Created on May 6, 2008, 1:35 PM
 */

package com.formsdirectinc.xao;

import junit.framework.*;
import com.formsdirectinc.schema.application.model.Application;
import com.formsdirectinc.schema.application.model.FormSection;
import com.formsdirectinc.schema.application.model.Page;
import com.jamonapi.Monitor;
import com.jamonapi.MonitorFactory;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.log4j.Logger;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.SAXException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.UnmarshallerHandler;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author rajesh
 */
public class ApplicationXAOTest extends TestCase {
    
    public ApplicationXAOTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ApplicationXAOTest.class);
        
        return suite;
    }

    /**
     * Test of isCacheApplications method, of class com.formsdirectinc.xao.ApplicationXAO.
     */
    public void testIsCacheApplications() {
        System.out.println("isCacheApplications");
        
        ApplicationXAO instance = new ApplicationXAO();
        
        boolean expResult = true;
        boolean result = instance.isCacheApplications();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCacheApplications method, of class com.formsdirectinc.xao.ApplicationXAO.
     */
    public void testSetCacheApplications() {
        System.out.println("setCacheApplications");
        
        boolean cacheApplications = true;
        ApplicationXAO instance = new ApplicationXAO();
        
        instance.setCacheApplications(cacheApplications);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstance method, of class com.formsdirectinc.xao.ApplicationXAO.
     */
    public void testGetInstance() {
        System.out.println("getInstance");
        
        ApplicationXAO expResult = null;
        ApplicationXAO result = ApplicationXAO.getInstance();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setXMLFileName method, of class com.formsdirectinc.xao.ApplicationXAO.
     */
    public void testSetXMLFileName() {
        System.out.println("setXMLFileName");
        
        String XMLFileName = "";
        ApplicationXAO instance = new ApplicationXAO();
        
        instance.setXMLFileName(XMLFileName);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class com.formsdirectinc.xao.ApplicationXAO.
     */
    public void testInit() throws Exception {
        System.out.println("init");
        
        ApplicationXAO instance = new ApplicationXAO();
        
        instance.init();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unmarshalApplication method, of class com.formsdirectinc.xao.ApplicationXAO.
     */
    public void testUnmarshalApplication() throws Exception {
        System.out.println("unmarshalApplication");
        
        InputSource source = null;
        ApplicationXAO instance = new ApplicationXAO();
        
        Application expResult = null;
        Application result = instance.unmarshalApplication(source);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCachedApplication method, of class com.formsdirectinc.xao.ApplicationXAO.
     */
    public void testGetCachedApplication() {
        System.out.println("getCachedApplication");
        
        String applicationName = "";
        ApplicationXAO instance = new ApplicationXAO();
        
        Application expResult = null;
        Application result = instance.getCachedApplication(applicationName);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of filterJXPath method, of class com.formsdirectinc.xao.ApplicationXAO.
     */
    public void testFilterJXPath() {
        System.out.println("filterJXPath");
        
        String expression = "";
        ApplicationXAO instance = new ApplicationXAO();
        
        Object expResult = null;
        Object result = instance.filterJXPath(expression);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findPageByID method, of class com.formsdirectinc.xao.ApplicationXAO.
     */
    public void testFindPageByID() {
        System.out.println("findPageByID");
        
        String pageID = "";
        ApplicationXAO instance = new ApplicationXAO();
        
        Page expResult = null;
        Page result = instance.findPageByID(pageID);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findFormSectionByID method, of class com.formsdirectinc.xao.ApplicationXAO.
     */
    public void testFindFormSectionByID() {
        System.out.println("findFormSectionByID");
        
        String formSectionID = "";
        ApplicationXAO instance = new ApplicationXAO();
        
        FormSection expResult = null;
        FormSection result = instance.findFormSectionByID(formSectionID);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class com.formsdirectinc.xao.ApplicationXAO.
     */
    public void testMain() throws Exception {
        System.out.println("main");
        
        String[] args = null;
        
        ApplicationXAO.main(args);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
