package com.mega.mvc03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	
	public int service(int price ) {
		price = price - 1000;
		return price;
	}
	
	public String[] idChk(String id) {
		String[] id2 = {"root", "admin","apple","melon","mint"};
		String result = "사용가능";
		String page = "ok";
		for (int i = 0; i < id2.length; i++) {
			if (id2[i].equals(id)) {
				result = "중복된 아이디";
				 page= "no";				
			}
		}
		String[] values = {result,page};
		return values;
	}
}
