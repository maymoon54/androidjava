package 연산자;

public class 산술연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 200;
		int y = 100;
		
		int sum = x + y;
		//1.자바에서는 int끼리의 계산은 무조건 int
		System.out.println("두수의 합은 " + sum);
		double div = y / x; 
		// double은 8바이트 int는 4바이트
		System.out.println("두수의 나눗셈은 " + div);
		
		//2.자바에서는 하나라도 double이면 무조건 double
		//하나만 정수를 실수로 강제로 변환해서 계산시 사용 할 수 있다.
		//강제로 타입을 바꾸는것 : 타입변환 (형변환)
		double div2 = (double)y / x;
		System.out.println("두수의 나눗셈2은" + div2);
		
		double div3 = (double)(y / x);
		System.out.println("두수의 나눗셈3은" + div);
		
	}
}
