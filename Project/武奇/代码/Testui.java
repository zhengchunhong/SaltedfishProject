package com.webtest.demo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;


public class Testui extends BaseTest{
	//登录是测试前提
	@BeforeMethod
    public void testLogin() throws InterruptedException{
		webtest.open("http://localhostsh:99/home/users/login.html");
		Thread.sleep(200);
		webtest.type("id=loginName", "18703236116");
		Thread.sleep(200);
		webtest.type("id=loginPwd", "19820818");
		Thread.sleep(200);
		webtest.type("id=verifyCode", "aaaa");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[6]/div[2]/div[2]/form/table/tbody/tr[9]/td/div/a");
		Thread.sleep(200);
	}
	//part1打开
	//01打开页面-我的订单
	@Test
	public void order_test01() throws InterruptedException {
		webtest.open("http://localhostsh:99/home/index/index.html");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[1]/div/ul[2]/li[1]/div[1]/a");
		Thread.sleep(200);
	}
	//02打开页面-待付款订单
	@Test
	public void order_test02() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[1]");
		Thread.sleep(200);
	}
	//03打开页面-待收货订单
	@Test
	public void order_test03() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[2]");
		Thread.sleep(200);
	}
	//04打开页面-待发货订单
	@Test
	public void order_test04() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[3]");
		Thread.sleep(200);
	}
	//05打开页面-待评价订单
	@Test
	public void order_test05() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[4]");
		Thread.sleep(200);
	}
	//06打开页面-已完成订单
	@Test
	public void order_test06() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[5]");
		Thread.sleep(200);
	}
	//07打开页面-待取消订单
	@Test
	public void order_test07() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[6]");
		Thread.sleep(200);
	}
	//08打开页面-拒收/退款
	@Test
	public void order_test08() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[7]");
		Thread.sleep(200);
	}
	//09打开页面-我的评价
	@Test
	public void order_test09() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[8]");
		Thread.sleep(200);
	}
	//part2待付款
	//10待付款订单通过订单号查询
	@Test
	public void order_test10() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[1]");
		Thread.sleep(200);
		webtest.type("id=orderNo", "100000294");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/button");
		Thread.sleep(200);
	}
	//11待付款订单通过姓名查询
	@Test
	public void order_test11() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[1]");
		Thread.sleep(200);
		webtest.type("id=userName", "武奇奇");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/button");
		Thread.sleep(200);
	}
	//12查看待付款订单详情
	@Test
	public void order_test12() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[1]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[2]/tr[3]/td[4]/div[2]/a");
		Thread.sleep(200);
	}
	//13查看待付款订单支付
	@Test
	public void order_test13() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[1]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[2]/tr[3]/td[4]/div[1]/a");
		Thread.sleep(200);
	}
	//14待付款订单取消
	@Test
	public void order_test14() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[1]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[2]/tr[2]/td/div[3]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[8]/div[3]/a[1]");
		Thread.sleep(200);
	}
	//15查看待付款订单的商品详情
	@Test
	public void order_test15() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[1]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[2]/tr[3]/td[1]/div[1]/a");
		Thread.sleep(200);
	}
	//part 3待收货
	//16待收货订单通过订单号查询
	@Test
	public void order_test16() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[2]");
		Thread.sleep(200);
		webtest.type("id=orderNo", "100000316");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/button");
		Thread.sleep(200);
	}
	//17待收货订单通过姓名查询
	@Test
	public void order_test17() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[2]");
		Thread.sleep(200);
		webtest.type("id=userName", "武奇奇");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/button");
		Thread.sleep(200);
	}
	//18查看待收货订单详情
		@Test
		public void order_test18() throws InterruptedException {
			webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[2]");
			Thread.sleep(200);
			webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[2]/tr[3]/td[4]/div[3]/a");
			Thread.sleep(200);
		}
		//19查看待收货订单的商品详情
		@Test
		public void order_test19() throws InterruptedException {
			webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[2]");
			Thread.sleep(200);
			webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[2]/tr[3]/td[1]/div[1]/a");
			Thread.sleep(200);
		}
	//20取消确认收货
	@Test
	public void order_test20() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[2]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[2]/tr[3]/td[4]/div[1]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[8]/div[3]/a[2]");
		Thread.sleep(200);
	}
	//21确认收货
	@Test
	public void order_test21() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[2]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[2]/tr[3]/td[4]/div[1]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[8]/div[3]/a[1]");
		Thread.sleep(200);
	}
	
	//part4 待发货
	//22待发货订单通过订单号查询
	@Test
	public void order_test22() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[3]");
		Thread.sleep(200);
		webtest.type("id=orderNo", "100000213");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/button");
		Thread.sleep(200);
	}
	//23待发货订单通过姓名查询
	@Test
	public void order_test23() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[3]");
		Thread.sleep(200);
		webtest.type("id=userName", "武奇奇");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/button");
		Thread.sleep(200);
	}
	//24查看待发货订单详情
	@Test
	public void order_test24() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[3]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[3]/tr[3]/td[4]/div/a");
		Thread.sleep(200);
	}
	//25查看待发货订单的商品详情
	@Test
	public void order_test25() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[3]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[3]/tr[3]/td[1]/div[1]/a");
		Thread.sleep(200);
	}
	//26取消待发货订单
	@Test
	public void order_test26() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[3]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[2]/tr[2]/td/div[3]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[8]/div[3]/a[1]");
		Thread.sleep(200);
	}
	//part5待评价
	//27待评价订单通过订单号查询
	@Test
	public void order_test27() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[4]");
		Thread.sleep(200);
		webtest.type("id=orderNo", "100000224");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/button");
		Thread.sleep(200);
	}
	//28待评价订单通过姓名查询
	@Test
	public void order_test28() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[4]");
		Thread.sleep(200);
		webtest.type("id=userName", "武奇奇");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/button");
		Thread.sleep(200);
	}
	//29查看待评价订单详情
	@Test
	public void order_test29() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[4]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[2]/tr[3]/td[4]/div[2]/a");
		Thread.sleep(200);
	}
	//30查看待评价订单的商品详情
	@Test
	public void order_test30() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[4]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[2]/tr[3]/td[1]/div[1]/a");
		Thread.sleep(200);
	}
	//31文字评价订单
	@Test
	public void order_test31() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[4]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[2]/tr[3]/td[4]/div[1]/a");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/form/div/div[2]/div[1]/div[2]/div[1]/img[4]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/form/div/div[2]/div[3]/div[2]/div[1]/img[5]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/form/div/div[2]/div[5]/div[2]/div[1]/img[5]");
		Thread.sleep(200);
		webtest.type("id=content1", "非常好");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/form/div/div[2]/div[10]/div[4]/div[3]/button");
		Thread.sleep(200);
	}
	//part6已完成
	//32已完成订单通过订单号查询
	@Test
	public void order_test32() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[5]");
		Thread.sleep(200);
		webtest.type("id=orderNo", "100000342");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/button");
		Thread.sleep(200);
	}
	//33已完成订单通过姓名查询
	@Test
	public void order_test33() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[5]");
		Thread.sleep(200);
		webtest.type("id=userName", "武奇奇");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/button");
		Thread.sleep(200);
	}
	//34查看已完成订单详情
	@Test
	public void order_test34() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[5]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[2]/tr[3]/td[4]/div[2]/a");
		Thread.sleep(200);
	}
	//35查看待完成订单的商品详情
	@Test
	public void order_test35() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[5]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[2]/tr[3]/td[1]/div[1]/a");
		Thread.sleep(200);
	}
	//part7已取消
	//36已取消订单通过订单号查询
	@Test
	public void order_test36() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[6]");
		Thread.sleep(200);
		webtest.type("id=orderNo", "100000250");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/button");
		Thread.sleep(200);
	}
	//37已取消订单通过姓名查询
	@Test
	public void order_test37() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[6]");
		Thread.sleep(200);
		webtest.type("id=userName", "武奇奇");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/button");
		Thread.sleep(200);
	}
	//38查看已取消订单详情
	@Test
	public void order_test38() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[6]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[2]/tr[3]/td[4]/div/a");
		Thread.sleep(200);
	}
	//39查看已取消订单的商品详情
	@Test
	public void order_test39() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[6]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[2]/tr[3]/td[1]/div[1]/a");
		Thread.sleep(200);
	}
	//part8 拒收/退款
	//40拒收/退款订单通过订单号查询
	@Test
	public void order_test40() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[7]");
		Thread.sleep(200);
		webtest.type("id=orderNo", "100000176");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/button");
		Thread.sleep(200);
	}
	//41拒收/退款订单通过姓名查询
	@Test
	public void order_test41() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[7]");
		Thread.sleep(200);
		webtest.type("id=userName", "武奇奇");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/button");
		Thread.sleep(200);
	}
	//42查看拒收/退款订单详情
	@Test
	public void order_test42() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[7]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[2]/tr[3]/td[4]/div/a");
		Thread.sleep(200);
	}
	//43查看拒收/退款订单的商品详情
	@Test
	public void order_test43() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[7]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[3]/table/tbody[2]/tr[3]/td[1]/div[1]/a");
		Thread.sleep(200);
	}
	//44用户拒收订单通过未退款查询
	@Test
	public void order_test44() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[7]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/select/option[3]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/button");
		Thread.sleep(200);
	}
	//45用户拒收订单通过已退款查询
	@Test
	public void order_test45() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[1]/li[7]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/select/option[2]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/button");
		Thread.sleep(200);
	}
	//part9我关注的商品
	//46查看我关注的商品
	@Test
	public void order_test46() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul[2]/li");
		Thread.sleep(200);
	}
	//part10积分明细
	//47查看积分明细
	@Test
	public void order_test47() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[1]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/div/ul/li[1]");
		Thread.sleep(200);
	}
	//48查看积分收入
	@Test
	public void order_test48() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[1]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/div/ul/li[2]");
		Thread.sleep(200);
	}
	//49查看积分支出
	@Test
	public void order_test49() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[1]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/div/ul/li[3]");
		Thread.sleep(200);
	}
	//part11资金流水
	//50查看资金流水
	@Test
	public void order_test50() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[2]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/div/ul/li[1]");
		Thread.sleep(200);
	}
	//51查看资金收入
	@Test
	public void order_test51() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[2]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/div/ul/li[2]");
		Thread.sleep(200);
	}
	//52查看资金收入
	@Test
	public void order_test52() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[2]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/div/ul/li[3]");
		Thread.sleep(200);
	}
	//part13提现管理
	//53查看提现记录
	@Test
	public void order_test53() throws InterruptedException {
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[3]");
		Thread.sleep(200);
		webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/div/ul/li[1]");
		Thread.sleep(200);
	}
		//54查看提现账号
		@Test
		public void order_test54() throws InterruptedException {
			webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
			Thread.sleep(200);
			webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[3]");
			Thread.sleep(200);
			webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/div/ul/li[2]");
			Thread.sleep(200);
		}
		//55删除提现账号
		@Test
		public void order_test55() throws InterruptedException {
			webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/div/a[2]/li");
			Thread.sleep(200);
			webtest.click("xpath=/html/body/div[3]/div[3]/div[1]/ul/li[3]");
			Thread.sleep(200);
			webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/div/ul/li[2]");
			Thread.sleep(200);
			webtest.click("xpath=/html/body/div[3]/div[3]/div[2]/div[2]/div/div/div[2]/table/tbody/tr/td[5]/a[2]");
			Thread.sleep(200);
			webtest.click("xpath=/html/body/div[8]/div[3]/a[1]");
			Thread.sleep(200);
			
		}
	
}
