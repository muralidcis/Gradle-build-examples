/*
 * MailerTest.java
 * JUnit based test
 *
 * Created on November 27, 2007, 6:02 PM
 */

package com.formsdirectinc.helpers.mail;

import junit.framework.*;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.Properties;
import java.util.Date;
import com.jamonapi.*;

/**
 *
 * @author rajesh
 */
public class MailerTest extends TestCase {
    
    public MailerTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(MailerTest.class);
        
        return suite;
    }

    /**
     * Test of sendMail method, of class com.formsdirectinc.helpers.mail.Mailer.
     */
    public void testSendMail() {
        System.out.println("sendMail");
        
        String sender = "";
        String receiver = "";
        String subject = "";
        String messageBody = "";
        
        int expResult = 0;
        int result = Mailer.sendMail(sender, receiver, subject, messageBody);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendMailHtml method, of class com.formsdirectinc.helpers.mail.Mailer.
     */
    public void testSendMailHtml() {
        System.out.println("sendMailHtml");
        
        String sender = "";
        String receiver = "";
        String subject = "";
        String messageBody = "";
        Mailer instance = new Mailer();
        
        int expResult = 0;
        int result = instance.sendMailHtml(sender, receiver, subject, messageBody);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
