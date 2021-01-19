package com.mega.mvc05;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;


@Service
public class MailService {

	@Autowired
	private JavaMailSender mailSender;

	
	
	public void mailSend2(HttpServletRequest request) {

		System.out.println("�������߻��Ͽ� mailSend2 �޼��尡 ȣ���===========");
		
		try {
			//MIMessage��ü ����
			MimeMessage message = mailSender.createMimeMessage();
			
			//message��ü �ȿ� ���� �־�� �ϴµ�, vo���� Ŭ���� ��ü�� ���� ���� �־��ֵ��� ����.
			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");
			
			messageHelper.setFrom("maymoon0621@gmail.com");
			messageHelper.setTo(request.getParameter("dmsdhre@hanmail.net"));
			messageHelper.setSubject("������ ���� �߻�");
			messageHelper.setText("�����߻�!!!!");
			
			mailSender.send(message);
			System.out.println("������ ���½��ϴ�============================");
			
		} catch (Exception e) {			
			System.out.println("���Ϻ������� ���� �߻�" + e);
		}
		
	}
	
	public void mailSend(HttpServletRequest request) {
		System.out.println(request.getParameter("tomail"));
		System.out.println(request.getParameter("title"));
		System.out.println(request.getParameter("content"));
		//System.out.println(mailSender);
		
		try {
			//MIMessage��ü ����
			MimeMessage message = mailSender.createMimeMessage();
			
			//message��ü �ȿ� ���� �־�� �ϴµ�, vo���� Ŭ���� ��ü�� ���� ���� �־��ֵ��� ����.
			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");
			
			messageHelper.setFrom("maymoon0621@gmail.com");
			messageHelper.setTo(request.getParameter("tomail"));
			messageHelper.setSubject(request.getParameter("title"));
			messageHelper.setText(request.getParameter("content"));
			
			mailSender.send(message);
			System.out.println("������ ���½��ϴ�============================");
			
		} catch (Exception e) {			
			System.out.println("���Ϻ������� ���� �߻�" + e);
		}
		
	}
}
