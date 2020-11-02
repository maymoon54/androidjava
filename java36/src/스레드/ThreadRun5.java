package 스레드;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;
import java.awt.Color;
import javax.swing.ImageIcon;

public class ThreadRun5 extends JFrame {
	JLabel top = new JLabel("1"); // 전역변수, 글로벌변수
	JLabel center = new JLabel("");
	JLabel sub = new JLabel("3");

	public ThreadRun5() {
		getContentPane().setBackground(Color.GREEN);
		setTitle("나의 멀티스레드");
		setSize(875, 360);

		top.setFont(new Font("Arial Narrow", Font.BOLD, 65));
		getContentPane().add(top, BorderLayout.NORTH);

		center.setFont(new Font("굴림", Font.PLAIN, 54));
		getContentPane().add(center, BorderLayout.CENTER);

		sub.setFont(new Font("Arial Narrow", Font.BOLD, 50));
		getContentPane().add(sub, BorderLayout.SOUTH);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 35));
		getContentPane().add(lblNewLabel, BorderLayout.WEST);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setForeground(Color.GREEN);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 35));
		getContentPane().add(lblNewLabel_1, BorderLayout.EAST);

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
	// 단점: 내부클래스는 독립적으로 사용 불가
	public class CounterThread2 extends Thread {
		@Override
		public void run() {
			for (int i = 500; i > 0; i--) {
				System.out.println("카운터: " + i);
				top.setText("Counter: " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
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
		ThreadRun5 t = new ThreadRun5();
	}

}