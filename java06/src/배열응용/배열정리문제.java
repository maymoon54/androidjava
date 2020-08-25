package 배열응용;

import java.util.Stack;

import javax.swing.JOptionPane;

public class 배열정리문제 {

	public static void main(String[] args) {
		
		
	//1. 10,20,30,40,50을 배열에 넣어
		//첫번째 값과 두번째 값 더해서 프린트!
		int[] num = {10,20,30,40,50};
		System.out.println(num[0]+num[1]);
	
	//2.JAVA, SPRING, SJP를 입력받아 배열에 넣기
		String[] data = new String[3];
		for (int i = 0; i < data.length; i++) {
			data[i]=JOptionPane.showInputDialog("과목입력");
		}
		System.out.println("**"+data[0]+"보다는 " + data[1]+"**");
		
	//3. 11,22,33,44를 배열에 넣어서
		//이중 33은 몇번째 위치에 있는지 프린트!
		int[] num2 = {11,22,33,44};
		//for문을 사용해서 num2[i]값을 33과 비교 
		for (int i = 0; i < num2.length; i++) {
			if (num2[i]==33) {
				System.out.println("위치는"+i);
			}
		}
		
	//4. 5개의 정수 배열을 만들어서 1~5까지 입력하여 프린트!	
		
		//5개의 값을 입력받아 저장할 변수 선언 (배열)
		int[] num4 = new int[5];
		for (int i = 0; i < num4.length; i++) {
			num4[i] = i + 1;
		}
		for (int x : num4) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		//String[] data2 = new String[5];
		
		//for문으로 5개의 정수 입력받음
		//for (int i = 0; i < data2.length; i++) {
			//data2[i] = JOptionPane.showInputDialog("정수입력");
			//System.out.println(data2[i]);
		//}
		
	// 5. 66,77,88,99 중 최대값을 찾기
		int[] num3 = {66,77,88,99};
		int max = num3[0]; //max값에 우선 배열의 첫번째 값 넣어둠
		for (int i = 0; i < num3.length; i++) {
			if (num3[i]>max) {
				max = num3[i];
			}
		}
		System.out.println("최대값은"+max);
		
	// 6. 5번에서 66과 99의 위치를 변경	
		
		int[] num6 = {66,77,88,99};
		//차례대로 실행하면 66이 사라지므로 66을 먼저 백업함
		int imsi = num6[0]; //<-66
		num6[0] = num6[3];
		num6[3] = imsi;
		for (int x : num6) {
			System.out.print(x+ " ");
		}
		System.out.println();
		
		
	}

}
