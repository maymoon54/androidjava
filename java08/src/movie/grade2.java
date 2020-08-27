package movie;

import java.util.Scanner;

public class grade2 {

	public static void main(String[] args) {
		// 성적관리
		// 학번, 이름 입력받기
		// 1학기 중간고사 기말고사 / 2학기 중간고사 기말고사 성적 입력받기
		// 각 학기 중간-기말 성적차이
		// 1학기 2학기 비교해서 결과 출력
		// 각 학생별로 같은 과정을 반복

		Scanner scan = new Scanner(System.in);
		while (true) {
			
			System.out.println("학번을 입력하세요 / 입력하지 않으실 경우 n입력");
			String stuno = scan.nextLine();
			if (stuno.equals("n")) {
				System.out.println("입력끝");
				break;

			} else {
				
				
				System.out.println("이름을 입력하세요");
				String name = scan.nextLine();

				System.out.println("1학기 중간고사 성적 입력");
				int g1 = scan.nextInt();

				System.out.println("1학기 기말고사 성적 입력");
				int g2 = scan.nextInt();

				System.out.println("2학기 중간고사 성적 입력");
				int g3 = scan.nextInt();

				System.out.println("2학기 기말고사 성적 입력");
				int g4 = scan.nextInt();

				System.out.println("[성적관리]");
				System.out.println("학번 : " + stuno);
				System.out.println("이름 : " + name);
				
				System.out.println("학기\t중간고사\t기말고사\t 점수차" );
				System.out.println("--------------------------------");
				System.out.println("1학기 : \t"+g1+"\t"+g2+"\t"+(g2-g1));
				System.out.println("2학기 : \t"+g3+"\t"+g4+"\t"+(g4-g3));
				System.out.println("점수차 \t"+(g3-g1)+"\t"+(g4-g2));
				
				System.out.println();
				scan.nextLine();
			}

		}

	}

}
