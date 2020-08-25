package 기본입출력;

import javax.swing.JOptionPane;

public class 예제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.데이터: 입력
		String input1 = JOptionPane.showInputDialog("숫자를 입력하세요 1");
		String input2 = JOptionPane.showInputDialog("숫자를 입력하세요 2");
				
	    // 2.처리
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);

		for(int i=num1; i<=num2; i++) {
			System.out.println(i);
		}		
				
	}

}
