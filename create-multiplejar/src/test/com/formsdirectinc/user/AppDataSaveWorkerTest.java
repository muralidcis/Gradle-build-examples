/*
 * AppDataSaveWorkerTest.java
 * JUnit based test
 *
 * Created on May 13, 2008, 4:31 PM
 */

package com.formsdirectinc.user;

import junit.framework.*;
import org.apache.log4j.*;
import com.jamonapi.*;

/**
 *
 * @author rajesh
 */
public class AppDataSaveWorkerTest extends TestCase {
    
    public AppDataSaveWorkerTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    /**
     * Test of setAppInfo method, of class com.formsdirectinc.user.AppDataSaveWorker.
     */
    public void testSetAppInfo() {
        System.out.println("setAppInfo");
        
        ApplicationTable appInfo = null;
        AppDataSaveWorker instance = null;
        
        instance.setAppInfo(appInfo);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListener method, of class com.formsdirectinc.user.AppDataSaveWorker.
     */
    public void testSetListener() {
        System.out.println("setListener");
        
        ApplicationSaveListener listener = null;
        AppDataSaveWorker instance = null;
        
        instance.setListener(listener);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class com.formsdirectinc.user.AppDataSaveWorker.
     */
    public void testRun() {
        System.out.println("run");
        
        AppDataSaveWorker instance = null;
        
        instance.run();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
