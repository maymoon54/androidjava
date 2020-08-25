package 반복문;

public class 반복하다가스킵 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			if (i % 3 == 0) {
				continue; // skip
			}
			System.out.println(i);
		}
	}

}
