package 정리문제;

import java.util.Calendar;

public class 스레드2 {

	public static void main(String[] args) {

		// 0부터 1000까지 프린트
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				int[] num = new int[1000];
				for (int i = 0; i < 1000; i++) {
					num[i] = i;
					System.out.println(num[i]);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				
			}
		}); 

		// 지금시각 3초단위로 프린트
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					Calendar c = Calendar.getInstance();
					int hh = c.get(Calendar.HOUR_OF_DAY);
					int mm = c.get(Calendar.MINUTE);
					int ss = c.get(Calendar.SECOND);
					System.out.println("현재시각은 " + hh + "시" + mm + "분" + ss + "초");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				
			}
		}); 
		
		thread1.start();
		thread2.start();

	}
}