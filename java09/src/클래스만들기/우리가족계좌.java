package 클래스만들기;

public class 우리가족계좌 {

	public static void main(String[] args) {
	
		
	계좌 아버지 = new 계좌();	
	아버지.이름 = "홍길동";
	아버지.계좌이름 = "튼튼적금";
	아버지.금액 = 1000;
	
	계좌 어머니 = new 계좌();	
	어머니.이름 = "박길동";
	어머니.계좌이름 = "튼튼예금";
	어머니.금액 = 2000;
	
	계좌 딸 = new 계좌();	
	딸.이름 = "홍기사";
	딸.계좌이름 = "다음적금";
	딸.금액 = 3000;
	
	System.out.println("우리 가족 계좌 정보");
	System.out.println("----------------------");
	System.out.println("이름\t계좌이름\t금액");
	System.out.println("----------------------");
	System.out.println(아버지.이름+"\t"+아버지.계좌이름+"\t"+아버지.금액);
	System.out.println(어머니.이름+"\t"+어머니.계좌이름+"\t"+어머니.금액);
	System.out.println(딸.이름+"\t"+딸.계좌이름+"\t"+딸.금액);
	
	
	System.out.println("----------------------");
	
	System.out.print("아버지는 ");
	아버지.입금();
	System.out.print("딸은 ");
	딸.출금();
	
	}

}
