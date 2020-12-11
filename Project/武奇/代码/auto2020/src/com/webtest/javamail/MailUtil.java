package com.webtest.javamail;

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

public class MailUtil {
	private String sender = "zheng_chunhong010@126.com"; // 发送者邮箱地址
	private String auth_code = "IUQYAGUCDOCEUVXD"; // 授权码
	private String subject = "实训任务"; // 邮件主题
	private String content; // 邮件的文本内容
	

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

		// 1、构造Session对象（邮件会话对象），设置服务器，授权码，需要Properties对象
		Session session = Session.getInstance(props, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// TODO Auto-generated method stub
				return new PasswordAuthentication(sender, auth_code);
			}

		});

		// 2、创建邮件，创建Message对象，子类 MimeMessage
		// 设置发件人、收件人、主题、正文
		Message message = new MimeMessage(session);
		String receiver1 = ReadProperties.getPropertyValue("tomail");
		try {
			message.setFrom(new InternetAddress(sender));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(receiver1));
			message.setSubject(subject);
			message.setText(content);
        
			// 3、发送邮件
			Transport.send(message);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}