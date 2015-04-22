/*
 * AppcenterSuite.java
 * JUnit based test
 *
 * Created on May 6, 2008, 1:35 PM
 */

package com.formsdirectinc.ui.appcenter;

import junit.framework.*;

/**
 *
 * @author rajesh
 */
public class AppcenterSuite extends TestCase {
    
    public AppcenterSuite(String testName) {
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
        TestSuite suite = new TestSuite("AppcenterSuite");
        suite.addTest(com.formsdirectinc.ui.appcenter.ApplicationCenterTableModelTest.suite());
        suite.addTest(com.formsdirectinc.ui.appcenter.ApplicationCenterTableRowTest.suite());
        suite.addTest(com.formsdirectinc.ui.appcenter.ApplicationCenterDelegateTest.suite());
        suite.addTest(com.formsdirectinc.ui.appcenter.comparator.ComparatorSuite.suite());
        return suite;
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
