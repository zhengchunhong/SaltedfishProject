package com.webtest.mail;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class JavaMailTestListener extends TestListenerAdapter{
	
	/*
	 * �����
 * */
	@Override
	public void onFinish(ITestContext testContext) {
		// TODO Auto-generated method stub 
//		super.onFinish(testContext); 
		// ��ӡ���ܵĲ���������Ŀ
		ITestNGMethod[] methods = this.getAllTestMethods();
		System.out.println("һ��ִ���ˣ�" + methods.length);

		// �ɹ���/ʧ�ܵĲ����������ƺ���Ŀ
		List<ITestResult> failList = this.getFailedTests();
		int len1 = failList.size();
		System.out.println("ʧ�ܵĲ���������" + len1);
		
		List<ITestResult> passList = this.getPassedTests();
		int len2 = passList.size();
		System.out.println("�ɹ��Ĳ���������" + len2);

		List<String>sumList1 = new ArrayList<String>();
		List<String>sumList2 = new ArrayList<String>();
		String text1=null;
		String text2=null;
		
		for (int i = 0; i < len1; i++) {
			ITestResult tr1 = failList.get(i);
			System.out.println(tr1.getInstanceName() + ":" + tr1.getName() + "ʧ����");		
			sumList1.add(tr1.getInstanceName()+ ":" + tr1.getName() + "ʧ����");
			text1 = sumList1.toString();			
		}	
		for (int j = 0; j < len2; j++) {
			ITestResult tr2 = passList.get(j);
			System.out.println(tr2.getInstanceName() + ":" + tr2.getName() + "�ɹ���");		
			sumList2.add(tr2.getInstanceName()+ ":" + tr2.getName() + "�ɹ���");
			text2 = sumList2.toString();	
		}			
		String text = text1 + text2;
		
		MailUtil mailUtil = new MailUtil();
		mailUtil.setContent(text);
		try {
			mailUtil.sendMail();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
