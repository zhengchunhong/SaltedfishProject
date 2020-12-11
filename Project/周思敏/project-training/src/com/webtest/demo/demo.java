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
		// 登陆成功是测试前提
		webtest.open("http://localhost/wstshop_3.0.0/admin/index/login.html");
		webtest.type("id=loginPwd", "admin");
		webtest.type("id=verifyCode", "1111");
		webtest.click("xpath=//input[@type='button']");
	}
	
	@Test
	public void test42() throws InterruptedException {
		// 商品管理-在售商品，在商品中填入编号“148267577224604”，进行查询
		webtest.click("xpath=//*[text()='商品管理']");
		webtest.click("xpath=//*[text()='在售商品']");
		driver.switchTo().frame("wst-lframe-22");
		webtest.type("id=goodsName", "148267577224604");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='查询']");
		Thread.sleep(2000);
	}
}
