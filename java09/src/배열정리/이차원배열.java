package 배열정리;

public class 이차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1차원배열 : 선 /1행 n열 
		//2차원배열 : 면 /n행 n열 각행마다 다른 열개수를 가질 수 있는게 특징 ex)극장 좌석 1행은 좌석6개 2행은4개
		
		int[][] seat = new int[3][5]; //3행 5열, 행별로 열개수 다를경우 [3][] 비워둠
		//배열을 선언하는 순간 공간이 할당!
		//기본형변수 int 15개, 참조형변수(주소) seat  
		//seat : 참조형변수(주소)
		//int[3][5] : 기본형변수 (값)
		//배열은 자동초기화 int ->0
		
		//    0 1 2 3 4
		// 0  0 0 0 0 0     for문
		// 1  0 0 0 0 0     for문
		// 2  0 0 0 0 0     for문
		
		seat[0][1] = 1;
		seat[0][4] = 1;
		seat[2][4] = 1;
		seat[1][2] = 1;
		seat[2][1] = 1;
		
		
		System.out.println("행의갯수 : "+seat.length); //2중for문
		for (int i = 0; i < seat.length; i++) {//바깥쪽 for문 0행 1행 2행
			for (int j = 0; j < seat[i].length; j++) {//행별 열 개수 0~4
				System.out.print(seat[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
