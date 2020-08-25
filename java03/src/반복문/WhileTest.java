package 반복문;

import javax.swing.JOptionPane;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//계속 반복하고자 하는 경우
		//제한된 횟수를 반복하고자 하는 경우
		
		while(true) {
			System.out.println("내가 계속 돌아요.");
			String choice = JOptionPane.showInputDialog("계속하실래요? yes or no");
			if (choice.equals("n") || choice.equals("no")){
				System.out.println("프로그램을 종료합니다.");
				System.exit(0); //프로그램 종료
				//break; //while반복문을 종료, while 아래에 있는것들은 계속 실행
			}
		}
	
		//int i = 0; //시작값
		//while(i < 10) { //조건식
		//	System.out.println("내가 10번 돌아요.");
		//실행내용
		//	i++;
		//}
	}
	
}
	
	


