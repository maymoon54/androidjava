package 스레드;
//alt + e에서 Thread선택함
//import java.lang.*; 자동으로 쓸 수 있지만 명시적으로 써보면 lang(언어)안에 속한 것 모두 쓰겠다는.. 의미?

import java.util.Arrays;

public class StarThread extends Thread {

	@Override
	public void run() { //런메서드 재정의
		for (int i = 0; i < 100; i++) {
			System.out.println("★");
		}
		
	}

	
	//멤버변수, 멤버메서드
	

}
