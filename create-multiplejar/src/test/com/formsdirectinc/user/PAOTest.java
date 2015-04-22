/*
 * PAOTest.java
 * JUnit based test
 *
 * Created on November 27, 2007, 6:03 PM
 */

package com.formsdirectinc.user;

import junit.framework.*;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;
import java.util.Arrays;
import javax.crypto.NoSuchPaddingException;
import javax.mail.MessagingException;
import org.apache.log4j.Category;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.engines.AESLightEngine;
import org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.util.encoders.Base64;
import com.formsdirectinc.security.AESUtils;
import com.jamonapi.Monitor;
import com.jamonapi.MonitorFactory;

/**
 *
 * @author rajesh
 */
public class PAOTest extends TestCase {
    
    public PAOTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(PAOTest.class);
        
        return suite;
    }

    /**
     * Test of getInstance method, of class com.formsdirectinc.user.PAO.
     */
    public void testGetInstance() {
        System.out.println("getInstance");
        
        PAO expResult = null;
        PAO result = PAO.getInstance();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LoadKeys method, of class com.formsdirectinc.user.PAO.
     */
    public void testLoadKeys() throws Exception {
        System.out.println("LoadKeys");
        
        String directory = "";
        
        PAO.LoadKeys(directory);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LoadKeysProduction method, of class com.formsdirectinc.user.PAO.
     */
    public void testLoadKeysProduction() throws Exception {
        System.out.println("LoadKeysProduction");
        
        String directory = "";
        
        boolean expResult = true;
        boolean result = PAO.LoadKeysProduction(directory);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKey method, of class com.formsdirectinc.user.PAO.
     */
    public void testGetKey() throws Exception {
        System.out.println("getKey");
        
        String password = "";
        
        CipherParameters expResult = null;
        CipherParameters result = PAO.getKey(password);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Encrypt method, of class com.formsdirectinc.user.PAO.
     */
    public void testEncrypt() throws Exception {
        System.out.println("Encrypt");
        
        String toEncrypt = "";
        
        String expResult = "";
        String result = PAO.Encrypt(toEncrypt);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Decrypt method, of class com.formsdirectinc.user.PAO.
     */
    public void testDecrypt() throws Exception {
        System.out.println("Decrypt");
        
        String cipherBase64String = "";
        
        String expResult = "";
        String result = PAO.Decrypt(cipherBase64String);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnencryptedAdminKey method, of class com.formsdirectinc.user.PAO.
     */
    public void testGetUnencryptedAdminKey() {
        System.out.println("getUnencryptedAdminKey");
        
        String expResult = "";
        String result = PAO.getUnencryptedAdminKey();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUnencryptedAdminKey method, of class com.formsdirectinc.user.PAO.
     */
    public void testSetUnencryptedAdminKey() {
        System.out.println("setUnencryptedAdminKey");
        
        String unencryptedPassword = "";
        
        PAO.setUnencryptedAdminKey(unencryptedPassword);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSHA256Digest method, of class com.formsdirectinc.user.PAO.
     */
    public void testGetSHA256Digest() throws Exception {
        System.out.println("getSHA256Digest");
        
        String stri = "";
        
        byte[] expResult = null;
        byte[] result = PAO.getSHA256Digest(stri);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
