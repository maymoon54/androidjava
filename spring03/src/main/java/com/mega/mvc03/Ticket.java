package com.mega.mvc03;

public class Ticket {
	public int ticket(int price) {
		if (price >= 10000) {
			price = price - 1000;
		}
		return price;
	}	
	
}
