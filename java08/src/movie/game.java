package movie;

import java.util.Random;
import java.util.Scanner;

public class game {

	public static void main(String[] args) {

		
		int gamecount = 0; // 게임횟수
		int mewin0 = 0;
		int mewin1 = 0;
		int mewin2 = 0;
		int comwin = 0;
		int same = 0;
		
		String[] game = { "가위", "바위", "보" };
		Scanner scan = new Scanner(System.in); // while문 안에 x
		Random r = new Random(); // while문 안에 x
		
		// 무한루프
		while (true) {

			// 나의 선택
			System.out.print("0가위 1바위 2보 선택하시오(종료는-1)>>");
			int me = scan.nextInt();

			// -1을 선택했을경우 while문 종료
			if (me == -1) {
				System.out.println("종료");
				break;

				// 0,1,2중 하나를 입력했을때
			} else if (me == 0 || me == 1 || me == 2) {
				// 내가 선택한 값 출력
				System.out.println("나 :" + game[me]);
				// 컴퓨터의 랜덤값 출력
				int com = r.nextInt(3);
				System.out.println("컴퓨터 :" + game[com]);
				gamecount++;

				// 나와 컴퓨터 누가 이겼는지 비교하기
				// 1.내가 가위를 선택
				if (me == 0) {
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
				// 2.내가 바위를 선택
				} else if (me == 1) {
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
				// 3. 내가 보를 선택
				} else {
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
		// 0,1,2,-1이 아닌 다른 숫자를 입력했을때
			} else {
			System.out.println("잘못 입력하셨습니다");
			}
			System.out.println("-------------");
		}
		System.out.println("게임횟수:" + gamecount);
		System.out.println("컴퓨터가이김:" + comwin);
		System.out.println("내가 가위를 내서 이김:" + mewin0);
		System.out.println("내가 바위를 내서 이김:" + mewin1);
		System.out.println("내가 보를 내서 이김:" + mewin2);
		System.out.println("비김:" + same);
	}

}
