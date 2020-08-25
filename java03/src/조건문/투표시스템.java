package 조건문;

import javax.swing.JOptionPane;

public class 투표시스템 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iu=0;
		int js=0;
		int bts=0;
		//투표수를 집계하기 위해서 각각의 변수 선언
				
		while (true) {
			String choice = JOptionPane.showInputDialog("인기투표 선택해주세요 1:아이유 2:유재석 3:방탄 4:종료");
			if (choice.equals("4")) {
				System.out.println("종료");
				break;
		// 4를 입력하면 반복문 끝냄
			}else if (choice.equals("1")) {
				iu++;
		// 1을 입력하면 iu 1씩 증가
			}else if (choice.equals("2")) {
				js++; 
		// 2를 입력하면 js 1씩 증가
			}else if (choice.equals("3")) {
				bts++;
		// 3을 입력하면 bts 1씩 증가
			}
		}
		System.out.println("아이유: " +iu+ "표");
		System.out.println("유재석: " +js+ "표");
		System.out.println("방탄: " +bts+ "표");
		
	}// main

}// class
