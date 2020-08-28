package 클래스만들기;

public class 용돈계산기 {

	public void add(int x, int y) {
		int sum = x + y;
		System.out.println("일년동안 받은 용돈은 "+sum);
	}
	
	public int mul(int x, int y) {
		int result = x * y;
		return result; //결과값을 가져다가 전체금액이 50만원이 넘는지 판단해야함
	}
	
}
