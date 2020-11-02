package com.mega.mvc03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	
	@Autowired
	MovieService service;
	
	@RequestMapping("idChk.do")
	public String idChk(String id, Model model) {
		String[] values = service.idChk(id);
		model.addAttribute("result", values[0]);
		return values[1];
	}
	
	
	@RequestMapping("reply.do")
	public void reply(String reply, Model model) {
		//db처리했음.
		//views로 넘어감.
		System.out.println("컨트롤러에서 받은 댓글은" + reply);
		model.addAttribute("reply", reply);
	}
	
	
	@RequestMapping("movie.do")
	public String movie(String title, int price, Model model){
		System.out.println("컨트롤러에서 받은 영화제목은" + title);
		System.out.println("컨트롤러에서 받은 티켓가격은" + price);
		price = service.service(price);
		model.addAttribute("title",title);		
		model.addAttribute("price",price);
		
		return "like";
	}
}
