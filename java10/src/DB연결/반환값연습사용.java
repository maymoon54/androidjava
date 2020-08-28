package DB연결;

import java.sql.Date;

public class 반환값연습사용 {

	public static void main(String[] args) {
		
		반환값연습 p = new 반환값연습();
		
		Date date = p.add();
		System.out.println(date.getDate());
		System.out.println(date.getHours());
		
		boolean result = p.add(true);
		System.out.println(result);
		
		int[] result2 = p.add(100);
		for (int x : result2) {
			System.out.println(x);
			
		double result3 = p.add(55.5, 100);
		System.out.println(result3);
		
		int result4 = p.add(500, 400);
		System.out.println(result4);

		
		}
	}

}
