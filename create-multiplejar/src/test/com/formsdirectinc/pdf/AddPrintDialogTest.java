/*
 * AddPrintDialogTest.java
 * JUnit based test
 *
 * Created on May 6, 2008, 1:35 PM
 */

package com.formsdirectinc.pdf;

import junit.framework.*;
import org.pdfbox.pdmodel.*;
import org.pdfbox.pdmodel.interactive.action.*;
import org.pdfbox.pdmodel.interactive.action.type.PDActionJavaScript;
import java.util.List;
import java.io.IOException;

/**
 *
 * @author rajesh
 */
public class AddPrintDialogTest extends TestCase {
    
    public AddPrintDialogTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(AddPrintDialogTest.class);
        
        return suite;
    }

    /**
     * Test of main method, of class com.formsdirectinc.pdf.AddPrintDialog.
     */
    public void testMain() throws Exception {
        System.out.println("main");
        
        String[] args = null;
        
        AddPrintDialog.main(args);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
