package com.webtest.demo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ShoppingCartTest extends BaseTest {
	// 登录是测试前提
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

//	01在主页面搜索商品
	@Test
	public void cart_test01() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.type("id=search-ipt", "草莓");
		Thread.sleep(200);
		webtest.click("xpath=//*[@id=\"search-btn\"]");
		Thread.sleep(200);
	}

//	02点击首页的全部商品分类
	@Test
	public void cart_test02() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[2]/div[1]/a");
		Thread.sleep(200);
	}

//	03点击首页右侧的购物车
	@Test
	public void cart_test03() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[7]/div[8]/div/div[1]/div[3]/div[1]");
		Thread.sleep(200);
	}

//	04点击首页右侧的我的足迹
	@Test
	public void cart_test04() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[7]/div[8]/div/div[1]/div[3]/div[3]");
		Thread.sleep(200);
	}

//	05点击首页右侧的我的消息
	@Test
	public void cart_test05() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.mouseToElement("xpath=/html/body/div[7]/div[8]/div/div[1]/div[3]/div[4]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[7]/div[8]/div/div[1]/div[3]/div[4]/a/em");
		Thread.sleep(200);
	}

//	06点击首页右侧的回到顶部
	@Test
	public void cart_test06() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.mouseToElement("xpath=/html/body/div[7]/div[8]/div/div[1]/div[4]/div[1]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[7]/div[8]/div/div[1]/div[4]/div[1]/a/em");
		Thread.sleep(200);
	}

//	07点击首页搜索栏下的网上商店
	@Test
	public void cart_test07() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[2]/div[2]/div[2]/a[2]");
		Thread.sleep(200);
	}

//	08点击首页的店铺公告
	@Test
	public void cart_test08() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[7]/div[1]/div[1]/div[2]/div/a");
		Thread.sleep(200);
	}

//	09点击店铺公告其中的一条
	@Test
	public void cart_test09() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[7]/div[1]/div[1]/div[2]/ul/a[1]/li");
		Thread.sleep(200);
	}

//	10其他子页面上鼠标滑上全部商品分类
	@Test
	public void cart_test10() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/ul/li[2]/a");
		Thread.sleep(200);
		webtest.mouseToElement("xpath=/html/body/div[4]/div/div[2]/div[1]/a");
		Thread.sleep(200);
	}

//	11在全部商品分类的二级菜单中鼠标滑上某一分类
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

//	12鼠标滑上商品分类下的选择框
	@Test
	public void cart_test12() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/ul/li[2]/a");
		Thread.sleep(200);
		webtest.mouseToElement("xpath=/html/body/div[6]/div[2]/div/div[1]/a");
		Thread.sleep(200);
	}

//13输入搜索商品的价格范围，进行有关商品搜索
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

//14在子页面的搜索框中进行搜索
	@Test
	public void cart_test14() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/ul/li[2]/a");
		Thread.sleep(200);
		webtest.type("id=sGoodsName", "草莓");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[3]/div");
		Thread.sleep(200);
	}

//15根据品牌筛选商品
	@Test
	public void cart_test15() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/ul/li[2]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[7]/div[2]/div[3]/div[1]/ul/li[6]");
		Thread.sleep(200);
	}

//16根据价格筛选商品
	@Test
	public void cart_test16() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/ul/li[2]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[7]/div[2]/div[3]/div[2]/ul/li[4]");
		Thread.sleep(200);
	}

//	17打开迷你购物车界面
	@Test
	public void cart_test17() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.mouseToElement("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
	}

//	18打开购物车页面
	@Test
	public void cart_test18() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
	}

//	19点击商品详情页
	@Test
	public void cart_test19() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/ul/li[2]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[7]/div[2]/div[1]/div[3]/a[1]");
		Thread.sleep(200);
	}

//	20点击商品详情页，点击加入购物车
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

//	21对同一商品多次添加购物车
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

//	22点击商品详情页，点击立即购买
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

//	23点击商品详情页，点击数量处“+”，在页面上查看
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

//	24点击商品详情页，点击数量处“-”，在页面上查看
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

//	25检查添加物品后，购物车数量显示
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

//	10选择商品，点击删除，点击取消
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

//	27选择商品，点击删除，点击确定
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

//	28选择商品，勾选商品，点击删除，点击确定
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

//	29勾选全选，点击删除，点击确定
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

//	30检查删除物品后，购物车数量显示
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

//	31打开购物车页面，点击继续购物
	@Test
	public void cart_test31() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[4]/a[1]");
		Thread.sleep(200);
	}

//	32未勾选商品时，点击结算按钮
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

//	33点击全选时，点击结算按钮
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

//	34勾选一个商品时，点击结算按钮
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

//	35勾选一个商品时，查看应付总金额和商品金额是否一致
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

//	36点击全选时，商品是否被全选
	@Test
	public void cart_test36() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[1]/div[1]/input");
		Thread.sleep(200);
	}

//	37打开购物车页面，点击商品进入商品详情页
	@Test
	public void cart_test37() throws InterruptedException {
		webtest.open("http://localhost2:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[4]/div/div[3]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[5]/div[2]/div/div[1]/div[2]/div[1]/a/img");
		Thread.sleep(200);
	}

//	38新增收货地址为默认地址
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

//	39新增收货地址不为默认地址
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

//	40支付方式选择货到付款
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

//	41支付方式选择在线支付
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

//	42送货方式选择快递运输
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

//	43送货方式选择自提
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

//	44发票信息选择不需要开发票
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

//	45发票信息选择需要开发票（不写发票抬头）
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

//	46发票信息选择需要开发票（填写发票抬头）
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

//	47发票信息选择需要开发票（填写发票抬头）
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

//	48填写核对订单信息时，点击上一步
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

//	49填写核对订单信息时，点击提交订单
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

//	50提交订单后，点击继续购物
	@Test
	public void cart_test50() throws InterruptedException {
		webtest.click("xpath=/html/body/div[6]/div[3]/div[3]/a");
		Thread.sleep(200);
	}

}
