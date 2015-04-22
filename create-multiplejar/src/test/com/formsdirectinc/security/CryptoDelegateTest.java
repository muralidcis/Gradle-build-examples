package com.formsdirectinc.security;

import junit.framework.TestCase;
/**
 * key files needs to be put in project directory before running Test Suite
 * 
 * @author Vivek Saini
 *
 */
public class CryptoDelegateTest extends TestCase {
	private CryptoDelegate cryptoDelegate;
	private static final String DECRYPTED_STRING="stringToBeEncrypted";
	private static final String ENCRYPTED_STRING="4Hh/ko0d9JmrcrxPGq5Zckk5LbFm1zv4AWOJR/Yd4UI=";
	@Override
	public void setUp()
	{
		System.setProperty("serverMode", "test");
		cryptoDelegate= CryptoDelegate.getInstance();
	}
	
	@Override
	public void tearDown()
	{
		System.setProperty("serverMode", "");
		cryptoDelegate=null;
	}
	
	public void testEncrypt()
	{
		try {
			String encryptedStr=cryptoDelegate.encrypt(DECRYPTED_STRING);
			assertEquals(ENCRYPTED_STRING, encryptedStr);
		} catch (Exception e) {
			e.printStackTrace();
			fail("key files are missing");
		}
	}
	public void testDecrypt()
	{
		try {
			String decryptedStr=cryptoDelegate.decrypt(ENCRYPTED_STRING);
			assertEquals(DECRYPTED_STRING, decryptedStr);
		} catch (Exception e) {
			e.printStackTrace();
			fail("key files are missing");
		}
	}
	public void testEncryptDecrypt()
	{
		try {
			String encryptedStr=cryptoDelegate.encrypt(DECRYPTED_STRING);
			String decryptedStr=cryptoDelegate.decrypt(encryptedStr);
			
			assertEquals(DECRYPTED_STRING, decryptedStr);
		} catch (Exception e) {
			e.printStackTrace();
			fail("key files are missing");
		}
	}
	
	public void testMultipleEncrypt()
	{
		try {
			String encryptedStr=cryptoDelegate.encrypt(DECRYPTED_STRING);
			
			encryptedStr=cryptoDelegate.encrypt(encryptedStr);
			encryptedStr=cryptoDelegate.encrypt(encryptedStr);
			encryptedStr=cryptoDelegate.encrypt(encryptedStr);
			
			assertEquals(ENCRYPTED_STRING, encryptedStr);
		} catch (Exception e) {
			e.printStackTrace();
			fail("key files are missing");
		}
	}
	public void testMultipleDecrypt()
	{
		try {
			String decryptedStr=cryptoDelegate.decrypt(ENCRYPTED_STRING);
			
			decryptedStr=cryptoDelegate.decrypt(decryptedStr);
			decryptedStr=cryptoDelegate.decrypt(decryptedStr);
			decryptedStr=cryptoDelegate.decrypt(decryptedStr);
			decryptedStr=cryptoDelegate.decrypt(decryptedStr);
			
			fail("exception should be thrown when we attempt to decrypt a already decrypted string");
		} catch (Exception e) {
			assert(true);
		}
	}
}
