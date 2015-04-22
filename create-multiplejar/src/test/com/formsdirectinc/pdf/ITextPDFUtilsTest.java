/*
 * ITextPDFUtilsTest.java
 * JUnit based test
 *
 * Created on May 6, 2008, 1:35 PM
 */

package com.formsdirectinc.pdf;

import junit.framework.*;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.AcroFields;
import com.lowagie.text.pdf.PdfCopyFields;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfStamper;
import java.io.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.*;
import com.jamonapi.*;

/**
 *
 * @author rajesh
 */
public class ITextPDFUtilsTest extends TestCase {
    
    public ITextPDFUtilsTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ITextPDFUtilsTest.class);
        
        return suite;
    }

    /**
     * Test of getDocPackage method, of class com.formsdirectinc.pdf.ITextPDFUtils.
     */
    public void testGetDocPackage() {
        System.out.println("getDocPackage");
        
        ITextPDFUtils instance = new ITextPDFUtils();
        
        List<PdfStamper> expResult = null;
        List<PdfStamper> result = instance.getDocPackage();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDocPackage method, of class com.formsdirectinc.pdf.ITextPDFUtils.
     */
    public void testSetDocPackage() {
        System.out.println("setDocPackage");
        
        List<PdfStamper> value = null;
        ITextPDFUtils instance = new ITextPDFUtils();
        
        instance.setDocPackage(value);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of savePackage method, of class com.formsdirectinc.pdf.ITextPDFUtils.
     */
    public void testSavePackage() throws Exception {
        System.out.println("savePackage");
        
        OutputStream os = null;
        ITextPDFUtils instance = new ITextPDFUtils();
        
        instance.savePackage(os);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToPackage method, of class com.formsdirectinc.pdf.ITextPDFUtils.
     */
    public void testAddToPackage() throws Exception {
        System.out.println("addToPackage");
        
        String fileName = "";
        ITextPDFUtils instance = new ITextPDFUtils();
        
        instance.addToPackage(fileName);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeField method, of class com.formsdirectinc.pdf.ITextPDFUtils.
     */
    public void testWriteField() throws Exception {
        System.out.println("writeField");
        
        String fieldName = "";
        String fieldValue = "";
        ITextPDFUtils instance = new ITextPDFUtils();
        
        instance.writeField(fieldName, fieldValue);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
