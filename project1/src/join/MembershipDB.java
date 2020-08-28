package join;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class MembershipDB {
	//DB처리하는 방법이 4단계로 정해져 있다.
			public void create(String id, String pw, String name, String email, String phone) throws Exception {
				System.out.println("DB에 저장 처리 함.");
				//1.conector 설정
				Class.forName("com.mysql.jdbc.Driver");
				//자바에서는 에러가 너무 많이 발생할 것 같은 상황에서는 반드시
				//에러처리를 반드시 해주어야 함.
				//네트워크 연결, db연결, 파일연결, cpu연결
				
				System.out.println("1. conector 설정 성공!");
				
				//2.db연결 
					//1)url : ip+port+db명
					//2)username : root
					//3)password : 1234
				String url = "jdbc:mysql://localhost:3366/movie";
				String user = "root";
				String password = "1234";
				Connection con = DriverManager.getConnection(url, user, password);
				System.out.println("2. movie연결 성공!!");
				
				//db연동 index는 1부터 시작
				String sql = "insert into bbs values (?,?,?,?,?)";
				//컴퓨터는 이 문장을 그냥 String으로 인식!
				
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, id);
				ps.setString(2, pw);
				ps.setString(3, name);
				ps.setString(4, email);
				ps.setString(5, phone);
				
				System.out.println("3. SQL문 생성 성공!!");
				
				ps.executeUpdate();
				System.out.println("4. SQL문을 mysql로 네트워크 전송 성공!!");
				
			}
	}


