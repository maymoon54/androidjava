package 배열정리;

public class 과목별점수 {

	public static void main(String[] args) {

		//행(과목) 4줄
		int[][] study = new int[4][];
		
		//과목당 응시자(열) 수는 각각 다르다 
		
		int[] kor = {50,60,70,80,90};
		int[] math = {66,77,88};
		int[] eng = {90,80,70,60};
		int[] sc = {77,100};
	
		//각 행에 열을 넣어줌
		study[0] = kor; 
		study[1] = math; 
		study[2] = eng; 
		study[3] = sc; 
		
		
		for (int i = 0; i < study.length; i++) {
			for (int j = 0; j < study[i].length; j++) {
				System.out.print(study[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
