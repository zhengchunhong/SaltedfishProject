package com.webtest.demo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ShoppingCartTest extends BaseTest {
/*
 * ���ﳵ��������д����Ʒ����ҳ
 * �����
 * */
	// ��¼�ǲ���ǰ��
	@BeforeMethod
	public void testLogin() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/home/users/login.html");
		Thread.sleep(200);
		webtest.type("id=loginName", "li_haoyu");
		Thread.sleep(200);
		webtest.type("id=loginPwd", "123456");
		Thread.sleep(200);
		webtest.type("id=verifyCode", "aaaa");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='��¼']");
		Thread.sleep(200);
	}

//	01����ҳ��������Ʒ
	@Test(priority = 1)
	public void cart_test01() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.type("id=search-ipt", "��ݮ");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='wst-search']//div[1]");
		Thread.sleep(200);
	}

//	02�����ҳ��ȫ����Ʒ����
	@Test(priority = 2)
	public void cart_test02() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='dt j-cate-dt']//a[1]");
		Thread.sleep(200);
	}

//	03�����ҳ�Ҳ�Ĺ��ﳵ
	@Test(priority = 3)
	public void cart_test03() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='toolbar-tab tbar-tab-cart']");
		Thread.sleep(200);
	}

//	04�����ҳ�Ҳ���ҵ��㼣
	@Test(priority = 4)
	public void cart_test04() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='toolbar-tabs j-tab']//div)[3]");
		Thread.sleep(200);
	}

//	05�����ҳ�Ҳ���ҵ���Ϣ
	@Test(priority = 5)
	public void cart_test05() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.mouseToElement("xpath=(//div[@class='toolbar-tabs j-tab']//div)[4]");
		Thread.sleep(200);
		webtest.click("xpath=//em[text()='�ҵ���Ϣ']");
		Thread.sleep(200);
	}

//	06�����ҳ�Ҳ�Ļص�����
	@Test(priority = 6)
	public void cart_test06() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.mouseToElement("xpath=//div[@class='toolbar-footer']//div[1]");
		Thread.sleep(200);
		webtest.click("xpath=//em[text()='����']");
		Thread.sleep(200);
	}

//	07�����ҳ�������µ������̵�
	@Test(priority = 7)
	public void cart_test07() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='wst-search-keys']//a)[2]");
		Thread.sleep(200);
	}

//	08�����ҳ�ĵ��̹���
	@Test(priority = 8)
	public void cart_test08() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='rnbh-r-title']//a)[1]");
		Thread.sleep(200);
	}

//	09������̹������е�һ��
	@Test(priority = 9)
	public void cart_test09() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//li[text()='PHP��ԴϵͳWSTSHOP']");
		Thread.sleep(200);
	}

//	10������ҳ������껬��ȫ����Ʒ����
	@Test(priority = 10)
	public void cart_test10() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=(//li[@class='fore1']//a)[2]");
		Thread.sleep(200);
		webtest.mouseToElement("xpath=//div[@class='dt j-cate-dt']//a[1]");
		Thread.sleep(200);
	}

//	11��ȫ����Ʒ����Ķ����˵�����껬��ĳһ����
	@Test(priority = 11)
	public void cart_test11() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='second-cat']//a)[2]");
		Thread.sleep(200);
	}

//	12��껬����Ʒ�����µ�ѡ���
	@Test(priority = 12)
	public void cart_test12() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.mouseToElement("xpath=(//div[@class='second-cat']//a)[2]");
		Thread.sleep(200);
	}

//13����������Ʒ�ļ۸�Χ�������й���Ʒ����
	@Test(priority = 13)
	public void cart_test13() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=(//li[@class='fore1']//a)[2]");
		Thread.sleep(200);
		webtest.type("id=sprice", "1");
		Thread.sleep(200);
		webtest.type("id=eprice", "20");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='line line2']//button[1]");
		Thread.sleep(200);
	}

//14����ҳ����������н�������
	@Test(priority = 14)
	public void cart_test14() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=(//li[@class='fore1']//a)[2]");
		Thread.sleep(200);
		webtest.type("id=sGoodsName", "��ݮ");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='filter-search']//div[1]");
		Thread.sleep(200);
	}

//15����Ʒ��ɸѡ��Ʒ
	@Test(priority = 15)
	public void cart_test15() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=(//li[@class='fore1']//a)[2]");
		Thread.sleep(200);
		webtest.click("xpath=(//ul[@class='content']//li)[4]");
		Thread.sleep(200);
	}

//16���ݼ۸�ɸѡ��Ʒ
	@Test(priority = 16)
	public void cart_test16() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=(//li[@class='fore1']//a)[2]");
		Thread.sleep(200);
		webtest.click("xpath=//li[text()='18-27']");
		Thread.sleep(200);
	}

//	17�����㹺�ﳵ����
	@Test(priority = 17)
	public void cart_test17() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.mouseToElement("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
	}

//	18�򿪹��ﳵҳ��
	@Test(priority = 18)
	public void cart_test18() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
	}

