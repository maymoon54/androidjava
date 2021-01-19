package 스레드연습;

public class 스레드메인3 {

	public static void main(String[] args) {

		//타이머스레드 time = new 타이머스레드();
		//별찍기스레드 star = new 별찍기스레드();
		
		//인터페이스로 러너블한 단위로 만들어준 후
		//스레드 객체를 만들기
		Thread thread = new Thread(new 타이머스레드());
		Thread thread2 = new Thread(new 별찍기스레드());
		
		
		
		thread.start();
		thread2.start();
		
	}

}
