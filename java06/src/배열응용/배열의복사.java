package 배열응용;

public class 배열의복사 {

	public static void main(String[] args) {

		// 5과목 배열로 저장하기
		String[] sub = { "국어", "수학", "과학", "컴퓨터", "영어" };

		// 1학기 과목 점수
		int[] data1 = { 100, 99, 77, 87, 66 };

		// 2학기 과목점수 (배열복사하기)
		int[] data2 = data1.clone();
		// 과학은44, 영어는 55점으로 변경
		data2[2] = 44;
		data2[4] = 55;

		// 1학기, 2학기 점수를 프린트
		// for문을 사용하여 배열에 저장되어있는 각 과목의 점수를 출력
		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i] + "\t");

		}
		System.out.println("");

		for (int i : data1) {
			System.out.print(i + "\t");
		}

		System.out.println("");

		for (int i : data2) {
			System.out.print(+i + "\t");
		}

		// 점수가 변경된 과목의 수는??
		// for문으로 배열안의 점수를 하나씩 꺼내서 index값 별로 서로 같은지 다른지 비교한다
		// count 변수를 선언하고 두개의 값이 서로 다를때만 1씩 증가하도록 함
		int count = 0;
		for (int i = 0; i < data2.length; i++) {
			if (data1[i] != data2[i]) {
				count++;
			}
		}
		System.out.println("");
		System.out.println("변경된 과목의 수는 " + count + "개");

		// 1학기 2학기 중 평균이 더 높은 학기는?

		double sum1 = 0;
		double avg1 = 0;
		// for문으로 배열에 저장된 점수를 계속 더해줘서 합계를 계산
		for (int i = 0; i < data1.length; i++) {
			sum1 = sum1 + data1[i];
		}
		// 계산된 합계를 sub배열의 length값(과목의갯수)으로 나눠서 평균을 계산한다.
		avg1 = sum1 / sub.length;
		System.out.println("1학기 평균은 " + avg1 + "점");

		double sum2 = 0;
		double avg2 = 0;
		for (int i = 0; i < data2.length; i++) {
			sum2 = sum2 + data2[i];
		}
		avg2 = sum2 / sub.length;
		System.out.println("2학기 평균은 " + avg2 + "점");

		if (avg1 > avg2) {
			System.out.println("평균이 더 높은 학기는 1학기");
			if (avg1 < avg2) {
				System.out.println("평균이 더 높은 학기는 2학기");
			}
		} else {
			System.out.println("평균이 같음");
		}

		// 점수가 변경된 과목명은??
		// for문으로 data1배열과 data2배열의 각 값을 인덱스 별로 비교하여
		// 값이 서로 다른경우에는 sub배열의 값 출력 
		System.out.print("점수가 변경된 과목은? ");
		for (int i = 0; i < data2.length; i++) {
			if (data1[i] != data2[i]) {

				System.out.print(sub[i] + " ");
			}
		}

	}

}
