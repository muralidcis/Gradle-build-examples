/*
 * ApplicationDelegateTest.java
 * JUnit based test
 *
 * Created on May 6, 2008, 1:29 PM
 */

package com.formsdirectinc.user;

import junit.framework.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
import org.apache.log4j.*;
import java.io.*;
import javax.naming.InitialContext;
import com.formsdirectinc.schema.application.model.Application;
import com.formsdirectinc.schema.application.model.Features;
import com.formsdirectinc.schema.application.model.Feature;
import com.formsdirectinc.schema.application.model.Property;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Date;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.io.IOException;
import javax.crypto.NoSuchPaddingException;
import javax.mail.MessagingException;

/**
 *
 * @author rajesh
 */
public class ApplicationDelegateTest extends TestCase {
    
    public ApplicationDelegateTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    /**
     * Test of getInstance method, of class com.formsdirectinc.user.ApplicationDelegate.
     */
    public void testGetInstance() {
        System.out.println("getInstance");
        
        ApplicationDelegate expResult = null;
        ApplicationDelegate result = ApplicationDelegate.getInstance();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createApplication method, of class com.formsdirectinc.user.ApplicationDelegate.
     */
    public void testCreateApplication() throws Exception {
        System.out.println("createApplication");
        
        int applicationType = 0;
        int userID = 0;
        ApplicationDelegate instance = new ApplicationDelegate();
        
        int expResult = 0;
        int result = instance.createApplication(applicationType, userID);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lockStage method, of class com.formsdirectinc.user.ApplicationDelegate.
     */
    public void testLockStage() {
        System.out.println("lockStage");
        
        int stageID = 0;
        ApplicationDelegate instance = new ApplicationDelegate();
        
        instance.lockStage(stageID);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unlockStage method, of class com.formsdirectinc.user.ApplicationDelegate.
     */
    public void testUnlockStage() {
        System.out.println("unlockStage");
        
        int stageID = 0;
        ApplicationDelegate instance = new ApplicationDelegate();
        
        instance.unlockStage(stageID);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveApplication method, of class com.formsdirectinc.user.ApplicationDelegate.
     */
    public void testSaveApplication() throws Exception {
        System.out.println("saveApplication");
        
        ApplicationTable applicationTable = null;
        ApplicationDelegate instance = new ApplicationDelegate();
        
        instance.saveApplication(applicationTable);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeApplicationToFileSystem method, of class com.formsdirectinc.user.ApplicationDelegate.
     */
    public void testWriteApplicationToFileSystem() {
        System.out.println("writeApplicationToFileSystem");
        
        ApplicationTable applicationTable = null;
        String fileName = "";
        ApplicationDelegate instance = new ApplicationDelegate();
        
        int expResult = 0;
        int result = instance.writeApplicationToFileSystem(applicationTable, fileName);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of asyncSaveApplication method, of class com.formsdirectinc.user.ApplicationDelegate.
     */
    public void testAsyncSaveApplication() {
        System.out.println("asyncSaveApplication");
        
        ApplicationTable application = null;
        ApplicationSaveListener listener = null;
        ApplicationDelegate instance = new ApplicationDelegate();
        
        instance.asyncSaveApplication(application, listener);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadApplication method, of class com.formsdirectinc.user.ApplicationDelegate.
     */
    public void testLoadApplication() {
        System.out.println("loadApplication");
        
        long applicationId = 0L;
        ApplicationDelegate instance = new ApplicationDelegate();
        
        ApplicationTable expResult = null;
        ApplicationTable result = instance.loadApplication(applicationId);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadApplicationStages method, of class com.formsdirectinc.user.ApplicationDelegate.
     */
    public void testLoadApplicationStages() {
        System.out.println("loadApplicationStages");
        
        int applicationID = 0;
        ApplicationDelegate instance = new ApplicationDelegate();
        
        List<Stage> expResult = null;
        List<Stage> result = instance.loadApplicationStages(applicationID);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of disableApplication method, of class com.formsdirectinc.user.ApplicationDelegate.
     */
    public void testDisableApplication() {
        System.out.println("disableApplication");
        
        int applicationID = 0;
        ApplicationDelegate instance = new ApplicationDelegate();
        
        instance.disableApplication(applicationID);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateStatus method, of class com.formsdirectinc.user.ApplicationDelegate.
     */
    public void testUpdateStatus() {
        System.out.println("updateStatus");
        
        int applicationID = 0;
        int applicationStatus = 0;
        ApplicationDelegate instance = new ApplicationDelegate();
        
        instance.updateStatus(applicationID, applicationStatus);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveStage method, of class com.formsdirectinc.user.ApplicationDelegate.
     */
    public void testSaveStage() {
        System.out.println("saveStage");
        
        Stage stage = null;
        ApplicationDelegate instance = new ApplicationDelegate();
        
        instance.saveStage(stage);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadStage method, of class com.formsdirectinc.user.ApplicationDelegate.
     */
    public void testLoadStage() {
        System.out.println("loadStage");
        
        int stageID = 0;
        ApplicationDelegate instance = new ApplicationDelegate();
        
        Stage expResult = null;
        Stage result = instance.loadStage(stageID);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApplicationObject method, of class com.formsdirectinc.user.ApplicationDelegate.
     */
    public void testGetApplicationObject() {
        System.out.println("getApplicationObject");
        
        ApplicationDelegate instance = new ApplicationDelegate();
        
        Application expResult = null;
        Application result = instance.getApplicationObject();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ApplicationDelegateTest.class);
        
        return suite;
    }
    
}
