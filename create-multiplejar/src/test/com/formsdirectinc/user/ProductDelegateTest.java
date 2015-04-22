/*
 * ProductDelegateTest.java
 * JUnit based test
 *
 * Created on November 27, 2007, 6:03 PM
 */

package com.formsdirectinc.user;

import junit.framework.*;
import org.hibernate.cfg.*;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.HibernateException;
import org.apache.log4j.Category;
import org.apache.log4j.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.*;
import com.jamonapi.*;

/**
 *
 * @author rajesh
 */
public class ProductDelegateTest extends TestCase {
    
    public ProductDelegateTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ProductDelegateTest.class);
        
        return suite;
    }

    /**
     * Test of getSessionFactory method, of class com.formsdirectinc.user.ProductDelegate.
     */
    public void testGetSessionFactory() {
        System.out.println("getSessionFactory");
        
        ProductDelegate instance = new ProductDelegate();
        
        SessionFactory expResult = null;
        SessionFactory result = instance.getSessionFactory();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveProduct method, of class com.formsdirectinc.user.ProductDelegate.
     */
    public void testSaveProduct() {
        System.out.println("saveProduct");
        
        ProductCost productCatalogue = null;
        ProductDelegate instance = new ProductDelegate();
        
        boolean expResult = true;
        boolean result = instance.saveProduct(productCatalogue);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrieveProductSummary method, of class com.formsdirectinc.user.ProductDelegate.
     */
    public void testRetrieveProductSummary() {
        System.out.println("retrieveProductSummary");
        
        ProductDelegate instance = new ProductDelegate();
        
        List expResult = null;
        List result = instance.retrieveProductSummary();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductCost method, of class com.formsdirectinc.user.ProductDelegate.
     */
    public void testGetProductCost() {
        System.out.println("getProductCost");
        
        int prodId = 0;
        ProductDelegate instance = new ProductDelegate();
        
        float expResult = 0.0F;
        float result = instance.getProductCost(prodId);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
