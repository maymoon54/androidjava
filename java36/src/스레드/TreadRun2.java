package 스레드;

public class TreadRun2 {

	public static void main(String[] args) {
		PlusThread plus = new PlusThread();
		MinusThread minus = new MinusThread();
		plus.start();
		minus.start();
		
		//플러스, 마이너스, 메인 동시에 돌아감

	}

}
