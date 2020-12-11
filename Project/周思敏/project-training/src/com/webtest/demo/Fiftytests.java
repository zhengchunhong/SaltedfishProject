package com.webtest.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

/*
 * ��˼��
 * ��̨����ϵͳ�ж���/��Ʒ/��Ӫ����
 */

public class Fiftytests extends BaseTest {

	@BeforeMethod
	public void testLogin() throws InterruptedException {
		// ��½�ɹ��ǲ���ǰ��
		webtest.open("http://localhost/wstshop_3.0.0/admin/index/login.html");
		webtest.type("id=loginPwd", "admin");
		webtest.type("id=verifyCode", "1111");
		webtest.click("xpath=//input[@type='button']");
		Thread.sleep(200);
	}

	@Test(priority = 1)
	public void test1() throws InterruptedException {
		// ��Ӫ����-�Ƽ�����-��Ʒ�Ƽ����ɹ�����Ʒ�����Ƽ�
		WebElement selector;
		webtest.click("xpath=//*[text()='��Ӫ����']");
		webtest.click("xpath=//*[text()='��Ʒ�Ƽ�']");
		driver.switchTo().frame("wst-lframe-56");
		selector = driver.findElement(By.id("cat12_0"));
		Select select = new Select(selector);
		select.selectByValue("47");
		webtest.click("xpath=//input[@value='����']");
		webtest.click("xpath=(//input[@name='lchk_2'])[1]");
		webtest.click("xpath=(//input[@type='button'])[2]");
		webtest.click("xpath=//input[@value='����']");
	}

	@Test(priority = 2)
	public void test2() throws InterruptedException {
		// ��Ӫ����-�Ƽ�����-Ʒ���Ƽ����ɹ���Ʒ�ƽ����Ƽ�
		WebElement selector;
		webtest.click("xpath=//*[text()='��Ӫ����']");
		webtest.click("xpath=//*[text()='Ʒ���Ƽ�']");
		driver.switchTo().frame("wst-lframe-56");
		selector = driver.findElement(By.id("cat12_0"));
		Select select = new Select(selector);
		select.selectByValue("47");
		webtest.click("xpath=//input[@value='����']");
		webtest.click("xpath=(//input[@name='lchk_2'])[1]");
		webtest.click("xpath=(//input[@type='button'])[2]");
		webtest.click("xpath=//input[@value='����']");
	}

	@Test(priority = 3)
	public void test3() throws InterruptedException {
		// ��Ӫ����-�������-�������룬�������ֵ��Ž��в�ѯ
		webtest.click("xpath=//*[text()='��Ӫ����']");
		webtest.click("xpath=//*[text()='�������']");
		webtest.click("xpath=//*[text()='��������']");
		driver.switchTo().frame("wst-lframe-56");
		webtest.type("id=cashNo", "123456");
		webtest.click("xpath=//input[@type='button']");
	}

	@Test(priority = 4)
	public void test4() throws InterruptedException {
		// ��Ӫ����-�������-�������룬��������״̬Ϊ��������в�ѯ
		WebElement selector;
		webtest.click("xpath=//*[text()='��Ӫ����']");
		webtest.click("xpath=//*[text()='�������']");
		webtest.click("xpath=//*[text()='��������']");
		driver.switchTo().frame("wst-lframe-56");
		Thread.sleep(2000);
		selector = driver.findElement(By.id("cashSatus"));
		Select select = new Select(selector);
		select.selectByValue("0");
		Thread.sleep(200);
		webtest.click("xpath=//input[@type='button']");
		Thread.sleep(2000);
	}

	@Test(priority = 5)
	public void test5() throws InterruptedException {
		// ��Ӫ����-�������-�������룬��������״̬Ϊ��ͨ�����в�ѯ
		WebElement selector;
		webtest.click("xpath=//*[text()='��Ӫ����']");
		webtest.click("xpath=//*[text()='�������']");
		webtest.click("xpath=//*[text()='��������']");
		driver.switchTo().frame("wst-lframe-56");
		Thread.sleep(2000);
		selector = driver.findElement(By.id("cashSatus"));
		Select select = new Select(selector);
		select.selectByValue("1");
		Thread.sleep(200);
		webtest.click("xpath=//input[@type='button']");
		Thread.sleep(2000);
	}

