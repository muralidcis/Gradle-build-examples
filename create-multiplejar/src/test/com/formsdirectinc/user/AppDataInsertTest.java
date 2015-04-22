/*
 * AppDataInsertTest.java
 * JUnit based test
 *
 * Created on November 27, 2007, 6:03 PM
 */

package com.formsdirectinc.user;

import junit.framework.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.HibernateException;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.sql.Date;
import org.apache.log4j.*;
import com.jamonapi.*;

/**
 *
 * @author rajesh
 */
public class AppDataInsertTest extends TestCase {
    
    public AppDataInsertTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(AppDataInsertTest.class);
        
        return suite;
    }

    /**
     * Test of setAppInfo method, of class com.formsdirectinc.user.AppDataInsert.
     */
    public void testSetAppInfo() {
        System.out.println("setAppInfo");
        
        ApplicationTable appInfo = null;
        AppDataInsert instance = null;
        
        instance.setAppInfo(appInfo);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHbSession method, of class com.formsdirectinc.user.AppDataInsert.
     */
    public void testSetHbSession() {
        System.out.println("setHbSession");
        
        Session hbSession = null;
        AppDataInsert instance = null;
        
        instance.setHbSession(hbSession);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setToEncrypt method, of class com.formsdirectinc.user.AppDataInsert.
     */
    public void testSetToEncrypt() {
        System.out.println("setToEncrypt");
        
        String toEncrypt = "";
        AppDataInsert instance = null;
        
        instance.setToEncrypt(toEncrypt);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of InsertApp method, of class com.formsdirectinc.user.AppDataInsert.
     */
    public void testInsertApp() {
        System.out.println("InsertApp");
        
        AppDataInsert instance = null;
        
        int expResult = 0;
        int result = instance.InsertApp();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
