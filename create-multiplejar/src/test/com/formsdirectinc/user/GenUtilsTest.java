/*
 * GenUtilsTest.java
 * JUnit based test
 *
 * Created on November 27, 2007, 6:03 PM
 */

package com.formsdirectinc.user;

import junit.framework.*;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author rajesh
 */
public class GenUtilsTest extends TestCase {
    
    public GenUtilsTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(GenUtilsTest.class);
        
        return suite;
    }

    /**
     * Test of readFileAsString method, of class com.formsdirectinc.user.GenUtils.
     */
    public void testReadFileAsString() throws Exception {
        System.out.println("readFileAsString");
        
        String filePath = "";
        
        String expResult = "";
        String result = GenUtils.readFileAsString(filePath);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
