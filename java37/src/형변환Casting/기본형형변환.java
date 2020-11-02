package 형변환Casting;

public class 기본형형변환 {

	public static void main(String[] args) {
		// 정수, 실수, 문자, 논리 : primitive (원시적인, 가공되지 않은) data
		//<-> derived (파생된, 가공된) data : 참조형데이터, 파생데이터
		
		// 크기에 대한 것을 고려해야 함.
		// 정수 byte(1)->short(2)->int(4)->long(8)
		// +-3만, +-2억

		byte a = 100; // 1바이트 : -128 ~ +127 까지 들어감
		// cpu에서 계산할때는 다 인트로 바꿔서 계산한다

		int b = a; // 기본형 복사 (배열의 깊은 복사 얕은 복사 참고..)
		// int(큰) <- byte(작) : 자동형변환

		//int c = 200;
		//byte d = c; byte에 200이 들어갈 수 없기 때문에 오류남

		int c = 120; //방 4개짜리 한칸에 120 들어있음
		byte d = (byte)c; //byte 단위로 짤라야 함 
		//byte(작) <- int(큰) : 강제형변환

	}

}
