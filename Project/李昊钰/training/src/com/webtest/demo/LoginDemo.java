package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class LoginDemo extends BaseTest {

	/*
	 * 李昊钰
 * */
	@Test
	public void testLogin() {

		webtest.open("http://localhost:8032/mymovie/admin.php/");

		webtest.type("name=username", "admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		assertTrue(webtest.isTextPresent("閫�鍑�"));
	}

}
