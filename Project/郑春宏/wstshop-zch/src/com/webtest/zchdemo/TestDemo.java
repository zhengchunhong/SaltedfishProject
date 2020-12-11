package com.webtest.zchdemo;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

/*
 * author:郑春宏
 * 模块：wstshop网上商城后台首页模块的冒烟测试
 */
public class TestDemo extends BaseTest {

	//登录
	@BeforeMethod
	public void testLoginSuccess() throws InterruptedException {
		webtest.open("http://localhost/wstshop/admin/index/login.html");
		webtest.typeAndClear("id=loginName", "admin");
		webtest.typeAndClear("id=loginPwd", "123456");
		webtest.typeAndClear("id=verifyCode", "1111");
		webtest.click("xpath=//input[@type='button']");
		Thread.sleep(200);
		assertTrue(webtest.isTextPresent("登录"));
		Thread.sleep(200);
//		webtest.click("xpath=//*[text()='退出']");
	}

	// 修改店铺配置
	@Test
	public void test01() throws InterruptedException {
		webtest.click("xpath=//*[text()='店铺配置']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.type("id=hotWordsSearch", ",82年拉菲");
		Thread.sleep(1000);
		webtest.click("xpath=//input[@value='保存']");
		Thread.sleep(500);
	}

	// 修改导航管理
	@Test
	public void test02() throws InterruptedException {
		webtest.click("xpath=//*[text()='导航管理']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[7]/div/a[1]");
		Thread.sleep(200);
		webtest.selectByValue("id=navType", "1");
		Thread.sleep(200);
		webtest.click("xpath=//input[@value='提交']");
		Thread.sleep(500);
	}

	// 新增导航
	@Test
	public void test03() throws InterruptedException {
		webtest.click("xpath=//*[text()='导航管理']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='新增']");
		Thread.sleep(200);
		webtest.type("id=navTitle", "测试导航");
		Thread.sleep(200);
		webtest.type("id=navUrl", "http://www.baidu.com");
		Thread.sleep(200);
		webtest.type("id=navSort", "20");
		Thread.sleep(200);
		webtest.click("xpath=//input[@value='提交']");
		Thread.sleep(500);
	}

	// 删除导航
	@Test
	public void test04() throws InterruptedException {
		webtest.click("xpath=//*[text()='导航管理']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[7]/div/a[2]");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='确定']");
		Thread.sleep(500);
	}

	// 修改广告
	@Test
	public void test05() throws InterruptedException {
		webtest.click("xpath=//*[text()='广告管理']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[9]/div/a[1]");
		Thread.sleep(200);
		webtest.typeAndClear("id=adName", "2");
		Thread.sleep(300);
		webtest.click("xpath=//input[@value='提交']");
		Thread.sleep(500);
	}

	// 新增广告
	@Test
	public void test06() throws InterruptedException {
		webtest.click("xpath=//*[text()='广告管理']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='新增']");
		Thread.sleep(200);
		webtest.selectByValue("id=positionType", "1");
		Thread.sleep(200);
		webtest.selectByValue("id=adPositionId", "5");
		Thread.sleep(200);
		webtest.type("id=adName", "测试");
		Thread.sleep(200);
		webtest.type("xpath=//input[@type='file']", "D:\\az\\testfile\\hh.jpg");
		Thread.sleep(200);
		webtest.type("id=adStartDate", "2020-11-25");
		Thread.sleep(200);
		webtest.type("id=adEndDate", "2020-11-26");
		Thread.sleep(200);
		webtest.type("id=adSort", "1");
		Thread.sleep(200);
		webtest.click("xpath=//input[@value='提交']");
		Thread.sleep(500);
	}

