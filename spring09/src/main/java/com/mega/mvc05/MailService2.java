package com.mega.mvc05;

import javax.mail.internet.MimeMessage;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Aspect //����Ŭ���� ����
@Service("mail") //��ü�����Ҷ� �̸� ���� (�����߻��� �̸����� 
public class MailService2 {

	@Autowired
	private JavaMailSender mailSender;

	
	
	public void mailSend2(JoinPoint joinPoint, Throwable ex) {

		Signature signature = joinPoint.getSignature();
		System.out.println(signature.getName());
		System.out.println(signature.toString());
	
		System.out.println(ex.getMessage());		
		System.out.println("������ �߻��Ͽ� mailSend2 �޼��尡 ȣ���===========");
		String body = signature.toString() + "\n" +"�������� : " + ex.getMessage();
		
		try {
			//MIMessage��ü ����
			MimeMessage message = mailSender.createMimeMessage();
			
			//message��ü �ȿ� ���� �־�� �ϴµ�, vo���� Ŭ���� ��ü�� ���� ���� �־��ֵ��� ����.
			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");
			
			messageHelper.setFrom("maymoon0621@gmail.com");
			messageHelper.setTo("dmsdhre@hanmail.net");
			messageHelper.setSubject("������ ���� �߻�");
			messageHelper.setText(body);
			
			mailSender.send(message);
			System.out.println("������ ���½��ϴ�============================");
			
		} catch (Exception e) {			
			System.out.println("���Ϻ������� ���� �߻�" + e);
		}
		
	}
	

}
