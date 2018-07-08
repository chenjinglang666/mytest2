package com.it.lianxi.util;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

/**
 * �����ʼ��������������������������
 * ------------------------------------------------------------
 * -------------------------------------- ʹ�÷����� 1_���������com.itheima.shop.util����
 * 2_����mail.jar�����̵�/WEB-INF/lib/��
 * 3_дһ��Demo01���main����������MailEyouUtil.sendMail("����������","�ռ�������","�ʼ�����","֧��HTML��ʽ���ʼ�����"
 * ) �磺MailEyouUtil.sendMail("zhaojun@abc.com","zhaoyun@abc.com","����һ��",
 * "<b>���</b>")
 * ------------------------------------------------------------------
 * --------------------------------
 */
public final class MailEyouUtil {

	/**
	 * ������new��������
	 */
	private MailEyouUtil() {
	}

	/**
	 * �����ʼ� ����һ������������ ���������ռ������� ���������ʼ����� �����ģ��ʼ�����
	 */
	public static void sendMail(String fromEmail, String toEmail,
			String subject, String emailMsg) throws Exception {
		// 1_����Java�����������ʼ������������Ӷ���
		Properties props = new Properties();
		props.put("mail.smtp.host", "127.0.0.1");// �����ʼ���������SMTP��������������IP
		Session session = Session.getInstance(props, null);

		// 2_����һ���ʼ�
		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(fromEmail));// ����������
		message.setRecipient(RecipientType.TO, new InternetAddress(toEmail));// �ռ�������
		message.setSubject(subject);// ����
		message.setContent(emailMsg, "text/html;charset=UTF-8");// ���ݺ͸�ʽ����

		// 3_�����ʼ�
		Transport.send(message);
	}

}
