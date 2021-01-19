package 스레드연습;

public class 스레드메인 {

	public static void main(String[] args) {
		// 메인을 실행시키면
		// 더하기 안에 run이 실행됨

		더하기 p = new 더하기();
		빼기 m = new 빼기();
		
		//cpu에 등록
		p.start();
		m.start();
		
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("메인이야>>" + i);
		}
	}

}
