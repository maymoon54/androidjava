package 배열응용;

import java.util.Random;

public class 답안지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		
		//답안지 만들기 (정답)
		int[] data = new int[1000];
		for (int i = 0; i < 1000; i++) {
			data[i] = r.nextInt(4); //0~3까지의 숫자중 랜덤값 1000개 생성
		}
		
		// 내 답안지 
		int[] my = new int[1000];
		for (int i = 0; i < 1000; i++) {
			my[i] = r.nextInt(4);
		}		
		
		// 두개의 답안지 비교하기
		System.out.print("문항\t정답\t내답\t처리");
		int count = 0;
		
		for (int i = 0; i < my.length; i++) {
			String result = "오답";
			if (data[i]==my[i]) {
			result = "정답";
			count++;
			}
			
		System.out.println(i+"\t"+data[i]+"\t"+my[i]+"\t"+result);
			
		}	
			
			
		
		
		

		
	}

}
