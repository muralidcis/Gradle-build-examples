/*
 * AESUtilsTest.java
 * JUnit based test
 *
 * Created on November 27, 2007, 6:03 PM
 */

package com.formsdirectinc.security;

import junit.framework.*;
import java.io.*;
import java.security.*;
import java.util.Date;
import java.util.Random;
import javax.crypto.*;
import javax.crypto.spec.*;
import javax.mail.MessagingException;
import javax.mail.internet.MimeUtility;
import com.jamonapi.*;

/**
 *
 * @author rajesh
 */
public class AESUtilsTest extends TestCase {
    
    public AESUtilsTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(AESUtilsTest.class);
        
        return suite;
    }

    /**
     * Test of longToKey method, of class com.formsdirectinc.security.AESUtils.
     */
    public void testLongToKey() {
        System.out.println("longToKey");
        
        long keyvalue = 0L;
        AESUtils instance = new AESUtils();
        
        String expResult = "";
        String result = instance.longToKey(keyvalue);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of StringToFile method, of class com.formsdirectinc.security.AESUtils.
     */
    public void testStringToFile() {
        System.out.println("StringToFile");
        
        String toWrite = "";
        String fileName = "";
        AESUtils instance = new AESUtils();
        
        instance.StringToFile(toWrite, fileName);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FileToBytes method, of class com.formsdirectinc.security.AESUtils.
     */
    public void testFileToBytes() throws Exception {
        System.out.println("FileToBytes");
        
        String fileName = "";
        
        byte[] expResult = null;
        byte[] result = AESUtils.FileToBytes(fileName);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GenerateKeys method, of class com.formsdirectinc.security.AESUtils.
     */
    public void testGenerateKeys() {
        System.out.println("GenerateKeys");
        
        String directory = "";
        AESUtils instance = new AESUtils();
        
        instance.GenerateKeys(directory);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MimeEncode method, of class com.formsdirectinc.security.AESUtils.
     */
    public void testMimeEncode() throws Exception {
        System.out.println("MimeEncode");
        
        byte[] toEncode = null;
        
        byte[] expResult = null;
        byte[] result = AESUtils.MimeEncode(toEncode);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MimeDecode method, of class com.formsdirectinc.security.AESUtils.
     */
    public void testMimeDecode() throws Exception {
        System.out.println("MimeDecode");
        
        byte[] toDecode = null;
        
        byte[] expResult = null;
        byte[] result = AESUtils.MimeDecode(toDecode);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BytesToString method, of class com.formsdirectinc.security.AESUtils.
     */
    public void testBytesToString() {
        System.out.println("BytesToString");
        
        byte[] byteArray = null;
        
        String expResult = "";
        String result = AESUtils.BytesToString(byteArray);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of StringToBytes method, of class com.formsdirectinc.security.AESUtils.
     */
    public void testStringToBytes() {
        System.out.println("StringToBytes");
        
        String Str = "";
        
        byte[] expResult = null;
        byte[] result = AESUtils.StringToBytes(Str);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
