package com.webtest.demo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.freemarker.WebTestListener;
import com.webtest.core.BaseTest;

@Listeners(WebTestListener.class)
public class demo extends BaseTest{
	@BeforeMethod
	public void testLogin() throws InterruptedException {
		// ��½�ɹ��ǲ���ǰ��
		webtest.open("http://localhost/wstshop_3.0.0/admin/index/login.html");
		webtest.type("id=loginPwd", "admin");
		webtest.type("id=verifyCode", "1111");
		webtest.click("xpath=//input[@type='button']");
	}
	
	@Test
	public void test42() throws InterruptedException {
		// ��Ʒ����-������Ʒ������Ʒ�������š�148267577224604�������в�ѯ
		webtest.click("xpath=//*[text()='��Ʒ����']");
		webtest.click("xpath=//*[text()='������Ʒ']");
		driver.switchTo().frame("wst-lframe-22");
		webtest.type("id=goodsName", "148267577224604");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='��ѯ']");
		Thread.sleep(2000);
	}
}
