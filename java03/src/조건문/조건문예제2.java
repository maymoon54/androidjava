package 조건문;

import javax.swing.JOptionPane;

public class 조건문예제2 {

	public static void main(String[] args) {
		
		int target = 88;
		int c = 0; // 정답이 아닐때마다 카운트해주기 위해 변수선언
		
		while(true) {
			String input = JOptionPane.showInputDialog("정답을 입력하세요");
			int n = Integer.parseInt(input);
			// 입력받을 정답과 비교하기 위해 정수화
			if(n==target) {
				System.out.println("정답입니다. 축하합니다!");
				break;
			// 입력받은값과 정답이 같을때 반복문 멈추고 정답입니다 출력	
			}else if (n>target) {
				System.out.println("너무 커요!");
				c++; //두번적어야 하므로 좋은코드 아님 공통적으로 아닌것을 else로 묶음
			
			}else if (n<target) {
				System.out.println("너무 작아요");
				c++;
					// 입력받은값과 정답 크기를 비교하여 크다/작다 출력해주고,
					// 수행시 1씩 더해줘서 틀릿횟수를 계산
				
			}
				
			}
			System.out.println("틀린횟수 " + c + "번");
			System.out.println((c+1) +"번 만에 정답 맞춤");
			//틀린횟수를 출력하고, 정답을 몇번만에 맞췄는지는 틀린횟수+1로 출력 
		}
		
			
	}


