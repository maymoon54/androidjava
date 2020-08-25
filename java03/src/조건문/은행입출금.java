package 조건문;

import javax.swing.JOptionPane;

public class 은행입출금 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int inm = 0;
	int outm = 0;
	int sum = 0;	
	
	while(true) {
		String input = JOptionPane.showInputDialog("1)입금 2)출금 3)잔고 4)종료");
		if (input.equals("4")) {
			System.out.println("종료");
			break;
		}else {
			
			if(input.equals("1")) {
				String in = JOptionPane.showInputDialog("입금액 입력");
				inm = Integer.parseInt(in);
				System.out.println("입금액은" + inm+ "원");
			
			}if(input.equals("2")) {
				String out = JOptionPane.showInputDialog("출금액 입력");
				outm = Integer.parseInt(out);
				System.out.println("출금액은" + outm+ "원");
				
			}if(input.equals("3")) {
				sum = inm - outm;
				System.out.println("잔고는" + sum + "원");
			}
			}
	}	
		
		
	}

}
