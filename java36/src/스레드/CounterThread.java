package 스레드;

public class CounterThread extends Thread {
	@Override
	public void run() {
    for (int i = 500; i >0; i--) {
		System.out.println("카운터: " + i);
		//포문한번 돌때 잠깐 쉬었다가렴 cpu야
		//cpu라는 외부 개체에게 명령하는것이라 예외처리 해야함
		//상속받은 클래스는 건들수 없다..? 너가 대신 처리해.. 던질 수 없다 무조건 try catch해야함
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {//인터럽트:방해되서 중단되는것, 제일 강력한 인터럽트는 전원꺼지는것
			// e라는 매개변수에 오류내용 저장
			e.printStackTrace();//에러가 어디서 발생했는지 쭉 찍어보는 메서드
			
			//Exception : 예외처리
			//외부자원을 연결할때 무조건 예외처리를 한다
			//오류가 생겼을때 그 부분을 빼고 나머지를 처리하겠다
			
		}
		
	}	
		// super.run(); 부모클래스 안쓸려고 오버라이드 하는것이기 때문에 지움..

	}

//	private void view() {
//		super.run(); // 오버라이드 한 런 말고 , 원래 부모클래스에 있던 메소드 호출
//					// 문법적으로 가능한것이고 쓸일이 별로 없음
//		System.out.println("내용프린트");
//	}
}
