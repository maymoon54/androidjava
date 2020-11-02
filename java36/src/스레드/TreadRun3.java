package 스레드;

public class TreadRun3 {

	public static void main(String[] args) {
		
		CounterThread counter = new CounterThread();
		TimerThread timer = new TimerThread();
		ImgThread img = new ImgThread();
		counter.start();
		timer.start();
		img.start();
		

		

	}

}
