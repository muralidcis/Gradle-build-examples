/*
 * FilingInstructionGeneratorTest.java
 * JUnit based test
 *
 * Created on May 6, 2008, 1:35 PM
 */

package com.formsdirectinc.ui.instructions;

import junit.framework.*;
import com.formsdirectinc.rules.RuleEngine;
import com.formsdirectinc.user.CustomerSignup;
import java.io.InputStream;
import java.util.HashMap;
import com.formsdirectinc.pdf.HTMLToPDF;

/**
 *
 * @author rajesh
 */
public class FilingInstructionGeneratorTest extends TestCase {
    
    public FilingInstructionGeneratorTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(FilingInstructionGeneratorTest.class);
        
        return suite;
    }

    /**
     * Test of getInstance method, of class com.formsdirectinc.ui.instructions.FilingInstructionGenerator.
     */
    public void testGetInstance() throws Exception {
        System.out.println("getInstance");
        
        FilingInstructionGenerator expResult = null;
        FilingInstructionGenerator result = FilingInstructionGenerator.getInstance();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateFilingInstruction method, of class com.formsdirectinc.ui.instructions.FilingInstructionGenerator.
     */
    public void testGenerateFilingInstruction() {
        System.out.println("generateFilingInstruction");
        
        String templateName = "";
        String contextPath = "";
        Object applicationData = null;
        Object instructionData = null;
        CustomerSignup cs = null;
        FilingInstructionGenerator instance = new FilingInstructionGenerator();
        
        InputStream expResult = null;
        InputStream result = instance.generateFilingInstruction(templateName, contextPath, applicationData, instructionData, cs);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
