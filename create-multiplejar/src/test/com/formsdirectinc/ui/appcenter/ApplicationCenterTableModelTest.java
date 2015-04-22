/*
 * ApplicationCenterTableModelTest.java
 * JUnit based test
 *
 * Created on May 6, 2008, 1:35 PM
 */

package com.formsdirectinc.ui.appcenter;

import junit.framework.*;
import com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow;

/**
 *
 * @author rajesh
 */
public class ApplicationCenterTableModelTest extends TestCase {
    
    public ApplicationCenterTableModelTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ApplicationCenterTableModelTest.class);
        
        return suite;
    }

    /**
     * Test of setTableRows method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableModel.
     */
    public void testSetTableRows() {
        System.out.println("setTableRows");
        
        java.util.ArrayList<ApplicationCenterTableRow> tableRows = null;
        ApplicationCenterTableModel instance = new ApplicationCenterTableModel();
        
        instance.setTableRows(tableRows);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTableRows method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableModel.
     */
    public void testGetTableRows() {
        System.out.println("getTableRows");
        
        ApplicationCenterTableModel instance = new ApplicationCenterTableModel();
        
        java.util.ArrayList<ApplicationCenterTableRow> expResult = null;
        java.util.ArrayList<ApplicationCenterTableRow> result = instance.getTableRows();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMostRecentApplication method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableModel.
     */
    public void testSetMostRecentApplication() {
        System.out.println("setMostRecentApplication");
        
        ApplicationCenterTableRow mostRecentApplication = null;
        ApplicationCenterTableModel instance = new ApplicationCenterTableModel();
        
        instance.setMostRecentApplication(mostRecentApplication);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMostRecentApplication method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableModel.
     */
    public void testGetMostRecentApplication() {
        System.out.println("getMostRecentApplication");
        
        ApplicationCenterTableModel instance = new ApplicationCenterTableModel();
        
        ApplicationCenterTableRow expResult = null;
        ApplicationCenterTableRow result = instance.getMostRecentApplication();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
