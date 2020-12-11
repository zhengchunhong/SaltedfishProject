package com.webtest.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

/*
 * 周思敏
 * 后台管理系统中订单/商品/运营管理
 */

public class Fiftytests extends BaseTest {

	@BeforeMethod
	public void testLogin() throws InterruptedException {
		// 登陆成功是测试前提
		webtest.open("http://localhost/wstshop_3.0.0/admin/index/login.html");
		webtest.type("id=loginPwd", "admin");
		webtest.type("id=verifyCode", "1111");
		webtest.click("xpath=//input[@type='button']");
		Thread.sleep(200);
	}

	@Test(priority = 1)
	public void test1() throws InterruptedException {
		// 运营管理-推荐管理-商品推荐，成功对商品进行推荐
		WebElement selector;
		webtest.click("xpath=//*[text()='运营管理']");
		webtest.click("xpath=//*[text()='商品推荐']");
		driver.switchTo().frame("wst-lframe-56");
		selector = driver.findElement(By.id("cat12_0"));
		Select select = new Select(selector);
		select.selectByValue("47");
		webtest.click("xpath=//input[@value='搜索']");
		webtest.click("xpath=(//input[@name='lchk_2'])[1]");
		webtest.click("xpath=(//input[@type='button'])[2]");
		webtest.click("xpath=//input[@value='保存']");
	}

	@Test(priority = 2)
	public void test2() throws InterruptedException {
		// 运营管理-推荐管理-品牌推荐，成功对品牌进行推荐
		WebElement selector;
		webtest.click("xpath=//*[text()='运营管理']");
		webtest.click("xpath=//*[text()='品牌推荐']");
		driver.switchTo().frame("wst-lframe-56");
		selector = driver.findElement(By.id("cat12_0"));
		Select select = new Select(selector);
		select.selectByValue("47");
		webtest.click("xpath=//input[@value='搜索']");
		webtest.click("xpath=(//input[@name='lchk_2'])[1]");
		webtest.click("xpath=(//input[@type='button'])[2]");
		webtest.click("xpath=//input[@value='保存']");
	}

	@Test(priority = 3)
	public void test3() throws InterruptedException {
		// 运营管理-财务管理-提现申请，输入提现单号进行查询
		webtest.click("xpath=//*[text()='运营管理']");
		webtest.click("xpath=//*[text()='财务管理']");
		webtest.click("xpath=//*[text()='提现申请']");
		driver.switchTo().frame("wst-lframe-56");
		webtest.type("id=cashNo", "123456");
		webtest.click("xpath=//input[@type='button']");
	}

	@Test(priority = 4)
	public void test4() throws InterruptedException {
		// 运营管理-财务管理-提现申请，更改提现状态为待处理进行查询
		WebElement selector;
		webtest.click("xpath=//*[text()='运营管理']");
		webtest.click("xpath=//*[text()='财务管理']");
		webtest.click("xpath=//*[text()='提现申请']");
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
		// 运营管理-财务管理-提现申请，更改提现状态为已通过进行查询
		WebElement selector;
		webtest.click("xpath=//*[text()='运营管理']");
		webtest.click("xpath=//*[text()='财务管理']");
		webtest.click("xpath=//*[text()='提现申请']");
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
		// 运营管理-财务管理-提现申请，更改下方每页显示页数为50条
		WebElement selector;
		webtest.click("xpath=//*[text()='运营管理']");
		webtest.click("xpath=//*[text()='财务管理']");
		webtest.click("xpath=//*[text()='提现申请']");
		driver.switchTo().frame("wst-lframe-56");
		Thread.sleep(2000);
		selector = driver.findElement(By.xpath("//div[@class='l-bar-group l-bar-selectpagesize']//select[1]"));
		Select select = new Select(selector);
		select.selectByValue("50");
		Thread.sleep(2000);
	}

	@Test(priority = 7)
	public void test7() throws InterruptedException {
		// 运营管理-财务管理-提现申请，更改下方每页显示页数为100条
		WebElement selector;
		webtest.click("xpath=//*[text()='运营管理']");
		webtest.click("xpath=//*[text()='财务管理']");
		webtest.click("xpath=//*[text()='提现申请']");
		driver.switchTo().frame("wst-lframe-56");
		Thread.sleep(2000);
		selector = driver.findElement(By.xpath("//div[@class='l-bar-group l-bar-selectpagesize']//select[1]"));
		Select select = new Select(selector);
		select.selectByValue("100");
		Thread.sleep(2000);
	}

