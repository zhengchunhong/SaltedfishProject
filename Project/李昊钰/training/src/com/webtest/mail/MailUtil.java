package com.webtest.mail;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import com.webtest.utils.ReadProperties;

/*
 * ReportNG�����ʼ�
 * �����
* */
public class MailUtil {
	private String sender = "lhy001217@126.com"; // �����������ַ
	private String auth_code = "EXSSEWVTETDLXYJS"; // ��Ȩ��
	private String subject = "��Ŀʵѵ"; // �ʼ�����
	private String content; // �ʼ����ı�����

	public String getContent() { 
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void sendMail() throws IOException {

		Properties props = new Properties();
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.host", "smtp.126.com");
		props.put("mail.smtp.auth", true);

		// 1������Session�����ʼ��Ự���󣩣����÷���������Ȩ�룬��ҪProperties����
		Session session = Session.getInstance(props, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// TODO Auto-generated method stub
				return new PasswordAuthentication(sender, auth_code);
			}

		});

		// 2�������ʼ�������Message�������� MimeMessage
		// ���÷����ˡ��ռ��ˡ����⡢����
		Message message = new MimeMessage(session);
		String receiver1 = ReadProperties.getPropertyValue("tomail1");
		try {
			message.setFrom(new InternetAddress(sender));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(receiver1));
			message.setSubject(subject);
			message.setText(content);
			// 3�������ʼ�
			Transport.send(message);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
