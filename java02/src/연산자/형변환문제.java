package 연산자;

public class 형변환문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte x = 100;
		int y = x;
		System.out.println("y: "+ x); //자동형변환
		
		//int x = 300;
		//byte y = x;
		//System.out.println("y: "+ x); //형변환불가
		
		double a = 400; //8바이트
		int b = (int)a; //강제형변환
		System.out.println("b: "+ a); 
		
		
		int c = 400;
		double d = c; //자동형변환
		System.out.println("d: "+ c); 



	}

}
