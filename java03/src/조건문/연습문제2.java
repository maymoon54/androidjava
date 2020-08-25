package 조건문;

import javax.swing.JOptionPane;

public class 연습문제2 {

	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("첫번째 수 입력");
		int num1 = Integer.parseInt(input1);
		
		String input2 = JOptionPane.showInputDialog("두번째 수 입력");
		int num2 = Integer.parseInt(input2);
		
		int cal = 0;
		String input3 = JOptionPane.showInputDialog("사칙연산  + - * /");
		
		if (input3.equals("+")) {
			cal = num1 + num2;
			System.out.print("덧셈");
		}else if (input3.equals("-")) {
			cal = num1 - num2;
			System.out.print("뺄셈");
		}else if (input3.equals("*")) {
			cal = num1 * num2;
			System.out.print("곱셈");
		}else if (input3.equals("/")) {
			cal = num1 / num2;
			System.out.print("나눗셈");
		 
		}
		System.out.println("결과는 " + cal);
	} 

}
