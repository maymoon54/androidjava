package 스레드연습;

import java.util.Date;

public class 스레드메인4 {

	public static void main(String[] args) {

		//추상클래스에 run을 오버라이드 해서 만듬
		
		Thread thread = new Thread() {

			public void run() {

				for (int i = 0; i < 1000; i++) {
					Date date = new Date();
					System.out.println("현재시각" + date);

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		};

		Thread thread2 = new Thread() {
			public void run() {
				for (int i = 0; i < 1000; i++) {

					System.out.println("★");

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}

		};

		thread.start();
		thread2.start();

	}

}
