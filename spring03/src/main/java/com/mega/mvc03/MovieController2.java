package com.mega.mvc03;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController2 {
	
	//@RequestMapping("movie.do")
	public String movie(String title, int price, Model model, MovieService service){
		System.out.println("컨트롤러에서 받은 영화제목은" + title);
		System.out.println("컨트롤러에서 받은 티켓가격은" + price);
		price = service.service(price);	

		model.addAttribute("title",title);		
		model.addAttribute("price",price);
		
		return "like";
	}
}
