/*
 * PDFServletTest.java
 * JUnit based test
 *
 * Created on May 6, 2008, 1:35 PM
 */

package com.formsdirectinc.pdf;

import junit.framework.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Category;
import com.formsdirectinc.ui.instructions.FilingInstructionGenerator;
import com.formsdirectinc.user.AccountDelegate;
import com.formsdirectinc.user.CustomerSignup;
import com.jamonapi.Monitor;
import com.jamonapi.MonitorFactory;

/**
 *
 * @author rajesh
 */
public class PDFServletTest extends TestCase {
    
    public PDFServletTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(PDFServletTest.class);
        
        return suite;
    }

    /**
     * Test of init method, of class com.formsdirectinc.pdf.PDFServlet.
     */
    public void testInit() throws Exception {
        System.out.println("init");
        
        ServletConfig config = null;
        PDFServlet instance = new PDFServlet();
        
        instance.init(config);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doGet method, of class com.formsdirectinc.pdf.PDFServlet.
     */
    public void testDoGet() throws Exception {
        System.out.println("doGet");
        
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        PDFServlet instance = new PDFServlet();
        
        instance.doGet(request, response);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doPost method, of class com.formsdirectinc.pdf.PDFServlet.
     */
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        PDFServlet instance = new PDFServlet();
        
        instance.doPost(request, response);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public static void main(java.lang.String[] argList) {
        junit.textui.TestRunner.run(suite());
    }
    
}
