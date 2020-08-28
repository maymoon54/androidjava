package 클래스만들기;

public class 컴퓨터 {
	//상태정의 => 멤버변수, 전역변수(global변수,글로벌변수)
	//객체 생성 후, 멤버 변수는 객체마다 다 별도로 복사되게 된다.
	//복사된 멤버변수에는 생성된 객체의 실제값이 들어가게 된다.
	//멤버변수는 실제값이 들어가는 변수(인스턴스 변수)
	//전역변수는 => 클래스 전체 영역에서 사용가능
	//변수는 선언의 위치가 중요!
	//선언의 위치가 이 변수를 쓸 수 있는 범위를 결정

	//public을 붙이면 다른 패키지에서도 쓸 수 있음
	//접근제어자(default, public)
	
	public int price; //가격
	public String company; //제조회사
	public int size; //모니터의크기
	
	//동작정의 => 멤머메서드
	public void internet() {
		System.out.println("인터넷하다");
	}
	
	public void doc() {
		System.out.println("문서작성하다");
	}

	// 메뉴 source/ Generate to String 메서드 코드자동 생성
	// 원래 toString()은 기초형이면 기초형값, 참조형이면 주소를 찍어줌
	// toString()을 내가 원하는 프린트 모양대로 변경해서 사용할 수 있다
	
	@Override //덮어썼다는 뜻 지워도 상관없다
	public String toString() {
		return "컴퓨터 [price=" + price + ", company=" + company + ", size=" + size + "]";
	}
	
	
}
