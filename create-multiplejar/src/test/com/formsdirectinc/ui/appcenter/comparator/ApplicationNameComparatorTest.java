/*
 * ApplicationNameComparatorTest.java
 * JUnit based test
 *
 * Created on May 6, 2008, 1:35 PM
 */

package com.formsdirectinc.ui.appcenter.comparator;

import junit.framework.*;
import java.util.*;
import com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow;

/**
 *
 * @author rajesh
 */
public class ApplicationNameComparatorTest extends TestCase {
    
    public ApplicationNameComparatorTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ApplicationNameComparatorTest.class);
        
        return suite;
    }

    /**
     * Test of compare method, of class com.formsdirectinc.ui.appcenter.comparator.ApplicationNameComparator.
     */
    public void testCompare() {
        System.out.println("compare");
        
        ApplicationCenterTableRow appTableRow1 = null;
        ApplicationCenterTableRow appTableRow2 = null;
        ApplicationNameComparator instance = new ApplicationNameComparator();
        
        int expResult = 0;
        int result = instance.compare(appTableRow1, appTableRow2);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
