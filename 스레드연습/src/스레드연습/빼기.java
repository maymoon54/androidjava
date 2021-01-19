package 스레드연습;

public class 빼기 extends Thread {
	
	@Override
	public void run() {
		// 동시에 실행되게 하고 싶은 내용
		for (int i = 1000; i > 0; i--) {
			System.out.println("빼기" + i);
		}		
		
		try {
			Thread.sleep(1000);
			// 1초 1000ms
		} catch (InterruptedException e) {
			// 인터럽트 (방해)
			e.printStackTrace();
		} 
	}
}