	@Test(priority = 8)
	public void test8() throws InterruptedException {
		// 运营管理-财务管理-提现申请，更改下方每页显示页数为150条
		WebElement selector;
		webtest.click("xpath=//*[text()='运营管理']");
		webtest.click("xpath=//*[text()='财务管理']");
		webtest.click("xpath=//*[text()='提现申请']");
		driver.switchTo().frame("wst-lframe-56");
		Thread.sleep(2000);
		selector = driver.findElement(By.xpath("//div[@class='l-bar-group l-bar-selectpagesize']//select[1]"));
		Select select = new Select(selector);
		select.selectByValue("150");
		Thread.sleep(2000);
	}

	@Test(priority = 9)
	public void test9() throws InterruptedException {
		// 运营管理-财务管理-提现申请，更改下方每页显示页数为200条
		WebElement selector;
		webtest.click("xpath=//*[text()='运营管理']");
		webtest.click("xpath=//*[text()='财务管理']");
		webtest.click("xpath=//*[text()='提现申请']");
		driver.switchTo().frame("wst-lframe-56");
		selector = driver.findElement(By.xpath("//div[@class='l-bar-group l-bar-selectpagesize']//select[1]"));
		Select select = new Select(selector);
		select.selectByValue("200");
	}

	@Test(priority = 10)
	public void test10() throws InterruptedException {
		// 订单管理-待发货订单，输入订单编号进行查询
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='待发货订单']");
		driver.switchTo().frame("wst-lframe-35");
		webtest.type("id=orderNo", "100000176");
		webtest.click("xpath=//*[text()='查询']");
	}

	@Test(priority = 11)
	public void test11() throws InterruptedException {
		// 订单管理-待发货订单，更改付款方式为全部进行查询
		WebElement selector;
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='待发货订单']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("payType"));
		Select select = new Select(selector);
		select.selectByValue("-1");
		webtest.click("xpath=//*[text()='查询']");
	}

	@Test(priority = 12)
	public void test12() throws InterruptedException {
		// 订单管理-待发货订单，更改付款方式为货到付款进行查询
		WebElement selector;
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='待发货订单']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("payType"));
		Select select = new Select(selector);
		select.selectByValue("0");
		webtest.click("xpath=//*[text()='查询']");
	}

	@Test(priority = 13)
	public void test13() throws InterruptedException {
		// 订单管理-待发货订单，更改付款方式为在线支付进行查询
		WebElement selector;
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='待发货订单']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("payType"));
		Select select = new Select(selector);
		select.selectByValue("1");
		webtest.click("xpath=//*[text()='查询']");
	}

	@Test(priority = 14)
	public void test14() throws InterruptedException {
		// 订单管理-待发货订单，更改配送方式为全部进行查询
		WebElement selector;
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='待发货订单']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("deliverType"));
		Select select = new Select(selector);
		select.selectByValue("-1");
		webtest.click("xpath=//*[text()='查询']");
	}

	@Test(priority = 15)
	public void test15() throws InterruptedException {
		// 订单管理-待发货订单，更改配送方式为自提进行查询
		WebElement selector;
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='待发货订单']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("deliverType"));
		Select select = new Select(selector);
		select.selectByValue("0");
		webtest.click("xpath=//*[text()='查询']");
	}

	@Test(priority = 16)
	public void test16() throws InterruptedException {
		// 订单管理-待发货订单，更改配送方式为送货上门进行查询
		WebElement selector;
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='待发货订单']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("deliverType"));
		Select select = new Select(selector);
		select.selectByValue("1");
		webtest.click("xpath=//*[text()='查询']");
	}

	@Test(priority = 17)
	public void test17() throws InterruptedException {
		// 订单管理-待发货订单，删除列表中的订单
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='待发货订单']");
		driver.switchTo().frame("wst-lframe-35");
		webtest.click("xpath=(//table[@class='l-grid-body-table']/following::table)[2]");
		webtest.click("xpath=//div[@class='layui-layer-btn']//a[1]");
		Thread.sleep(2000);
	}

	@Test(priority = 18)
	public void test18() throws InterruptedException {
		// 订单管理-待发货订单，发货列表中的订单（配送方式为送货上门），快递选择顺丰快递，不输入订单号
		WebElement selector;
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='待发货订单']");
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
		// 订单管理-待发货订单，发货列表中的订单（配送方式为送货上门），不选择快递，输入订单号123456
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='待发货订单']");
		driver.switchTo().frame("wst-lframe-35");
		webtest.click("xpath=(//table[@class='l-grid-body-table']/following::table)[2]");
		webtest.type("id=expressNo", "123456");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='layui-layer-btn']//a[1]");
		Thread.sleep(2000);
	}

	@Test(priority = 20)
	public void test20() throws InterruptedException {
		// 订单管理-待发货订单，发货列表中的订单（配送方式为送货上门），快递选择顺丰快递，输入订单号为123456
		WebElement selector;
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='待发货订单']");
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
		// 订单管理-待发货订单，查看订单详情并返回
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='待发货订单']");
		driver.switchTo().frame("wst-lframe-35");
		webtest.click("xpath=(//div[@class='l-grid-row-cell-inner']//a)[1]");
		Thread.sleep(200);
		webtest.click("xpath=//input[@type='button']");
		Thread.sleep(2000);
	}

