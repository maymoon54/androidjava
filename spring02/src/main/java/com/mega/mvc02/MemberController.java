package com.mega.mvc02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@RequestMapping("insert.do")
	public void result(String id, String pw, String name) {
		System.out.println("컨트롤러에서 받은 id : " + id);
		System.out.println("컨트롤러에서 받은 pw : " + pw);
		System.out.println("컨트롤러에서 받은 name: " + name);		
		
	}
}
