/*
 * PDFPreprocessorTest.java
 * JUnit based test
 *
 * Created on May 6, 2008, 1:35 PM
 */

package com.formsdirectinc.pdf;

import junit.framework.*;
import java.io.*;
import java.util.*;
import org.apache.log4j.*;
import com.jamonapi.*;

/**
 *
 * @author rajesh
 */
public class PDFPreprocessorTest extends TestCase {
    
    public PDFPreprocessorTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(PDFPreprocessorTest.class);
        
        return suite;
    }

    /**
     * Test of main method, of class com.formsdirectinc.pdf.PDFPreprocessor.
     */
    public void testMain() {
        System.out.println("main");
        
        String[] args = null;
        
        PDFPreprocessor.main(args);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of process method, of class com.formsdirectinc.pdf.PDFPreprocessor.
     */
    public void testProcess() {
        System.out.println("process");
        
        String outputXMLFilename = "";
        String outputDir = "";
        List pdfFiles = null;
        PDFPreprocessor instance = new PDFPreprocessor();
        
        instance.process(outputXMLFilename, outputDir, pdfFiles);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
