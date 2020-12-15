package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;

public class ExcelDemo extends BaseTest{
	
		//打开页面
		@BeforeMethod
		public void open_URL() {
			webtest.open("http://localhost:88/");
		}
		
		//1.验证正常注册流程（用户名为英文）
		@Test(dataProvider="wstshop",dataProviderClass=NSDataProvider.class)
		public void test_usernameisEnglish_regist(String s1,String s2,String s3) throws InterruptedException {
			webtest.click("link=请登录");
			Thread.sleep(1000);
			webtest.type("id=loginName", s1);
			webtest.type("id=loginPwd", s2);
			webtest.type("id=verifyCode", s3);
			webtest.click("class=wst-login-but");
			Thread.sleep(1000);
			assertTrue(webtest.isTextPresent("首页"));
		}


}

