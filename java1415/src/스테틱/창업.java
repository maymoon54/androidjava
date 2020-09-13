package 스테틱;

public class 창업 {

	public static void main(String[] args) {
		직원 직원1 = new 직원("홍길동", "남", 20);
		직원 직원2 = new 직원("김희영", "여", 30);
		직원 직원3 = new 직원("이영화", "남", 40);
		System.out.println(직원1);
		System.out.println(직원2);
		System.out.println(직원3);
		System.out.println("인원 : " + 직원.count);
		System.out.println("평균나이 : " + 직원.sum / 직원.count);

	}

}
