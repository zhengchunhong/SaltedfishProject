package com.webtest.zchdemo;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.webtest.freemarker.WebTestListener;
import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;

/*
 * author:郑春宏
 * 模块：wstshop网上商城后台首页模块的修改店铺配置实现数据驱动
 */
@Listeners(WebTestListener.class)
public class zchExcelDataTest extends BaseTest {

	// 登录
	@BeforeMethod
	public void testLoginSuccess() throws InterruptedException {
		webtest.open("http://localhost/wstshop/admin/index/login.html");
//		webtest.type("id=loginName", "admin");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "1");
		webtest.click("xpath=//input[@type='button']");
		Thread.sleep(200);
		assertTrue(webtest.isTextPresent("登录"));
		Thread.sleep(200);
	}

	// 修改店铺配置
	@Test(dataProvider = "zch", dataProviderClass = NSDataProvider.class)
	public void test01(String s1) throws InterruptedException{
		webtest.click("xpath=//*[text()='店铺配置']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.typeAndClear("id=hotWordsSearch", s1);
		Thread.sleep(1000);
		webtest.click("xpath=//input[@value='保存']");
		Thread.sleep(800);
	}

}
