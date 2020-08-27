package movie;

import java.util.Random;
import java.util.Scanner;

public class game2 {

	public static void main(String[] args) {

		/*
		 * //컴퓨터는 임의의 숫자를 냄 Random r = new Random(); int com = r.nextInt(3); // 0,1,2 중
		 * 하나 System.out.println(com);
		 * 
		 * //나는 숫자를 선택함 Scanner scan = new Scanner(System.in);
		 * System.out.print("0가위 1바위 2보 선택하시오 >>"); int me = scan.nextInt();
		 * System.out.println(me+1);
		 */

		// 무한루프
		int gamecount = 0; //게임횟수 
		int mewin0 = 0;
		int mewin1 = 0;
		int mewin2 = 0;
		int comwin = 0;
		int same = 0;
		
		String[] game = {"가위", "바위", "보", "게임종료"};
		Scanner scan = new Scanner(System.in);
		while (true) {

			// 나의 선택
			System.out.print("0가위 1바위 2보 선택하시오(종료는3)>>");
			int me = scan.nextInt();
			System.out.println("나 :" + game[me]);

			// 3을 선택했을경우 while문 종료
			if (me == 3) {			
				break;
			
			//0,1,2중 하나를 입력했을때	
			} else {
				// 컴퓨터의 값
				Random r = new Random();
				int com = r.nextInt(3); // 0,1,2 중 하나
				System.out.println("컴퓨터 :" + game[com]);
				gamecount++;

				// 나와 컴퓨터 누가 이겼는지 비교하기

				if (me == 0) {// 1.내가 가위를 선택
					if (com == 0) {// 컴퓨터 가위
						System.out.println("비김");
						same++;
					} else if (com == 1) {// 컴퓨터 바위
						System.out.println("컴퓨터가 이김");
						comwin++;
					} else {// 컴퓨터 보
						System.out.println("내가 이김");
						mewin0++;
					}
				} else if (me == 1) { // 2.내가 바위를 선택
					if (com == 0) {// 컴 가위
						System.out.println("내가 이김");
						mewin1++;
					} else if (com == 1) {// 컴 바위
						System.out.println("비김");
						same++;
					} else {// 컴 보
						System.out.println("컴퓨터가 이김");
						comwin++;
					}
				} else {// 3. 내가 보를 선택
					if (com == 0) {// 컴 가위
						System.out.println("컴퓨터가 이김");
						comwin++;
					} else if (com == 1) {// 컴 바위
						System.out.println("내가이김");
						mewin2++;
						
					} else {// 컴 보
						System.out.println("비김");
						same++;
					}
				}

			}
			System.out.println("-------------");
		}
		System.out.println("게임횟수:" + gamecount);
		System.out.println("내가 가위를 내서 이김:" + mewin0);
		System.out.println("내가 바위를 내서 이김:" + mewin1);
		System.out.println("내가 보를 내서 이김:" + mewin2);
		
		System.out.println("컴퓨터가이김:" + comwin);
		System.out.println("비김:" + same);
	}

}
