package 배열응용;

import java.util.Arrays;

public class 배열정렬 {

	public static void main(String[] args) {

		int[] age = { 99, 10, 77, 100, 88, 33, 24, 10 };
		
		//배열을 복사할때는 clone()함수 사용!
		//깊은 복사, 배열은 깊은 복사를 해야한다. (=!얕은복사)
		//깊은 복사를 해야 배열이 따로 따로 만들어짐.
		int[] age2 = age.clone();
		//원본은 유지하고 복사본 만듬 : 비파괴함수
		
		for (int i : age) {
			System.out.print(i+" ");
		}
		System.out.println("");
		System.out.println("---------------------");
		age2[0]=999; //배열 복사본의 첫번째 값 바꿔보기 
		for (int i : age2) {
			System.out.print(i+" ");
		}
		
		System.out.println("");
		Arrays.sort(age); //오름차순 정렬
		//파괴함수 : 
		//cpu가 ram에 있는 값을 가져다가 정렬해서 다시 저장함 (인덱스값 바뀜)
		
		for (int i : age) {
			System.out.println(i + " ");
		}

	}

}
