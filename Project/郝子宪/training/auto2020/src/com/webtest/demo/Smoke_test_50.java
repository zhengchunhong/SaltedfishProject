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
 * �ڶ���
 * ������
 * ע�ᡢ��¼���һ�����ģ��
 * */

//@Listeners(WebTestListenerFreemarker.class)
public class Smoke_test_50 extends BaseTest{
	
	//��ҳ��
	@BeforeMethod
	public void open_URL() {
		webtest.open("http://localhost:88/");
	}
	
	
	//ע��ģ��
	/*@Test
	public void test_open() {
		//webtest.open("http://localhost:88/");
		webtest.click("xpath��//a[text()��'���ע��']/r/n");
	}*/
	
	//1.��֤����ע�����̣��û���ΪӢ�ģ�
	@Test(priority=1)
	public void test_usernameisEnglish_regist() throws InterruptedException {
		webtest.click("link=���ע��");
		Thread.sleep(1000);
		webtest.type("id=loginName", "userhzx");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		webtest.click("link=�˳�");
		assertTrue(webtest.isTextPresent("���û��Ѵ���"));
	}

	//2.��֤ע�����̣��û���Ϊ���ģ�
	@Test(priority=2)
	public void test_usernameisChinese_regist() throws InterruptedException {
		webtest.click("link=���ע��");
		Thread.sleep(1000);
		webtest.type("id=loginName", "������");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("�û�������Ϊ��"));
	}
	
	//3.��֤����ע�����̣��û���Ϊ���䣩
	@Test(priority=3)
	public void test_usernameisEmail_regist() throws InterruptedException {
		webtest.click("link=���ע��");
		Thread.sleep(1000);
		webtest.type("id=loginName", "490886598@qq.com");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("��ҳ"));
	}

	//4.��֤����ע�����̣��û���Ϊ�ֻ��ţ�
	@Test(priority=4)
	public void test_usernameisPhonenumber_regist() throws InterruptedException {
		webtest.click("link=���ע��");
		Thread.sleep(1000);
		webtest.type("id=loginName", "13171659105");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("��ҳ"));
	}

	//5.��֤����ע�����̣�����Ϊ��Ӣ�ģ�
	@Test(priority=5)
	public void test_passwordisEnglish_regist() throws InterruptedException {
		webtest.click("link=���ע��");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user2");
		webtest.type("id=loginPwd", "hzxgwb");
		webtest.type("id=reUserPwd", "hzxgwb");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("��ҳ"));
	}

	//6.��֤����ע�����̣�����Ϊ�����ţ�
	@Test(priority=6)
	public void test_passwordissymbols_regist() throws InterruptedException {
		webtest.click("link=���ע��");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user3");
		webtest.type("id=loginPwd", "@#��%����&");
		webtest.type("id=reUserPwd", "@#��%����&");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("��ҳ"));
	}

	//7.��֤����ע�����̣�����Ϊ���֡����ź�Ӣ�ģ�
	@Test(priority=7)
	public void test_passwordisRemix_regist() throws InterruptedException {
		webtest.click("link=���ע��");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user4");
		webtest.type("id=loginPwd", "hzxgwb123@");
		webtest.type("id=reUserPwd", "hzxgwb123@");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		webtest.click("link=�˳�");
		assertTrue(webtest.isTextPresent("��ҳ"));
	}
	
	//8.��֤�û������Ϲ淶���������
	@Test(priority=8)
	public void test_EmailIsWrog_regist() throws InterruptedException {
		webtest.click("link=���ע��");
		Thread.sleep(1000);
		webtest.type("id=loginName", "490886232359@qq.com");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		webtest.click("link=�˳�");
		assertTrue(webtest.isTextPresent("��ҳ"));
	}

	//9.��֤����ע��
	@Test(priority=9)
	public void test_success_regist() throws InterruptedException {
		webtest.click("link=���ע��");
		Thread.sleep(1000);
		webtest.type("id=loginName", "users");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		webtest.click("link=�˳�");
		assertTrue(webtest.isTextPresent("��ҳ"));
	}
	
	//10.��֤�û������Ϲ淶���ֻ��Ŵ���
	@Test(priority=10)
	public void test_usernameisPhonenumberwasWrong_regist() throws InterruptedException {
		webtest.click("link=���ע��");
		Thread.sleep(1000);
		webtest.type("id=loginName", "13271659105");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		webtest.click("link=�˳�");
		assertTrue(webtest.isTextPresent("��ҳ"));
	}

	//11.��֤�û������Ϲ淶
	@Test(priority=11)
	public void test_usernameisWrong_regist() throws InterruptedException {
		webtest.click("link=���ע��");
		Thread.sleep(1000);
		webtest.type("id=loginName", "132sdsdf");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("����д�û������ֻ��Ż�������"));
	}
	

	//12.��֤���벻�Ϲ淶������6λ��
	@Test(priority=12)
	public void test_psdisshort_regist() throws InterruptedException {
		webtest.click("link=���ע��");
		Thread.sleep(1000);
		webtest.type("id=loginName", "users");
		webtest.type("id=loginPwd", "12345");
		webtest.type("id=reUserPwd", "12345");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("����д6-16λ�ַ������ܰ����ո�"));
	}

	//13.��֤���벻�Ϲ淶������16λ��
	@Test(priority=13)
	public void test_psdislong_regist() throws InterruptedException {
		webtest.click("link=���ע��");
		Thread.sleep(1000);
		webtest.type("id=loginName", "users");
		webtest.type("id=loginPwd", "12345123451234512345");
		webtest.type("id=reUserPwd", "12345123451234512345");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("����д6-16λ�ַ������ܰ����ո�"));
	}

	//14.��֤���벻�Ϲ淶���пո�
	@Test(priority=14)
	public void test_psdhasblank_regist() throws InterruptedException {
		webtest.click("link=���ע��");
		Thread.sleep(1000);
		webtest.type("id=loginName", "users");
		webtest.type("id=loginPwd", "123 45 6");
		webtest.type("id=reUserPwd", "123 45 6");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("����д6-16λ�ַ������ܰ����ո�"));
	}

	//15.��֤ȷ������1
	@Test(priority=15)
	public void test_testpsd1_regist() throws InterruptedException {
		webtest.click("link=���ע��");
		Thread.sleep(1000);
		webtest.type("id=loginName", "users");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "1234567");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("ȷ�����������벻һ��"));
	}
	
	//16.��֤ȷ������2
	@Test(priority=16)
	public void test_testpsd2_regist() throws InterruptedException {
		webtest.click("link=���ע��");
		Thread.sleep(1000);
		webtest.type("id=loginName", "users");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "hzxgwb");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("ȷ�����������벻һ��"));
	}
	
	//17.��֤ȷ������(�ɹ�)
	@Test(priority=17)
	public void test_testpsdissuccess_regist() throws InterruptedException {
		webtest.click("link=���ע��");
		Thread.sleep(1000);
		webtest.type("id=loginName", "users");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		webtest.click("link=�˳�");
		assertTrue(webtest.isTextPresent("��ҳ"));
	}
	
	//18.��ѡ�Ķ���ͬ�⡶�û�ע��Э�顷
	@Test(priority=18)
	public void test_no_regist() throws InterruptedException {
		webtest.click("link=���ע��");
		Thread.sleep(1000);
		webtest.type("id=loginName", "users");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		//webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("�˴�����Ϊ��"));
	}

	//19.��֤����д�û���
	@Test(priority=19)
	public void test_usernameisnull_regist() throws InterruptedException {
		webtest.click("link=���ע��");
		Thread.sleep(1000);
		webtest.type("id=loginName", "");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("�û�������Ϊ��"));
	}

	//20.��֤����д����
	@Test(priority=20)
	public void test_psdisnull_regist() throws InterruptedException {
		webtest.click("link=���ע��");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user");
		webtest.type("id=loginPwd", "");
		webtest.type("id=reUserPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("���벻��Ϊ��"));
	}

	//21.��֤����дȷ������
	@Test(priority=21)
	public void test_testpsdisnull_regist() throws InterruptedException {
		webtest.click("link=���ע��");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("ȷ�����벻��Ϊ��"));
	}
	
	//22.��֤��֤��Ϊ��
	@Test(priority=22)
	public void test_codeisnull_regist() throws InterruptedException {
		webtest.click("link=���ע��");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user34");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "123456");
		webtest.type("id=verifyCode", "");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("��֤�벻��Ϊ��"));
	}
	

	//��¼ģ��
	//23.��֤������¼
	@Test(priority=23)
	public void test_Loginsuccess_regist() throws InterruptedException {
		webtest.click("link=���¼");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		webtest.click("link=�˳�");
		assertTrue(webtest.isTextPresent("��ҳ"));
	}

	//24.��֤�û���Ϊ��
	@Test(priority=24)
	public void test_LoginUsernameisNull_regist() throws InterruptedException {
		webtest.click("link=���¼");
		Thread.sleep(1000);
		webtest.type("id=loginName", "");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("����д�û���"));
	}
	
	//25.��֤����Ϊ��
	@Test(priority=25)
	public void test_LoginPswisNull_regist() throws InterruptedException {
		webtest.click("link=���¼");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user");
		webtest.type("id=loginPwd", "");
		webtest.type("id=verifyCode", "1111");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		webtest.click("link=�˳�");
		assertTrue(webtest.isTextPresent("����д����"));
	}
	
	//26.��֤��֤��Ϊ��
	@Test(priority=26)
	public void test_LoginCodeisNull_regist() throws InterruptedException {
		webtest.click("link=���¼");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		webtest.click("link=�˳�");
		assertTrue(webtest.isTextPresent("��������֤��"));
	}
	
	//27.��֤��֤��Ϊ�ո�
	@Test(priority=27)
	public void test_LoginCodeisblank_regist() throws InterruptedException {
		webtest.click("link=���¼");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "    ");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		webtest.click("link=�˳�");
		assertTrue(webtest.isTextPresent("��������֤��"));
	}

	//28.��֤��֤��С��4λ
	@Test(priority=28)
	public void test_CodeisShort_regist() throws InterruptedException {
		webtest.click("link=���¼");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "111");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		webtest.click("link=�˳�");
		assertTrue(webtest.isTextPresent("��ҳ"));
	}
	
	//29.��֤��֤�����4λ
	@Test(priority=29)
	public void test_CodeisLong_regist() throws InterruptedException {
		webtest.click("link=���¼");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "1111111");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		webtest.click("link=�˳�");
		assertTrue(webtest.isTextPresent("��ҳ"));
	}
	
	//30.��֤��д��֤���������һ�š�
	@Test(priority=30)
	public void test_ChangePicture_regist() throws InterruptedException {
		webtest.click("link=���¼");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("link=��һ��");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		webtest.click("link=�˳�");
		assertTrue(webtest.isTextPresent("��������֤��"));
	}
	
	//31.��֤ĳ�����û�
	@Test(priority=31)
	public void test_UserIsNull_regist() throws InterruptedException {
		webtest.click("link=���¼");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user122342443258");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("���û�������"));
	}

	//32.��֤�������
	@Test(priority=32)
	public void test_PswIsWrong_regist() throws InterruptedException {
		webtest.click("link=���¼");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user");
		webtest.type("id=loginPwd", "12345678");
		webtest.type("id=verifyCode", "1111");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("�������"));
	}

	//33.��֤��¼���̣��û���Ϊ���ģ�
	@Test(priority=33)
	public void test_Login1_regist() throws InterruptedException {
		webtest.click("link=���¼");
		Thread.sleep(1000);
		webtest.type("id=loginName", "������");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("�û�������"));
	}

	//34.��֤������¼���̣��û���Ϊ���䣩
	@Test(priority=34)
	public void test_Login2_regist() throws InterruptedException {
		webtest.click("link=���¼");
		Thread.sleep(1000);
		webtest.type("id=loginName", "490886598@qq.com");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		webtest.click("link=�˳�");
		assertTrue(webtest.isTextPresent("��ҳ"));
	}

	//35.��֤������¼���̣��û���Ϊ�ֻ��ţ�
	@Test(priority=35)
	public void test_Login3_regist() throws InterruptedException {
		webtest.click("link=���¼");
		Thread.sleep(1000);
		webtest.type("id=loginName", "13171659105");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		webtest.click("link=�˳�");
		assertTrue(webtest.isTextPresent("��ҳ"));
	}

	//36.��֤��֤��ΪӢ��
	@Test(priority=36)
	public void test_LoginPswIsWrong_regist() throws InterruptedException {
		webtest.click("link=���¼");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "abcd");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		webtest.click("link=�˳�");
		assertTrue(webtest.isTextPresent("��ҳ"));
	}
	

	
	//�һ�����ģ��
	//37.��֤�û�������֤�����ȷ
	@Test(priority=37)
	public void test_Allsuccess_regist() throws InterruptedException {
		webtest.click("link=���¼");
		Thread.sleep(1000);
		webtest.click("xpath=(//tr[@class='wst-login-tr']//a)[2]");
		webtest.type("id=loginName", "user");
		webtest.type("id=verifyCode", "1111");
		webtest.click("class=wst-regist-but forgetbtn1");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("��֤���"));
	}
	
	//38.��֤�û������Ϲ淶
	@Test(priority=38)
	public void test_usernameIsWrong_regist() throws InterruptedException {
		webtest.click("link=���¼");
		Thread.sleep(1000);
		webtest.click("xpath=(//tr[@class='wst-login-tr']//a)[2]");
		webtest.type("id=loginName", "55");
		webtest.type("id=verifyCode", "1111");
		webtest.click("class=wst-regist-but forgetbtn1");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("���û�������"));
	}

	//39.��֤��֤�루ȫΪСд��
	@Test(priority=39)
	public void test_xiaoxie_regist() throws InterruptedException {
		webtest.click("link=���¼");
		Thread.sleep(1000);
		webtest.click("xpath=(//tr[@class='wst-login-tr']//a)[2]");
		webtest.type("id=loginName", "user");
		webtest.type("id=verifyCode", "aaaa");
		webtest.click("class=wst-regist-but forgetbtn1");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("��֤�����"));
	}

	//40.��֤��֤�루ȫΪ��д��
	@Test(priority=40)
	public void test_daxie_regist() throws InterruptedException {
		webtest.click("link=���¼");
		Thread.sleep(1000);
		webtest.click("xpath=(//tr[@class='wst-login-tr']//a)[2]");
		webtest.type("id=loginName", "user");
		webtest.type("id=verifyCode", "AAAA");
		webtest.click("class=wst-regist-but forgetbtn1");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("��֤�����"));
	}

	//41.��֤��֤�루��д�ո�
	@Test(priority=41)
	public void test_kongge_regist() throws InterruptedException {
		webtest.click("link=���¼");
		Thread.sleep(1000);
		webtest.click("xpath=(//tr[@class='wst-login-tr']//a)[2]");
		webtest.type("id=loginName", "user");
		webtest.type("id=verifyCode", "    ");
		webtest.click("class=wst-regist-but forgetbtn1");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("��֤�����"));
	}
	
	//42.��֤��֤��Ϊ��
	@Test(priority=42)
	public void test_null_regist() throws InterruptedException {
		webtest.click("link=���¼");
		Thread.sleep(1000);
		webtest.click("xpath=(//tr[@class='wst-login-tr']//a)[2]");
		webtest.type("id=loginName", "user");
		webtest.type("id=verifyCode", "");
		webtest.click("class=wst-regist-but forgetbtn1");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("��������֤��"));
	}
	
	//43.��֤��֤��С��4λ
	@Test(priority=42)
	public void test_xiaoyu4_regist() throws InterruptedException {
		webtest.click("link=���¼");
		Thread.sleep(1000);
		webtest.click("xpath=(//tr[@class='wst-login-tr']//a)[2]");
		webtest.type("id=loginName", "user");
		webtest.type("id=verifyCode", "123");
		webtest.click("class=wst-regist-but forgetbtn1");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("��������֤��"));
	}
	
	//44.��֤��֤�����4λ
	@Test(priority=42)
	public void test_dayu4_regist() throws InterruptedException {
		webtest.click("link=���¼");
		Thread.sleep(1000);
		webtest.click("xpath=(//tr[@class='wst-login-tr']//a)[2]");
		webtest.type("id=loginName", "user");
		webtest.type("id=verifyCode", "12345");
		webtest.click("class=wst-regist-but forgetbtn1");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("��������֤��"));
	}

	//45.��֤��д��֤���������һ�š�
	@Test(priority=45)
	public void test_change_regist() throws InterruptedException {
		webtest.click("link=���¼");
		Thread.sleep(1000);
		webtest.click("xpath=(//tr[@class='wst-login-tr']//a)[2]");
		webtest.type("id=loginName", "user");
		webtest.type("id=verifyCode", "");
		webtest.click("class=wst-regist-but forgetbtn1");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("��������֤��"));
	}

	//46.��¼ѡ���ס���룬�ٴε�¼���������뿴�Ƿ��½�ɹ�
	@Test(priority=46)
	public void test_RememberPsw_regist() throws InterruptedException {
		webtest.click("link=���¼");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=verifyCode", "abcd");
		webtest.click("id=rememberPwd");
		webtest.click("class=wst-login-but");
		Thread.sleep(1000);
		webtest.click("link=�˳�");
		webtest.click("link=���¼");
		Thread.sleep(1000);
		webtest.type("id=loginName", "user");
		webtest.type("id=verifyCode", "abcd");
		webtest.click("class=wst-login-but");
		assertTrue(webtest.isTextPresent("����������"));
	}

	//47.ע��ʱ�����֤��ͼƬ����֤�뿴�ܷ񻻳ɹ�
	@Test(priority=47)
	public void test_clickpicture_regist() throws InterruptedException {
		webtest.click("link=���ע��");
		Thread.sleep(1000);
		webtest.type("id=loginName", "userhzxxxxxxx");
		webtest.type("id=loginPwd", "123456");
		webtest.type("id=reUserPwd", "123456");
		webtest.type("id=verifyCode", "1111");
		webtest.click("id=verifyImg");
		webtest.click("id=protocol");
		webtest.click("id=reg_butt");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("ע��ɹ�"));
	}
	
	//48.��¼��ת��ע��
	@Test(priority=48)
	public void test_skip_regist() throws InterruptedException {
		webtest.click("link=���¼");
		Thread.sleep(1000);
		webtest.click("link=���ע��");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("ע��ҳ��"));
	}
	
	//49.���Ե����¼�ܷ�����¼����
	@Test(priority=49)
	public void test_Login_regist() throws InterruptedException {
		webtest.click("link=���¼");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("��¼ҳ��"));
	}
	
	
	//50.���Ե��ע���ܷ����ע�����
	@Test(priority=50)
	public void test_post_regist() throws InterruptedException {
		webtest.click("link=���ע��");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("ע��ҳ��"));
	}


}
