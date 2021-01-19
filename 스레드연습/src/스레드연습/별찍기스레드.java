package 스레드연습;

import java.util.Date;

public class 별찍기스레드 implements Runnable {

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

}
