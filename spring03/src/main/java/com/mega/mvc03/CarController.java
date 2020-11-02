package com.mega.mvc03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;

//일반 자바 파일 : POJO (Plain Old Java Object)
//Controller 기능을 가진 클래스로 만들고 싶으면, 상속!!!
//@Controller 어노테이션을 쓰면, 내부적으로 벌어지는 일
// 1) 상속
// 2) 핸들러맵퍼에 키:값 을 등록 (키:요청되는 주소 / 값:객체의 메서드)

@Controller
public class CarController {
	//컨트롤러가 view까지 넘어가기 위한 항목
	//1.view페이지 지정
	//2.model의 속성값
	//이전버전에서는 뷰&모델 같이 넘겨줘야했다..
	@RequestMapping("car.do")
	public String car(String color, Model model) { //이름바꿔서 받고싶으면 어노테이션 해주면 됨
	System.out.println("컨트롤러에서 받은 색은"+ color);		//@RequestParam		
	model.addAttribute("color",color); // Views 에서 이 값을 꺼내서 쓸 수 있다
	return "img"; //car.jsp로 파일이름 설정했으면 void로 해도 자동연결 되는데, 그게 아니라면
					//대체하는 파일이름을 (String) 넘겨줘야한다
	}
}