//	@Test
//	public void test22() throws InterruptedException {
//		//订单管理-待发货订单，发货列表中的订单（配送方式为自提）
//		webtest.click("xpath=//*[text()='订单管理']");
//	    webtest.click("xpath=//*[text()='待发货订单']");
//		driver.switchTo().frame("wst-lframe-35");
//		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[9]/div/a[2]");
//		Thread.sleep(2000);
//		webtest.click("xpath=/html/body/div[5]/div[3]/a[1]");
//		Thread.sleep(2000);	
//	}

	@Test(priority = 22)
	public void test23() throws InterruptedException {
		// 订单管理-待付款订单，输入订单编号点击查询
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='待付款订单']");
		driver.switchTo().frame("wst-lframe-35");
		webtest.type("id=orderNo", "123456");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='查询']");
		Thread.sleep(2000);
	}

	@Test(priority = 23)
	public void test24() throws InterruptedException {
		// 订单管理-待付款订单，选择配送方式为自提，点击查询
		WebElement selector;
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='待付款订单']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("deliverType"));
		Select select = new Select(selector);
		select.selectByValue("1");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='查询']");
		Thread.sleep(2000);
	}

	@Test(priority = 24)
	public void test25() throws InterruptedException {
		// 订单管理-待付款订单，选择配送方式为送货上门，点击查询
		WebElement selector;
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='待付款订单']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("deliverType"));
		Select select = new Select(selector);
		select.selectByValue("0");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='查询']");
		Thread.sleep(2000);
	}

	@Test(priority = 25)
	public void test26() throws InterruptedException {
		// 订单管理-已发货订单，输入订单编号，点击查询
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='已发货订单']");
		driver.switchTo().frame("wst-lframe-35");
		webtest.type("id=orderNo", "100000294");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='查询']");
		Thread.sleep(2000);
	}

	@Test(priority = 26)
	public void test27() throws InterruptedException {
		// 订单管理-已发货订单，更改支付方式为送货上门，点击查询
		WebElement selector;
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='已发货订单']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("payType"));
		Select select = new Select(selector);
		select.selectByValue("0");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='查询']");
		Thread.sleep(2000);
	}

	@Test(priority = 27)
	public void test28() throws InterruptedException {
		// 订单管理-已发货订单，更改支付方式为在线支付，点击查询
		WebElement selector;
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='已发货订单']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("payType"));
		Select select = new Select(selector);
		select.selectByValue("1");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='查询']");
		Thread.sleep(2000);
	}

	@Test(priority = 28)
	public void test29() throws InterruptedException {
		// 订单管理-已发货订单，更改配送方式为自提，点击查询
		WebElement selector;
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='已发货订单']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("deliverType"));
		Select select = new Select(selector);
		select.selectByValue("1");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='查询']");
		Thread.sleep(2000);
	}

	@Test(priority = 29)
	public void test30() throws InterruptedException {
		// 订单管理-已发货订单，更改配送方式为送货上门，点击查询
		WebElement selector;
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='已发货订单']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("deliverType"));
		Select select = new Select(selector);
		select.selectByValue("0");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='查询']");
		Thread.sleep(2000);
	}

	@Test(priority = 30)
	public void test31() throws InterruptedException {
		// 订单管理-已发货订单，点击商品详情然后返回
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='已发货订单']");
		driver.switchTo().frame("wst-lframe-35");
		webtest.click("xpath=(//div[@class='l-grid-row-cell-inner']//a)[1]");
		Thread.sleep(2000);
		webtest.click("xpath=//input[@type='button']");
		Thread.sleep(2000);
	}

	@Test(priority = 31)
	public void test32() throws InterruptedException {
		// 订单管理-已发货订单，删除商品，在弹出的界面选择取消
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='已发货订单']");
		driver.switchTo().frame("wst-lframe-35");
		webtest.click("xpath=(//div[@class='l-grid-row-cell-inner']//a)[2]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='layui-layer-btn']//a)[2]");
		Thread.sleep(2000);
	}

	@Test(priority = 32)
	public void test33() throws InterruptedException {
		// 订单管理-取消/拒收订单，输入订单编号进行查询
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='取消/拒收订单']");
		driver.switchTo().frame("wst-lframe-35");
		webtest.type("id=orderNo", "100000143");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='查询']");
		Thread.sleep(2000);
	}

	@Test(priority = 33)
	public void test34() throws InterruptedException {
		// 订单管理-取消/拒收订单，更改订单状态为已取消，查询
		WebElement selector;
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='取消/拒收订单']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("orderStatus"));
		Select select = new Select(selector);
		select.selectByValue("-1");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='查询']");
		Thread.sleep(2000);
	}

	@Test(priority = 34)
	public void test35() throws InterruptedException {
		// 订单管理-取消/拒收订单，更改订单状态为用户拒收，查询
		WebElement selector;
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='取消/拒收订单']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("orderStatus"));
		Select select = new Select(selector);
		select.selectByValue("-3");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='查询']");
		Thread.sleep(2000);
	}

	@Test(priority = 35)
	public void test36() throws InterruptedException {
		// 订单管理-取消/拒收订单，更改支付方式为货到付款，查询
		WebElement selector;
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='取消/拒收订单']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("payType"));
		Select select = new Select(selector);
		select.selectByValue("0");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='查询']");
		Thread.sleep(2000);
	}

	@Test(priority = 36)
	public void test37() throws InterruptedException {
		// 订单管理-取消/拒收订单，更改支付方式为在线支付，查询
		WebElement selector;
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='取消/拒收订单']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("payType"));
		Select select = new Select(selector);
		select.selectByValue("1");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='查询']");
		Thread.sleep(2000);
	}

	@Test(priority = 37)
	public void test38() throws InterruptedException {
		// 订单管理-取消/拒收订单，更改配送方式为自提，查询
		WebElement selector;
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='取消/拒收订单']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("deliverType"));
		Select select = new Select(selector);
		select.selectByValue("1");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='查询']");
		Thread.sleep(2000);
	}

	@Test(priority = 38)
	public void test39() throws InterruptedException {
		// 订单管理-取消/拒收订单，更改配送方式为送货上门，查询
		WebElement selector;
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='取消/拒收订单']");
		driver.switchTo().frame("wst-lframe-35");
		selector = driver.findElement(By.id("deliverType"));
		Select select = new Select(selector);
		select.selectByValue("0");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='查询']");
		Thread.sleep(2000);
	}

	@Test(priority = 39)
	public void test40() throws InterruptedException {
		// 订单管理-已收货订单，输入订单编号进行查询
		webtest.click("xpath=//*[text()='订单管理']");
		webtest.click("xpath=//*[text()='已收货订单']");
		driver.switchTo().frame("wst-lframe-35");
		webtest.type("id=orderNo", "100000110");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='查询']");
		Thread.sleep(2000);
	}

	@Test(priority = 40)
	public void test41() throws InterruptedException {
		// 商品管理-在售商品，在所属分类中选择“时蔬水果、网上菜场”，进行查询
		WebElement selector;
		webtest.click("xpath=//*[text()='商品管理']");
		webtest.click("xpath=//*[text()='在售商品']");
		driver.switchTo().frame("wst-lframe-22");
		selector = driver.findElement(By.id("cat_0"));
		Select select = new Select(selector);
		select.selectByValue("47");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='查询']");
		Thread.sleep(2000);
	}

	@Test(priority = 41)
	public void test42() throws InterruptedException {
		// 商品管理-在售商品，在商品中填入编号“148267577224604”，进行查询
		webtest.click("xpath=//*[text()='商品管理']");
		webtest.click("xpath=//*[text()='在售商品']");
		driver.switchTo().frame("wst-lframe-22");
		webtest.type("id=goodsName", "148267577224604");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='查询']");
		Thread.sleep(2000);
	}

	@Test(priority = 42)
	public void test43() throws InterruptedException {
		// 商品管理-在售商品，在商品中填入商品名称“私房酒”，进行查询
		webtest.click("xpath=//*[text()='商品管理']");
		webtest.click("xpath=//*[text()='在售商品']");
		driver.switchTo().frame("wst-lframe-22");
		webtest.type("id=goodsName", "私房酒");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='查询']");
		Thread.sleep(2000);
	}

	@Test(priority = 43)
	public void test44() throws InterruptedException {
		// 商品管理-在售商品，选中第一个商品，将它设置为推荐
		webtest.click("xpath=//*[text()='商品管理']");
		webtest.click("xpath=//*[text()='在售商品']");
		driver.switchTo().frame("wst-lframe-22");
		webtest.click("xpath=(//input[@class='chk'])[2]");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='推荐']");
		Thread.sleep(2000);
	}

	@Test(priority = 44)
	public void test45() throws InterruptedException {
		// 商品管理-在售商品，选择第一个商品，双击修改属性
		webtest.click("xpath=//*[text()='商品管理']");
		webtest.click("xpath=//*[text()='在售商品']");
		driver.switchTo().frame("wst-lframe-22");
		webtest.doubleClick("xpath=(//div[@title='双击可修改'])[3]");
		Thread.sleep(2000);
	}

	@Test(priority = 45)
	public void test46() throws InterruptedException {
		// 商品管理-在售商品，选择第一个商品，删除，在弹出的界面选择确定
		webtest.click("xpath=//*[text()='商品管理']");
		webtest.click("xpath=//*[text()='在售商品']");
		driver.switchTo().frame("wst-lframe-22");
		webtest.click("xpath=(//div[@class='goods-valign-m']//a)[3]");
		Thread.sleep(200);
		webtest.click("xpath=//div[@class='layui-layer-btn']//a[1]");
		Thread.sleep(2000);
	}

	@Test(priority = 46)
	public void test47() throws InterruptedException {
		// 商品管理-新增商品-商品信息，填写对应信息，新增商品
		webtest.click("xpath=//*[text()='商品管理']");
		webtest.click("xpath=//*[text()='新增商品']");
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
		webtest.type("id=goodsName", "娃哈哈");
		Thread.sleep(500);
		webtest.typeAndClear("id=marketPrice", "7.50");
		Thread.sleep(500);
		webtest.typeAndClear("id=shopPrice", "6.00");
		Thread.sleep(500);
		webtest.typeAndClear("id=goodsStock", "5200");
		Thread.sleep(500);
		webtest.typeAndClear("id=warnStock", "100");
		Thread.sleep(500);
		webtest.typeAndClear("id=goodsUnit", "娃哈哈官方旗舰店");
		Thread.sleep(500);
		webtest.click("xpath=//*[text()='保存']");
		Thread.sleep(2000);
	}

	@Test(priority = 47)
	public void planb47() throws InterruptedException {
		// 商品管理-品牌管理，在品牌名称中输入“西门子”，点击查询
		webtest.click("xpath=//*[text()='商品管理']");
		webtest.click("xpath=//*[text()='品牌管理']");
		driver.switchTo().frame("wst-lframe-22");
		webtest.type("id=key", "西门子");
		Thread.sleep(200);
		webtest.click("xpath=//button[text()='查询']");
		Thread.sleep(2000);
	}

	@Test(priority = 48)
	public void test48() throws InterruptedException {
		// 商品管理-商品分类，新增子分类
		webtest.click("xpath=//*[text()='商品管理']");
		webtest.click("xpath=//*[text()='商品分类']");
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
		// 商品管理-商品属性，修改商品的排序号为2
		webtest.click("xpath=//*[text()='商品管理']");
		webtest.click("xpath=//*[text()='商品属性']");
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
		// 商品管理-评价管理，删除第一条评论
		webtest.click("xpath=//*[text()='商品管理']");
		webtest.click("xpath=//*[text()='评价管理']");
		driver.switchTo().frame("wst-lframe-22");
		webtest.click("xpath=(//div[@class='l-grid-row-cell-inner']//a)[2]");
		Thread.sleep(200);
		webtest.click("xpath=(//div[@class='layui-layer-btn']//a)[2]");
		Thread.sleep(2000);
	}
}
