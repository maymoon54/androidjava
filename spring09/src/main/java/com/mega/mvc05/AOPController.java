package com.mega.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AOPController {
	
	@Autowired
	ASite a;
	
	@RequestMapping("a.do")
	public void aop1() {
		a.person();
	}
	
	@Autowired
	BSite b;
	
	@RequestMapping("b.do")
	public void aop2() {
		b.cart();
		b.orderProduct();
	
	}
	
	@Autowired
	AOPService service;
	
	@RequestMapping("aopError.do")
	public void aop3() {
		System.out.println( "컨트롤러 호출 ");
		try {
			service.error();
		} catch (Exception e) {
			
		}
	}
	
}