//	19�����Ʒ����ҳ
	@Test(priority = 19)
	public void cart_test19() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=(//li[@class='fore1']//a)[2]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='rnbh-goods']//a)[1]");
		Thread.sleep(200);
	}

//	20�����Ʒ����ҳ��������빺�ﳵ
	@Test(priority = 20)
	public void cart_test20() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=(//li[@class='fore1']//a)[2]");
		Thread.sleep(200);
		webtest.open("http://localhost/wstshop_3.0.0/home/goods/detail/id/7.html");
		webtest.click("id=addBtn");
		Thread.sleep(200);
	}

//	21��ͬһ��Ʒ�����ӹ��ﳵ
	@Test(priority = 21)
	public void cart_test21() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=(//li[@class='fore1']//a)[2]");
		Thread.sleep(200);
		webtest.open("http://localhost/wstshop_3.0.0/home/goods/detail/id/7.html");
		for (int i = 0; i < 10; i++) {
			webtest.click("id=addBtn");
			Thread.sleep(200);
		}
	}

//	22�����Ʒ����ҳ�������������
	@Test(priority = 22)
	public void cart_test22() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=(//li[@class='fore1']//a)[2]");
		Thread.sleep(200);
		webtest.open("http://localhost/wstshop_3.0.0/home/goods/detail/id/7.html");
		webtest.click("id=buyBtn");
		Thread.sleep(200);
	}

//	23�����Ʒ����ҳ�������������+������ҳ���ϲ鿴
	@Test(priority = 23)
	public void cart_test23() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=(//li[@class='fore1']//a)[2]");
		Thread.sleep(200);
		webtest.open("http://localhost/wstshop_3.0.0/home/goods/detail/id/7.html");
		Thread.sleep(200);
		webtest.click("id=buy-add");
		Thread.sleep(200);
	}

//	24�����Ʒ����ҳ�������������-������ҳ���ϲ鿴
	@Test(priority = 24)
	public void cart_test24() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=(//li[@class='fore1']//a)[2]");
		Thread.sleep(200);
		webtest.open("http://localhost/wstshop_3.0.0/home/goods/detail/id/7.html");
		Thread.sleep(200);
		webtest.click("id=buy-add");
		Thread.sleep(200);
		webtest.click("id=buy-reduce");
		Thread.sleep(200);
	}

//	25��������Ʒ�󣬹��ﳵ������ʾ
	@Test(priority = 25)
	public void cart_test25() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		String num = webtest.getText("xpath=//*[@id=\"goodsTotalNum\"]");
		Thread.sleep(200);
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
	}

//	26ѡ����Ʒ�����ɾ�������ȡ��
	@Test(priority = 26)
	public void cart_test26() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='action']//a)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='layui-layer-btn']//a)[2]");
		Thread.sleep(200);
	}

//	27ѡ����Ʒ�����ɾ�������ȷ��
	@Test(priority = 27)
	public void cart_test27() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='action']//a)[1]");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='layui-layer-btn']//a[1]");
		Thread.sleep(200);
	}

//	28ѡ����Ʒ����ѡ��Ʒ�����ɾ�������ȷ��
	@Test(priority = 28)
	public void cart_test28() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[2]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='action']//a)[1]");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='layui-layer-btn']//a[1]");
		Thread.sleep(200);
	}

//	29��ѡȫѡ�����ɾ�������ȷ��
	@Test(priority = 29)
	public void cart_test29() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='action']//a)[1]");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='layui-layer-btn']//a[1]");
		Thread.sleep(200);
	}

//	30���ɾ����Ʒ�󣬹��ﳵ������ʾ
	@Test(priority = 30)
	public void cart_test30() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		String num = webtest.getText("xpath=//*[@id=\"goodsTotalNum\"]");
		Thread.sleep(200);
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
	}

//	31�򿪹��ﳵҳ�棬�����������
	@Test(priority = 31)
	public void cart_test31() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='cart-btn']//a[1]");
		Thread.sleep(200);
	}

//	32δ��ѡ��Ʒʱ��������㰴ť
	@Test(priority = 32)
	public void cart_test32() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='cart-btn']//a)[2]");
		Thread.sleep(200);
	}

//	33���ȫѡʱ��������㰴ť
	@Test(priority = 33)
	public void cart_test33() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='cart-btn']//a)[2]");
		Thread.sleep(200);
	}

//	34��ѡһ����Ʒʱ��������㰴ť
	@Test(priority = 34)
	public void cart_test34() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[2]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='cart-btn']//a)[2]");
		Thread.sleep(200);
	}

//	35��ѡһ����Ʒʱ���鿴Ӧ���ܽ�����Ʒ����Ƿ�һ��
	@Test(priority = 35)
	public void cart_test35() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[2]");
		Thread.sleep(200);
	}

//	36���ȫѡʱ����Ʒ�Ƿ�ȫѡ
	@Test(priority = 36)
	public void cart_test36() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
	}

