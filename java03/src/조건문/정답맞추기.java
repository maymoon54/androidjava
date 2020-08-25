package 조건문;

import javax.swing.JOptionPane;

public class 정답맞추기 {

	public static void main(String[] args) {
		
		int target = 88;
		int no = 0;
		int count = 0; 
		
		while(true) {
			String input = JOptionPane.showInputDialog("정답을 입력하세요");
			int n = Integer.parseInt(input);
			count++;
			//비교연산자는 기본형 데이터만 사용할 수 있다.
			if(n==target) {
				System.out.println("정답입니다. 축하합니다!");
				break;
			}else {
				System.out.println("정답이 아닙니다");
				no++;
				//큰지 작은지 힌트를 주세요.
				if(n>target) {
					System.out.println("너무커요!");
				}else {
					System.out.println("너무작아요!");
				}
			 }
			}//while
			System.out.println("틀린횟수 " + no + "번");
			System.out.println(count +"번 만에 정답 맞춤");
		}//main
			
	}//class


