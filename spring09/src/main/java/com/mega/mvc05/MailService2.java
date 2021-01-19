package com.mega.mvc05;

import javax.mail.internet.MimeMessage;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Aspect //관점클래스 선언
@Service("mail") //객체생성할때 이름 지정 (에러발생시 이름으로 
public class MailService2 {

	@Autowired
	private JavaMailSender mailSender;

	
	
	public void mailSend2(JoinPoint joinPoint, Throwable ex) {

		Signature signature = joinPoint.getSignature();
		System.out.println(signature.getName());
		System.out.println(signature.toString());
	
		System.out.println(ex.getMessage());		
		System.out.println("에러가 발생하여 mailSend2 메서드가 호출됨===========");
		String body = signature.toString() + "\n" +"에러정보 : " + ex.getMessage();
		
		try {
			//MIMessage객체 생성
			MimeMessage message = mailSender.createMimeMessage();
			
			//message객체 안에 값을 넣어야 하는데, vo같은 클래스 객체를 만들어서 값을 넣어주도록 하자.
			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");
			
			messageHelper.setFrom("maymoon0621@gmail.com");
			messageHelper.setTo("dmsdhre@hanmail.net");
			messageHelper.setSubject("서버에 문제 발생");
			messageHelper.setText(body);
			
			mailSender.send(message);
			System.out.println("메일을 보냈습니다============================");
			
		} catch (Exception e) {			
			System.out.println("메일보내는중 에러 발생" + e);
		}
		
	}
	

}
