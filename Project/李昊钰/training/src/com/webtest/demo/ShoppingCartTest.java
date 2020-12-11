package com.webtest.demo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ShoppingCartTest extends BaseTest {
/*
 * 购物车，订单填写，商品详情页
 * 李昊钰
 * */
	// 登录是测试前提
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
		webtest.click("xpath=//*[text()='登录']");
		Thread.sleep(200);
	}

//	01在主页面搜索商品
	@Test(priority = 1)
	public void cart_test01() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.type("id=search-ipt", "草莓");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='wst-search']//div[1]");
		Thread.sleep(200);
	}

//	02点击首页的全部商品分类
	@Test(priority = 2)
	public void cart_test02() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='dt j-cate-dt']//a[1]");
		Thread.sleep(200);
	}

//	03点击首页右侧的购物车
	@Test(priority = 3)
	public void cart_test03() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='toolbar-tab tbar-tab-cart']");
		Thread.sleep(200);
	}

//	04点击首页右侧的我的足迹
	@Test(priority = 4)
	public void cart_test04() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='toolbar-tabs j-tab']//div)[3]");
		Thread.sleep(200);
	}

//	05点击首页右侧的我的消息
	@Test(priority = 5)
	public void cart_test05() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.mouseToElement("xpath=(//div[@class='toolbar-tabs j-tab']//div)[4]");
		Thread.sleep(200);
		webtest.click("xpath=//em[text()='我的消息']");
		Thread.sleep(200);
	}

//	06点击首页右侧的回到顶部
	@Test(priority = 6)
	public void cart_test06() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.mouseToElement("xpath=//div[@class='toolbar-footer']//div[1]");
		Thread.sleep(200);
		webtest.click("xpath=//em[text()='顶部']");
		Thread.sleep(200);
	}

//	07点击首页搜索栏下的网上商店
	@Test(priority = 7)
	public void cart_test07() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='wst-search-keys']//a)[2]");
		Thread.sleep(200);
	}

//	08点击首页的店铺公告
	@Test(priority = 8)
	public void cart_test08() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='rnbh-r-title']//a)[1]");
		Thread.sleep(200);
	}

//	09点击店铺公告其中的一条
	@Test(priority = 9)
	public void cart_test09() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//li[text()='PHP开源系统WSTSHOP']");
		Thread.sleep(200);
	}

//	10其他子页面上鼠标滑上全部商品分类
	@Test(priority = 10)
	public void cart_test10() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=(//li[@class='fore1']//a)[2]");
		Thread.sleep(200);
		webtest.mouseToElement("xpath=//div[@class='dt j-cate-dt']//a[1]");
		Thread.sleep(200);
	}

//	11在全部商品分类的二级菜单中鼠标滑上某一分类
	@Test(priority = 11)
	public void cart_test11() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='second-cat']//a)[2]");
		Thread.sleep(200);
	}

//	12鼠标滑上商品分类下的选择框
	@Test(priority = 12)
	public void cart_test12() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.mouseToElement("xpath=(//div[@class='second-cat']//a)[2]");
		Thread.sleep(200);
	}

//13输入搜索商品的价格范围，进行有关商品搜索
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

//14在子页面的搜索框中进行搜索
	@Test(priority = 14)
	public void cart_test14() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=(//li[@class='fore1']//a)[2]");
		Thread.sleep(200);
		webtest.type("id=sGoodsName", "草莓");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='filter-search']//div[1]");
		Thread.sleep(200);
	}

//15根据品牌筛选商品
	@Test(priority = 15)
	public void cart_test15() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=(//li[@class='fore1']//a)[2]");
		Thread.sleep(200);
		webtest.click("xpath=(//ul[@class='content']//li)[4]");
		Thread.sleep(200);
	}

//16根据价格筛选商品
	@Test(priority = 16)
	public void cart_test16() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=(//li[@class='fore1']//a)[2]");
		Thread.sleep(200);
		webtest.click("xpath=//li[text()='18-27']");
		Thread.sleep(200);
	}

//	17打开迷你购物车界面
	@Test(priority = 17)
	public void cart_test17() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.mouseToElement("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
	}

//	18打开购物车页面
	@Test(priority = 18)
	public void cart_test18() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
	}

//	19点击商品详情页
	@Test(priority = 19)
	public void cart_test19() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=(//li[@class='fore1']//a)[2]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='rnbh-goods']//a)[1]");
		Thread.sleep(200);
	}

//	20点击商品详情页，点击加入购物车
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

//	21对同一商品多次添加购物车
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

//	22点击商品详情页，点击立即购买
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

//	23点击商品详情页，点击数量处“+”，在页面上查看
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

//	24点击商品详情页，点击数量处“-”，在页面上查看
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

//	25检查添加物品后，购物车数量显示
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

//	26选择商品，点击删除，点击取消
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

//	27选择商品，点击删除，点击确定
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

//	28选择商品，勾选商品，点击删除，点击确定
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

//	29勾选全选，点击删除，点击确定
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

//	30检查删除物品后，购物车数量显示
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

//	31打开购物车页面，点击继续购物
	@Test(priority = 31)
	public void cart_test31() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='cart-btn']//a[1]");
		Thread.sleep(200);
	}

//	32未勾选商品时，点击结算按钮
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

//	33点击全选时，点击结算按钮
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

//	34勾选一个商品时，点击结算按钮
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

//	35勾选一个商品时，查看应付总金额和商品金额是否一致
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

//	36点击全选时，商品是否被全选
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

//	37打开购物车页面，点击商品进入商品详情页
	@Test(priority = 37)
	public void cart_test37() throws InterruptedException {
		webtest.open("http://localhost/wstshop_3.0.0/");
		Thread.sleep(200);
		webtest.click("xpath=//a[@class='wst-cart']//em[1]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='img']//img)[1]");
		Thread.sleep(200);
	}

//	38新增收货地址为默认地址
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

//	39新增收货地址不为默认地址
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

//	40支付方式选择货到付款
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
		webtest.click("xpath=//div[text()='货到付款']");
		Thread.sleep(200);
	}

//	41支付方式选择在线支付
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
		webtest.click("xpath=//div[text()='在线支付']");
		Thread.sleep(200);
	}

//	42送货方式选择快递运输
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
		webtest.click("xpath=//div[text()='快递运输']");
		Thread.sleep(200);
	}

//	43送货方式选择自提
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
		webtest.click("xpath=//div[text()='自提']");
		Thread.sleep(200);
	}

//	44发票信息选择不需要开发票
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
		webtest.click("xpath=//div[text()='不需要开发票']");
		Thread.sleep(200);
	}

//	45发票信息选择需要开发票（不写发票抬头）
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
		webtest.click("xpath=//div[text()='需要开发票']");
		Thread.sleep(200);
	}

//	46发票信息选择需要开发票（填写发票抬头）
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
		webtest.click("xpath=//div[text()='需要开发票']");
		Thread.sleep(200);
		webtest.type("id=invoiceClient", "lhy");
		Thread.sleep(200);
	}

//	47填写备注
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

//	48填写核对订单信息时，点击上一步
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

//	49填写核对订单信息时，点击提交订单
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

//	50提交订单后，点击继续购物
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
