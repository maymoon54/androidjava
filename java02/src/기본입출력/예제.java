package 기본입출력;

import javax.swing.JOptionPane;

public class 예제 {

	public static void main(String[] args) {
		// 1.데이터: 입력
		String input1 = JOptionPane.showInputDialog("숫자를 입력하세요 1");
		String input2 = JOptionPane.showInputDialog("숫자를 입력하세요 2");
		
		// 2.처리
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		
		int cal1 = num1 + num2;
		int cal2 = num1 - num2;
		int cal3 = num1 * num2;
		int cal4 = num1 / num2;
		
		// 3.결과 : 출력		
		System.out.println("덧셈결과는 " + cal1 + " 뺄셈결과는 " + cal2 + " 곱셈결과는 " + cal3 + " 나눗셈 결과는 " + cal4);
	
	
		
	
	}

}
