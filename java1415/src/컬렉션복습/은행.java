package 컬렉션복습;

import java.util.ArrayList;

public class 은행 {

	public static void main(String[] args) {
	
		계좌 account1 = new 계좌("홍길동","정기적금",1000); //(클래스의 이름과 동일하게 자동생성된) 메서드가 호출된다
		계좌 account2 = new 계좌("김길동","정기예금",2000);
		계좌 account3 = new 계좌("김사랑","정기예금",2000);
		계좌 account4 = new 계좌("전지현","정기예금",2000);
		계좌 account5 = new 계좌("이상화","정기예금",2000);
		
		//계좌 account3 = new 계좌(); 
		//에러남.. 값을 넣지 않으면 객체를 생성 할 수 없다
		
		System.out.println(account1);
		System.out.println(account2);
		
		ArrayList<계좌> list = new ArrayList<>();
		list.add(account1);
		list.add(account2);
		list.add(account3);
		list.add(account4);
		list.add(account5);
		
		파일로저장2 file = new 파일로저장2();
		file.save(list);
		
		

	}

}
