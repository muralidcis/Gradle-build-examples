/*
 * GenericListenerTest.java
 * JUnit based test
 *
 * Created on November 27, 2007, 6:03 PM
 */

package com.formsdirectinc.user;

import junit.framework.*;
import java.util.Map;
import org.apache.log4j.*;
import com.jamonapi.*;

/**
 *
 * @author rajesh
 */
public class GenericListenerTest extends TestCase {
    
    public GenericListenerTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(GenericListenerTest.class);
        
        return suite;
    }

    /**
     * Test of Response method, of class com.formsdirectinc.user.GenericListener.
     */
    public void testResponse() {
        System.out.println("Response");
        
        WorkerResponse response = null;
        GenericListener instance = null;
        
        instance.Response(response);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
