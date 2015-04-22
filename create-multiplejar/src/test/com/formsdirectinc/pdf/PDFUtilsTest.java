/*
 * PDFUtilsTest.java
 * JUnit based test
 *
 * Created on May 6, 2008, 1:35 PM
 */

package com.formsdirectinc.pdf;

import junit.framework.*;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;
import java.util.Iterator;
import java.util.List;
import org.pdfbox.cos.COSArray;
import org.pdfbox.cos.COSObject;
import org.pdfbox.cos.COSStream;
import org.pdfbox.cos.COSString;
import org.pdfbox.exceptions.COSVisitorException;
import org.pdfbox.pdmodel.PDDocument;
import org.pdfbox.pdmodel.PDDocumentCatalog;
import org.pdfbox.pdmodel.interactive.form.*;
import org.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.pdfbox.util.PDFMergerUtility;
import org.apache.log4j.*;
import com.jamonapi.*;

/**
 *
 * @author rajesh
 */
public class PDFUtilsTest extends TestCase {
    
    public PDFUtilsTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(PDFUtilsTest.class);
        
        return suite;
    }

    /**
     * Test of getDocPackage method, of class com.formsdirectinc.pdf.PDFUtils.
     */
    public void testGetDocPackage() {
        System.out.println("getDocPackage");
        
        PDFUtils instance = new PDFUtils();
        
        List expResult = null;
        List result = instance.getDocPackage();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDocPackage method, of class com.formsdirectinc.pdf.PDFUtils.
     */
    public void testSetDocPackage() {
        System.out.println("setDocPackage");
        
        List value = null;
        PDFUtils instance = new PDFUtils();
        
        instance.setDocPackage(value);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class com.formsdirectinc.pdf.PDFUtils.
     */
    public void testMain() throws Exception {
        System.out.println("main");
        
        String[] args = null;
        
        PDFUtils.main(args);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeXFA method, of class com.formsdirectinc.pdf.PDFUtils.
     */
    public void testRemoveXFA() throws Exception {
        System.out.println("removeXFA");
        
        String inputFile = "";
        String outputFile = "";
        PDFUtils instance = new PDFUtils();
        
        instance.removeXFA(inputFile, outputFile);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of extractXFAPacketStream method, of class com.formsdirectinc.pdf.PDFUtils.
     */
    public void testExtractXFAPacketStream() {
        System.out.println("extractXFAPacketStream");
        
        PDDocument doc = null;
        String packetName = "";
        PDFUtils instance = new PDFUtils();
        
        COSStream expResult = null;
        COSStream result = instance.extractXFAPacketStream(doc, packetName);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of extractXFAPacket method, of class com.formsdirectinc.pdf.PDFUtils.
     */
    public void testExtractXFAPacket() {
        System.out.println("extractXFAPacket");
        
        PDDocument doc = null;
        String packetName = "";
        PDFUtils instance = new PDFUtils();
        
        StringBuffer expResult = null;
        StringBuffer result = instance.extractXFAPacket(doc, packetName);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of extractXFATemplate method, of class com.formsdirectinc.pdf.PDFUtils.
     */
    public void testExtractXFATemplate() throws Exception {
        System.out.println("extractXFATemplate");
        
        String fileName = "";
        PDFUtils instance = new PDFUtils();
        
        StringBuffer expResult = null;
        StringBuffer result = instance.extractXFATemplate(fileName);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of extractXFADataset method, of class com.formsdirectinc.pdf.PDFUtils.
     */
    public void testExtractXFADataset() throws Exception {
        System.out.println("extractXFADataset");
        
        String fileName = "";
        PDFUtils instance = new PDFUtils();
        
        StringBuffer expResult = null;
        StringBuffer result = instance.extractXFADataset(fileName);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of injectDatasetsXML method, of class com.formsdirectinc.pdf.PDFUtils.
     */
    public void testInjectDatasetsXML() throws Exception {
        System.out.println("injectDatasetsXML");
        
        PDDocument doc = null;
        InputStream xmlData = null;
        PDFUtils instance = new PDFUtils();
        
        instance.injectDatasetsXML(doc, xmlData);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of injectTemplateXML method, of class com.formsdirectinc.pdf.PDFUtils.
     */
    public void testInjectTemplateXML() throws Exception {
        System.out.println("injectTemplateXML");
        
        PDDocument doc = null;
        InputStream xmlData = null;
        PDFUtils instance = new PDFUtils();
        
        instance.injectTemplateXML(doc, xmlData);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of savePackage method, of class com.formsdirectinc.pdf.PDFUtils.
     */
    public void testSavePackage() throws Exception {
        System.out.println("savePackage");
        
        OutputStream os = null;
        PDFUtils instance = new PDFUtils();
        
        instance.savePackage(os);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mergePDFDocuments method, of class com.formsdirectinc.pdf.PDFUtils.
     */
    public void testMergePDFDocuments() {
        System.out.println("mergePDFDocuments");
        
        List documents = null;
        PDFUtils instance = new PDFUtils();
        
        instance.mergePDFDocuments(documents);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of savePDF method, of class com.formsdirectinc.pdf.PDFUtils.
     */
    public void testSavePDF() throws Exception {
        System.out.println("savePDF");
        
        Object doc = null;
        OutputStream os = null;
        PDFUtils instance = new PDFUtils();
        
        instance.savePDF(doc, os);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToPackage method, of class com.formsdirectinc.pdf.PDFUtils.
     */
    public void testAddToPackage() throws Exception {
        System.out.println("addToPackage");
        
        String fileName = "";
        PDFUtils instance = new PDFUtils();
        
        instance.addToPackage(fileName);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeField method, of class com.formsdirectinc.pdf.PDFUtils.
     */
    public void testWriteField() throws Exception {
        System.out.println("writeField");
        
        String fieldName = "";
        String fieldValue = "";
        PDFUtils instance = new PDFUtils();
        
        instance.writeField(fieldName, fieldValue);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
