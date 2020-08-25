package 조건문;

public class 월별날짜판별 {

	public static void main(String[] args) {

		int month = 8;

		switch (month) { //정수(byte,short,int) longx
						 //실수는 x
						 //문자, 문자열(String)
		case 2:
			System.out.println("28일까지");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일까지");
			break;
		default:
			System.out.println("31일까지");
		}
	}

}