//	37�򿪹��ﳵҳ�棬�����Ʒ������Ʒ����ҳ
	@Test(priority = 37)
	public void cart_test37() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='img']//img)[1]");
		Thread.sleep(200);
	}

//	38�����ջ���ַΪĬ�ϵ�ַ
	@Test(priority = 38)
	public void cart_test38() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[2]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='cart-btn']//a)[2]");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='box-head']//a[1]");
		Thread.sleep(200);
		webtest.type("id=userName", "Li");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='field']//select[1]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/div[2]/div/form/div[2]/div[2]/select/option[2]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='field']//select)[2]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/div[2]/div/form/div[2]/div[2]/select[2]/option[2]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='field']//select)[3]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/div[2]/div/form/div[2]/div[2]/select[3]/option[2]");
		Thread.sleep(200);
		webtest.type("id=userAddress", "World");
		Thread.sleep(200);
		webtest.type("id=userPhone", "12345678910");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='radio-box']//label)[2]");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='rows']//a[1]");
		Thread.sleep(200);
	}

//	39�����ջ���ַ��ΪĬ�ϵ�ַ
	@Test(priority = 39)
	public void cart_test39() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[2]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='cart-btn']//a)[2]");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='box-head']//a[1]");
		Thread.sleep(200);
		webtest.type("id=userName", "Li2");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='field']//select[1]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/div[2]/div/form/div[2]/div[2]/select/option[2]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='field']//select)[2]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/div[2]/div/form/div[2]/div[2]/select[2]/option[2]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='field']//select)[3]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/div[2]/div/form/div[2]/div[2]/select[3]/option[2]");
		Thread.sleep(200);
		webtest.type("id=userAddress", "World2");
		Thread.sleep(200);
		webtest.type("id=userPhone", "12345678911");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='radio-box']//label)[4]");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='rows']//a[1]");
		Thread.sleep(200);
	}

//	40֧����ʽѡ���������
	@Test(priority = 40)
	public void cart_test40() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[2]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='cart-btn']//a)[2]");
		Thread.sleep(200);
		webtest.click("xpath=//div[text()='��������']");
		Thread.sleep(200);
	}

//	41֧����ʽѡ������֧��
	@Test(priority = 41)
	public void cart_test41() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[2]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='cart-btn']//a)[2]");
		Thread.sleep(200);
		webtest.click("xpath=//div[text()='����֧��']");
		Thread.sleep(200);
	}

//	42�ͻ���ʽѡ��������
	@Test(priority = 42)
	public void cart_test42() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[2]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='cart-btn']//a)[2]");
		Thread.sleep(200);
		webtest.click("xpath=//div[text()='�������']");
		Thread.sleep(200);
	}

//	43�ͻ���ʽѡ������
	@Test(priority = 43)
	public void cart_test43() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[2]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='cart-btn']//a)[2]");
		Thread.sleep(200);
		webtest.click("xpath=//div[text()='����']");
		Thread.sleep(200);
	}

//	44��Ʊ��Ϣѡ����Ҫ����Ʊ
	@Test(priority = 44)
	public void cart_test44() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[2]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='cart-btn']//a)[2]");
		Thread.sleep(200);
		webtest.click("xpath=//div[text()='����Ҫ����Ʊ']");
		Thread.sleep(200);
	}

//	45��Ʊ��Ϣѡ����Ҫ����Ʊ����д��Ʊ̧ͷ��
	@Test(priority = 45)
	public void cart_test45() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[2]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='cart-btn']//a)[2]");
		Thread.sleep(200);
		webtest.click("xpath=//div[text()='��Ҫ����Ʊ']");
		Thread.sleep(200);
	}

//	46��Ʊ��Ϣѡ����Ҫ����Ʊ����д��Ʊ̧ͷ��
	@Test(priority = 46)
	public void cart_test46() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[2]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='cart-btn']//a)[2]");
		Thread.sleep(200);
		webtest.click("xpath=//div[text()='��Ҫ����Ʊ']");
		Thread.sleep(200);
		webtest.type("id=invoiceClient", "lhy");
		Thread.sleep(200);
	}

//	47��д��ע
	@Test(priority = 47)
	public void cart_test47() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[2]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='cart-btn']//a)[2]");
		Thread.sleep(200);
		webtest.type("id=remark", "lhy");
		Thread.sleep(200);
	}

//	48��д�˶Զ�����Ϣʱ�������һ��
	@Test(priority = 48)
	public void cart_test48() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[2]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='cart-btn']//a)[2]");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='cart-btn']//a[1]");
		Thread.sleep(200);
	}

//	49��д�˶Զ�����Ϣʱ������ύ����
	@Test(priority = 49)
	public void cart_test49() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[2]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='cart-btn']//a)[2]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='cart-btn']//a)[2]");
		Thread.sleep(200);
	}

//	50�ύ�����󣬵����������
	@Test(priority = 50)
	public void cart_test50() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='chk']//input)[2]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='cart-btn']//a)[2]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='cart-btn']//a)[2]");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='go']//a[1]");
		Thread.sleep(200);
	}

}
