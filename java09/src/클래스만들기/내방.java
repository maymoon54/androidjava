package 클래스만들기;

public class 내방 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		휴대폰 p1 = new 휴대폰();
		p1.color = "흰색";
		p1.size = 7;
		p1.company = "삼성";

		System.out.println("p1휴대폰의 색은 " + p1.color);
		System.out.println("p1휴대폰의 크기은 " + p1.size);
		System.out.println("p1휴대폰의 회사는 " + p1.company);
		p1.문자하다();

		System.out.println("-----------------------------");
		휴대폰 p2 = new 휴대폰();
		p2.color = "red";
		p2.size = 11;
		p2.company = "애플";

		System.out.println("p2휴대폰의 색은 " + p2.color);
		System.out.println("p2휴대폰의 크기은 " + p2.size);
		System.out.println("p2휴대폰의 회사는 " + p2.company);

		p2.전화하다();
		
		System.out.println("-----------------------------");
		
		강아지 dog1 = new 강아지();
		dog1.type = "리트리버";
		dog1.color = "갈색";
		System.out.println("dog1의 종은" + dog1.type);
		
		
		강아지 dog2 = new 강아지();
		dog2.type = "말티즈";
		dog2.color = "흰색";
		System.out.println("dog2의 종은" + dog2.type);
		
	
	}
	

}
