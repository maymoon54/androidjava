package 스레드;

public class TreadRun1 {

	public static void main(String[] args) {
		StarThread star = new StarThread();
		AtThread at = new AtThread();
		//star.run();
		//at.run();
		//런메서드 직접 호출하면 순차적으로 처리된다
		
		star.start();
		at.start();
		//cpu가 프로그램 돌리면서 같이 처리해야한다고 인식함
		//별과 골뱅이가 섞여 나옴..
		//cpu의 상태에 따라 star 혹은 at 둘중 하나 먼저 실행함
	}

}
