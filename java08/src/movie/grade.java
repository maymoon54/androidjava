package movie;

import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		// 성적관리
		// 학번, 이름 입력받기
		// 1학기 중간고사 기말고사 / 2학기 중간고사 기말고사 성적 입력받기
		// 각 학기 중간-기말 성적차이
		// 1학기 2학기 비교해서 결과 출력
		// 각 학생별로 같은 과정을 반복

		// 1. 배열생성 : 2명의 학생 성적을 관리
		String[] stuno = new String[2];
		String[] name = new String[2];
		String[] grade = new String[2];
		int[] g1 = new int[2];
		int[] g2 = new int[2];
		int[] g3 = new int[2];
		int[] g4 = new int[2];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < stuno.length; i++) {
			System.out.println("학번을 입력하세요");
			stuno[i] = scan.next();
			System.out.println("이름을 입력하세요");
			name[i] = scan.next();
			System.out.println("1학기 중간고사 성적 입력");
			g1[i] = scan.nextInt();

			System.out.println("1학기 기말고사 성적 입력");
			g2[i] = scan.nextInt();

			System.out.println("2학기 중간고사 성적 입력");
			g3[i] = scan.nextInt();

			System.out.println("2학기 기말고사 성적 입력");
			g4[i] = scan.nextInt();

		}
		System.out.println("[성적관리]");
		System.out.println("학번\t이름\t1학기중간\t1학기기말\t2학기중간\t2학기기말");
		for (int j = 0; j < stuno.length; j++) {
			System.out.println(stuno[j] + "\t" + name[j] + "\t" + g1[j] + "\t" + g2[j] + "\t" + g3[j] + "\t" + g4[j]);
			
		}

	}

}
