package 컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 컬렉션예제 {

	public static void main(String[] args) {
		
	// 1. 달리기
		ArrayList run = new ArrayList();
		run.add("박소정"); //1등
		run.add("김정민");
		run.add("소지현");
		run.add("김개념");
		for (int i = 0; i < run.size(); i++) {
			System.out.println(i+1 + "등: " + run.get(i));
		}
		
		//2등이 반칙하여 탈락
		System.out.println("---2등 반칙 탈락---");
		run.remove(1);
		for (int i = 0; i < run.size(); i++) {
			System.out.println(i+1 + "등: " + run.get(i));
		}
		
	//	2.고객관리 시스템
	HashMap c = new HashMap();
	c.put(100, "김데이");
	c.put(200, "김사전");
	c.put(300, "김구조");
	c.put(400, "김자료");
		
		//200번의 고객은 탈퇴
		c.remove(200);
		
		//300번의 고객은 개명
		c.put(300, "김충성");
	System.out.println();	
	System.out.println("고객의 전체리스트");	
	System.out.println(c);
		
	
	//	3.가고싶은 여행지, 한번 다녀온것은 가지 않음
	HashSet tour = new HashSet();
	tour.add("유럽");
	tour.add("일본");
	tour.add("필리핀");
	tour.add("캐나다");
	tour.add("미국");
	tour.add("유럽");
	System.out.println();
	System.out.println("여행지 리스트");
	System.out.println(tour);

	}

}
