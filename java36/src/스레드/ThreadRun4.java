package 스레드;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;

public class ThreadRun4 extends JFrame {

	JLabel top = new JLabel("1"); // 전역변수, 글로벌 변수
	JLabel center = new JLabel("");
	JLabel sub = new JLabel("3");

	public ThreadRun4() {
		// 생성자를 이용해서 이 안에 코드를 넣고
		setTitle("나의 멀티스레드");
		setSize(800, 300);

		top.setFont(new Font("굴림", Font.PLAIN, 50));
		getContentPane().add(top, BorderLayout.NORTH);


		getContentPane().add(center, BorderLayout.CENTER);

		sub.setFont(new Font("굴림", Font.PLAIN, 50));
		getContentPane().add(sub, BorderLayout.SOUTH);

		CounterThread2 counter = new CounterThread2();
		counter.start();
		
		TimerThread2 timer = new TimerThread2();
		timer.start();
		
		ImgThread2 img = new ImgThread2();
		img.start();

		setVisible(true);

	}

	// 내부클래스(inner class)
	// 변수를 다른 클래스와 공유할 목적
	// 단점 : 내부클래스는 독립적으로 사용 불가
	public class CounterThread2 extends Thread {
		@Override
		public void run() {
			for (int i = 500; i > 0; i--) {
				System.out.println("카운터: " + i);
				top.setText("Counter: " + i);
				// 포문한번 돌때 잠깐 쉬었다가렴 cpu야
				// cpu라는 외부 개체에게 명령하는것이라 예외처리 해야함
				// 상속받은 클래스는 건들수 없다..? 너가 대신 처리해.. 던질 수 없다 무조건 try catch해야함

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {// 인터럽트:방해되서 중단되는것, 제일 강력한 인터럽트는 전원꺼지는것
					// e라는 매개변수에 오류내용 저장
					e.printStackTrace();// 에러가 어디서 발생했는지 쭉 찍어보는 메서드

					// Exception : 예외처리
					// 외부자원을 연결할때 무조건 예외처리를 한다
					// 오류가 생겼을때 그 부분을 빼고 나머지를 처리하겠다

				}

			}
			// super.run(); 부모클래스 안쓸려고 오버라이드 하는것이기 때문에 지움..

		}

//		private void view() {
//			super.run(); // 오버라이드 한 런 말고 , 원래 부모클래스에 있던 메소드 호출
//						// 문법적으로 가능한것이고 쓸일이 별로 없음
//			System.out.println("내용프린트");
	}
	
	public class TimerThread2 extends Thread {
		// @ => 보통은 at ~에 //hera@naver.com : 네이버닷컴의 헤라 아이디
		// @ => 여기서는 Annotiation 표기, 표시 : 기능없음 /지워도 무방
		// @Component ==> 같은 Annotiaion이지만 기능있음. new! 객체생성

		@Override // 오버라이드, 재정의 // @는 Annotiation 어노테이션
		public void run() {
			for (int i = 0; i < 300; i++) {
				Date date = new Date(); // java.util.Date - jdk의 java패키지

				System.out.println(date);
				try {
					Thread.sleep(1000); // 1초
					sub.setText("Timer: " + date);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		}
	}

	public class ImgThread2 extends Thread {
		@Override // 재정의 (스레드 안의 run메서드를 재정의)
		public void run() {
			String[] img = { "1.png", "2.png", "3.png", "4.png", "5.png" };
			for (int i = 0; i < img.length; i++) {
				System.out.println("이미지: " + img[i]);
				try {
					Thread.sleep(3000); // 1초=1000.. 3초
					center.setIcon(new ImageIcon(img[i]));

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		// main 메서드안에서 인식 못하고 글로벌하게 위로 빼줘야 하는 경우 static을 써야한다..
		// main에서 시작하는데 static을 안쓰고 싶을때..
		// static은 메모리에 항상 가지고 있어야 하기 때문에..static은 최소로 써야함
		// 기본 생성자 안에 코드를 넣고 메인에 자기 자신의 객체를 생성
		// 글로벌 변수를 쓴다고 해도, 객체를 생성한다음에 쓰는것이기 떄문에..

		ThreadRun4 t = new ThreadRun4(); // 생성자 호출

	}

}
