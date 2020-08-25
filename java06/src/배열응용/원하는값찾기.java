package 배열응용;

import java.util.Random;

public class 원하는값찾기 {

	public static void main(String[] args) {
		Random r = new Random(42);
		int[] number = new int[1000];
		for (int i = 0; i < number.length; i++) {
			number[i] = r.nextInt(1000)-444; // 0~999
		}
		for (int i = 0; i < number.length; i++) {
			System.out.println(i + ":" + number[i]);
		}

		int target = 100;
		int count = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] == target) {
				System.out.println(target + "의 위치는" + i);
				count++;
			}
		}
		System.out.println(target + "의 개수는" + count + "개");

		System.out.println("------추가예제------");

		// 1. max값 찾기

		int max = number[0]; // 배열 첫번째 값을 우선 max에 저장함

		for (int i = 1; i < number.length; i++) {
			// 배열의 첫번째 값부터 max값과 비교
			if (number[i] > max) {
				// max값 보다 클 경우에 해당값을 max에 다시 저장함
				max = number[i];
			}
		}
		System.out.println("최대값은" + max);

		// 3. max의 위치 찾기
		// 4. max값의 개수 찾기
		int count2 = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] == max) {
				System.out.println("최대값" + max + "의 위치는" + i);
				count2++;
			}
		}
		System.out.println("최대값" + max + "의 개수는" + count2);

		// 2. min값 찾기
		int min = number[0]; // 배열 첫번째 값을 우선 min에 저장함
		for (int i = 1; i < number.length; i++) {
			if (number[i] < min) {
				// 배열의 i번째 값이 min값보다 작을 경우 해당값을 min값에 넣음
				// (최소값이 바뀜)
				min = number[i];

			}
		}
		System.out.println("최소값은" + min);

	}

}
