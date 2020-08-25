package 배열응용;

import java.util.Random;

import javax.swing.JOptionPane;

public class 입력해서넣어보자3 {

	public static void main(String[] args) {
		
		Random r = new Random(); //아무거나 만들어주는 클래스
		
		
		int[] data = new int[10000];
		for (int i = 0; i < 10000; i++) {
			data[i] = r.nextInt(100); //int(-21억~21억)type 임의로 생성 , ()안에 범위 넣어줌 0~99 
		}						
		
		for (int i : data) {
			System.out.println(i);
		}
	}

}
