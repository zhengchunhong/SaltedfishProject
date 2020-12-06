package com.webtest.demo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ShoppingCartTest extends BaseTest {
	// ��¼�ǲ���ǰ��
	@BeforeMethod
	public void testLogin() throws InterruptedException {
		webtest.open("http://localhost2:99/home/users/login.html");
		Thread.sleep(200);
		webtest.type("id=loginName", "li_haoyu");
		Thread.sleep(200);
		webtest.type("id=loginPwd", "123456");
		Thread.sleep(200);
		webtest.type("id=verifyCode", "aaaa");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");
		Thread.sleep(200);
	}

//	01����ҳ��������Ʒ
	@Test
	public void cart_test01() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.type("id=search-ipt", "��ݮ");
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"search-btn\"]");
		Thread.sleep(200);
	}

//	02�����ҳ��ȫ����Ʒ����
	@Test
	public void cart_test02() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[2]/div[1]/a");
		Thread.sleep(200);
	}

//	03�����ҳ�Ҳ�Ĺ��ﳵ
	@Test
	public void cart_test03() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[7]/div[8]/div/div[1]/div[3]/div[1]");
		Thread.sleep(200);
	}

//	04�����ҳ�Ҳ���ҵ��㼣
	@Test
	public void cart_test04() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[7]/div[8]/div/div[1]/div[3]/div[3]");
		Thread.sleep(200);
	}

//	05�����ҳ�Ҳ���ҵ���Ϣ
	@Test
	public void cart_test05() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.mouseToElement("xpath=/html/body/div[7]/div[8]/div/div[1]/div[3]/div[4]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[7]/div[8]/div/div[1]/div[3]/div[4]/a/em");
		Thread.sleep(200);
	}

//	06�����ҳ�Ҳ�Ļص�����
	@Test
	public void cart_test06() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.mouseToElement("xpath=/html/body/div[7]/div[8]/div/div[1]/div[4]/div[1]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[7]/div[8]/div/div[1]/div[4]/div[1]/a/em");
		Thread.sleep(200);
	}

//	07�����ҳ�������µ������̵�
	@Test
	public void cart_test07() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[2]/div[2]/div[2]/a[2]");
		Thread.sleep(200);
	}

//	08�����ҳ�ĵ��̹���
	@Test
	public void cart_test08() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[7]/div[1]/div[1]/div[2]/div/a");
		Thread.sleep(200);
	}

//	09������̹������е�һ��
	@Test
	public void cart_test09() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[7]/div[1]/div[1]/div[2]/ul/a[1]/li");
		Thread.sleep(200);
	}

//	10������ҳ������껬��ȫ����Ʒ����
	@Test
	public void cart_test10() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/ul/li[2]/a");
		Thread.sleep(200);
		webtest.mouseToElement("xpath=/html/body/div[4]/div/div[2]/div[1]/a");
		Thread.sleep(200);
	}

//	11��ȫ����Ʒ����Ķ����˵�����껬��ĳһ����
	@Test
	public void cart_test11() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/ul/li[2]/a");
		Thread.sleep(200);
		webtest.mouseToElement("xpath=/html/body/div[4]/div/div[2]/div[1]/a");
		Thread.sleep(200);
		webtest.mouseToElement("xpath=/html/body/div[4]/div/div[2]/div[2]/div[1]/div[1]/h3");
		Thread.sleep(200);
	}

//	12��껬����Ʒ�����µ�ѡ���
	@Test
	public void cart_test12() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/ul/li[2]/a");
		Thread.sleep(200);
		webtest.mouseToElement("xpath=/html/body/div[6]/div[2]/div/div[1]/a");
		Thread.sleep(200);
	}

//13����������Ʒ�ļ۸�Χ�������й���Ʒ����
	@Test
	public void cart_test13() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/ul/li[2]/a");
		Thread.sleep(200);
		webtest.type("id=sprice", "1");
		Thread.sleep(200);
		webtest.type("id=eprice", "20");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[8]/div[2]/div[1]/div[2]/button");
		Thread.sleep(200);
	}

//14����ҳ����������н�������
	@Test
	public void cart_test14() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/ul/li[2]/a");
		Thread.sleep(200);
		webtest.type("id=sGoodsName", "��ݮ");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[3]/div");
		Thread.sleep(200);
	}

//15����Ʒ��ɸѡ��Ʒ
	@Test
	public void cart_test15() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/ul/li[2]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[7]/div[2]/div[3]/div[1]/ul/li[6]");
		Thread.sleep(200);
	}

