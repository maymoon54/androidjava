package 배열응용;

import java.util.Random;

public class 임의의값연산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Random r = new Random(); 
		
		int[] num = new int[100];
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(100); //random 클래스를 사용해서 0~99사이 값 랜덤생성
		}
		
		for (int i : num) {
			System.out.println(i);
		}
		
		int sum = num[0] + num[99]; //첫번째 값과 마지막값을 더한다
		System.out.println("합은 "+sum);
	}

}
