package 기본입출력;

import javax.swing.JOptionPane;

public class 예제3 {

	public static void main(String[] args) {
		// 1.데이터: 입력
		String input1 = JOptionPane.showInputDialog("반복할 숫자");
		String input2 = JOptionPane.showInputDialog("반복할 문자");
		
		// 2.처리
		int num1 = Integer.parseInt(input1);
		
		// 3.결과 : 출력
		for(int i=0; i<num1; i++) {
			System.out.println(input2);
		}
		

	}

}
