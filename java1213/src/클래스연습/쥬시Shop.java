package 클래스연습;

public class 쥬시Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		계산기 cal = new 계산기(); //cal이라는 변수가 ram에 생김 & 멤버변수 3개 복사됨(값은 초기화) 변수3개의 주소가 cal에 들어있음..
							//멤버변수가 전역변수에 복사가 된다?????
		cal.color = "빨강"; //cal이라는 주소가 가리키는 color라는 변수에 값을 집어넣는다
		cal.price = 5000; //접근연산자로 멤버변수에 접근한것
		cal.size = 11;
		int 쥬스count = 5;
		int 커피count = 3;
		
		int sum = cal.더하다(쥬스count,커피count); 
		//주소를 가지고 메서드를 쓸 수 있다 ★★★★★
		//한잔에 3천원 ==> 전체금액 계산
		int sum2 = sum * 3000;
		System.out.println("당신이 지불할 금액은 " + sum2+"원");
		
		//대입연산자 써서 값을 넣어줄려면 값이 넘어와야함..(return)
		int 쥬스가격 = cal.곱하다(쥬스count, 3000);
		int 커피가격 = cal.곱하다(커피count, 2000);
		
		System.out.println("쥬스가격은" + 쥬스가격 + "원");
		System.out.println("커피가격은" + 커피가격 + "원");
		
		int 차이 = cal.빼다(쥬스가격, 커피가격);
		System.out.println("차이는 " + 차이 + "원");
	}

}
