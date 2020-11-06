package com.mega.mvc05;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReplyController {

	@Autowired
	ReplyService service;
	// ������ ����(di)�� ���� ReplyServiceŬ������
	// �̱��� ��ü�� �ִ��� ã�Ƽ�, �� �ּҸ� ����!
	// "Ŭ������ Ÿ��" �� ������ ����!

	@RequestMapping("create.do")
	public String create(ReplyVO replyVO) {
		int result = service.create(replyVO);
		if(result ==1) {
			// ����� �� ������ �Ǿ���
			return "ok";
		}else {
			//��� ������ �� ������ �����.
			return "fail";
		}
		
	}

	public void list(int original, Model model) {
		model.addAttribute("list", service.list(original));
	}

	@RequestMapping("delete3.do")
	public String delete(ReplyVO replyVO) {
		
		int result = service.delete(replyVO);
		System.out.println("==========="+ replyVO);
		if(result ==1) {
			//reponse.sendRedirect("one.do?no" + replyVO.getOriginal());
			return "redirect:one.do?no=" + replyVO.getOriginal();
		}else {
			return "fail";//views/fail.jspȣ��
		}
	}
}
