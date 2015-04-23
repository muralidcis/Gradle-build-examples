/*
 * InstructionsSuite.java
 * JUnit based test
 *
 * Created on May 6, 2008, 1:35 PM
 */

package com.formsdirectinc.ui.instructions;

import junit.framework.*;

/**
 *
 * @author rajesh
 */
public class InstructionsSuite extends TestCase {
    
    public InstructionsSuite(String testName) {
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
        TestSuite suite = new TestSuite("InstructionsSuite");
        suite.addTest(com.formsdirectinc.ui.instructions.FilingInstructionGeneratorTest.suite());
        return suite;
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}