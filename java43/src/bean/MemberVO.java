package bean;

public class MemberVO {

	private String id; //db테이블에 전달목적이므로 칼럼명과 이름 동일하게
	private String pw;
	private String name;
	private String tel;
	
	//자동완성 소스
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	//private라고 쓰면, 이 클래스 내에서만 변수에 접근해서 쓸 수 있음.
	//외부에서는 접근 불가
	
	//전역변수4개랑 지역변수1개 총 5개 생김
	
	//각 변수에 값을 넣고 빼는 메서드를 정의하면 된다.
	//가방에 넣을때는 set메서드로 정의 : setters
	//가방에서 꺼낼 때는 get메서드로 정의 : getters
	
//	public void setId(String id) { //낙타표기법, 메서드 이름은 소문자
//		this.id = id;
//		//이름이 같으므로 this 붙여서 전역변수임을 표시함
//	}
	
	
}
