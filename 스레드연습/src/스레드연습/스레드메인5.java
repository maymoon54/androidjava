package 스레드연습;

import java.util.Date;

public class 스레드메인5 {

	public static void main(String[] args) {

		//익명클래스를 사용
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
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
		});
		

		Thread thread2 = new Thread(new Runnable() {
			
			@Override
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
		}); 
				
		thread.start();
		thread2.start();

	}

}