//16���ݼ۸�ɸѡ��Ʒ
	@Test
	public void cart_test16() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/ul/li[2]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[7]/div[2]/div[3]/div[2]/ul/li[4]");
		Thread.sleep(200);
	}

//	17�����㹺�ﳵ����
	@Test
	public void cart_test17() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.mouseToElement("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
	}

//	18�򿪹��ﳵҳ��
	@Test
	public void cart_test18() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
	}

//	19�����Ʒ����ҳ
	@Test
	public void cart_test19() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/ul/li[2]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[7]/div[2]/div[1]/div[3]/a[1]");
		Thread.sleep(200);
	}

//	20�����Ʒ����ҳ��������빺�ﳵ
	@Test
	public void cart_test20() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/ul/li[2]/a");
		Thread.sleep(200);
		webtest.open("http://localhost2:99/home/goods/detail/id/6.html");
		webtest.click("id=addBtn");
		Thread.sleep(200);
	}

//	21��ͬһ��Ʒ�����ӹ��ﳵ
	@Test
	public void cart_test21() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/ul/li[2]/a");
		Thread.sleep(200);
		webtest.open("http://localhost2:99/home/goods/detail/id/6.html");
		for (int i = 0; i < 10; i++) {
			webtest.click("id=addBtn");
			Thread.sleep(200);
		}
	}

//	22�����Ʒ����ҳ�������������
	@Test
	public void cart_test22() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/ul/li[2]/a");
		Thread.sleep(200);
		webtest.open("http://localhost2:99/home/goods/detail/id/6.html");
		webtest.click("id=buyBtn");
		Thread.sleep(200);
	}

//	23�����Ʒ����ҳ�������������+������ҳ���ϲ鿴
	@Test
	public void cart_test23() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/ul/li[2]/a");
		Thread.sleep(200);
		webtest.open("http://localhost2:99/home/goods/detail/id/6.html");
		Thread.sleep(200);
		webtest.click("id=buy-add");
		Thread.sleep(200);
	}

//	24�����Ʒ����ҳ�������������-������ҳ���ϲ鿴
	@Test
	public void cart_test24() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/ul/li[2]/a");
		Thread.sleep(200);
		webtest.open("http://localhost2:99/home/goods/detail/id/6.html");
		Thread.sleep(200);
		webtest.click("id=buy-reduce");
		Thread.sleep(200);
	}

//	25��������Ʒ�󣬹��ﳵ������ʾ
	@Test
	public void cart_test25() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		String num = webtest.getText("xpath=//*[@id=\"goodsTotalNum\"]");
		Thread.sleep(200);
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
	}

//	10ѡ����Ʒ�����ɾ�������ȡ��
	@Test
	public void cart_test26() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[2]/div/div/div[6]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[11]/div[3]/a[2]");
		Thread.sleep(200);
	}

//	27ѡ����Ʒ�����ɾ�������ȷ��
	@Test
	public void cart_test27() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[2]/div/div/div[6]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[11]/div[3]/a[1]");
		Thread.sleep(200);
	}

//	28ѡ����Ʒ����ѡ��Ʒ�����ɾ�������ȷ��
	@Test
	public void cart_test28() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"gchk_5\"]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[2]/div/div/div[6]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[11]/div[3]/a[1]");
		Thread.sleep(200);
	}

//	29��ѡȫѡ�����ɾ�������ȷ��
	@Test
	public void cart_test29() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[2]/div/div/div[6]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[11]/div[3]/a[1]");
		Thread.sleep(200);
	}

//	30���ɾ����Ʒ�󣬹��ﳵ������ʾ
	@Test
	public void cart_test30() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		String num = webtest.getText("xpath=//*[@id=\"goodsTotalNum\"]");
		Thread.sleep(200);
		System.out.println(num);
		System.out.println(num);
		System.out.println(num);
	}

//	31�򿪹��ﳵҳ�棬�����������
	@Test
	public void cart_test31() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/a[1]");
		Thread.sleep(200);
	}

//	32δ��ѡ��Ʒʱ��������㰴ť
	@Test
	public void cart_test32() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/a[2]");
		Thread.sleep(200);
	}

//	33���ȫѡʱ��������㰴ť
	@Test
	public void cart_test33() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/a[2]");
		Thread.sleep(200);
	}

//	34��ѡһ����Ʒʱ��������㰴ť
	@Test
	public void cart_test34() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"gchk_7\"]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/a[2]");
		Thread.sleep(200);
	}

//	35��ѡһ����Ʒʱ���鿴Ӧ���ܽ�����Ʒ����Ƿ�һ��
	@Test
	public void cart_test35() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"gchk_7\"]");
		Thread.sleep(200);
	}

