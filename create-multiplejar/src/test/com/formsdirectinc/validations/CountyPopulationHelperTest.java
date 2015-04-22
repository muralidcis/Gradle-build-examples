package com.formsdirectinc.validations;

import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;

public class CountyPopulationHelperTest {

	@Before
	public void setUp() throws Exception {
		SessionFactory sf = com.formsdirectinc.test.framework.util.HibernateUtil.getSessionFactory();		
	}

	@Test
	public void testValidate() {
		String response = new CountyPopulationHelper().populate("NY", "00601");
		System.out.println(response);
	}

}
