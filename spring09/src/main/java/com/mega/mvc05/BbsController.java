package com.mega.mvc05;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	@Autowired
	BbsService service;

	@Autowired
	ReplyService service2;

	@RequestMapping("delete.do")
	public void delete() {
		// dbó���ϰ�,
		// views�� �Ѿ��.!!
	}

	@RequestMapping("update.do")
	public void update(Model model) {
		// dbó���� �� ���� �ϴ� ���
		// �ݵ�� controller�� ���ľ��Ѵ�.
		// db�˻��ؼ� ������ �´�.
		// �˻��� ����� views�� �ִ� update.jsp�� �Ѱܾ� ��.
		model.addAttribute("result", "���� �˻� �����..");

	}

	@RequestMapping("insert.do")
	public void insert(BbsVO bbsVO, HttpSession session) {
		// �Է°����� vo�� �����ϴ� ���
		// 1) ��ü����: prototype���
		// 2) input name�Ӽ��� ������ set�޼��带 �ڵ����� ȣ��
		// 3) �����̸��� Ŭ�����̸��� ù���ڸ� �ҹ��ڷ� �����ϴ� ���
		// �ڵ����� vo�� model�� �Ӽ����� ����
		// views�� �Ʒ� jsp���Ͽ��� model�Ӽ����� ���� �� �� ����.
		System.out.println(bbsVO.getNo());
		System.out.println(bbsVO.getTitle());
		System.out.println(bbsVO.getContent());
		System.out.println(bbsVO.getWriter());

		// model�� �ѹ��� request�� response�� �ϰ� �������.
		// �������� request���� Ư���� ���� �����ϰ� ����ϰ� ������
		// session���� �����ؾ� �Ѵ�.!
		session.setAttribute("bbsVO2", bbsVO);

	}

	@RequestMapping("one.do")
	public void one(BbsVO bbsVO, Model model, HttpSession session) {
		session.setAttribute("id", "apple");
		// �Խù� �ϳ��� ������ ����,
		model.addAttribute("one", service.one(bbsVO));

		// �Խù��� ��� ����Ʈ�� ������ �;� ��.
		model.addAttribute("list", service2.list(bbsVO.getNo()));
		model.addAttribute("total", service2.list(bbsVO.getNo()).size());

	}
}