	// 删除广告
	@Test
	public void test07() throws InterruptedException {
		webtest.click("xpath=//*[text()='广告管理']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[22]/td[9]/div/a[2]");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='确定']");
		Thread.sleep(500);
	}

	// 修改广告位置
	@Test
	public void test08() throws InterruptedException {
		webtest.click("xpath=//*[text()='广告位置']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[7]/div/a[1]");
		Thread.sleep(200);
		webtest.typeAndClear("id=apSort", "1");
		Thread.sleep(200);
		webtest.click("xpath=//input[@value='提交']");
		Thread.sleep(500);
	}

	// 新增广告位置
	@Test
	public void test09() throws InterruptedException {
		webtest.click("xpath=//*[text()='广告位置']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='新增']");
		Thread.sleep(200);
		webtest.selectByValue("id=positionType", "1");
		Thread.sleep(200);
		webtest.type("id=positionName", "测试位置");
		Thread.sleep(200);
		webtest.type("id=positionCode", "测试01");
		Thread.sleep(200);
		webtest.type("id=positionWidth", "100");
		Thread.sleep(200);
		webtest.type("id=positionHeight", "100");
		Thread.sleep(200);
		webtest.typeAndClear("id=apSort", "1");
		Thread.sleep(200);
		webtest.click("xpath=//input[@value='提交']");
		Thread.sleep(500);
	}

	// 删除广告位置
	@Test
	public void test10() throws InterruptedException {
		webtest.click("xpath=//*[text()='广告位置']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[23]/td[7]/div/a[2]");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='确定']");
		Thread.sleep(500);
	}

	// 修改银行
	@Test
	public void test11() throws InterruptedException {
		webtest.click("xpath=//*[text()='银行管理']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[2]/div/a[1]");
		Thread.sleep(200);
		webtest.type("id=bankName", "1");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='确定']");
		Thread.sleep(500);
	}

	// 新增银行
	@Test
	public void test12() throws InterruptedException {
		webtest.click("xpath=//*[text()='银行管理']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='新增']");
		Thread.sleep(200);
		webtest.type("id=bankName", "测试银行");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='确定']");
		Thread.sleep(500);
	}

	// 删除银行
	@Test
	public void test13() throws InterruptedException {
		webtest.click("xpath=//*[text()='银行管理']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[2]/div/a[2]");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='确定']");
		Thread.sleep(500);
	}

	// 修改地区信息
	@Test
	public void test14() throws InterruptedException {
		webtest.click("xpath=//*[text()='地区管理']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[5]/div/a[2]");
		Thread.sleep(200);
		webtest.type("id=areaKey", "1");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='确定']");
		Thread.sleep(500);
	}

	// 新增地区
	@Test
	public void test15() throws InterruptedException {
		webtest.click("xpath=//*[text()='地区管理']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='新增']");
		Thread.sleep(200);
		webtest.type("id=areaName", "唐山");
		Thread.sleep(200);
		webtest.type("id=areaKey", "1");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='确定']");
		Thread.sleep(500);
	}

	// 删除地区
	@Test
	public void test16() throws InterruptedException {
		webtest.click("xpath=//*[text()='地区管理']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[5]/div/a[3]");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='确定']");
		Thread.sleep(500);
	}

	// 修改友情链接
	@Test
	public void test17() throws InterruptedException {
		webtest.click("xpath=//*[text()='友情链接']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[4]/div/a[1]");
		Thread.sleep(200);
		webtest.type("id=friendlinkSort", "1");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='确定']");
		Thread.sleep(500);
	}

	// 新增友情链接
	@Test
	public void test18() throws InterruptedException {
		webtest.click("xpath=//*[text()='友情链接']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='新增']");
		Thread.sleep(200);
		webtest.type("id=friendlinkName", "测试");
		Thread.sleep(200);
		webtest.type("id=friendlinkUrl", "http://www.baidu.com");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='确定']");
		Thread.sleep(500);
	}

	// 删除友情链接
	@Test
	public void test19() throws InterruptedException {
		webtest.click("xpath=//*[text()='友情链接']");
		Thread.sleep(200);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[4]/div/a[2]");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='确定']");
		Thread.sleep(500);
	}

	// 修改快递
	@Test
	public void test20() {
		webtest.click("xpath=//*[text()='快递管理']");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[2]/div/a[1]");
		webtest.typeAndClear("id=expressName", "哈哈哈哈哈");
		webtest.click("xpath=//*[text()='确定']");
	}

	// 新增快递
	@Test
	public void test21() {
		webtest.click("xpath=//*[text()='快递管理']");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[text()='新增']");
		webtest.typeAndClear("id=expressName", "飞毛腿快递");
		webtest.click("xpath=//*[text()='确定']");
	}

	// 删除快递
	@Test
	public void test22() {
		webtest.click("xpath=//*[text()='快递管理']");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=/html/body/div[2]/div[4]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[2]/div/a[2]");
		webtest.click("xpath=//*[text()='确定']");
	}

	// 修改默认运费
	@Test
	public void test23() {
		webtest.click("xpath=//*[text()='运费管理']");
		webtest.enterFrame("wst-lframe-1");
		webtest.typeAndClear("id=key", "8");
		webtest.click("xpath=//*[text()='运费']");
	}

	// 新增角色管理
	@Test
	public void test24() throws InterruptedException {
		webtest.click("xpath=//*[text()='系统管理']");
		Thread.sleep(100);
		webtest.click("xpath=//*[text()='角色管理']");
		Thread.sleep(100);
		webtest.enterFrame("wst-lframe-1");
		Thread.sleep(100);
		webtest.click("xpath=//*[text()='新增']");
		Thread.sleep(100);
		webtest.type("id=roleName", "超级管理员");
		webtest.type("id=roleDesc", "测试");
		Thread.sleep(100);
		webtest.click("xpath=//input[@value='保存']");
		Thread.sleep(500);

	}

	// 修改会员等级
	@Test
	public void test25() {
		webtest.click("xpath=//*[text()='会员管理']");
		webtest.click("xpath=//*[text()='会员等级']");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=(//div[@class='l-grid-row-cell-inner']//a)[1]");
		webtest.typeAndClear("id=startScore", "3002");
		webtest.click("xpath=//input[@type='submit']");
	}

	// 新增会员等级
	@Test
	public void test26() throws InterruptedException {
		webtest.click("xpath=//*[text()='会员管理']");
		webtest.click("xpath=//*[text()='会员等级']");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//button[text()='新增']");
		webtest.type("xpath=/html/body/form/table/tbody/tr[2]/td/div/div[2]/input", "D:\\az\\testfile\\hh.jpg");
		webtest.type("id=rankName", "至尊会员");
		webtest.type("id=startScore", "10000");
		webtest.type("id=endScore", "5000");
		webtest.type("id=rebate", "80%");
		Thread.sleep(200);
		webtest.click("xpath=//input[@type='submit']");
	}

	// 删除会员等级
	@Test
	public void test27() {
		webtest.click("xpath=//*[text()='会员管理']");
		webtest.click("xpath=//*[text()='会员等级']");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=(//div[@class='l-grid-row-cell-inner']//a)[2]");
		webtest.click("xpath=//*[text()='确定']");
	}

	// 会员管理-会员管理-修改会员信息
	@Test
	public void test28() {
		webtest.click("xpath=//*[text()='会员管理']");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[4]/a[2]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1005|c110\"]/div/a[1]");
		webtest.typeAndClear("id=userPhone", "18745678909");
		webtest.typeAndClear("id=userEmail", "2596869264@qq.com");
		webtest.click("xpath=//input[@type='submit']");
	}

	// 会员管理-会员管理-新增会员
	@Test
	public void test29() {
		webtest.click("xpath=//*[text()='会员管理']");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[4]/a[2]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//button[text()='新增']");
		webtest.type("id=loginName", "ahhhhhhhh");
		webtest.type("id=userName", "ahhhhhhhh");
		webtest.type("id=userPhone", "18697549325");
		webtest.type("id=userEmail", "9686957423@qq.com");
		webtest.type("id=userScore", "1");
		webtest.type("id=userTotalScore", "1");
		webtest.type("id=userQQ", "8754693215");
		webtest.click("xpath=//input[@type='submit']");
	}

	// 会员管理-会员管理-删除会员
	@Test
	public void test30() {
		webtest.click("xpath=//*[text()='会员管理']");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[4]/a[2]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c110\"]/div/a[2]");
		webtest.click("xpath=//*[text()='确定']");
	}

	// 会员管理-会员管理-查询会员信息
	@Test
	public void test31() {
		webtest.click("xpath=//*[text()='会员管理']");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[4]/a[2]");
		webtest.enterFrame("wst-lframe-1");
		webtest.type("id=loginName1", "user");
		webtest.click("xpath=//input[@type='button']");
	}

	// 会员管理-账号管理-修改账号信息
	@Test
	public void test32() {
		webtest.click("xpath=//*[text()='会员管理']");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[4]/a[3]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1005|c108\"]/div/a[1]");
		webtest.typeAndClear("id=loginName", "testzz");
		webtest.click("xpath=//*[text()='确定']");
	}

	// 会员管理-账号管理-查询账号信息
	@Test
	public void test33() {
		webtest.click("xpath=//*[text()='会员管理']");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[4]/a[3]");
		webtest.enterFrame("wst-lframe-1");
		webtest.type("id=loginName1", "zheng");
		webtest.click("xpath=//input[@type='button']");
	}

	// 会员管理-账号管理-重置支付密码
	@Test
	public void test34() {
		webtest.click("xpath=//*[text()='会员管理']");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[4]/a[3]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1005|c108\"]/div/a[2]");
		webtest.click("xpath=//*[text()='确定']");
	}

	// 文章管理-文章管理-修改文章
	@Test
	public void test35() {
		webtest.click("xpath=//*[text()='文章管理']");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[6]/a[1]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c109\"]/div/a[1]");
		webtest.typeAndClear("id=articleKey", "修改后test");
		webtest.click("xpath=//button[@type='submit']");
	}

	// 文章管理-文章管理-新增文章
	@Test
	public void test36() {
		webtest.click("xpath=//*[text()='文章管理']");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[6]/a[1]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//button[text()='新增']");
		webtest.type("id=articleTitle", "test11");
		webtest.click("id=catIds");
		webtest.click("xpath=//span[text()='帮助中心']");
		webtest.type("id=articleKey", "test11");
		webtest.click("xpath=//*[@id=\"articleForm\"]/table/tbody/tr[5]/td/div/div[1]/span[47]/span");
		webtest.click("xpath=//*/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]");
		webtest.click("xpath=//button[@type='submit']");
	}

	// 文章管理-文章管理-删除文章
	@Test
	public void test37() {
		webtest.click("xpath=//*[text()='文章管理']");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[6]/a[1]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=(//div[@class='l-grid-row-cell-inner']//a)[2]");
		webtest.click("xpath=//*[text()='确定']");
	}

	// 文章管理-文章管理-查询文章
	@Test
	public void test38() {
		webtest.click("xpath=//*[text()='文章管理']");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[6]/a[1]");
		webtest.enterFrame("wst-lframe-1");
		webtest.type("id=key", "test");
		webtest.click("xpath=//button[text()='查询']");
	}

	// 文章管理-文章管理-批量删除文章
	@Test
	public void test39() {
		webtest.click("xpath=//*[text()='文章管理']");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[6]/a[1]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*[@id=\"maingrid|2|r1001|c102\"]/div/input");
		webtest.click("xpath=//td[@id='maingrid|2|r1002|c102']/div[1]/input[1]");
		webtest.click("xpath=//button[text()='批量删除']");
		webtest.click("xpath=//*[text()='确定']");
	}

	// 文章管理-文章分类-修改文章分类
	@Test
	public void test40() {
		webtest.click("xpath=//*[text()='文章管理']");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[6]/a[2]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=(//td[@class='l-grid-row-cell']//a)[2]");
		webtest.typeAndClear("id=catSort", "3");
		webtest.click("xpath=//*[text()='确定']");
	}

	// 文章管理-文章分类-新增文章分类
	@Test
	public void test41() {
		webtest.click("xpath=//*[text()='文章管理']");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[6]/a[2]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//button[text()='新增']");
		webtest.type("id=catName", "test11");
		webtest.type("id=catSort", "0");
		webtest.click("xpath=//*[text()='确定']");
	}

	// 文章管理-文章分类-删除文章分类
	@Test
	public void test42() {
		webtest.click("xpath=//*[text()='文章管理']");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[6]/a[2]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=(//td[@class='l-grid-row-cell']//a)[3]");
		webtest.click("xpath=//*[text()='确定']");
	}

	// 文章管理-文章分类-新增文章子分类
	@Test
	public void test43() throws InterruptedException {
		webtest.click("xpath=//*[text()='文章管理']");
		webtest.click("xpath=//*[@id=\"wst-accordion-1\"]/div[6]/a[2]");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*/div[2]/table/tr[1]/td[6]/a[1]");
		Thread.sleep(300);
		webtest.type("id=catName", "testhh");
		Thread.sleep(300);
		webtest.typeAndClear("id=catSort", "1");
		Thread.sleep(300);
		webtest.click("xpath=//*[text()='确定']");
	}

	// 系统管理-菜单权限-新增首页菜单权限
	@Test
	public void test44() throws InterruptedException {
		webtest.click("xpath=//*[text()='系统管理']");
		webtest.click("xpath=//*[text()='菜单权限']");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("id=menuTree_2_span");
		webtest.click("xpath=//button[text()='新增']");
		webtest.type("id=privilegeName", "ahhhh");
		webtest.type("id=privilegeCode", "123");
		webtest.type("id=privilegeUrl", "$$");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='确定']");
		Thread.sleep(2000);
	}

	// 系统管理-菜单权限-删除首页菜单权限
	@Test
	public void test45() {
		webtest.click("xpath=//*[text()='系统管理']");
		webtest.click("xpath=//*[text()='菜单权限']");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("id=menuTree_2_span");
		webtest.click("xpath=(//div[@class='l-grid-row-cell-inner']//a)[4]");
		webtest.click("xpath=//*[text()='确定']");
	}

	// 系统管理-菜单权限-修改首页菜单权限
	@Test
	public void test46() throws InterruptedException {
		webtest.click("xpath=//*[text()='系统管理']");
		webtest.click("xpath=//*[text()='菜单权限']");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("id=menuTree_2_span");
		webtest.click("xpath=//div[@class='l-grid-row-cell-inner']//a[1]");
		webtest.typeAndClear("id=privilegeCode", "修改后");
		webtest.typeAndClear("id=privilegeUrl", "@2");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='确定']");
	}

	// 系统管理-前台菜单-修改前台菜单
	@Test
	public void test47() throws InterruptedException {
		webtest.click("xpath=//*[text()='系统管理']");
		webtest.click("xpath=//*[text()='前台菜单']");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=(//td[@class='l-grid-row-cell']//a)[2]");
		webtest.typeAndClear("id=menuUrl", "修改");
		webtest.typeAndClear("id=menuSort", "20");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='确定']");
	}

	// 系统管理-前台菜单-新增前台菜单
	@Test
	public void test48() throws InterruptedException {
		webtest.click("xpath=//*[text()='系统管理']");
		webtest.click("xpath=//*[text()='前台菜单']");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//button[text()='新增']");
		webtest.type("id=menuName", "test11");
		webtest.type("id=menuUrl", "localhost/test11");
		webtest.type("id=menuSort", "0");
		webtest.click("id=isShow");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='确定']");
	}

	// 系统管理-前台菜单-删除前台菜单
	@Test
	public void test49() {
		webtest.click("xpath=//*[text()='系统管理']");
		webtest.click("xpath=//*[text()='前台菜单']");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*/div[2]/table/tr[2]/td[6]/a[3]");
		webtest.click("xpath=//*[text()='确定']");
	}

	// 系统管理-前台菜单-新增子菜单
	@Test
	public void test50() throws InterruptedException {
		webtest.click("xpath=//*[text()='系统管理']");
		webtest.click("xpath=//*[text()='前台菜单']");
		webtest.enterFrame("wst-lframe-1");
		webtest.click("xpath=//*/div[2]/table/tr[1]/td[6]/a[1]");
		webtest.type("id=menuName", "test11");
		webtest.type("id=menuUrl", "localhost/test11");
		webtest.type("id=menuSort", "0");
		webtest.click("id=isShow");
		Thread.sleep(200);
		webtest.click("xpath=//*[text()='确定']");
	}
}
