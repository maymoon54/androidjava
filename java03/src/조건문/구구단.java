package 조건문;

public class 구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0; 
		for (int i = 1; i < 10; i++) { // 구구단 9단까지 출력

			if (i % 2 == 1) { 
				continue; // 홀수단일 경우에는 skip
			}
			for (int j = 1; j < 10; j++) {
				n = i * j;
				System.out.println(i + "*" + j + "=" + n);
			}
			System.out.println("-------");
		}
	}

}
