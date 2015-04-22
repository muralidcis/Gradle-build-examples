/*
 * PDFFormFillerTest.java
 * JUnit based test
 *
 * Created on May 13, 2008, 4:28 PM
 */

package com.formsdirectinc.pdf;

import junit.framework.*;
import com.formsdirectinc.xao.UserDataXAO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.*;
import ognl.Ognl;
import ognl.OgnlException;
import org.apache.commons.beanutils.PropertyUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.apache.log4j.*;
import com.jamonapi.*;

/**
 *
 * @author rajesh
 */
public class PDFFormFillerTest extends TestCase {
    
    public PDFFormFillerTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    /**
     * Test of stopProcess method, of class com.formsdirectinc.pdf.PDFFormFiller.
     */
    public void testStopProcess() {
        System.out.println("stopProcess");
        
        PDFFormFiller instance = new PDFFormFiller();
        
        instance.stopProcess();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInterrupted method, of class com.formsdirectinc.pdf.PDFFormFiller.
     */
    public void testGetInterrupted() {
        System.out.println("getInterrupted");
        
        PDFFormFiller instance = new PDFFormFiller();
        
        boolean expResult = true;
        boolean result = instance.getInterrupted();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompleted method, of class com.formsdirectinc.pdf.PDFFormFiller.
     */
    public void testGetCompleted() {
        System.out.println("getCompleted");
        
        PDFFormFiller instance = new PDFFormFiller();
        
        int expResult = 0;
        int result = instance.getCompleted();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCompleted method, of class com.formsdirectinc.pdf.PDFFormFiller.
     */
    public void testSetCompleted() {
        System.out.println("setCompleted");
        
        int completed = 0;
        PDFFormFiller instance = new PDFFormFiller();
        
        instance.setCompleted(completed);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserDataObject method, of class com.formsdirectinc.pdf.PDFFormFiller.
     */
    public void testSetUserDataObject() {
        System.out.println("setUserDataObject");
        
        Object obj = null;
        PDFFormFiller instance = new PDFFormFiller();
        
        instance.setUserDataObject(obj);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPDFDocument method, of class com.formsdirectinc.pdf.PDFFormFiller.
     */
    public void testAddPDFDocument() throws Exception {
        System.out.println("addPDFDocument");
        
        InputStream pdfData = null;
        PDFFormFiller instance = new PDFFormFiller();
        
        instance.addPDFDocument(pdfData);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class com.formsdirectinc.pdf.PDFFormFiller.
     */
    public void testMain() throws Exception {
        System.out.println("main");
        
        String[] args = null;
        
        PDFFormFiller.main(args);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillForm method, of class com.formsdirectinc.pdf.PDFFormFiller.
     */
    public void testFillForm() throws Exception {
        System.out.println("fillForm");
        
        String XMLFileName = "";
        InputStream dataXML = null;
        String packageName = "";
        String className = "";
        OutputStream output = null;
        PDFFormFiller instance = new PDFFormFiller();
        
        instance.fillForm(XMLFileName, dataXML, packageName, className, output);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of processSubform method, of class com.formsdirectinc.pdf.PDFFormFiller.
     */
    public void testProcessSubform() {
        System.out.println("processSubform");
        
        Element subform = null;
        PDFFormFiller instance = new PDFFormFiller();
        
        instance.processSubform(subform);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of processTable method, of class com.formsdirectinc.pdf.PDFFormFiller.
     */
    public void testProcessTable() {
        System.out.println("processTable");
        
        Element subform = null;
        String boundListPath = "";
        PDFFormFiller instance = new PDFFormFiller();
        
        instance.processTable(subform, boundListPath);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
