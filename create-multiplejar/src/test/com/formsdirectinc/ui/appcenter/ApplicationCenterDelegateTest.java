/*
 * ApplicationCenterDelegateTest.java
 * JUnit based test
 *
 * Created on May 6, 2008, 1:31 PM
 */

package com.formsdirectinc.ui.appcenter;

import junit.framework.*;
import org.hibernate.*;
import com.formsdirectinc.ui.appcenter.ApplicationCenterTableModel;
import com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow;
import com.formsdirectinc.user.ApplicationTable;
import com.formsdirectinc.user.Stage;
import com.formsdirectinc.user.ApplicationTableHome;
import java.util.List;
import java.util.Iterator;
import org.apache.log4j.*;

/**
 *
 * @author rajesh
 */
public class ApplicationCenterDelegateTest extends TestCase {
    
    public ApplicationCenterDelegateTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    /**
     * Test of listApplicationsForUser method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterDelegate.
     */
    public void testListApplicationsForUser() {
        System.out.println("listApplicationsForUser");
        
        int userID = 0;
        ApplicationCenterDelegate instance = new ApplicationCenterDelegate();
        
        ApplicationCenterTableModel expResult = null;
        ApplicationCenterTableModel result = instance.listApplicationsForUser(userID);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ApplicationCenterDelegateTest.class);
        
        return suite;
    }
    
}
