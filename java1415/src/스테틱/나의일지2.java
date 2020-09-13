package 스테틱;

import java.util.ArrayList;

public class 나의일지2 {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부",10,"학원");
		System.out.println(Day.count + "개 생성됨.");
		System.out.println(Day.sum + "시간 누적됨.");
		//static 변수는 클래스 단위로 접근
		
		Day day2 = new Day("여행",14,"경주");
		System.out.println(Day.count + "개 생성됨.");
		System.out.println(Day.sum + "시간 누적됨.");
		
		Day day3 = new Day("운동",11,"한강공원");
		System.out.println(Day.count + "개 생성됨.");
		System.out.println(Day.sum + "시간 누적됨.");
		
		
		System.out.println("평균시간은 "+Day.sum / Day.count + "시간");
		System.out.println("평균시간은 "+ day1.getAvg() + "시간");
		
		
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
	}

}
