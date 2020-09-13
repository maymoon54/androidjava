package 컬렉션;

import java.util.LinkedList;

public class 큐예제 {

	public static void main(String[] args) {
		// 시험일정순서가 국어, 수학, 영어, 컴퓨터

		LinkedList test = new LinkedList();
		test.add("국어");
		test.add("수학");
		test.add("영어");
		test.add("컴퓨터");

		// 1일차 시험 본 후
		System.out.print("1일차 시험 본후 남은 과목 : ");
		test.remove();
		for (int i = 0; i < test.size(); i++) {
			System.out.print(test.get(i));
		}
		System.out.println();


		// 2일차 시험 본 후
		System.out.print("2일차 시험 본후 남은 과목 : " );
		test.remove();
		for (int i = 0; i < test.size(); i++) {
			System.out.print(test.get(i));
		}
		System.out.println();


		// 3일차 시험 본 후
		System.out.print("3일차 시험 본후 남은 과목 : ");
		test.remove();
		for (int i = 0; i < test.size(); i++) {
			System.out.print(test.get(i));
		}


	}

}