	@Test(priority = 6)
	public void test6() throws InterruptedException {
		// ��Ӫ����-�������-�������룬�����·�ÿҳ��ʾҳ��Ϊ50��
		WebElement selector;
		webtest.click("xpath=//*[text()='��Ӫ����']");
		webtest.click("xpath=//*[text()='�������']");
		webtest.click("xpath=//*[text()='��������']");
		driver.switchTo().frame("wst-lframe-56");
		Thread.sleep(2000);
		selector = driver.findElement(By.xpath("//div[@class='l-bar-group l-bar-selectpagesize']//select[1]"));
		Select select = new Select(selector);
		select.selectByValue("50");
		Thread.sleep(2000);
	}

	@Test(priority = 7)
	public void test7() throws InterruptedException {
		// ��Ӫ����-�������-�������룬�����·�ÿҳ��ʾҳ��Ϊ100��
		WebElement selector;
		webtest.click("xpath=//*[text()='��Ӫ����']");
		webtest.click("xpath=//*[text()='�������']");
		webtest.click("xpath=//*[text()='��������']");
		driver.switchTo().frame("wst-lframe-56");
		Thread.sleep(2000);
		selector = driver.findElement(By.xpath("//div[@class='l-bar-group l-bar-selectpagesize']//select[1]"));
		Select select = new Select(selector);
		select.selectByValue("100");
		Thread.sleep(2000);
	}

	@Test(priority = 8)
	public void test8() throws InterruptedException {
		// ��Ӫ����-�������-�������룬�����·�ÿҳ��ʾҳ��Ϊ150��
		WebElement selector;
		webtest.click("xpath=//*[text()='��Ӫ����']");
		webtest.click("xpath=//*[text()='�������']");
		webtest.click("xpath=//*[text()='��������']");
		driver.switchTo().frame("wst-lframe-56");
		Thread.sleep(2000);
		selector = driver.findElement(By.xpath("//div[@class='l-bar-group l-bar-selectpagesize']//select[1]"));
		Select select = new Select(selector);
		select.selectByValue("150");
		Thread.sleep(2000);
	}

	@Test(priority = 9)
	public void test9() throws InterruptedException {
		// ��Ӫ����-�������-�������룬�����·�ÿҳ��ʾҳ��Ϊ200��
		WebElement selector;
		webtest.click("xpath=//*[text()='��Ӫ����']");
		webtest.click("xpath=//*[text()='�������']");
		webtest.click("xpath=//*[text()='��������']");
		driver.switchTo().frame("wst-lframe-56");
		selector = driver.findElement(By.xpath("//div[@class='l-bar-group l-bar-selectpagesize']//select[1]"));
		Select select = new Select(selector);
		select.selectByValue("200");
	}

