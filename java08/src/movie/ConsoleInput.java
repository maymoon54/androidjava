package movie;

import java.util.Scanner;

public class ConsoleInput {

	public static void main(String[] args) {
		// 콘솔에서 입력 : Scanner
		// 모든 입력의 데이터 타입은 String!!
		// 교재 p.517
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력>> ");
		String x = scan.next(); //한단어입력
		System.out.println("이름: "+x);
		System.out.print("나이를 입력>> ");
		int y = scan.nextInt(); //String으로 입력받은것을 int로 변환해줌
		System.out.println("내년 나이는 "+(y+1));
		
		//현재키입력 150.5
		//내년키는 170.5
		
		System.out.print("현재 키 입력>> ");
		double tall =scan.nextDouble();
		System.out.println("내년키는 "+(tall+20));
		
		System.out.print("밖에 비가 오나요?>> ");
		boolean rain = scan.nextBoolean();
		if (rain) {
			System.out.println("우산을 가지고 가자");
		}else {
			System.out.println("우산을 놓고가자");
		}
			
		//밖에 비가오나 true
		//true이면 , 우산을 가지고 가자
		//false이면, 우산을 놓고가자
		
		System.out.print("당신의 목표는?>> ");
		scan.nextLine(); //위에 입력된 엔터를 인식하기 때문에 한번 버려줘야 함.
		String life = scan.nextLine();//엔터치기 까지의 문장
		System.out.println("목표는" + life);
		
	}

	
}
