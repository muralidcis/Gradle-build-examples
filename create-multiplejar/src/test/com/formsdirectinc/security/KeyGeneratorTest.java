/*
 * KeyGeneratorTest.java
 * JUnit based test
 *
 * Created on November 27, 2007, 6:03 PM
 */

package com.formsdirectinc.security;

import junit.framework.*;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.security.DigestException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Random;
import org.bouncycastle.crypto.digests.SHA256Digest;

/**
 *
 * @author rajesh
 */
public class KeyGeneratorTest extends TestCase {
    
    public KeyGeneratorTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(KeyGeneratorTest.class);
        
        return suite;
    }

    /**
     * Test of main method, of class com.formsdirectinc.security.KeyGenerator.
     */
    public void testMain() throws Exception {
        System.out.println("main");
        
        String[] args = null;
        
        KeyGenerator.main(args);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSHA256Key method, of class com.formsdirectinc.security.KeyGenerator.
     */
    public void testGetSHA256Key() throws Exception {
        System.out.println("getSHA256Key");
        
        String stri = "";
        
        byte[] expResult = null;
        byte[] result = KeyGenerator.getSHA256Key(stri);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of StringToFile method, of class com.formsdirectinc.security.KeyGenerator.
     */
    public void testStringToFile() {
        System.out.println("StringToFile");
        
        String toWrite = "";
        String fileName = "";
        
        KeyGenerator.StringToFile(toWrite, fileName);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BytesToFile method, of class com.formsdirectinc.security.KeyGenerator.
     */
    public void testBytesToFile() {
        System.out.println("BytesToFile");
        
        byte[] toWrite = null;
        String fileName = "";
        
        KeyGenerator.BytesToFile(toWrite, fileName);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of longToKey method, of class com.formsdirectinc.security.KeyGenerator.
     */
    public void testLongToKey() {
        System.out.println("longToKey");
        
        long keyvalue = 0L;
        
        String expResult = "";
        String result = KeyGenerator.longToKey(keyvalue);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BytesToString method, of class com.formsdirectinc.security.KeyGenerator.
     */
    public void testBytesToString() {
        System.out.println("BytesToString");
        
        byte[] byteArray = null;
        
        String expResult = "";
        String result = KeyGenerator.BytesToString(byteArray);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
