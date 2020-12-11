package com.webtest.demo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
/**
 * author:武奇
 *订单部分+资金管理
 */
public class ExcelTest extends BaseTest {
	//登录是测试前提
	@BeforeMethod
//		@Test
	    public void testLogin() throws InterruptedException{
			System.out.println("打印 Before test");
			webtest.open("http://localhost:9999/home/users/login.html");
			Thread.sleep(200);
			webtest.type("id=loginName", "wuqiqi");
			Thread.sleep(200);
			webtest.type("id=loginPwd", "19820818");
			Thread.sleep(200);
			webtest.type("id=verifyCode", "aaaa");
			Thread.sleep(200);
			
			webtest.click("xpath=(//table[@class='wst-table']//a)[4]");
			Thread.sleep(200);
		}
		//23待发货订单通过姓名查询
		@Test(dataProvider = "wstshop",dataProviderClass = NSDataProvider.class)
		public void order_test23(String s1) throws InterruptedException {
			webtest.click("xpath=(//li[@class=' wst-menuas'])[3]");
			Thread.sleep(200);
			webtest.type("id=userName", s1);
			Thread.sleep(200);
			webtest.click("xpath=//button[text()='查询']");
			Thread.sleep(200);
		}
}
