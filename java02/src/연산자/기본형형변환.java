package 연산자;

public class 기본형형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 큰 <- 작은 : 자동형변환
		int x = 100; //int의 범위 -21억 ~ 21억, 4바이트
		byte y = 120; //byte의 범위 -128 ~ 127, 1바이트
		x = y;
		System.out.println("x:" + x);
		// 작은<-큰 : 강제형변환 ()을 사용
		// (자르고 싶은 데이터형) 변수명
		int z = 127;
		byte w = (byte)z;
		System.out.println("w:"+ w);
		
		//int q = 1000;
		//byte t = q; 
		//강제형변환하는 경우는 
		//강제로 변환하고자 하는 타입범위에
		//값이 들어가야 한다
		
			}

}