//	36���ȫѡʱ����Ʒ�Ƿ�ȫѡ
	@Test
	public void cart_test36() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
	}

//	37�򿪹��ﳵҳ�棬�����Ʒ������Ʒ����ҳ
	@Test
	public void cart_test37() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[2]/div/div[1]/div[2]/div[1]/a/img");
		Thread.sleep(200);
	}

//	38�����ջ���ַΪĬ�ϵ�ַ
	@Test
	public void cart_test38() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"gchk_28\"]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/a[2]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/a");
		Thread.sleep(200);
		webtest.type("id=userName", "Li");
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"area_0\"]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/div[2]/div/form/div[2]/div[2]/select/option[2]");
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"area_0_110000\"]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/div[2]/div/form/div[2]/div[2]/select[2]/option[2]");
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"area_0_110000_110100\"]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/div[2]/div/form/div[2]/div[2]/select[3]/option[2]");
		Thread.sleep(200);
		webtest.type("id=userAddress", "World");
		Thread.sleep(200);
		webtest.type("id=userPhone", "12345678910");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/div[2]/div/form/div[4]/div[2]/label[1]/label");
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"saveAddressBtn\"]");
		Thread.sleep(200);
	}

//	39�����ջ���ַ��ΪĬ�ϵ�ַ
	@Test
	public void cart_test39() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"gchk_28\"]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/a[2]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/a");
		Thread.sleep(200);
		webtest.type("id=userName", "Li2");
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"area_0\"]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/div[2]/div/form/div[2]/div[2]/select/option[2]");
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"area_0_110000\"]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/div[2]/div/form/div[2]/div[2]/select[2]/option[2]");
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"area_0_110000_110100\"]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/div[2]/div/form/div[2]/div[2]/select[3]/option[2]");
		Thread.sleep(200);
		webtest.type("id=userAddress", "World2");
		Thread.sleep(200);
		webtest.type("id=userPhone", "12345678911");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/div[2]/div/form/div[4]/div[2]/label[2]/label");
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"saveAddressBtn\"]");
		Thread.sleep(200);
	}

//	40֧����ʽѡ���������
	@Test
	public void cart_test40() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"gchk_28\"]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/a[2]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[6]/div[2]/div[1]");
		Thread.sleep(200);
	}

//	41֧����ʽѡ������֧��
	@Test
	public void cart_test41() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"gchk_28\"]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/a[2]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[6]/div[2]/div[2]");
		Thread.sleep(200);
	}

//	42�ͻ���ʽѡ��������
	@Test
	public void cart_test42() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"gchk_28\"]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/a[2]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[7]/div[2]/div[1]");
		Thread.sleep(200);
	}

//	43�ͻ���ʽѡ������
	@Test
	public void cart_test43() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"gchk_28\"]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/a[2]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[7]/div[2]/div[2]");
		Thread.sleep(200);
	}

//	44��Ʊ��Ϣѡ����Ҫ����Ʊ
	@Test
	public void cart_test44() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"gchk_28\"]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/a[2]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[8]/div[2]/div[1]");
		Thread.sleep(200);
	}

//	45��Ʊ��Ϣѡ����Ҫ����Ʊ����д��Ʊ̧ͷ��
	@Test
	public void cart_test45() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"gchk_28\"]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/a[2]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[8]/div[2]/div[2]");
		Thread.sleep(200);
	}

//	46��Ʊ��Ϣѡ����Ҫ����Ʊ����д��Ʊ̧ͷ��
	@Test
	public void cart_test46() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"gchk_28\"]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/a[2]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[8]/div[2]/div[2]");
		Thread.sleep(200);
		webtest.type("id=invoiceClient", "lhy");
		Thread.sleep(200);
	}

//	47��Ʊ��Ϣѡ����Ҫ����Ʊ����д��Ʊ̧ͷ��
	@Test
	public void cart_test47() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"gchk_28\"]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/a[2]");
		Thread.sleep(200);
		webtest.type("id=remark", "lhy");
		Thread.sleep(200);
	}

//	48��д�˶Զ�����Ϣʱ�������һ��
	@Test
	public void cart_test48() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"gchk_28\"]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/a[2]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[10]/a[1]");
		Thread.sleep(200);
	}

//	49��д�˶Զ�����Ϣʱ������ύ����
	@Test
	public void cart_test49() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"gchk_28\"]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/a[2]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[10]/a[2]");
		Thread.sleep(200);
	}

//	50�ύ�����󣬵����������
	@Test
	public void cart_test50() throws InterruptedException {
		webtest.click("xpath=/html/body/div[6]/div[3]/div[3]/a");
		Thread.sleep(200);
	}

}
