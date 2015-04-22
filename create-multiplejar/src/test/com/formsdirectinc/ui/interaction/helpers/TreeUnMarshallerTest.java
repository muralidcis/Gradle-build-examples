/*
 * TreeUnMarshallerTest.java
 * JUnit based test
 *
 * Created on November 27, 2007, 6:03 PM
 */

package com.formsdirectinc.ui.interaction.helpers;

import junit.framework.*;
import java.io.*;
import java.util.*;
import com.thoughtworks.xstream.*;
import com.jenkov.prizetags.tree.itf.*;
import com.jenkov.prizetags.tree.impl.*;
import com.jamonapi.*;

/**
 *
 * @author rajesh
 */
public class TreeUnMarshallerTest extends TestCase {
    
    public TreeUnMarshallerTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(TreeUnMarshallerTest.class);
        
        return suite;
    }

    /**
     * Test of createNavTreeObject method, of class com.formsdirectinc.ui.interaction.helpers.TreeUnMarshaller.
     */
    public void testCreateNavTreeObject() {
        System.out.println("createNavTreeObject");
        
        String fileName = "";
        TreeUnMarshaller instance = new TreeUnMarshaller();
        
        TreeNode expResult = null;
        TreeNode result = instance.createNavTreeObject(fileName);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
