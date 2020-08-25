package 제어문;

public class 반복문3 {

	public static void main(String[] args) {
		// 100부터 1까지 프린트
		int start = 100; //시작값 100 변수 선언
		int end = 1;     //끝나는값 1 변수 선언
		//int add = 1;     //더해줄값 
		
 		while(start >=end) { //시작값이 100부터 1까지 감소하는 동안 반복함
 			
 			System.out.println(start);
 			//start = start - add; //1씩 감소
 			start--;
 		}
		System.out.println("---------------");
 		// 5부터 10까지 프린트
 		
 		int x = 5;  //시작값 5
 		int y = 10; //끝나는 값 10
 		while(x<=y) {  // 시작값이 5부터 10까지 증가하는 동안 반복함
 			System.out.println(x);
 			//x = x + add ;
 			x++; //증감연산자
 		}
 		
 		System.out.println("---------------");
 		// 1부터 100까지 2씩 증가하면서 프린트
 		
 		int a = 1;  //시작값 1
 		int b = 100;//끝나는 값 100
 		int c = 2;  // 더해줄 값
 		while(a <= b) { //시작값1에서 2씩 증가해서 100보다 작거나 같아질때까지 반복
 			System.out.println(a);
 			a = a + c;
 		}
 		
 		
	}

}
