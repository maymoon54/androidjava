package 배열응용;

import java.util.Random;

public class 아무값중50보다큰값찾아보자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random(); //아무값
		//0~99 까지의 값 천개를 랜덤하게 만들어서 50보다 큰값을 프린트
		
		int[] num = new int[1000];
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(100);
		}
		
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i]>=80) {
				System.out.println(i+":"+num[i]);
				count++;
			}
		}
		System.out.println("80보다 큰 숫자 개수는 "+ count+ "개");
	}

}
