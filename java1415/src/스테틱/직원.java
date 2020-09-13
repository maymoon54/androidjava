package 스테틱;

public class 직원 {
	// static 정리문제

	String 이름;
	String 성별;
	int 나이;

	static int count;
	static int sum;

	public 직원(String 이름, String 성별, int 나이) {
		count++; // 인원 카운트
		sum = sum + 나이; // 나이합
		this.이름 = 이름;
		this.성별 = 성별;
		this.나이 = 나이;
	}

	@Override
	public String toString() {
		return "직원 [이름=" + 이름 + ", 성별=" + 성별 + ", 나이=" + 나이 + "]";
	}

}
