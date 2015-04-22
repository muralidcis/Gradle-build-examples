/*
 * UIMessageResourceTest.java
 * JUnit based test
 *
 * Created on November 27, 2007, 6:02 PM
 */

package com.formsdirectinc.helpers.mail;

import junit.framework.*;
import java.io.*;
import java.util.ResourceBundle;
import java.util.Locale;
import org.apache.log4j.*;
import com.jamonapi.*;

/**
 *
 * @author rajesh
 */
public class UIMessageResourceTest extends TestCase {
    
    public UIMessageResourceTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(UIMessageResourceTest.class);
        
        return suite;
    }

    /**
     * Test of getBundle method, of class com.formsdirectinc.helpers.mail.UIMessageResource.
     */
    public void testGetBundle() {
        System.out.println("getBundle");
        
        Locale locale = null;
        UIMessageResource instance = new UIMessageResource();
        
        instance.getBundle(locale);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessage method, of class com.formsdirectinc.helpers.mail.UIMessageResource.
     */
    public void testGetMessage() {
        System.out.println("getMessage");
        
        String key = "";
        UIMessageResource instance = new UIMessageResource();
        
        String expResult = "";
        String result = instance.getMessage(key);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
