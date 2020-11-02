package 형변환Casting;

public class 포장클래스 {
	public static void main(String[] args) {
		// 포장클래스 (Wrapper class, 래퍼클래스)
		// 기본형에 대한 추가적인 기능을 붙여서
		// 클래스로 만들어 놓은 것.
		// int -> Integer
		// double -> Double
		// char -> Character
		// boolean -> Boolean
		
		int x = 100; //기본형
		Integer y = new Integer(200); //래퍼클래스
		x = y; //참조형을 기본형 int에 넣는다.. 문법적으로는 X
			   //기본형과 포장클래스간에는 자동으로 변환
		       //포장한것을 풀어서.. 포장안한 것에 넣음
		//기본형 <- 참조형 : 오토 언박싱(auto unboxing)
		
		y = x; //참조형에 기본형을 넣음..
		//참조형 <- 기본형 : 오토 박싱(auto boxing)
		//객체화 해주는것
		
	}
}
