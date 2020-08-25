package 배열응용;

import javax.swing.JOptionPane;

public class 입력해서넣어보자4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력을 받아서, 저장공간에 넣어두었다가
		//나중에 꺼내서 연산이나 출력을 하고자 하는 경우
		
		int[] data = new int[3];
		for (int i = 0; i < 3; i++) {
			//변수 선언의 위치가 변수를 사용할 수 있는 범위(지역)를 결정!
			//for문안에서 변수선언하면, for문 밖에서는 인식x
			String s = JOptionPane.showInputDialog("점수입력");
			data[i] = Integer.parseInt(s);
		}
		
		for (int i : data) {
			System.out.println(i);
		}
	}

}
