package 스레드;



import java.util.Date;

import javax.xml.crypto.Data;

public class TimerThread extends Thread {
	//@ => 보통은 at ~에 //hera@naver.com : 네이버닷컴의 헤라 아이디
	//@ => 여기서는 Annotiation 표기, 표시 : 기능없음 /지워도 무방
	//@Component ==> 같은 Annotiaion이지만 기능있음. new! 객체생성
	
	@Override // 오버라이드, 재정의 //  @는 Annotiation 어노테이션
	public void run() {
for (int i = 0; i < 300; i++) {
	Date date = new Date(); //java.util.Date - jdk의 java패키지
	
	System.out.println(date);
	try {
		Thread.sleep(1000); //1초
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
		super.run();
	}
}
