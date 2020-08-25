package 배열기본;

public class 값이정해져있는경우 {

	public static void main(String[] args) {
		
		//1.저장공간이 만들어지는 순간 저장할 값이 정해지지 않는 경우
		// 일단, 공간을 먼저 만들어준다.
		int[] jumsu = new int[10];
		
		//나중에 값을 집어넣는 경우
		jumsu[0] = 100;
		jumsu[9] = 200;
		
		//for (int i = 0; i < jumsu.length; i++) {
		//	System.out.println(i + ": "+ jumsu[i]);
		//}// i는 index역할
		
		//foreach : 배열의 첫위치 값부터 하나씩 오른쪽으로 가면서 자동으로 꺼내주는 반복문
		// length보다 작을때까지!
		// 꺼낼때만 쓰고, 배열에 값을 넣을때는 사용불가!
		
		for (int x : jumsu) {
			System.out.println(x);
		}// x = int type의 임시변수
		
		//2.저장공간이 만들어주는 순간 저장할 값이 정해져있는 경우
		// 공간 만들자마자, 초기값을 정해진 값으로 바로 넣을 수 있다.
		
		//int[] jumsu2 = {100, 200, 300};
		//for (int i = 0; i < jumsu2.length; i++) {
		//System.out.println(i+ ": "+jumsu2[i]);
		//}
	}

}