	@Test(priority = 10)
	public void test10() throws InterruptedException {
		// ��������-���������������붩����Ž��в�ѯ
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='����������']");
		driver.switchTo().frame("wst-lframe-35");
		webtest.type("id=orderNo", "100000176");
		webtest.click("xpath=//*[text()='��ѯ']");
	}

	@Test(priority = 11)
	public void test11() throws InterruptedException {
		// ��������-���������������ĸ��ʽΪȫ�����в�ѯ
		WebElement selector;
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='����������']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("payType"));
		Select select = new Select(selector);
		select.selectByValue("-1");
		webtest.click("xpath=//*[text()='��ѯ']");
	}

	@Test(priority = 12)
	public void test12() throws InterruptedException {
		// ��������-���������������ĸ��ʽΪ����������в�ѯ
		WebElement selector;
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='����������']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("payType"));
		Select select = new Select(selector);
		select.selectByValue("0");
		webtest.click("xpath=//*[text()='��ѯ']");
	}

	@Test(priority = 13)
	public void test13() throws InterruptedException {
		// ��������-���������������ĸ��ʽΪ����֧�����в�ѯ
		WebElement selector;
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='����������']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("payType"));
		Select select = new Select(selector);
		select.selectByValue("1");
		webtest.click("xpath=//*[text()='��ѯ']");
	}

	@Test(priority = 14)
	public void test14() throws InterruptedException {
		// ��������-�������������������ͷ�ʽΪȫ�����в�ѯ
		WebElement selector;
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='����������']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("deliverType"));
		Select select = new Select(selector);
		select.selectByValue("-1");
		webtest.click("xpath=//*[text()='��ѯ']");
	}

	@Test(priority = 15)
	public void test15() throws InterruptedException {
		// ��������-�������������������ͷ�ʽΪ������в�ѯ
		WebElement selector;
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='����������']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("deliverType"));
		Select select = new Select(selector);
		select.selectByValue("0");
		webtest.click("xpath=//*[text()='��ѯ']");
	}

	@Test(priority = 16)
	public void test16() throws InterruptedException {
		// ��������-�������������������ͷ�ʽΪ�ͻ����Ž��в�ѯ
		WebElement selector;
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='����������']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("deliverType"));
		Select select = new Select(selector);
		select.selectByValue("1");
		webtest.click("xpath=//*[text()='��ѯ']");
	}

	@Test(priority = 17)
	public void test17() throws InterruptedException {
		// ��������-������������ɾ���б��еĶ���
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='����������']");
		driver.switchTo().frame("wst-lframe-35");
		webtest.click("xpath=(//table[@class='l-grid-body-table']/following::table)[2]");
		webtest.click("xpath=//div[@class='layui-layer-btn']//a[1]");
		Thread.sleep(2000);
	}

	@Test(priority = 18)
	public void test18() throws InterruptedException {
		// ��������-�����������������б��еĶ��������ͷ�ʽΪ�ͻ����ţ������ѡ��˳���ݣ������붩����
		WebElement selector;
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='����������']");
		driver.switchTo().frame("wst-lframe-35");
		webtest.click("xpath=(//table[@class='l-grid-body-table']/following::table)[2]");
		selector = driver.findElement(By.id("expressId"));
		Select select = new Select(selector);
		select.selectByValue("1");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='layui-layer-btn']//a[1]");
		Thread.sleep(2000);
	}

	@Test(priority = 19)
	public void test19() throws InterruptedException {
		// ��������-�����������������б��еĶ��������ͷ�ʽΪ�ͻ����ţ�����ѡ���ݣ����붩����123456
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='����������']");
		driver.switchTo().frame("wst-lframe-35");
		webtest.click("xpath=(//table[@class='l-grid-body-table']/following::table)[2]");
		webtest.type("id=expressNo", "123456");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='layui-layer-btn']//a[1]");
		Thread.sleep(2000);
	}

	@Test(priority = 20)
	public void test20() throws InterruptedException {
		// ��������-�����������������б��еĶ��������ͷ�ʽΪ�ͻ����ţ������ѡ��˳���ݣ����붩����Ϊ123456
		WebElement selector;
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='����������']");
		driver.switchTo().frame("wst-lframe-35");
		webtest.click("xpath=(//table[@class='l-grid-body-table']/following::table)[2]");
		selector = driver.findElement(By.id("expressId"));
		Select select = new Select(selector);
		select.selectByValue("1");
		Thread.sleep(200);
		webtest.type("id=expressNo", "123456");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='layui-layer-btn']//a[1]");
		Thread.sleep(2000);
	}

	@Test(priority = 21)
	public void test21() throws InterruptedException {
		// ��������-�������������鿴�������鲢����
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='����������']");
		driver.switchTo().frame("wst-lframe-35");
		webtest.click("xpath=(//div[@class='l-grid-row-cell-inner']//a)[1]");
		Thread.sleep(200);
		webtest.click("xpath=//input[@type='button']");
		Thread.sleep(2000);
	}

