package 스테틱;

import javax.swing.JOptionPane;

public class Day {
	String doing;
	int time;
	String location;
	final static String company = "mega";
	static int count; //전역변수는 자동초기화가 됨. 0으로 초기화!
	static int sum; //시간누적
	
	//입력값이 위 3개가 다 있어야 이 부품을 이용할 수 있음.
	//입력값이(파라메터, 매개변수)가 있는 클래스 이름과 동일한 메서드를 만든다
	//그럼 객체생성시 자동호출된다
	//생성자 (메서드, counstuctor)

	public Day(String doing, int time, String location) {
		count++;
		sum = sum + time;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}
	
	//static 메서드 (정적 메서드) : 객체생성하지 않아도, 이 기능을 바로 사용 가능
	//클래스이름으로 바로 접근해서 사용할 수 있는 메서드로 만드는 것이 좋다.
	public static String getName( ) {
		return company; //static메서드 내에서는 인스턴스 변수 사용 불가
		//인스턴스변수는 객체 생성 후 접근 변수
	}
	//자주 사용하는 기능의 메서드는 바로 바로 쓸 수 있게 만들어두는 것이 좋다.
	//Integer.parseInt(), JOptionPane.showInputDialog() 
	
	//일반 메서드 : 객체생성 후, 참조형 변수의 주소로 접근 가능!
				//heap영역에 메모리 다 할당한 후 주소호출해서 써야한다.
	public int getAvg(){
		return sum/count;
	}
	
	//메서드 이름을 동일하게 할 수 있음.
	//단, 입력값이 달라야 함.
	//하나의 이름을 메서드 이름으로 해서 여러개 만들 수 있음.
	//오버로딩(overloading) : 하나의 이름으로 다양한 형태의 메서드를 구현
							//다형성 (polymorphism, 폴리모피즘)
 
	
	//파라메터를 통해서 만든 멤버변수값을 한꺼번에 출력하고자 하는 경우
	//toString()을 재정의
	
	@Override //재정의, 오버라이드, 오버라이딩
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}

}
