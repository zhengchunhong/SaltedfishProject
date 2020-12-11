package com.webtest.mail;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

import org.testng.TestListenerAdapter;
import org.testng.annotations.Listeners;

import com.sun.mail.util.MailSSLSocketFactory;

/**
 * �ʼ�����
 *�����
 * 
 */

public class SendUtil extends TestListenerAdapter {

	public static void main(String[] args) throws GeneralSecurityException, UnsupportedEncodingException {
		// �ռ��˵�������
		String to = "lhy001217plus@126.com";

		// �����˵�������
		String from = "lhy001217@126.com";

		// ָ�������ʼ�������Ϊ smtp.126.com
		String host = "smtp.126.com"; 

		// ��ȡϵͳ����
		Properties properties = System.getProperties();

		// �����ʼ�������
		properties.setProperty("mail.smtp.host", host);

		properties.put("mail.smtp.auth", "true");
		MailSSLSocketFactory sf = new MailSSLSocketFactory();
		sf.setTrustAllHosts(true);
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.ssl.socketFactory", sf);
		// ��ȡĬ��session����
		Session session = Session.getDefaultInstance(properties, new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() { // 126����������˻�����������¼��Ȩ��
				return new PasswordAuthentication("lhy001217@126.com", "EXSSEWVTETDLXYJS"); // �������ʼ��û�������Ȩ��
			}
		});

		try {
			// ����Ĭ�ϵ� MimeMessage ����
			MimeMessage message = new MimeMessage(session);

			// Set From: ͷ��ͷ�ֶ�
			message.setFrom(new InternetAddress(from));

			// Set To: ͷ��ͷ�ֶ�
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			// Set Subject: ��������
			message.setSubject("��Ŀʵѵ");

			// ������Ϣ����
			BodyPart messageBodyPart = new MimeBodyPart();

			// ��Ϣ
			messageBodyPart.setText("�����-ReportNG-testout�Ը�����ʽ����");

			// ����������Ϣ
			Multipart multipart = new MimeMultipart();

			// �����ı���Ϣ����
			multipart.addBodyPart(messageBodyPart);

			// ��������
			messageBodyPart = new MimeBodyPart();
			// ����Ҫ���͸������ļ�·��
			String filename = "D:\\Java\\2019-09-workplace\\test-output.zip";
			DataSource source = new FileDataSource(filename);
			messageBodyPart.setDataHandler(new DataHandler(source));

			// messageBodyPart.setFileName(filename);
			// �������������ģ������ļ�·������������
			messageBodyPart.setFileName(MimeUtility.encodeText(filename));
			multipart.addBodyPart(messageBodyPart);

			// ����������Ϣ
			message.setContent(multipart);

			// ������Ϣ
			Transport.send(message);
			System.out.println("Sent message successfully....");
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
	}

}