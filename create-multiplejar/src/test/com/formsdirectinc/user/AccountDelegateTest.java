/*
 * AccountDelegateTest.java
 * JUnit based test
 *
 * Created on May 13, 2008, 4:27 PM
 */

package com.formsdirectinc.user;

import junit.framework.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.HibernateException;
import org.xml.sax.InputSource;
import javax.naming.InitialContext;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Date;
import com.Ostermiller.util.*;
import com.formsdirectinc.security.AESUtils;
import com.formsdirectinc.schema.interaction.model.ApplicationStatus;
import com.formsdirectinc.xao.UserDataXAO;
import com.formsdirectinc.helpers.mail.Mailer;
import com.formsdirectinc.helpers.mail.UIMessageResource;
import java.io.*;
import javax.xml.bind.MarshalException;
import javax.xml.bind.JAXBException;
import org.apache.log4j.*;
import com.jamonapi.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.xml.sax.InputSource;

/**
 *
 * @author rajesh
 */
public class AccountDelegateTest extends TestCase {
    
    public AccountDelegateTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    /**
     * Test of isLastAppSaveStatus method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testIsLastAppSaveStatus() {
        System.out.println("isLastAppSaveStatus");
        
        AccountDelegate instance = new AccountDelegate();
        
        boolean expResult = true;
        boolean result = instance.isLastAppSaveStatus();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastAppSaveSuccess method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testSetLastAppSaveSuccess() {
        System.out.println("setLastAppSaveSuccess");
        
        boolean v = true;
        AccountDelegate instance = new AccountDelegate();
        
        instance.setLastAppSaveSuccess(v);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSessionFactory method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testGetSessionFactory() {
        System.out.println("getSessionFactory");
        
        AccountDelegate instance = new AccountDelegate();
        
        SessionFactory expResult = null;
        SessionFactory result = instance.getSessionFactory();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createAccount method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testCreateAccount() {
        System.out.println("createAccount");
        
        CustomerSignup customerSignup = null;
        AccountDelegate instance = new AccountDelegate();
        
        int expResult = 0;
        int result = instance.createAccount(customerSignup);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateProfile method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testUpdateProfile() {
        System.out.println("updateProfile");
        
        CustomerSignup cs = null;
        AccountDelegate instance = new AccountDelegate();
        
        boolean expResult = true;
        boolean result = instance.updateProfile(cs);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieveProfile method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testRetrieveProfile() {
        System.out.println("retrieveProfile");
        
        String emailId = "";
        AccountDelegate instance = new AccountDelegate();
        
        CustomerSignup expResult = null;
        CustomerSignup result = instance.retrieveProfile(emailId);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrievePassword method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testRetrievePassword() {
        System.out.println("retrievePassword");
        
        String emailId = "";
        AccountDelegate instance = new AccountDelegate();
        
        String expResult = "";
        String result = instance.retrievePassword(emailId);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieveEmail method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testRetrieveEmail() {
        System.out.println("retrieveEmail");
        
        long userId = 0L;
        AccountDelegate instance = new AccountDelegate();
        
        String expResult = "";
        String result = instance.retrieveEmail(userId);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieveCustomerSignup method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testRetrieveCustomerSignup() {
        System.out.println("retrieveCustomerSignup");
        
        long userId = 0L;
        AccountDelegate instance = new AccountDelegate();
        
        CustomerSignup expResult = null;
        CustomerSignup result = instance.retrieveCustomerSignup(userId);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of authenticate method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testAuthenticate() {
        System.out.println("authenticate");
        
        String emailId = "";
        String password = "";
        String siteName = "";
        AccountDelegate instance = new AccountDelegate();
        
        boolean expResult = true;
        boolean result = instance.authenticate(emailId, password, siteName);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createApplication method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testCreateApplication() {
        System.out.println("createApplication");
        
        ApplicationTable application = null;
        AccountDelegate instance = new AccountDelegate();
        
        boolean expResult = true;
        boolean result = instance.createApplication(application);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertApplication method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testInsertApplication() {
        System.out.println("insertApplication");
        
        ApplicationTable at = null;
        String appData = "";
        Map sessionMap = null;
        AccountDelegate instance = new AccountDelegate();
        
        instance.insertApplication(at, appData, sessionMap);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieveAccountSummaryUsingEmailID method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testRetrieveAccountSummaryUsingEmailID() {
        System.out.println("retrieveAccountSummaryUsingEmailID");
        
        String emailId = "";
        AccountDelegate instance = new AccountDelegate();
        
        List<ApplicationTable> expResult = null;
        List<ApplicationTable> result = instance.retrieveAccountSummaryUsingEmailID(emailId);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieveAccountSummary method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testRetrieveAccountSummary() {
        System.out.println("retrieveAccountSummary");
        
        String userId = "";
        AccountDelegate instance = new AccountDelegate();
        
        List expResult = null;
        List result = instance.retrieveAccountSummary(userId);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieveAccount method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testRetrieveAccount() {
        System.out.println("retrieveAccount");
        
        String emailId = "";
        long applicationId = 0L;
        int applicationType = 0;
        AccountDelegate instance = new AccountDelegate();
        
        ApplicationTable expResult = null;
        ApplicationTable result = instance.retrieveAccount(emailId, applicationId, applicationType);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fileToString method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testFileToString() throws Exception {
        System.out.println("fileToString");
        
        String fileName = "";
        
        String expResult = "";
        String result = AccountDelegate.fileToString(fileName);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of interactionUnmarshaller method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testInteractionUnmarshaller() throws Exception {
        System.out.println("interactionUnmarshaller");
        
        String interactionXML = "";
        AccountDelegate instance = new AccountDelegate();
        
        ApplicationStatus expResult = null;
        ApplicationStatus result = instance.interactionUnmarshaller(interactionXML);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of applicationUnmarshaller method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testApplicationUnmarshaller() throws Exception {
        System.out.println("applicationUnmarshaller");
        
        String packageName = "";
        String className = "";
        String applicationXML = "";
        AccountDelegate instance = new AccountDelegate();
        
        Object expResult = null;
        Object result = instance.applicationUnmarshaller(packageName, className, applicationXML);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of applicationMarshaller method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testApplicationMarshaller() throws Exception {
        System.out.println("applicationMarshaller");
        
        String packageName = "";
        Object appData = null;
        AccountDelegate instance = new AccountDelegate();
        
        String expResult = "";
        String result = instance.applicationMarshaller(packageName, appData);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mailUser method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testMailUser() {
        System.out.println("mailUser");
        
        String rbBaseName = "";
        String senderMail = "";
        String userMail = "";
        String subject = "";
        String messageBody = "";
        List mailArguments = null;
        AccountDelegate instance = new AccountDelegate();
        
        instance.mailUser(rbBaseName, senderMail, userMail, subject, messageBody, mailArguments);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSessionMap method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testGetSessionMap() {
        System.out.println("getSessionMap");
        
        AccountDelegate instance = new AccountDelegate();
        
        Map expResult = null;
        Map result = instance.getSessionMap();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSessionMap method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testSetSessionMap() {
        System.out.println("setSessionMap");
        
        Map v = null;
        AccountDelegate instance = new AccountDelegate();
        
        instance.setSessionMap(v);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkKeys method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testCheckKeys() {
        System.out.println("checkKeys");
        
        String pass = "";
        AccountDelegate instance = new AccountDelegate();
        
        boolean expResult = true;
        boolean result = instance.checkKeys(pass);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchCustomerSignup method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testSearchCustomerSignup() {
        System.out.println("searchCustomerSignup");
        
        String queryCriteria = "";
        String query = "";
        String fromDate = "";
        String toDate = "";
        AccountDelegate instance = new AccountDelegate();
        
        List<CustomerSignup> expResult = null;
        List<CustomerSignup> result = instance.searchCustomerSignup(queryCriteria, query, fromDate, toDate);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCommentsByEmail method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testGetCommentsByEmail() {
        System.out.println("getCommentsByEmail");
        
        String emailId = "";
        AccountDelegate instance = new AccountDelegate();
        
        List<CommentsTable> expResult = null;
        List<CommentsTable> result = instance.getCommentsByEmail(emailId);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieveApplicationType method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testRetrieveApplicationType() {
        System.out.println("retrieveApplicationType");
        
        String productName = "";
        AccountDelegate instance = new AccountDelegate();
        
        int expResult = 0;
        int result = instance.retrieveApplicationType(productName);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieveProductName method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testRetrieveProductName() {
        System.out.println("retrieveProductName");
        
        int appType = 0;
        AccountDelegate instance = new AccountDelegate();
        
        String expResult = "";
        String result = instance.retrieveProductName(appType);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllProductsCost method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testGetAllProductsCost() {
        System.out.println("getAllProductsCost");
        
        AccountDelegate instance = new AccountDelegate();
        
        List<ProductCost> expResult = null;
        List<ProductCost> result = instance.getAllProductsCost();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertPersistentSession method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testInsertPersistentSession() {
        System.out.println("insertPersistentSession");
        
        long userId = 0L;
        AccountDelegate instance = new AccountDelegate();
        
        String expResult = "";
        String result = instance.insertPersistentSession(userId);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieveSession method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testRetrieveSession() {
        System.out.println("retrieveSession");
        
        String sessionId = "";
        AccountDelegate instance = new AccountDelegate();
        
        long expResult = 0L;
        long result = instance.retrieveSession(sessionId);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAlertSiteAccount method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testDeleteAlertSiteAccount() {
        System.out.println("deleteAlertSiteAccount");
        
        AccountDelegate instance = new AccountDelegate();
        
        int expResult = 0;
        int result = instance.deleteAlertSiteAccount();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadAllApplications method, of class com.formsdirectinc.user.AccountDelegate.
     */
    public void testLoadAllApplications() {
        System.out.println("loadAllApplications");
        
        int applicationType = 0;
        AccountDelegate instance = new AccountDelegate();
        
        List<ApplicationTable> expResult = null;
        List<ApplicationTable> result = instance.loadAllApplications(applicationType);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
