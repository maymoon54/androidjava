package com.mega.mvc05;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//��Ʈ�ѷ����� DB�� �Ѿ���� / ����� ������ �ͼ� 
//�߰��� ó���ؾ��ϴ� �κ� : �����Ͻ� �� (business layer)
//����Ʈ��Ʈ�ѷ� - ��Ʈ�ѷ� - ��ϴϽ��� - DAO -
@Service
public class ReplyService {

	@Autowired
	ReplyDAO dao;
	
	public int create(ReplyVO vo) {
		return dao.create(vo);
	}
	
	public List<ReplyVO> list(int original) {
		return dao.list(original);
	}
	
	public int delete(ReplyVO vo) {
		return dao.delete(vo);
	}
}
