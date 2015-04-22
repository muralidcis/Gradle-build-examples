/*
 * XFAParserTest.java
 * JUnit based test
 *
 * Created on May 6, 2008, 1:35 PM
 */

package com.formsdirectinc.pdf;

import junit.framework.*;
import java.io.File;
import java.util.Stack;
import java.util.List;
import javax.xml.*;
import javax.xml.parsers.*;
import javax.xml.xpath.*;
import org.w3c.dom.*;
import com.jamonapi.*;

/**
 *
 * @author rajesh
 */
public class XFAParserTest extends TestCase {
    
    public XFAParserTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(XFAParserTest.class);
        
        return suite;
    }

    /**
     * Test of parseXFATemplate method, of class com.formsdirectinc.pdf.XFAParser.
     */
    public void testParseXFATemplate() throws Exception {
        System.out.println("parseXFATemplate");
        
        String fileName = "";
        String pdfFilename = "";
        XFAParser instance = new XFAParser();
        
        StringBuffer expResult = null;
        StringBuffer result = instance.parseXFATemplate(fileName, pdfFilename);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of processSubform method, of class com.formsdirectinc.pdf.XFAParser.
     */
    public void testProcessSubform() {
        System.out.println("processSubform");
        
        Element subform = null;
        Element parent = null;
        StringBuffer name = null;
        XFAParser instance = new XFAParser();
        
        instance.processSubform(subform, parent, name);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of processField method, of class com.formsdirectinc.pdf.XFAParser.
     */
    public void testProcessField() {
        System.out.println("processField");
        
        Element field = null;
        Element subform = null;
        StringBuffer name = null;
        XFAParser instance = new XFAParser();
        
        instance.processField(field, subform, name);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class com.formsdirectinc.pdf.XFAParser.
     */
    public void testMain() throws Exception {
        System.out.println("main");
        
        String[] args = null;
        
        XFAParser.main(args);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
