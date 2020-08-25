package 배열기본;

public class 배열기본2 {

	public static void main(String[] args) {
		//배열의 특징
		//1.배열은 일반적으로 같은 타입을 묶을때만 사용!
		//  다양한 타입을 묶을 때는 배열을 쓰지 않음.
		//2.배열은 고정되는 크기를 가진다. (크기조절 불가능)
		
		int[] temp = new int[7];
		temp[0] = 30;
		temp[1] = 29;
		temp[2] = 31;
		temp[3] = 27;
		temp[4] = 26;
		temp[5] = 32;
		temp[6] = 33;
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println(i+1+"일차: "+temp[i]);
		}
		
	}

}
