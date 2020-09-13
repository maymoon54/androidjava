package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BbsDAO2 {

	// create메서드 정의

	public void create(BbsVO vo) throws Exception {

		// 1.connector설정
		Class.forName("com.mysql.jdbc.Driver");

		// 2.db연결
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);

		//3.sql문을 만든다.(create)
		String sql = "insert into bbs values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
			//con에 들어있는 드라이버 주소를 통해 pre-어쩌구 메서드를 호출한것
		ps.setInt(1, vo.getNo());
		ps.setString(2, vo.getTitle());
		ps.setString(3, vo.getContent());
		ps.setString(4, vo.getWriter());
		
				
				
		//4.sql문을 전송
		ps.executeUpdate();
		
		
	}
	
	public BbsVO one(int no) throws Exception {
//      DB프로그램 절차에 맞추어서 코딩
//      1. connector설정
     Class.forName("com.mysql.jdbc.Driver");
     System.out.println("1. connector연결 성공.!!");

     // 2. db연결
//           String url = "연결하는방법://ip:port/db명";
     String url = "jdbc:mysql://localhost:3366/shop1";
     String user = "root";
     String password = "1234";
     Connection con = DriverManager.getConnection(url, user, password);
     System.out.println("2. db연결 성공.!!");

     // 3. sql문을 만든다.
     String sql = "select * from bbs where no = ?";
     //select * from member where id = 'park' //setString
     //select * from bbs where no = 1 //setInt
     PreparedStatement ps = con.prepareStatement(sql);
     ps.setInt(1, no);

     // 4. sql문은 전송
     // select의 결과는 검색결과가 담긴 테이블(항목+내용)
     // 내용에는 없을 수도 있고, 많은 수도 있음.
     ResultSet rs = ps.executeQuery();
     System.out.println("4. SQL문 전송 성공.!!");
     BbsVO bag = new BbsVO();//가방만들어서,
     if (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
        System.out.println("검색결과가 있어요.");
        int no2 = rs.getInt("no");
        String title = rs.getString("title");
        String content = rs.getString("content");
        String writer = rs.getString("writer");
        //가방에 넣기
        bag.setNo(no2);
        bag.setTitle(title);
        bag.setContent(content);
        bag.setWriter(writer);
        System.out.println("검색결과 ino2: " + no2);
        System.out.println("검색결과 title: " + title);
        System.out.println("검색결과 content: " + content);
        System.out.println("검색결과 writer: " + writer);
     } else {
        System.out.println("검색결과가 없어요.");
     }
     return bag;
     // bag은 참조형 변수, 주소를 전달!
  }
	

}
