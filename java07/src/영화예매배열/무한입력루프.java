package 영화예매배열;

import java.util.Scanner;

public class 무한입력루프 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] seat = new int[10]; //좌석마다 예매상황을 저장할 공간들
		
		while (true) {
			System.out.println("------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print((i+1)+"  "); //좌석번호 1~10
			}
			System.out.println();
			System.out.println("------------------------------");
			
			//배열의 값
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i]+"  ");
			}
			
			System.out.println("");
			System.out.print("예매할 좌석번호를 입력하세요(종료 -1)>> ");
			int choice = scan.nextInt();
			if (choice == -1) {
				System.out.println("프로그램종료!");
				break;
			}
			//선택한 번호의 좌석을 예약처리
			seat[choice] = 1;
			System.out.println("예약을 완료했습니다.");
			
			

		}
	}

}
