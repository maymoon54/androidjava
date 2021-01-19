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

		System.out.println("에러가발생하여 mailSend2 메서드가 호출됨===========");
		
		try {
			//MIMessage객체 생성
			MimeMessage message = mailSender.createMimeMessage();
			
			//message객체 안에 값을 넣어야 하는데, vo같은 클래스 객체를 만들어서 값을 넣어주도록 하자.
			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");
			
			messageHelper.setFrom("maymoon0621@gmail.com");
			messageHelper.setTo(request.getParameter("dmsdhre@hanmail.net"));
			messageHelper.setSubject("서버에 문제 발생");
			messageHelper.setText("문제발생!!!!");
			
			mailSender.send(message);
			System.out.println("메일을 보냈습니다============================");
			
		} catch (Exception e) {			
			System.out.println("메일보내는중 에러 발생" + e);
		}
		
	}
	
	public void mailSend(HttpServletRequest request) {
		System.out.println(request.getParameter("tomail"));
		System.out.println(request.getParameter("title"));
		System.out.println(request.getParameter("content"));
		//System.out.println(mailSender);
		
		try {
			//MIMessage객체 생성
			MimeMessage message = mailSender.createMimeMessage();
			
			//message객체 안에 값을 넣어야 하는데, vo같은 클래스 객체를 만들어서 값을 넣어주도록 하자.
			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");
			
			messageHelper.setFrom("maymoon0621@gmail.com");
			messageHelper.setTo(request.getParameter("tomail"));
			messageHelper.setSubject(request.getParameter("title"));
			messageHelper.setText(request.getParameter("content"));
			
			mailSender.send(message);
			System.out.println("메일을 보냈습니다============================");
			
		} catch (Exception e) {			
			System.out.println("메일보내는중 에러 발생" + e);
		}
		
	}
}
