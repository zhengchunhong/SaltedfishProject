package com.webtest.demo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.freemarker.WebTestListener;
import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;

@Listeners(WebTestListener.class)
public class ExcelDemo extends BaseTest{
	@BeforeMethod
	public void testLogin() throws InterruptedException {
		// 登陆成功是测试前提
		webtest.open("http://localhost/wstshop_3.0.0/admin/index/login.html");
		webtest.type("id=loginPwd", "admin");
		webtest.type("id=verifyCode", "1111");
		webtest.click("xpath=//input[@type='button']");
	}
	
	@Test(dataProvider = "wstshop",dataProviderClass = NSDataProvider.class)
	public void test43(String s) throws InterruptedException {
		//商品管理-在售商品，在商品中填入商品名称“私房酒/娃哈哈”，进行查询
		webtest.click("xpath=//*[text()='商品管理']");
		webtest.click("xpath=//*[text()='在售商品']");
		driver.switchTo().frame("wst-lframe-22");
		webtest.type("id=goodsName",s);
		webtest.click("xpath=//*[text()='查询']");
	}
	
}
