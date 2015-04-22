/*
 * NewClassTest.java
 * JUnit based test
 *
 * Created on November 27, 2007, 6:02 PM
 */

package com.formsdirectinc.pdf;

import junit.framework.*;

/**
 *
 * @author rajesh
 */
public class NewClassTest extends TestCase {
    
    public NewClassTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(NewClassTest.class);
        
        return suite;
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
