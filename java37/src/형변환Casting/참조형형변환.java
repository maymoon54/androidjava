package 형변환Casting;

import java.util.ArrayList;

public class 참조형형변환 {

	public static void main(String[] args) {
		// 상속관계에서만 형변환(Casting, 캐스팅) 가능 
		// Car(부모, 수퍼) Truck(자식,서브)
		// 클래스간의 대소비교할 때는 개념적으로 접근
		// 부모클래스가 크고, 자식클래스가 작다
		
		ArrayList list = new ArrayList();
		// 어레이리스트는 배열과 비교해서 설명가능해야 한다
		// 같은 크기이고 타입이 같으면 배열을 쓰는게 가장 좋다
		// 어레이리스트는 모든타입을 묶을 수 있다. 크기가 유동
		
		list.add("홍길동"); //하나의 add 메서드 가지고 입력값이 다 다름.. 오버로드
		//Object(큰) <-- String(작) : 자동형변환
		//업캐스팅 : 자식이 부모자리에 들어감 = 자동형변환
		list.add(100); //add 메소드에 object면 다 넣을 수 있기 때문에.. 자식들도 다 넣을 수 있는것
		
		//최종적으론 Object <---(업캐스팅)--- Integer <----(오토박싱)--- int(기본형)
		
		list.add(11.22); //기본형 자료는 다 오토박싱 거쳐서 업캐스팅으로 리스트에 들어감
		list.add(true);
		list.add('A');
		
		list.add(new VO()); //업캐스팅만 필요

		System.out.println("목록내용: " + list);
		
		
		//업캐스팅(자동형변환)으로 String을 Object로 형변환하여 넣은 것은
		// 꺼냈을때 Object꺼내면 String에서 추가된 기능을 쓸 수 없다 (오브젝트 큰:부모 스트링 작은:속성 같으면서 기능더많다)
		// 꺼낼 때, String으로 형변환하여 꺼내야 한다
		// 강제형 변환, Down Casting (다운캐스팅)
		String name = (String)list.get(0);
		int age = (Integer)list.get(1); 
		//기본형 <--- (오토언박싱) <--- Integer <--- (다운캐스팅) <--- Object
		
				
	}

}
