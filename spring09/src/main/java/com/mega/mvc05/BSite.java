package com.mega.mvc05;

import org.springframework.stereotype.Component;

@Component
public class BSite {

	public void cart() {
		System.out.println("장바구니에 담다");
	}
	
	public void orderProduct() {
		System.out.println("물건을 주문하다");
	}
	
	
	
}
