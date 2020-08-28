package 클래스사용하기;

import 클래스만들기.용돈계산기;

public class 내용돈을계산해보자 {

	public static void main(String[] args) {
		//주소값을가지고 메서드에 접근
		//객체생성으로 메서드 호출
		용돈계산기 cal1 = new 용돈계산기();
		int money = 100000; //한달동안 받은 돈
		int month = 6; //6개월
		int sum = cal1.mul(money, month);
		if (sum<500000) {
			System.out.println("내용돈은 "+(sum+150000));
		}else {
			System.out.println("내용돈은 "+sum);
		}
		
		int m1 = 600000; //상반기 받은 용돈
		int m2 = 500000; //하반기 받은 용돈
		cal1.add(m1, m2);
		
		
	}

}
