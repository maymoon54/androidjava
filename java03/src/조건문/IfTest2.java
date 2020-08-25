package 조건문;

import javax.swing.JOptionPane;

public class IfTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ok = 0;
		int no = 0;
		int etc = 0; 
		//누적시키는 변수는 반복문 안에 넣으면 안됨 
		//반복할때마다 누적되지 않고, 초기화되기 때문에.	
		//(변수선언 하고 사용하지 않으면 밑줄 생김..)
		for (int i = 0; i < 5; i++) {
			
			String data = JOptionPane.showInputDialog("ok긍정 no부정 etc기타");
			if (data.equals("ok")) {
				System.out.println("긍정");
				ok++; //증감연산자
				//ok = ok + 1; 1더해서 다시 ram에다가 저장
				
			}else if (data.equals("no")) {
				System.out.println("부정");
				no++;
			}else {
				System.out.println("잘모르겠음");
				etc++;
			}	
		}
		System.out.println("긍정횟수: " + ok + "회");
		System.out.println("부정횟수: " + no + "회");
		System.out.println("모르겠음횟수: " + etc + "회");
	}

}
