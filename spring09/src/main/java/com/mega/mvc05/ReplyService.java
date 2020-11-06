package com.mega.mvc05;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//컨트롤러에서 DB로 넘어가기전 / 결과값 가지고 와서 
//중간에 처리해야하는 부분 : 비지니스 층 (business layer)
//프론트컨트롤러 - 컨트롤러 - 비니니스층 - DAO -
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
