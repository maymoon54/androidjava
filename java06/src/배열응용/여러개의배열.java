package 배열응용;

import java.util.Stack;

public class 여러개의배열 {

	public static void main(String[] args) {
	
	//1. 우리집 식구는 아버지, 어머지, 형, 나, 동생
	String[] fam = {"아버지", "어머니", "형", "나", "동생"};
	int[] age = {100,88,33,24,10};
	double[] tall = {177.5,152.2,190.3,167.7,155.3};
	//인덱스 번호로 한사람 정보 모두 
	
	System.out.println("우리집 식구 정리");
	System.out.println("---------------");
	System.out.println("이름\t나이\t키");
	
	for (int i = 0; i < tall.length; i++) {
		System.out.println(fam[i]+"\t"+age[i]+"\t"+tall[i]+"\t");
		
	}
	
	}

}