//	@Test
//	public void test22() throws InterruptedException {
//		//��������-�����������������б��еĶ��������ͷ�ʽΪ���ᣩ
//		webtest.click("xpath=//*[text()='��������']");
//	    webtest.click("xpath=//*[text()='����������']");
//		driver.switchTo().frame("wst-lframe-35");
//		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[9]/div/a[2]");
//		Thread.sleep(2000);
//		webtest.click("xpath=/html/body/div[5]/div[3]/a[1]");
//		Thread.sleep(2000);	
//	}

	@Test(priority = 22)
	public void test23() throws InterruptedException {
		// ��������-������������붩����ŵ����ѯ
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='�������']");
		driver.switchTo().frame("wst-lframe-35");
		webtest.type("id=orderNo", "123456");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='��ѯ']");
		Thread.sleep(2000);
	}

	@Test(priority = 23)
	public void test24() throws InterruptedException {
		// ��������-���������ѡ�����ͷ�ʽΪ���ᣬ�����ѯ
		WebElement selector;
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='�������']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("deliverType"));
		Select select = new Select(selector);
		select.selectByValue("1");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='��ѯ']");
		Thread.sleep(2000);
	}

	@Test(priority = 24)
	public void test25() throws InterruptedException {
		// ��������-���������ѡ�����ͷ�ʽΪ�ͻ����ţ������ѯ
		WebElement selector;
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='�������']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("deliverType"));
		Select select = new Select(selector);
		select.selectByValue("0");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='��ѯ']");
		Thread.sleep(2000);
	}

	@Test(priority = 25)
	public void test26() throws InterruptedException {
		// ��������-�ѷ������������붩����ţ������ѯ
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='�ѷ�������']");
		driver.switchTo().frame("wst-lframe-35");
		webtest.type("id=orderNo", "100000294");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='��ѯ']");
		Thread.sleep(2000);
	}

	@Test(priority = 26)
	public void test27() throws InterruptedException {
		// ��������-�ѷ�������������֧����ʽΪ�ͻ����ţ������ѯ
		WebElement selector;
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='�ѷ�������']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("payType"));
		Select select = new Select(selector);
		select.selectByValue("0");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='��ѯ']");
		Thread.sleep(2000);
	}

	@Test(priority = 27)
	public void test28() throws InterruptedException {
		// ��������-�ѷ�������������֧����ʽΪ����֧���������ѯ
		WebElement selector;
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='�ѷ�������']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("payType"));
		Select select = new Select(selector);
		select.selectByValue("1");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='��ѯ']");
		Thread.sleep(2000);
	}

	@Test(priority = 28)
	public void test29() throws InterruptedException {
		// ��������-�ѷ����������������ͷ�ʽΪ���ᣬ�����ѯ
		WebElement selector;
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='�ѷ�������']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("deliverType"));
		Select select = new Select(selector);
		select.selectByValue("1");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='��ѯ']");
		Thread.sleep(2000);
	}

	@Test(priority = 29)
	public void test30() throws InterruptedException {
		// ��������-�ѷ����������������ͷ�ʽΪ�ͻ����ţ������ѯ
		WebElement selector;
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='�ѷ�������']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("deliverType"));
		Select select = new Select(selector);
		select.selectByValue("0");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='��ѯ']");
		Thread.sleep(2000);
	}

	@Test(priority = 30)
	public void test31() throws InterruptedException {
		// ��������-�ѷ��������������Ʒ����Ȼ�󷵻�
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='�ѷ�������']");
		driver.switchTo().frame("wst-lframe-35");
		webtest.click("xpath=(//div[@class='l-grid-row-cell-inner']//a)[1]");
		Thread.sleep(2000);
		webtest.click("xpath=//input[@type='button']");
		Thread.sleep(2000);
	}

	@Test(priority = 31)
	public void test32() throws InterruptedException {
		// ��������-�ѷ���������ɾ����Ʒ���ڵ����Ľ���ѡ��ȡ��
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='�ѷ�������']");
		driver.switchTo().frame("wst-lframe-35");
		webtest.click("xpath=(//div[@class='l-grid-row-cell-inner']//a)[2]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='layui-layer-btn']//a)[2]");
		Thread.sleep(2000);
	}

	@Test(priority = 32)
	public void test33() throws InterruptedException {
		// ��������-ȡ��/���ն��������붩����Ž��в�ѯ
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='ȡ��/���ն���']");
		driver.switchTo().frame("wst-lframe-35");
		webtest.type("id=orderNo", "100000143");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='��ѯ']");
		Thread.sleep(2000);
	}

	@Test(priority = 33)
	public void test34() throws InterruptedException {
		// ��������-ȡ��/���ն��������Ķ���״̬Ϊ��ȡ������ѯ
		WebElement selector;
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='ȡ��/���ն���']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("orderStatus"));
		Select select = new Select(selector);
		select.selectByValue("-1");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='��ѯ']");
		Thread.sleep(2000);
	}

	@Test(priority = 34)
	public void test35() throws InterruptedException {
		// ��������-ȡ��/���ն��������Ķ���״̬Ϊ�û����գ���ѯ
		WebElement selector;
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='ȡ��/���ն���']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("orderStatus"));
		Select select = new Select(selector);
		select.selectByValue("-3");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='��ѯ']");
		Thread.sleep(2000);
	}

	@Test(priority = 35)
	public void test36() throws InterruptedException {
		// ��������-ȡ��/���ն���������֧����ʽΪ���������ѯ
		WebElement selector;
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='ȡ��/���ն���']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("payType"));
		Select select = new Select(selector);
		select.selectByValue("0");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='��ѯ']");
		Thread.sleep(2000);
	}

	@Test(priority = 36)
	public void test37() throws InterruptedException {
		// ��������-ȡ��/���ն���������֧����ʽΪ����֧������ѯ
		WebElement selector;
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='ȡ��/���ն���']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("payType"));
		Select select = new Select(selector);
		select.selectByValue("1");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='��ѯ']");
		Thread.sleep(2000);
	}

	@Test(priority = 37)
	public void test38() throws InterruptedException {
		// ��������-ȡ��/���ն������������ͷ�ʽΪ���ᣬ��ѯ
		WebElement selector;
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='ȡ��/���ն���']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("deliverType"));
		Select select = new Select(selector);
		select.selectByValue("1");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='��ѯ']");
		Thread.sleep(2000);
	}

	@Test(priority = 38)
	public void test39() throws InterruptedException {
		// ��������-ȡ��/���ն������������ͷ�ʽΪ�ͻ����ţ���ѯ
		WebElement selector;
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='ȡ��/���ն���']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("deliverType"));
		Select select = new Select(selector);
		select.selectByValue("0");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='��ѯ']");
		Thread.sleep(2000);
	}

	@Test(priority = 39)
	public void test40() throws InterruptedException {
		// ��������-���ջ����������붩����Ž��в�ѯ
		webtest.click("xpath=//*[text()='��������']");
		webtest.click("xpath=//*[text()='���ջ�����']");
		driver.switchTo().frame("wst-lframe-35");
		webtest.type("id=orderNo", "100000110");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='��ѯ']");
		Thread.sleep(2000);
	}

	@Test(priority = 40)
	public void test41() throws InterruptedException {
		// ��Ʒ����-������Ʒ��������������ѡ��ʱ��ˮ�������ϲ˳��������в�ѯ
		WebElement selector;
		webtest.click("xpath=//*[text()='��Ʒ����']");
		webtest.click("xpath=//*[text()='������Ʒ']");
		driver.switchTo().frame("wst-lframe-22");
		selector = driver.findElement(By.id("cat_0"));
		Select select = new Select(selector);
		select.selectByValue("47");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='��ѯ']");
		Thread.sleep(2000);
	}

	@Test(priority = 41)
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

	@Test(priority = 42)
	public void test43() throws InterruptedException {
		// ��Ʒ����-������Ʒ������Ʒ��������Ʒ���ơ�˽���ơ������в�ѯ
		webtest.click("xpath=//*[text()='��Ʒ����']");
		webtest.click("xpath=//*[text()='������Ʒ']");
		driver.switchTo().frame("wst-lframe-22");
		webtest.type("id=goodsName", "˽����");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='��ѯ']");
		Thread.sleep(2000);
	}

	@Test(priority = 43)
	public void test44() throws InterruptedException {
		// ��Ʒ����-������Ʒ��ѡ�е�һ����Ʒ����������Ϊ�Ƽ�
		webtest.click("xpath=//*[text()='��Ʒ����']");
		webtest.click("xpath=//*[text()='������Ʒ']");
		driver.switchTo().frame("wst-lframe-22");
		webtest.click("xpath=(//input[@class='chk'])[2]");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='�Ƽ�']");
		Thread.sleep(2000);
	}

	@Test(priority = 44)
	public void test45() throws InterruptedException {
		// ��Ʒ����-������Ʒ��ѡ���һ����Ʒ��˫���޸�����
		webtest.click("xpath=//*[text()='��Ʒ����']");
		webtest.click("xpath=//*[text()='������Ʒ']");
		driver.switchTo().frame("wst-lframe-22");
		webtest.doubleClick("xpath=(//div[@title='˫�����޸�'])[3]");
		Thread.sleep(2000);
	}

	@Test(priority = 45)
	public void test46() throws InterruptedException {
		// ��Ʒ����-������Ʒ��ѡ���һ����Ʒ��ɾ�����ڵ����Ľ���ѡ��ȷ��
		webtest.click("xpath=//*[text()='��Ʒ����']");
		webtest.click("xpath=//*[text()='������Ʒ']");
		driver.switchTo().frame("wst-lframe-22");
		webtest.click("xpath=(//div[@class='goods-valign-m']//a)[3]");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='layui-layer-btn']//a[1]");
		Thread.sleep(2000);
	}

	@Test(priority = 46)
	public void test47() throws InterruptedException {
		// ��Ʒ����-������Ʒ-��Ʒ��Ϣ����д��Ӧ��Ϣ��������Ʒ
		webtest.click("xpath=//*[text()='��Ʒ����']");
		webtest.click("xpath=//*[text()='������Ʒ']");
		driver.switchTo().frame("wst-lframe-22");
		webtest.click("xpath=/html/body/form/div/div[2]/div[1]/table/tbody/tr[15]/td/div/div[1]/span[48]/span");
		Thread.sleep(500);
		webtest.click("xpath=(//span[@class='ke-img'])[3]");
		Thread.sleep(500);
		webtest.selectByValue("id=cat_0", "49");
		Thread.sleep(500);
		webtest.selectByValue("id=cat_0_49", "81");
		Thread.sleep(500);
		webtest.selectByValue("id=cat_0_49_81", "304");
		Thread.sleep(500);
		webtest.type("xpath=/html/body/form/div/div[2]/div[1]/table/tbody/tr[1]/td[2]/div[2]/div[2]/input",
				"E:\\360downloads\\2030137.jpg");
		Thread.sleep(500);
		webtest.type("id=goodsName", "�޹���");
		Thread.sleep(500);
		webtest.typeAndClear("id=marketPrice", "7.50");
		Thread.sleep(500);
		webtest.typeAndClear("id=shopPrice", "6.00");
		Thread.sleep(500);
		webtest.typeAndClear("id=goodsStock", "5200");
		Thread.sleep(500);
		webtest.typeAndClear("id=warnStock", "100");
		Thread.sleep(500);
		webtest.typeAndClear("id=goodsUnit", "�޹����ٷ��콢��");
		Thread.sleep(500);
		webtest.click("xpath=//*[text()='����']");
		Thread.sleep(2000);
	}

	@Test(priority = 47)
	public void planb47() throws InterruptedException {
		// ��Ʒ����-Ʒ�ƹ�����Ʒ�����������롰�����ӡ��������ѯ
		webtest.click("xpath=//*[text()='��Ʒ����']");
		webtest.click("xpath=//*[text()='Ʒ�ƹ���']");
		driver.switchTo().frame("wst-lframe-22");
		webtest.type("id=key", "������");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='��ѯ']");
		Thread.sleep(2000);
	}

	@Test(priority = 48)
	public void test48() throws InterruptedException {
		// ��Ʒ����-��Ʒ���࣬�����ӷ���
		webtest.click("xpath=//*[text()='��Ʒ����']");
		webtest.click("xpath=//*[text()='��Ʒ����']");
		driver.switchTo().frame("wst-lframe-22");
		webtest.click("xpath=(//td[@class='l-grid-row-cell']//a)[1]");
		Thread.sleep(500);
		webtest.type("id=catName", "5555");
		Thread.sleep(200);
		webtest.typeAndClear("id=catSort", "3");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='layui-layer-btn']//a[1]");
		Thread.sleep(2000);
	}

	@Test(priority = 49)
	public void test49() throws InterruptedException {
		// ��Ʒ����-��Ʒ���ԣ��޸���Ʒ�������Ϊ2
		webtest.click("xpath=//*[text()='��Ʒ����']");
		webtest.click("xpath=//*[text()='��Ʒ����']");
		driver.switchTo().frame("wst-lframe-22");
		webtest.click("xpath=(//div[@class='l-grid-row-cell-inner']//a)[1]");
		Thread.sleep(200);
		webtest.typeAndClear("id=attrSort", "2");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='layui-layer-btn']//a[1]");
		Thread.sleep(2000);
	}

	@Test(priority = 50)
	public void test50() throws InterruptedException {
		// ��Ʒ����-���۹���ɾ����һ������
		webtest.click("xpath=//*[text()='��Ʒ����']");
		webtest.click("xpath=//*[text()='���۹���']");
		driver.switchTo().frame("wst-lframe-22");
		webtest.click("xpath=(//div[@class='l-grid-row-cell-inner']//a)[2]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='layui-layer-btn']//a)[2]");
		Thread.sleep(2000);
	}
}
