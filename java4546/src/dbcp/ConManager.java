package dbcp;

public class ConManager {

	static ConManager con; //전역변수 자동초기화 null들어가 있음
							// 객체생성하지않고 접근가능한 static변수로 만들어야함
	
	//객체가 만들어졌는지 체크
	//객체가 안만들어졌으면 만들어줌.
	//객체가 이미 하나 만들어져 있으면 안만듬
	//객체를 리턴
	public static ConManager getInstance( ) {
		if (con == null) { //객체가 없으면 객체 만듬
			con = new ConManager();
		}
		return con;
	}


}
