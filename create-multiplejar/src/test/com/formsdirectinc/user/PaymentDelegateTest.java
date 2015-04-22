/*
 * PaymentDelegateTest.java
 * JUnit based test
 *
 * Created on November 27, 2007, 6:03 PM
 */

package com.formsdirectinc.user;

import junit.framework.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Category;
import org.apache.log4j.Logger;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import javax.naming.Context;
import javax.naming.InitialContext;

/**
 *
 * @author rajesh
 */
public class PaymentDelegateTest extends TestCase {
    
    public PaymentDelegateTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(PaymentDelegateTest.class);
        
        return suite;
    }

    /**
     * Test of getSessionFactory method, of class com.formsdirectinc.user.PaymentDelegate.
     */
    public void testGetSessionFactory() {
        System.out.println("getSessionFactory");
        
        PaymentDelegate instance = new PaymentDelegate();
        
        SessionFactory expResult = null;
        SessionFactory result = instance.getSessionFactory();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of savePayment method, of class com.formsdirectinc.user.PaymentDelegate.
     */
    public void testSavePayment() {
        System.out.println("savePayment");
        
        PaymentTable payment = null;
        PaymentDelegate instance = new PaymentDelegate();
        
        boolean expResult = true;
        boolean result = instance.savePayment(payment);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPaidProduct method, of class com.formsdirectinc.user.PaymentDelegate.
     */
    public void testIsPaidProduct() {
        System.out.println("isPaidProduct");
        
        long applicationId = 0L;
        int applicationType = 0;
        PaymentDelegate instance = new PaymentDelegate();
        
        boolean expResult = true;
        boolean result = instance.isPaidProduct(applicationId, applicationType);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateApplicationType method, of class com.formsdirectinc.user.PaymentDelegate.
     */
    public void testUpdateApplicationType() {
        System.out.println("updateApplicationType");
        
        int applicationType = 0;
        long applicationId = 0L;
        PaymentDelegate instance = new PaymentDelegate();
        
        boolean expResult = true;
        boolean result = instance.updateApplicationType(applicationType, applicationId);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPaymentOfApplication method, of class com.formsdirectinc.user.PaymentDelegate.
     */
    public void testGetPaymentOfApplication() {
        System.out.println("getPaymentOfApplication");
        
        int applicationType = 0;
        long applicationId = 0L;
        PaymentDelegate instance = new PaymentDelegate();
        
        PaymentTable expResult = null;
        PaymentTable result = instance.getPaymentOfApplication(applicationType, applicationId);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSearchQueryResults method, of class com.formsdirectinc.user.PaymentDelegate.
     */
    public void testGetSearchQueryResults() {
        System.out.println("getSearchQueryResults");
        
        String queryCriteria = "";
        String query = "";
        String fromDate = "";
        String toDate = "";
        PaymentDelegate instance = new PaymentDelegate();
        
        List<CustomerPaymentInfo> expResult = null;
        List<CustomerPaymentInfo> result = instance.getSearchQueryResults(queryCriteria, query, fromDate, toDate);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createPayment method, of class com.formsdirectinc.user.PaymentDelegate.
     */
    public void testCreatePayment() {
        System.out.println("createPayment");
        
        PaymentTable payment = null;
        PaymentDelegate instance = new PaymentDelegate();
        
        instance.createPayment(payment);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
