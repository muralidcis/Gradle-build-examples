/*
 * ApplicationCenterTableRowTest.java
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
public class ApplicationCenterTableRowTest extends TestCase {
    
    public ApplicationCenterTableRowTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ApplicationCenterTableRowTest.class);
        
        return suite;
    }

    /**
     * Test of setApplicationName method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testSetApplicationName() {
        System.out.println("setApplicationName");
        
        String appName = "";
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        instance.setApplicationName(appName);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApplicationName method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testGetApplicationName() {
        System.out.println("getApplicationName");
        
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        String expResult = "";
        String result = instance.getApplicationName();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApplicants method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testSetApplicants() {
        System.out.println("setApplicants");
        
        java.util.ArrayList<String> applicants = null;
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        instance.setApplicants(applicants);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApplicants method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testGetApplicants() {
        System.out.println("getApplicants");
        
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        java.util.ArrayList<String> expResult = null;
        java.util.ArrayList<String> result = instance.getApplicants();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPurchaseDate method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testSetPurchaseDate() {
        System.out.println("setPurchaseDate");
        
        java.util.Calendar purchaseDate = null;
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        instance.setPurchaseDate(purchaseDate);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPurchaseDate method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testGetPurchaseDate() {
        System.out.println("getPurchaseDate");
        
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        java.util.Calendar expResult = null;
        java.util.Calendar result = instance.getPurchaseDate();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStartDate method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testSetStartDate() {
        System.out.println("setStartDate");
        
        java.util.Calendar startDate = null;
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        instance.setStartDate(startDate);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStartDate method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testGetStartDate() {
        System.out.println("getStartDate");
        
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        java.util.Calendar expResult = null;
        java.util.Calendar result = instance.getStartDate();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastUpdated method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testSetLastUpdated() {
        System.out.println("setLastUpdated");
        
        java.util.Calendar lastUpdated = null;
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        instance.setLastUpdated(lastUpdated);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastUpdated method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testGetLastUpdated() {
        System.out.println("getLastUpdated");
        
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        java.util.Calendar expResult = null;
        java.util.Calendar result = instance.getLastUpdated();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFormList method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testSetFormList() {
        System.out.println("setFormList");
        
        java.util.ArrayList<String> formList = null;
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        instance.setFormList(formList);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFormList method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testGetFormList() {
        System.out.println("getFormList");
        
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        java.util.ArrayList<String> expResult = null;
        java.util.ArrayList<String> result = instance.getFormList();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testSetStatus() {
        System.out.println("setStatus");
        
        int status = 0;
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        instance.setStatus(status);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testGetStatus() {
        System.out.println("getStatus");
        
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        int expResult = 0;
        int result = instance.getStatus();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStageCount method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testSetStageCount() {
        System.out.println("setStageCount");
        
        int stageCount = 0;
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        instance.setStageCount(stageCount);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStageCount method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testGetStageCount() {
        System.out.println("getStageCount");
        
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        int expResult = 0;
        int result = instance.getStageCount();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentStage method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testSetCurrentStage() {
        System.out.println("setCurrentStage");
        
        String currentStage = "";
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        instance.setCurrentStage(currentStage);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentStage method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testGetCurrentStage() {
        System.out.println("getCurrentStage");
        
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        String expResult = "";
        String result = instance.getCurrentStage();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPercentComplete method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testSetPercentComplete() {
        System.out.println("setPercentComplete");
        
        int percentComplete = 0;
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        instance.setPercentComplete(percentComplete);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPercentComplete method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testGetPercentComplete() {
        System.out.println("getPercentComplete");
        
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        int expResult = 0;
        int result = instance.getPercentComplete();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApplicationLocked method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testSetApplicationLocked() {
        System.out.println("setApplicationLocked");
        
        boolean applicationLocked = true;
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        instance.setApplicationLocked(applicationLocked);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isApplicationLoked method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testIsApplicationLoked() {
        System.out.println("isApplicationLoked");
        
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        boolean expResult = true;
        boolean result = instance.isApplicationLoked();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMultiForm method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testSetMultiForm() {
        System.out.println("setMultiForm");
        
        boolean multiForm = true;
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        instance.setMultiForm(multiForm);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMultiForm method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testIsMultiForm() {
        System.out.println("isMultiForm");
        
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        boolean expResult = true;
        boolean result = instance.isMultiForm();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMultiStage method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testSetMultiStage() {
        System.out.println("setMultiStage");
        
        boolean multiStage = true;
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        instance.setMultiStage(multiStage);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMultiStage method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testIsMultiStage() {
        System.out.println("isMultiStage");
        
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        boolean expResult = true;
        boolean result = instance.isMultiStage();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSite method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testSetSite() {
        System.out.println("setSite");
        
        String site = "";
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        instance.setSite(site);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSite method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testGetSite() {
        System.out.println("getSite");
        
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        String expResult = "";
        String result = instance.getSite();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContextPath method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testSetContextPath() {
        System.out.println("setContextPath");
        
        String contextPath = "";
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        instance.setContextPath(contextPath);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContextPath method, of class com.formsdirectinc.ui.appcenter.ApplicationCenterTableRow.
     */
    public void testGetContextPath() {
        System.out.println("getContextPath");
        
        ApplicationCenterTableRow instance = new ApplicationCenterTableRow();
        
        String expResult = "";
        String result = instance.getContextPath();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
