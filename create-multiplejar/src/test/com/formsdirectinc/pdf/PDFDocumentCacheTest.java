/*
 * PDFDocumentCacheTest.java
 * JUnit based test
 *
 * Created on May 6, 2008, 1:35 PM
 */

package com.formsdirectinc.pdf;

import junit.framework.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import com.jamonapi.*;

/**
 *
 * @author rajesh
 */
public class PDFDocumentCacheTest extends TestCase {
    
    public PDFDocumentCacheTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(PDFDocumentCacheTest.class);
        
        return suite;
    }

    /**
     * Test of getInstance method, of class com.formsdirectinc.pdf.PDFDocumentCache.
     */
    public void testGetInstance() {
        System.out.println("getInstance");
        
        PDFDocumentCache instance = null;
        
        PDFDocumentCache expResult = null;
        PDFDocumentCache result = instance.getInstance();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPDFDocument method, of class com.formsdirectinc.pdf.PDFDocumentCache.
     */
    public void testGetPDFDocument() throws Exception {
        System.out.println("getPDFDocument");
        
        String filename = "";
        PDFDocumentCache instance = null;
        
        InputStream expResult = null;
        InputStream result = instance.getPDFDocument(filename);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShouldCache method, of class com.formsdirectinc.pdf.PDFDocumentCache.
     */
    public void testGetShouldCache() {
        System.out.println("getShouldCache");
        
        PDFDocumentCache instance = null;
        
        boolean expResult = true;
        boolean result = instance.getShouldCache();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setShouldCache method, of class com.formsdirectinc.pdf.PDFDocumentCache.
     */
    public void testSetShouldCache() {
        System.out.println("setShouldCache");
        
        boolean value = true;
        PDFDocumentCache instance = null;
        
        instance.setShouldCache(value);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
