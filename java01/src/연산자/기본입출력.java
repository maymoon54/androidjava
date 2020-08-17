package 연산자;

import javax.swing.JOptionPane;

public class 기본입출력 {

	public static void main(String[] args) {
		// 창을 띄워서 입력을 받아보자
		// 창을 띄워서 출력을 해보자
		// 자주 사용하는 것은 부품의 대문자를 그대로 쓴다.
		// 특정한 일을 전담하는 부품을 만들어, 특정한 처리를 할때 부품을 지정함.
		// library에 전담하는 부품들이 저장되어있음..(자주쓰는 명령..앞글자 대문자) 4천개?
		
		String name = JOptionPane.showInputDialog("당신의 이름은");
		// JOptionPane을 이용해서 이름을 입력받아서 변수 name에 저장한다.
		
		System.out.println("당신의 이름은 " + name);
		// 화면에 출력
		
		String age = JOptionPane.showInputDialog("당신의 나이는");
		//JOptionPane을 이용해서 나이를 입력받아서 age라는 변수에 저장한다.
		
		// 키보드로 입력한 데이터 타입은 무조건 String!
		// String으로 저장된 데이터를 int / String 쓸지는 내가 결정!
		// 계산의 유무에 따라 계산해야하는 경우는 int로 변환해주어야 함.
		// 숫자로 바꿔보자!!
		
		int age2 = Integer.parseInt(age);
		//age를 정수로 변환시켜서 age2에 저장한다
		
		int lastAge = age2 - 1;
		//정수형태의 age2에 1을 빼는 연산을 수행하고, lastAge라는 변수에 저장한다.
		
		System.out.println("당신의 작년 나이는 " + lastAge);
		// 화면에 출력
	}

}
