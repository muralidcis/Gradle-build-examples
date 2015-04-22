/*
 * WorkerResponseTest.java
 * JUnit based test
 *
 * Created on November 27, 2007, 6:03 PM
 */

package com.formsdirectinc.user;

import junit.framework.*;

/**
 *
 * @author rajesh
 */
public class WorkerResponseTest extends TestCase {
    
    public WorkerResponseTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(WorkerResponseTest.class);
        
        return suite;
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
