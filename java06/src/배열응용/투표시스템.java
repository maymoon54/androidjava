package 배열응용;

import javax.swing.JOptionPane;

public class 투표시스템 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = { "블랙핑크", "유재석", "아이유", "이효리", "비" };

		// 투표수를 카운트 하기 위해서 저장공간 필요(배열)
		// 저장공간을 각각 변수지정하면 반복문 사용 x
		int[] 투표수 = new int[5];

		for (int i = 0; i < 10; i++) {
			String choice = JOptionPane.showInputDialog("투표하세요 0.블랙핑크 1.유재석 2.아이유 3.이효리 4.비");
			int choice2 = Integer.parseInt(choice);

			// 0 ~ 4
			if (choice2 < 0 || choice2 > 4) {
				i--;
			} else {
				투표수[choice2]++;

			}
		}

		for (int i = 0; i < 투표수.length; i++) {
			System.out.println(i + "번은" + 투표수[i] + "표");
		}

		for (int i = 0; i < 투표수.length; i++) {
			System.out.println(names[i] + "는" + 투표수[i] + "표");
		}

		int max = 투표수[0];
		for (int i = 0; i < 투표수.length; i++) {
			if (투표수[i] > max) {
				max = 투표수[i];
			}
		}
		System.out.println("-----------");
		for (int i = 0; i < 투표수.length; i++) {
			if (max == 투표수[i]) {
				System.out.println("1등:" + names[i]);
			}
		}

	}
}
