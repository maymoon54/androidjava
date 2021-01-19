package 스레드연습;

public class 더하기 extends Thread {
	
	@Override
	public void run() {
		// 동시에 실행되게 하고 싶은 내용
		for (int i = 0; i < 1000; i++) {
			System.out.println("더하기" + i);
		}
		
		//cpu자원을 사용하는것 에러날 확률 많다..
		//예외처리 두가지 : 던지기 / 내가 처리하기
		//던지기 안되는 이유 : 오버라이드 부모클래스랑 똑같아야함.. (입력값, 반환값..)
						//throws쓰면 부모클래스와 달라진다.. 
						//public void run() <-- 상속받아서 쓰려면 일치해야함
		
		try {
			Thread.sleep(1000);
			// 1초 1000ms
		} catch (InterruptedException e) {
			// 인터럽트 (방해)
			// 가장치명적 인터럽트는? 전원
			e.printStackTrace();
		} 
	}
}
