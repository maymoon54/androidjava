package com.mega.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BbsService {
	
	@Autowired
	BbsDAO dao; //전역변수
	
	public BbsVO one(BbsVO vo) {
		return dao.select(vo);
	}
}
