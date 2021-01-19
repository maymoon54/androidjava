package com.mega.mvc05;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JSONController {

	@RequestMapping("json.do")
	@ResponseBody
	public BbsVO json() {
		BbsVO vo = new BbsVO();
		vo.setNo(100);
		vo.setTitle("coffee");
		vo.setContent("good");
		vo.setWriter("park");
		return vo;
	}
	
	@RequestMapping("json2.do")
	@ResponseBody
	public ArrayList<BbsVO> json2() {
		BbsVO vo = new BbsVO();
		vo.setNo(100);
		vo.setTitle("coffee");
		vo.setContent("good");
		vo.setWriter("park");
	
		
		BbsVO vo2 = new BbsVO();
		vo2.setNo(200);
		vo2.setTitle("latte");
		vo2.setContent("bad");
		vo2.setWriter("kim");
	
		
		ArrayList<BbsVO> list = new ArrayList<BbsVO>();
		list.add(vo);
		list.add(vo2);
		
		return list;
		
	}
}
