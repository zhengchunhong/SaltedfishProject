package com.webtest.javamail;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
public class JavaMailTestListener extends TestListenerAdapter{
	
	@Override
	public void onFinish(ITestContext testContext) {
		// TODO Auto-generated method stub
//		super.onFinish(testContext);
		// 打印出总的测试用例数目
		ITestNGMethod[] methods = this.getAllTestMethods();
		System.out.println("一共执行了：" + methods.length);

		// 成功的/失败的测试用例名称和数目
		List<ITestResult> failList = this.getFailedTests();
		int len1 = failList.size();
		System.out.println("失败的测试用例：" + len1);
		
		List<ITestResult> passList = this.getPassedTests();
		int len2 = passList.size();
		System.out.println("成功的测试用例：" + len2);

		List<String>sumList1 = new ArrayList<String>();
		List<String>sumList2 = new ArrayList<String>();
		String text1=null;
		String text2=null;
		
		for (int i = 0; i < len1; i++) {
			ITestResult tr1 = failList.get(i);
			System.out.println(tr1.getInstanceName() + ":" + tr1.getName() + "失败了");		
			sumList1.add(tr1.getInstanceName()+ ":" + tr1.getName() + "失败了");
			text1 = sumList1.toString();			
			
		}	
		for (int j = 0; j < len2; j++) {
			ITestResult tr2 = passList.get(j);
			System.out.println(tr2.getInstanceName() + ":" + tr2.getName() + "成功了");		
			sumList2.add(tr2.getInstanceName()+ ":" + tr2.getName() + "成功了");
			text2 = sumList2.toString();	
		}			
		String text = text1 + text2;
		
		MailUtil mailUtil = new MailUtil();
//		mailUtil.setContent(text);
		try {
			mailUtil.sendMail();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
