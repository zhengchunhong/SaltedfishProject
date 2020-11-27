package com.webtest.demo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;

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
			webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");
			Thread.sleep(200);
		}

		@Test(dataProvider = "wstshop",dataProviderClass = NSDataProvider.class)
		public void order_test01(String s1) throws InterruptedException {
			System.out.println("数据 test");
			webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[4]");
			Thread.sleep(200);
			webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[2]/tr[3]/td[4]/div[1]/a");
			Thread.sleep(200);
			webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/form/div/div[2]/div[1]/div[2]/div[1]/img[5]");
			Thread.sleep(200);
			webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/form/div/div[2]/div[3]/div[2]/div[1]/img[5]");
			Thread.sleep(200);
			webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/form/div/div[2]/div[5]/div[2]/div[1]/img[5]");
			Thread.sleep(200);
			webtest.type("id=content1", s1);
			Thread.sleep(200);
			webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/form/div/div[2]/div[10]/div[4]/div[3]/button");
			Thread.sleep(200);
		}
}
