package 조건문;

import javax.swing.JOptionPane;
import javax.xml.bind.DataBindingException;

public class 조건문예제1 {

	public static void main(String[] args) {
		
		int ok = 0, no = 0, etc = 0; 
		// 긍정, 부정, 기타 횟수를 카운트 하기 위해서 변수 선언
		
		while(true) {
			String data = JOptionPane.showInputDialog("ok긍정 no부정 etc기타 end끝");
		// 무한루프로 물어보는 창 띄움	
			if (data.equals("end")) {
				System.out.println("반복문 종료합니다.");
				break;
		//end라고 입력하면 반복문을 중지하고 "종료" 출력
			}else if (data.equals("ok")) {
				System.out.println("긍정");
				ok++;
		//ok라고 입력시 "긍정" 출력하고 ok변수에 1씩 계속 더해서 저장함
			}else if (data.equals("no")) {
				System.out.println("부정");
				no++;
		//no라고 입력시 "부정" 출력하고 no 1씩 증가
			}else{
				System.out.println("기타");
				etc++;
		//end,ok,no 아닌 다른값 입력시 "기타" 출력하고 etc 1씩 증가
			}
		}
		System.out.println("긍정은 " + ok + "번");
		System.out.println("부정은 " + no + "번");
		System.out.println("기타는 " + etc + "번");
		//while문 반복이 끝나면 각각의 횟수를 출력한다
	}
		
}
