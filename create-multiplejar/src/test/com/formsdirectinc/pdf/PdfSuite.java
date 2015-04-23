/*
 * PdfSuite.java
 * JUnit based test
 *
 * Created on May 6, 2008, 1:35 PM
 */

package com.formsdirectinc.pdf;

import junit.framework.*;

/**
 *
 * @author rajesh
 */
public class PdfSuite extends TestCase {
    
    public PdfSuite(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    /**
     * suite method automatically generated by JUnit module
     */
    public static Test suite() {
        TestSuite suite = new TestSuite("PdfSuite");
        suite.addTest(com.formsdirectinc.pdf.PDFDocumentCacheTest.suite());
        suite.addTest(com.formsdirectinc.pdf.HTMLToPDFTest.suite());
        suite.addTest(com.formsdirectinc.pdf.PDFFormFillerTest.suite());
        suite.addTest(com.formsdirectinc.pdf.PDFSenderTest.suite());
        suite.addTest(com.formsdirectinc.pdf.XFAParserTest.suite());
        suite.addTest(com.formsdirectinc.pdf.PDFServletTest.suite());
        suite.addTest(com.formsdirectinc.pdf.PDFUtilsTest.suite());
        suite.addTest(com.formsdirectinc.pdf.ITextPDFUtilsTest.suite());
        suite.addTest(com.formsdirectinc.pdf.PDFPreprocessorTest.suite());
        suite.addTest(com.formsdirectinc.pdf.AddPrintDialogTest.suite());
        return suite;
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}