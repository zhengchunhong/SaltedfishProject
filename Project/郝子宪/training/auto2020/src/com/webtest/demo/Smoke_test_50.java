package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.freemarker.WebTestListenerFreemarker;

import bsh.org.objectweb.asm.Type;


/*
 * 第二组
 * 郝子宪
 * 注册、登录、找回密码模块
 * */

//@Listeners(WebTestListenerFreemarker.class)
public class Smoke_test_50 extends BaseTest{
	
	//打开页面
	@BeforeMethod
	public void open_URL() {
		webtest.open("http://localhost:88/");
	}
	
	
	//注册模块
	/*@Test
	public void test_open() {
		//webtest.open("http://localhost:88/");
		webtest.click("xpath＝//a[text()＝'免费注册']/r/n");
	}*/
	
	//1.验证正常注册流程（用户名为英文）
	@Test(priority=1)
	public void test_usernameisEnglish_regist() throws InterruptedException {
		webtest.click("link=免费注册");
		Thread.sleep(1000);
		webtest.type("id=loginName", "userhzx");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		webtest.click("link=退出");
		assertTrue(webtest.isTextPresent("该用户已存在"));
	}

	//2.验证注册流程（用户名为中文）
	@Test(priority=2)
	public void test_usernameisChinese_regist() throws InterruptedException {
		webtest.click("link=免费注册");
		Thread.sleep(1000);
		webtest.type("id=loginName", "郝子宪");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("用户名不能为空"));
	}
	
	//3.验证正常注册流程（用户名为邮箱）
	@Test(priority=3)
	public void test_usernameisEmail_regist() throws InterruptedException {
		webtest.click("link=免费注册");
		Thread.sleep(1000);
		webtest.type("id=loginName", "490886598@qq.com");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("首页"));
	}

	//4.验证正常注册流程（用户名为手机号）
	@Test(priority=4)
	public void test_usernameisPhonenumber_regist() throws InterruptedException {
		webtest.click("link=免费注册");
		Thread.sleep(1000);
		webtest.type("id=loginName", "13171659105");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("首页"));
	}

	//5.验证正常注册流程（密码为纯英文）
	@Test(priority=5)
	public void test_passwordisEnglish_regist() throws InterruptedException {
		webtest.click("link=免费注册");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user2");
		webtest.type("id=loginPwd", "hzxgwb");
		webtest.type("id=reUserPwd", "hzxgwb");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("首页"));
	}

	//6.验证正常注册流程（密码为纯符号）
	@Test(priority=6)
	public void test_passwordissymbols_regist() throws InterruptedException {
		webtest.click("link=免费注册");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user3");
		webtest.type("id=loginPwd", "@#￥%……&");
		webtest.type("id=reUserPwd", "@#￥%……&");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("首页"));
	}

	//7.验证正常注册流程（密码为数字、符号和英文）
	@Test(priority=7)
	public void test_passwordisRemix_regist() throws InterruptedException {
		webtest.click("link=免费注册");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user4");
		webtest.type("id=loginPwd", "hzxgwb123@");
		webtest.type("id=reUserPwd", "hzxgwb123@");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		webtest.click("link=退出");
		assertTrue(webtest.isTextPresent("首页"));
	}
	
	//8.验证用户名不合规范（邮箱错误）
	@Test(priority=8)
	public void test_EmailIsWrog_regist() throws InterruptedException {
		webtest.click("link=免费注册");
		Thread.sleep(1000);
		webtest.type("id=loginName", "490886232359@qq.com");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		webtest.click("link=退出");
		assertTrue(webtest.isTextPresent("首页"));
	}

	//9.验证正常注册
	@Test(priority=9)
	public void test_success_regist() throws InterruptedException {
		webtest.click("link=免费注册");
		Thread.sleep(1000);
		webtest.type("id=loginName", "users");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		webtest.click("link=退出");
		assertTrue(webtest.isTextPresent("首页"));
	}
	
	//10.验证用户名不合规范（手机号错误）
	@Test(priority=10)
	public void test_usernameisPhonenumberwasWrong_regist() throws InterruptedException {
		webtest.click("link=免费注册");
		Thread.sleep(1000);
		webtest.type("id=loginName", "13271659105");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		webtest.click("link=退出");
		assertTrue(webtest.isTextPresent("首页"));
	}

	//11.验证用户名不合规范
	@Test(priority=11)
	public void test_usernameisWrong_regist() throws InterruptedException {
		webtest.click("link=免费注册");
		Thread.sleep(1000);
		webtest.type("id=loginName", "132sdsdf");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("请填写用户名、手机号或者邮箱"));
	}
	

	//12.验证密码不合规范（少于6位）
	@Test(priority=12)
	public void test_psdisshort_regist() throws InterruptedException {
		webtest.click("link=免费注册");
		Thread.sleep(1000);
		webtest.type("id=loginName", "users");
		webtest.type("id=loginPwd", "12345");
		webtest.type("id=reUserPwd", "12345");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("请填写6-16位字符，不能包含空格"));
	}

	//13.验证密码不合规范（多于16位）
	@Test(priority=13)
	public void test_psdislong_regist() throws InterruptedException {
		webtest.click("link=免费注册");
		Thread.sleep(1000);
		webtest.type("id=loginName", "users");
		webtest.type("id=loginPwd", "12345123451234512345");
		webtest.type("id=reUserPwd", "12345123451234512345");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("请填写6-16位字符，不能包含空格"));
	}

	//14.验证密码不合规范（有空格）
	@Test(priority=14)
	public void test_psdhasblank_regist() throws InterruptedException {
		webtest.click("link=免费注册");
		Thread.sleep(1000);
		webtest.type("id=loginName", "users");
		webtest.type("id=loginPwd", "123 45 6");
		webtest.type("id=reUserPwd", "123 45 6");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("请填写6-16位字符，不能包含空格"));
	}

	//15.验证确认密码1
	@Test(priority=15)
	public void test_testpsd1_regist() throws InterruptedException {
		webtest.click("link=免费注册");
		Thread.sleep(1000);
		webtest.type("id=loginName", "users");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "1234567");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("确认密码与密码不一致"));
	}
	
	//16.验证确认密码2
	@Test(priority=16)
	public void test_testpsd2_regist() throws InterruptedException {
		webtest.click("link=免费注册");
		Thread.sleep(1000);
		webtest.type("id=loginName", "users");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "hzxgwb");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("确认密码与密码不一致"));
	}
	
	//17.验证确认密码(成功)
	@Test(priority=17)
	public void test_testpsdissuccess_regist() throws InterruptedException {
		webtest.click("link=免费注册");
		Thread.sleep(1000);
		webtest.type("id=loginName", "users");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		webtest.click("link=退出");
		assertTrue(webtest.isTextPresent("首页"));
	}
	
	//18.不选阅读并同意《用户注册协议》
	@Test(priority=18)
	public void test_no_regist() throws InterruptedException {
		webtest.click("link=免费注册");
		Thread.sleep(1000);
		webtest.type("id=loginName", "users");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		//webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("此处不能为空"));
	}

	//19.验证不填写用户名
	@Test(priority=19)
	public void test_usernameisnull_regist() throws InterruptedException {
		webtest.click("link=免费注册");
		Thread.sleep(1000);
		webtest.type("id=loginName", "");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("用户名不能为空"));
	}

	//20.验证不填写密码
	@Test(priority=20)
	public void test_psdisnull_regist() throws InterruptedException {
		webtest.click("link=免费注册");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user");
		webtest.type("id=loginPwd", "");
		webtest.type("id=reUserPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("密码不能为空"));
	}

	//21.验证不填写确认密码
	@Test(priority=21)
	public void test_testpsdisnull_regist() throws InterruptedException {
		webtest.click("link=免费注册");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("确认密码不能为空"));
	}
	
	//22.验证验证码为空
	@Test(priority=22)
	public void test_codeisnull_regist() throws InterruptedException {
		webtest.click("link=免费注册");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user34");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "123456");
		webtest.type("id=verifyCode", "");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("验证码不能为空"));
	}
	

	//登录模块
	//23.验证正常登录
	@Test(priority=23)
	public void test_Loginsuccess_regist() throws InterruptedException {
		webtest.click("link=请登录");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		webtest.click("link=退出");
		assertTrue(webtest.isTextPresent("首页"));
	}

	//24.验证用户名为空
	@Test(priority=24)
	public void test_LoginUsernameisNull_regist() throws InterruptedException {
		webtest.click("link=请登录");
		Thread.sleep(1000);
		webtest.type("id=loginName", "");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("请填写用户名"));
	}
	
	//25.验证密码为空
	@Test(priority=25)
	public void test_LoginPswisNull_regist() throws InterruptedException {
		webtest.click("link=请登录");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user");
		webtest.type("id=loginPwd", "");
		webtest.type("id=verifyCode", "1111");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		webtest.click("link=退出");
		assertTrue(webtest.isTextPresent("请填写密码"));
	}
	
	//26.验证验证码为空
	@Test(priority=26)
	public void test_LoginCodeisNull_regist() throws InterruptedException {
		webtest.click("link=请登录");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		webtest.click("link=退出");
		assertTrue(webtest.isTextPresent("请输入验证码"));
	}
	
	//27.验证验证码为空格
	@Test(priority=27)
	public void test_LoginCodeisblank_regist() throws InterruptedException {
		webtest.click("link=请登录");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "    ");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		webtest.click("link=退出");
		assertTrue(webtest.isTextPresent("请输入验证码"));
	}

	//28.验证验证码小于4位
	@Test(priority=28)
	public void test_CodeisShort_regist() throws InterruptedException {
		webtest.click("link=请登录");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "111");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		webtest.click("link=退出");
		assertTrue(webtest.isTextPresent("首页"));
	}
	
	//29.验证验证码大于4位
	@Test(priority=29)
	public void test_CodeisLong_regist() throws InterruptedException {
		webtest.click("link=请登录");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "1111111");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		webtest.click("link=退出");
		assertTrue(webtest.isTextPresent("首页"));
	}
	
	//30.验证填写验证码后点击“换一张”
	@Test(priority=30)
	public void test_ChangePicture_regist() throws InterruptedException {
		webtest.click("link=请登录");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("link=换一张");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		webtest.click("link=退出");
		assertTrue(webtest.isTextPresent("请输入验证码"));
	}
	
	//31.验证某个空用户
	@Test(priority=31)
	public void test_UserIsNull_regist() throws InterruptedException {
		webtest.click("link=请登录");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user122342443258");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("该用户不存在"));
	}

	//32.验证密码错误
	@Test(priority=32)
	public void test_PswIsWrong_regist() throws InterruptedException {
		webtest.click("link=请登录");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user");
		webtest.type("id=loginPwd", "12345678");
		webtest.type("id=verifyCode", "1111");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("密码错误"));
	}

	//33.验证登录流程（用户名为中文）
	@Test(priority=33)
	public void test_Login1_regist() throws InterruptedException {
		webtest.click("link=请登录");
		Thread.sleep(1000);
		webtest.type("id=loginName", "郝子宪");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("用户不存在"));
	}

	//34.验证正常登录流程（用户名为邮箱）
	@Test(priority=34)
	public void test_Login2_regist() throws InterruptedException {
		webtest.click("link=请登录");
		Thread.sleep(1000);
		webtest.type("id=loginName", "490886598@qq.com");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		webtest.click("link=退出");
		assertTrue(webtest.isTextPresent("首页"));
	}

	//35.验证正常登录流程（用户名为手机号）
	@Test(priority=35)
	public void test_Login3_regist() throws InterruptedException {
		webtest.click("link=请登录");
		Thread.sleep(1000);
		webtest.type("id=loginName", "13171659105");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		webtest.click("link=退出");
		assertTrue(webtest.isTextPresent("首页"));
	}

	//36.验证验证码为英文
	@Test(priority=36)
	public void test_LoginPswIsWrong_regist() throws InterruptedException {
		webtest.click("link=请登录");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "abcd");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		webtest.click("link=退出");
		assertTrue(webtest.isTextPresent("首页"));
	}
	

	
	//找回密码模块
	//37.验证用户名和验证码均正确
	@Test(priority=37)
	public void test_Allsuccess_regist() throws InterruptedException {
		webtest.click("link=请登录");
		Thread.sleep(1000);
		webtest.click("xpath=(//tr[@class='wst-login-tr']//a)[2]");
		webtest.type("id=loginName", "user");
		webtest.type("id=verifyCode", "1111");
		webtest.click("class=wst-regist-but forgetbtn1");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("验证身份"));
	}
	
	//38.验证用户名不合规范
	@Test(priority=38)
	public void test_usernameIsWrong_regist() throws InterruptedException {
		webtest.click("link=请登录");
		Thread.sleep(1000);
		webtest.click("xpath=(//tr[@class='wst-login-tr']//a)[2]");
		webtest.type("id=loginName", "55");
		webtest.type("id=verifyCode", "1111");
		webtest.click("class=wst-regist-but forgetbtn1");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("该用户不存在"));
	}

	//39.验证验证码（全为小写）
	@Test(priority=39)
	public void test_xiaoxie_regist() throws InterruptedException {
		webtest.click("link=请登录");
		Thread.sleep(1000);
		webtest.click("xpath=(//tr[@class='wst-login-tr']//a)[2]");
		webtest.type("id=loginName", "user");
		webtest.type("id=verifyCode", "aaaa");
		webtest.click("class=wst-regist-but forgetbtn1");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("验证码错误"));
	}

	//40.验证验证码（全为大写）
	@Test(priority=40)
	public void test_daxie_regist() throws InterruptedException {
		webtest.click("link=请登录");
		Thread.sleep(1000);
		webtest.click("xpath=(//tr[@class='wst-login-tr']//a)[2]");
		webtest.type("id=loginName", "user");
		webtest.type("id=verifyCode", "AAAA");
		webtest.click("class=wst-regist-but forgetbtn1");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("验证码错误"));
	}

	//41.验证验证码（填写空格）
	@Test(priority=41)
	public void test_kongge_regist() throws InterruptedException {
		webtest.click("link=请登录");
		Thread.sleep(1000);
		webtest.click("xpath=(//tr[@class='wst-login-tr']//a)[2]");
		webtest.type("id=loginName", "user");
		webtest.type("id=verifyCode", "    ");
		webtest.click("class=wst-regist-but forgetbtn1");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("验证码错误"));
	}
	
	//42.验证验证码为空
	@Test(priority=42)
	public void test_null_regist() throws InterruptedException {
		webtest.click("link=请登录");
		Thread.sleep(1000);
		webtest.click("xpath=(//tr[@class='wst-login-tr']//a)[2]");
		webtest.type("id=loginName", "user");
		webtest.type("id=verifyCode", "");
		webtest.click("class=wst-regist-but forgetbtn1");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("请输入验证码"));
	}
	
	//43.验证验证码小于4位
	@Test(priority=42)
	public void test_xiaoyu4_regist() throws InterruptedException {
		webtest.click("link=请登录");
		Thread.sleep(1000);
		webtest.click("xpath=(//tr[@class='wst-login-tr']//a)[2]");
		webtest.type("id=loginName", "user");
		webtest.type("id=verifyCode", "123");
		webtest.click("class=wst-regist-but forgetbtn1");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("请输入验证码"));
	}
	
	//44.验证验证码大于4位
	@Test(priority=42)
	public void test_dayu4_regist() throws InterruptedException {
		webtest.click("link=请登录");
		Thread.sleep(1000);
		webtest.click("xpath=(//tr[@class='wst-login-tr']//a)[2]");
		webtest.type("id=loginName", "user");
		webtest.type("id=verifyCode", "12345");
		webtest.click("class=wst-regist-but forgetbtn1");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("请输入验证码"));
	}

	//45.验证填写验证码后点击“换一张”
	@Test(priority=45)
	public void test_change_regist() throws InterruptedException {
		webtest.click("link=请登录");
		Thread.sleep(1000);
		webtest.click("xpath=(//tr[@class='wst-login-tr']//a)[2]");
		webtest.type("id=loginName", "user");
		webtest.type("id=verifyCode", "");
		webtest.click("class=wst-regist-but forgetbtn1");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("请输入验证码"));
	}

	//46.登录选择记住密码，再次登录不输入密码看是否登陆成功
	@Test(priority=46)
	public void test_RememberPsw_regist() throws InterruptedException {
		webtest.click("link=请登录");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "abcd");
		webtest.click("id=rememberPwd");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		webtest.click("link=退出");
		webtest.click("link=请登录");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user");
		webtest.type("id=verifyCode", "abcd");
		webtest.click("class=wst-login-but");
		assertTrue(webtest.isTextPresent("请输入密码"));
	}

	//47.注册时点击验证码图片换验证码看能否换成功
	@Test(priority=47)
	public void test_clickpicture_regist() throws InterruptedException {
		webtest.click("link=免费注册");
		Thread.sleep(1000);
		webtest.type("id=loginName", "userhzxxxxxxx");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=verifyImg");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("注册成功"));
	}
	
	//48.登录跳转至注册
	@Test(priority=48)
	public void test_skip_regist() throws InterruptedException {
		webtest.click("link=请登录");
		Thread.sleep(1000);
		webtest.click("link=免费注册");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("注册页面"));
	}
	
	//49.测试点击登录能否进入登录界面
	@Test(priority=49)
	public void test_Login_regist() throws InterruptedException {
		webtest.click("link=请登录");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("登录页面"));
	}
	
	
	//50.测试点击注册能否进入注册界面
	@Test(priority=50)
	public void test_post_regist() throws InterruptedException {
		webtest.click("link=免费注册");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("注册页面"));
	}


}
