/*
 * RuleEngineTest.java
 * JUnit based test
 *
 * Created on November 27, 2007, 6:02 PM
 */

package com.formsdirectinc.rules;

import junit.framework.*;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import org.drools.FactException;
import org.drools.IntegrationException;
import org.drools.RuleBase;
import org.drools.io.RuleBaseLoader;
import org.drools.WorkingMemory;
import org.drools.decisiontable.DecisionTableLoader;
import org.drools.decisiontable.SpreadsheetDRLConverter;
import org.xml.sax.SAXException;
import org.apache.log4j.*;
import com.jamonapi.*;

/**
 *
 * @author rajesh
 */
public class RuleEngineTest extends TestCase {
    
    public RuleEngineTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(RuleEngineTest.class);
        
        return suite;
    }

    /**
     * Test of getRuleXML method, of class com.formsdirectinc.rules.RuleEngine.
     */
    public void testGetRuleXML() {
        System.out.println("getRuleXML");
        
        RuleEngine instance = new RuleEngine();
        
        String expResult = "";
        String result = instance.getRuleXML();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRuleXML method, of class com.formsdirectinc.rules.RuleEngine.
     */
    public void testSetRuleXML() {
        System.out.println("setRuleXML");
        
        String newRuleXML = "";
        RuleEngine instance = new RuleEngine();
        
        instance.setRuleXML(newRuleXML);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadRuleBase method, of class com.formsdirectinc.rules.RuleEngine.
     */
    public void testLoadRuleBase() throws Exception {
        System.out.println("loadRuleBase");
        
        String ruleXML = "";
        RuleEngine instance = new RuleEngine();
        
        instance.loadRuleBase(ruleXML);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class com.formsdirectinc.rules.RuleEngine.
     */
    public void testInit() throws Exception {
        System.out.println("init");
        
        RuleEngine instance = new RuleEngine();
        
        instance.init();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of executeRules method, of class com.formsdirectinc.rules.RuleEngine.
     */
    public void testExecuteRules() throws Exception {
        System.out.println("executeRules");
        
        String currentStep = "";
        String action = "";
        Object obj = null;
        HashMap response = null;
        RuleEngine instance = new RuleEngine();
        
        instance.executeRules(currentStep, action, obj, response);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPageIDFromRuleEngine method, of class com.formsdirectinc.rules.RuleEngine.
     */
    public void testGetPageIDFromRuleEngine() throws Exception {
        System.out.println("getPageIDFromRuleEngine");
        
        String pageID = "";
        Object applicationData = null;
        RuleEngine instance = new RuleEngine();
        
        String expResult = "";
        String result = instance.getPageIDFromRuleEngine(pageID, applicationData);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class com.formsdirectinc.rules.RuleEngine.
     */
    public void testMain() throws Exception {
        System.out.println("main");
        
        String[] args = null;
        
        RuleEngine.main(args);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
