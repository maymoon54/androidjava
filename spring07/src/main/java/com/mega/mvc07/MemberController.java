package com.mega.mvc07;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@Autowired
	MemberService service;
	
	@RequestMapping("create2.do")
	public void create2(MemberVO memberVO) {
		service.insert(memberVO);
	}
	
	@RequestMapping("delete2.do")
	public void delete2(MemberVO memberVO) {
		service.delete(memberVO);
	}
	
	@RequestMapping("update2.do")
	public void update2(MemberVO memberVO) {
		service.update(memberVO);
	}
	
	@RequestMapping("one2.do")
	public void one2(MemberVO memberVO, Model model) {
								//memberVO 자동으로 모델로 설정 but id값만 들어있음
		MemberVO vo = service.one(memberVO);
		model.addAttribute("vo", vo); //db검색결과 반환값을 받아서 수동 모델 설정
	}
	
	@RequestMapping("list2.do")
	public void list2(Model model) {
	List<MemberVO> list = service.list();
	model.addAttribute("list", list);
	}
	
}
