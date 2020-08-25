package 배열기본;

public class 값이정해져있는경우2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] names = {"민병","은옥","혜정","재화"};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		for (String x : names) {
			System.out.println(x);
		} //출력용으로는 foreach 많이사용
		
		
		int[] age = {10,20,30,40};
		
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		}
		
		for (int i : age) { //i는 임시변수
			System.out.println(i);
		}
		
		
		char[] gender = {'남','여','여','여'};
		for (int i = 0; i < gender.length; i++) {
			System.out.println(gender[i]);
		}
		
		for (char c : gender) {
			System.out.println(c);
		}
		
		boolean[] bf = {false, false, true, true};
		for (int i = 0; i < bf.length; i++) {
			System.out.println(bf[i]);
		}
		
		
		for (boolean b : bf) {
			System.out.println(b);
		}
		
		double[] kg = {69.8,50.2,48.9,51.4};
		for (int i = 0; i < kg.length; i++) {
			System.out.println(kg[i]);
		}
		for (double d : kg) {
			System.out.println(d);
		}
		
		System.out.println("--------------------");
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("이름 :" + names[i]);
			System.out.println("나이 :" + age[i]);
			System.out.println("성별 :" + gender[i]);
			System.out.println("아침밥 먹었는지? :" + bf[i]);
			System.out.println("체중 :" + kg[i]);
		System.out.println("--------------------");
				
			
		}
		
		
	}

}
