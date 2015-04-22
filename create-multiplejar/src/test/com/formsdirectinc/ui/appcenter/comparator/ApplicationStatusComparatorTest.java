/*
 * ApplicationStatusComparatorTest.java
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
public class ApplicationStatusComparatorTest extends TestCase {
    
    public ApplicationStatusComparatorTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ApplicationStatusComparatorTest.class);
        
        return suite;
    }

    /**
     * Test of compare method, of class com.formsdirectinc.ui.appcenter.comparator.ApplicationStatusComparator.
     */
    public void testCompare() {
        System.out.println("compare");
        
        ApplicationCenterTableRow appTableRow1 = null;
        ApplicationCenterTableRow appTableRow2 = null;
        ApplicationStatusComparator instance = new ApplicationStatusComparator();
        
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
