package 조건문;

import javax.swing.JOptionPane;

public class 사원판별 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("사원번호를 입력");
		char dep = input.charAt(0);
		String num = input.substring(1);
		
		switch (dep) {
		case 'A':
			System.out.println("기획부, 고유번호는" + num + "입니다");
			break;
		case 'B':
			System.out.println("총무부");
			break;
		case 'C':
			System.out.println("개발부");
			break;

		default:
			System.out.println("해당부서 없음");
			
		}
	

	}

}
