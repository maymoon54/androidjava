package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//CRUD중심으로 기능을 정의
//데이터와 관련된 작업(Data Access Object:DAO)

public class MemberDAO {
	// 기능을 정의할때는 메서드(함수)를 사용
	public void create(String id, String pw, String name, String tel ) throws Exception {
		//DB프로그램 절차에 맞추어서 코딩
		//1.connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector 연결 성공!");
		
		//2.db연결
		//String url = "연결하는 방법://ip:port/db명";
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
			//드라이버 주소를 con이라는 변수에 넣어둠
		System.out.println("2.db연결 성공!!");
		
		
		//3.sql문을 만든다.(create)
		
		String sql = "insert into member values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
			//con에 들어있는 드라이버 주소를 통해 pre-어쩌구 메서드를 호출한것
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3.sql문 생성 성공!!");
				
				
		//4.sql문을 전송
		ps.executeUpdate();
		System.out.println("4.sql문 전송 성공!!");
		
	}

	public int read(String id) throws Exception {
		//1.connector설정
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("1.connector 연결 성공!");
				
				//2.db연결
				//String url = "연결하는 방법://ip:port/db명";
				String url = "jdbc:mysql://localhost:3366/shop1";
				String user = "root";
				String password = "1234";
				Connection con = DriverManager.getConnection(url, user, password);
				System.out.println("2.db연결 성공!!");
				
				
				//3.sql문을 만든다.(create)
				
				String sql = "select * from member where id = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, id);
				System.out.println("3.sql문 생성 성공!!");
						
						
				//4.sql문을 전송
				//select의 결과는 검색결과가 담긴 테이블(항목+내용)
				//내용에는 없을 수도 있고, 많을 수도 있음.
				ResultSet rs = ps.executeQuery();
				System.out.println("4.sql문 전송 성공!!");
				
				int result = 0; //없음(초기값)
				
				
				if (rs.next() == true) { //결과가 있는지 없는지 체크해주는 메서드
					//if(rs.next())와 동일함.
					//if문은 rs.next()가 true때만 실행되므로!
					
					System.out.println("검색결과가 있어요");
					result = 1;//있음
					String id2 = rs.getString("id");
					String pw2 = rs.getString("pw");
					String name2 = rs.getString("name");
					String tel2 = rs.getString("tel");
					System.out.println("검색결과 id: " + id2);
					System.out.println("검색결과 pw: " + pw2);
					System.out.println("검색결과 name: " + name2);
					System.out.println("검색결과 tel: " + tel2);
					
					
					
					
				}else {
					System.out.println("검색결과가 없어요");
				}
				return result;
				//0이 넘어가면, 검색결과 없음.
				//1이 넘어가면, 검색결과 있음.
	}

	public void update(String tel, String id) throws Exception {
		
		//1.connector설정
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("1.connector 연결 성공!");
				
				//2.db연결
				//String url = "연결하는 방법://ip:port/db명";
				String url = "jdbc:mysql://localhost:3366/shop1";
				String user = "root";
				String password = "1234";
				Connection con = DriverManager.getConnection(url, user, password);
				System.out.println("2.db연결 성공!!");
				
				
				//3.sql문을 만든다.(create)
				
				String sql = "update member set tel=? where id=?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, tel);
				ps.setString(2, id);

				System.out.println("3.sql문 생성 성공!!");
						
						
				//4.sql문을 전송
				ps.executeUpdate();
				System.out.println("4.sql문 전송 성공!!");
		
		

	}

	public void delete(String id) throws Exception {
		//1.connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		
		//2.db연결
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";

		Connection con = DriverManager.getConnection(url, user, password);
		
		//3.sql문을 만든다
		String sql = "delete from member where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		
		//4.sql문을 전송한다
		ps.executeLargeUpdate();
	
		
		
	}

}
