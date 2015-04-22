/*
 * HTMLToPDFTest.java
 * JUnit based test
 *
 * Created on May 6, 2008, 1:35 PM
 */

package com.formsdirectinc.pdf;

import junit.framework.*;
import java.io.*;
import java.util.HashMap;
import java.util.Properties;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.Template;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.*;
import org.zefer.pd4ml.PD4ML;
import java.awt.Dimension;
import java.awt.Insets;

/**
 *
 * @author rajesh
 */
public class HTMLToPDFTest extends TestCase {
    
    public HTMLToPDFTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(HTMLToPDFTest.class);
        
        return suite;
    }

    /**
     * Test of convertHTMLToPDF method, of class com.formsdirectinc.pdf.HTMLToPDF.
     */
    public void testConvertHTMLToPDF() {
        System.out.println("convertHTMLToPDF");
        
        String templateName = "";
        String contextPath = "";
        HashMap<String, Object> contextParams = null;
        HTMLToPDF instance = new HTMLToPDF();
        
        InputStream expResult = null;
        InputStream result = instance.convertHTMLToPDF(templateName, contextPath, contextParams);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
