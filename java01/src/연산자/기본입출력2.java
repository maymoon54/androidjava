package 연산자;

import javax.swing.JOptionPane;

public class 기본입출력2 {

	public static void main(String[] args) {
		// 1. 두 수를 입력 받아서
		// 2. int로 변환 한 후
		// 3. 더한 다음
		// 4. 더한 결과값 출력

		// ctrl + alt + 화살표 아래 : 한 줄 복사
		// alt + 화살표 방향 : 이동
	
	String input1 = JOptionPane.showInputDialog("숫자를 입력하세요");
	String input2 = JOptionPane.showInputDialog("숫자를 입력하세요");
	int num1 = Integer.parseInt(input1);
	int num2 = Integer.parseInt(input2);
	
	int sum = num1 + num2; // +연산자 : cpu
	System.out.println("두 수의 합은 " + sum);
	
	}

}
