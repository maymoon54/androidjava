package com.mega.mvc08;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class ProductService {
	
	@Autowired
	ProductDAO dao;
	
	public void create(ProductVO vo) {
		dao.insert(vo);
	}
	
	public void delete(ProductVO vo) {
		dao.delete(vo);
	}
	
	public void update(ProductVO vo) {
		dao.update(vo);
	}
	
	public ProductVO one(ProductVO vo) {
		return dao.one(vo);
	}
	
	public List<ProductVO> list() {
		return dao.list();
	}

}
