package 컬렉션복습;

import java.util.ArrayList;

import 스테틱.Day;

public class 나의일지 {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부",10,"학원");
		Day day2 = new Day("여행",14,"경주");
		Day day3 = new Day("운동",11,"한강공원");
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		
		//꺽쇠는 앞에만 써도 됨
		ArrayList<Day> list = new ArrayList<>();
		list.add(day1);
		list.add(day2);
		list.add(day3);
		
		파일로저장 file = new 파일로저장();
		file.save(list);// 주소값이 전달됨.. 콜바이레퍼런스
						// 파일로 저장 기능의 메서드 입력값에다가
						// ArrayList<Day> 넣기.. <-list의 타입..
	}

}
