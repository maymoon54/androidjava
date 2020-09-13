package 클래스연습;

//클래스가 5개라면 메인은 1개(첫페이지만 메인넣고 다음 페이지는 계속 연결..)
//메인은 혼자 작동할 수 있음
//프로젝트는 각자 메인으로 테스트를 하고.. 합할때 첫페이지에 연결함
public class 계산기 {
//	계산기 => class
//
//	프로그램하려고 하는 대상은
//	2가지 특징을 가지고 있음
//	눈에 보이는 속성 : 색, 가격, 크기 <명사> 
	// ==> 멤버변수(전역변수, global변수,클래스전체영역에서 사용가능)
	// ==> 자동초기화
	String color; // 참조형(null)
	int price; // 기본형(0)
	int size;// 기본형(0)

//	동작 : 더하다, 빼다, 곱하다, 나누다 <동사> 
	// ==> 멤버메서드(입력값, 반환값 유무)
	public int 더하다(int c1, int c2) { //메서드(기능) 정의
		//값을 전달하기 위한 변수 c1 c2 : 매개변수(parameter)
		
		//()안에 입력값
		//void : 반환값이 없다

		int result = c1+c2;
		return result; //계산할 결과를 넘겨서 전체금액을 계산해야한다.
	}

	public int 빼다(int x, int y) {
		int result = x - y;
		return result;
	}

	public int 곱하다(int x, int y) {
		int result = x * y;
		return result;
	}

	public void 나누다(int x, int y) {
		int result = x / y;
	}

}
