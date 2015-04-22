/*
 * InteractionMgrTest.java
 * JUnit based test
 *
 * Created on May 13, 2008, 4:30 PM
 */

package com.formsdirectinc.ui.interaction;

import junit.framework.*;
import com.formsdirectinc.rules.RuleEngine;
import com.formsdirectinc.schema.interaction.model.*;
import com.formsdirectinc.security.AESUtils;
import com.formsdirectinc.xao.UserDataXAO;
import org.drools.IntegrationException;
import org.xml.sax.SAXException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.bind.UnmarshalException;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import org.apache.log4j.*;
import com.jamonapi.*;
import com.formsdirectinc.user.Stage;
import com.formsdirectinc.user.StageStatusEnum;
import com.formsdirectinc.schema.application.model.*;

/**
 *
 * @author rajesh
 */
public class InteractionMgrTest extends TestCase {
    
    public InteractionMgrTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    /**
     * Test of setRuleName method, of class com.formsdirectinc.ui.interaction.InteractionMgr.
     */
    public void testSetRuleName() {
        System.out.println("setRuleName");
        
        String v = "";
        InteractionMgr instance = new InteractionMgr();
        
        instance.setRuleName(v);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSectionStatus method, of class com.formsdirectinc.ui.interaction.InteractionMgr.
     */
    public void testGetSectionStatus() throws Exception {
        System.out.println("getSectionStatus");
        
        String sectionID = "";
        ApplicationStatus appStatus = null;
        InteractionMgr instance = new InteractionMgr();
        
        SectionStatus expResult = null;
        SectionStatus result = instance.getSectionStatus(sectionID, appStatus);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPageStatus method, of class com.formsdirectinc.ui.interaction.InteractionMgr.
     */
    public void testGetPageStatus() throws Exception {
        System.out.println("getPageStatus");
        
        String pageID = "";
        ApplicationStatus appStatus = null;
        InteractionMgr instance = new InteractionMgr();
        
        PageStatus expResult = null;
        PageStatus result = instance.getPageStatus(pageID, appStatus);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isProperInteraction method, of class com.formsdirectinc.ui.interaction.InteractionMgr.
     */
    public void testIsProperInteraction() throws Exception {
        System.out.println("isProperInteraction");
        
        String pageID = "";
        ApplicationStatus appStatus = null;
        InteractionMgr instance = new InteractionMgr();
        
        boolean expResult = true;
        boolean result = instance.isProperInteraction(pageID, appStatus);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPageState method, of class com.formsdirectinc.ui.interaction.InteractionMgr.
     */
    public void testGetPageState() throws Exception {
        System.out.println("getPageState");
        
        String pageID = "";
        ApplicationStatus appStatus = null;
        InteractionMgr instance = new InteractionMgr();
        
        PageStateEnum expResult = null;
        PageStateEnum result = instance.getPageState(pageID, appStatus);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPageState method, of class com.formsdirectinc.ui.interaction.InteractionMgr.
     */
    public void testSetPageState() throws Exception {
        System.out.println("setPageState");
        
        String pageID = "";
        ApplicationStatus appStatus = null;
        String pageState = "";
        InteractionMgr instance = new InteractionMgr();
        
        instance.setPageState(pageID, appStatus, pageState);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSectionState method, of class com.formsdirectinc.ui.interaction.InteractionMgr.
     */
    public void testGetSectionState() throws Exception {
        System.out.println("getSectionState");
        
        String sectionID = "";
        ApplicationStatus appStatus = null;
        Object applicationData = null;
        InteractionMgr instance = new InteractionMgr();
        
        SectionStateEnum expResult = null;
        SectionStateEnum result = instance.getSectionState(sectionID, appStatus, applicationData);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSectionState method, of class com.formsdirectinc.ui.interaction.InteractionMgr.
     */
    public void testSetSectionState() throws Exception {
        System.out.println("setSectionState");
        
        String sectionID = "";
        ApplicationStatus appStatus = null;
        String sectionState = "";
        InteractionMgr instance = new InteractionMgr();
        
        instance.setSectionState(sectionID, appStatus, sectionState);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fileInteractionUnmarshaller method, of class com.formsdirectinc.ui.interaction.InteractionMgr.
     */
    public void testFileInteractionUnmarshaller() throws Exception {
        System.out.println("fileInteractionUnmarshaller");
        
        String fileInteractionXML = "";
        InteractionMgr instance = new InteractionMgr();
        
        ApplicationStatus expResult = null;
        ApplicationStatus result = instance.fileInteractionUnmarshaller(fileInteractionXML);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of interactionUnmarshaller method, of class com.formsdirectinc.ui.interaction.InteractionMgr.
     */
    public void testInteractionUnmarshaller() throws Exception {
        System.out.println("interactionUnmarshaller");
        
        String interactionXML = "";
        InteractionMgr instance = new InteractionMgr();
        
        ApplicationStatus expResult = null;
        ApplicationStatus result = instance.interactionUnmarshaller(interactionXML);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of interactionMarshaller method, of class com.formsdirectinc.ui.interaction.InteractionMgr.
     */
    public void testInteractionMarshaller() {
        System.out.println("interactionMarshaller");
        
        ApplicationStatus appStatus = null;
        InteractionMgr instance = new InteractionMgr();
        
        String expResult = "";
        String result = instance.interactionMarshaller(appStatus);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPageStatusList method, of class com.formsdirectinc.ui.interaction.InteractionMgr.
     */
    public void testGetPageStatusList() throws Exception {
        System.out.println("getPageStatusList");
        
        String sectionID = "";
        Object applicationData = null;
        ApplicationStatus appStatus = null;
        InteractionMgr instance = new InteractionMgr();
        
        List<PageStatus> expResult = null;
        List<PageStatus> result = instance.getPageStatusList(sectionID, applicationData, appStatus);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserPageStatusList method, of class com.formsdirectinc.ui.interaction.InteractionMgr.
     */
    public void testGetUserPageStatusList() throws Exception {
        System.out.println("getUserPageStatusList");
        
        Object applicationData = null;
        ApplicationStatus appStatus = null;
        InteractionMgr instance = new InteractionMgr();
        
        List<PageStatus> expResult = null;
        List<PageStatus> result = instance.getUserPageStatusList(applicationData, appStatus);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstIncompletePageId method, of class com.formsdirectinc.ui.interaction.InteractionMgr.
     */
    public void testGetFirstIncompletePageId() throws Exception {
        System.out.println("getFirstIncompletePageId");
        
        Object applicationData = null;
        ApplicationStatus appStatus = null;
        InteractionMgr instance = new InteractionMgr();
        
        String expResult = "";
        String result = instance.getFirstIncompletePageId(applicationData, appStatus);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserFirstIncompletePageId method, of class com.formsdirectinc.ui.interaction.InteractionMgr.
     */
    public void testGetUserFirstIncompletePageId() throws Exception {
        System.out.println("getUserFirstIncompletePageId");
        
        Object applicationData = null;
        ApplicationStatus appStatus = null;
        InteractionMgr instance = new InteractionMgr();
        
        String expResult = "";
        String result = instance.getUserFirstIncompletePageId(applicationData, appStatus);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPageIdFromRuleEngine method, of class com.formsdirectinc.ui.interaction.InteractionMgr.
     */
    public void testGetPageIdFromRuleEngine() throws Exception {
        System.out.println("getPageIdFromRuleEngine");
        
        String pageID = "";
        Object applicationData = null;
        InteractionMgr instance = new InteractionMgr();
        
        String expResult = "";
        String result = instance.getPageIdFromRuleEngine(pageID, applicationData);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValidationFailedList method, of class com.formsdirectinc.ui.interaction.InteractionMgr.
     */
    public void testGetValidationFailedList() throws Exception {
        System.out.println("getValidationFailedList");
        
        ApplicationStatus appStatus = null;
        InteractionMgr instance = new InteractionMgr();
        
        List<String> expResult = null;
        List<String> result = instance.getValidationFailedList(appStatus);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMSAPercentageComplete method, of class com.formsdirectinc.ui.interaction.InteractionMgr.
     */
    public void testGetMSAPercentageComplete() {
        System.out.println("getMSAPercentageComplete");
        
        ArrayList<Stage> stageList = null;
        InteractionMgr instance = new InteractionMgr();
        
        int expResult = 0;
        int result = instance.getMSAPercentageComplete(stageList);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSSAPercentageComplete method, of class com.formsdirectinc.ui.interaction.InteractionMgr.
     */
    public void testGetSSAPercentageComplete() throws Exception {
        System.out.println("getSSAPercentageComplete");
        
        Object applicationData = null;
        ApplicationStatus appStatus = null;
        InteractionMgr instance = new InteractionMgr();
        
        int expResult = 0;
        int result = instance.getSSAPercentageComplete(applicationData, appStatus);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserSectionIdList method, of class com.formsdirectinc.ui.interaction.InteractionMgr.
     */
    public void testGetUserSectionIdList() throws Exception {
        System.out.println("getUserSectionIdList");
        
        Object applicationData = null;
        ApplicationStatus appStatus = null;
        InteractionMgr instance = new InteractionMgr();
        
        List<String> expResult = null;
        List<String> result = instance.getUserSectionIdList(applicationData, appStatus);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class com.formsdirectinc.ui.interaction.InteractionMgr.
     */
    public void testMain() throws Exception {
        System.out.println("main");
        
        String[] args = null;
        
        InteractionMgr.main(args);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
