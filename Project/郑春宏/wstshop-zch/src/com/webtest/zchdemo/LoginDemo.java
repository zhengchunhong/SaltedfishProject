package com.webtest.zchdemo;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.webtest.freemarker.WebTestListener;
import com.webtest.core.BaseTest;

/*
 * author:Ö£´ººê
 * Ä£¿é£ºwstshopÍøÉÏÉÌ³ÇÇ°Ì¨ºóÌ¨µÇÂ¼Ä£¿éµÄ²âÊÔ
 */
@Listeners(WebTestListener.class)
public class LoginDemo extends BaseTest{

	@Test
	public void testLoginSuccess() throws InterruptedException {
		
		webtest.open("http://localhost/wstshop/admin/index/login.html");	
//		webtest.type("id=loginName", "admin");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("xpath=//input[@type='button']");
		Thread.sleep(200);
		assertTrue(webtest.isTextPresent("µÇÂ¼"));
		Thread.sleep(2000);
		webtest.click("xpath=//*[text()='ÍË³ö']");
	}
	
	@Test
	public void testLogin2Success() throws InterruptedException {
		
		webtest.open("http://localhost/wstshop/home/index/index.html");	
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='ÇëµÇÂ¼']");
		Thread.sleep(200);
		webtest.type("id=loginName", "zheng");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("xpath=//*[text()='µÇÂ¼']");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("»¶Ó­Äú£¬zheng"));
		webtest.click("xpath=//*[text()='ÍË³ö']");
	}
	
	@Test
	public void testLogin3Fail() throws InterruptedException {
		
		webtest.open("http://localhost/wstshop/home/index/index.html");	
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='ÇëµÇÂ¼']");
		Thread.sleep(200);
		webtest.type("id=loginName", "zheng");
		webtest.type("id=loginPwd", "11111");
		webtest.type("id=verifyCode", "111");
		webtest.click("xpath=//*[text()='µÇÂ¼']");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("»¶Ó­Äú£¬zheng"));
	}
	@Test
	public void testLogin1Fail() throws InterruptedException {
		
		webtest.open("http://localhost/wstshop/home/index/index.html");	
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='ÇëµÇÂ¼']");
		Thread.sleep(200);
		webtest.type("id=loginName", "");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("xpath=//*[text()='µÇÂ¼']");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("»¶Ó­Äú£¬zheng"));
	}
	
	@Test
	public void testLogin2Fail() throws InterruptedException {
		
		webtest.open("http://localhost/wstshop/home/index/index.html");	
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='ÇëµÇÂ¼']");
		Thread.sleep(200);
		webtest.type("id=loginName", "zheng");
		webtest.type("id=loginPwd", "");
		webtest.type("id=verifyCode", "1111");
		webtest.click("xpath=//*[text()='µÇÂ¼']");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("»¶Ó­Äú£¬zheng"));
	}

}
