package dbcp;

public class SingleTonTest {

	public static void main(String[] args) {
		ConManager con = ConManager.getInstance();
		System.out.println(con);
		
		ConManager con2 = ConManager.getInstance();
		System.out.println(con2); //con con2 주소가 같음

	}

}
