package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

//CRUD중심으로 기능을 정의
//데이터와 관련된 작업(Data Access Object: DAO)
public class BbsDAO {
    // 기능을 정의할 때는 메서드(함수)를 사용
    // 컨트롤+쉬프트+f(화면 자동 정리)
    // create메서드 호출시 입력값을 받아주는 중간 매개체 역할의 변수
    // => 매개변수(parameter, 파라메터)
	
//글쓰기	
    public void create(BbsVO vo) throws Exception {
        // DB프로그램 절차에 맞추어서 코딩
        // 1. connector설정
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("1. connector연결 성공.!!");

        // 2. db연결
//      String url = "연결하는방법://ip:port/db명";
        String url = "jdbc:mysql://localhost:3366/shop1";
        String user = "root";
        String password = "1234";
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("2. db연결 성공.!!");

        // 3. sql문을 만든다.(create)
        String sql = "insert into bbs values (?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, vo.getNo());
        ps.setString(2, vo.getTitle());
        ps.setString(3, vo.getContent());
        ps.setString(4, vo.getWriter());
        System.out.println("3. SQL생성 성공.!!");

        // 4. sql문은 전송
        ps.executeUpdate();
        System.out.println("4. SQL문 전송 성공.!!");

    }

    public void create(String id, String pw, String name, String tel) throws Exception {
        // DB프로그램 절차에 맞추어서 코딩
        // 1. connector설정
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("1. connector연결 성공.!!");

        // 2. db연결
//      String url = "연결하는방법://ip:port/db명";
        String url = "jdbc:mysql://localhost:3366/shop1";
        String user = "root";
        String password = "1234";
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("2. db연결 성공.!!");

        // 3. sql문을 만든다.(create)
        String sql = "insert into member values (?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, id);
        ps.setString(2, pw);
        ps.setString(3, name);
        ps.setString(4, tel);
        System.out.println("3. SQL생성 성공.!!");

        // 4. sql문은 전송
        ps.executeUpdate();
        System.out.println("4. SQL문 전송 성공.!!");

    }

//글검색
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
    
    
  //모든글 가져오기
    public ArrayList<BbsVO> all() throws Exception {
        // 가방을 넣는 컨테이너 역할을 하게 됨.!
        // <>안에는 컨테이너에 무엇을 넣을지 지정!
        ArrayList<BbsVO> list = new ArrayList<BbsVO>();
//         DB프로그램 절차에 맞추어서 코딩
//         1. connector설정
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("1. connector연결 성공.!!");

        // 2. db연결
//              String url = "연결하는방법://ip:port/db명";
        String url = "jdbc:mysql://localhost:3366/shop1";
        String user = "root";
        String password = "1234";
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("2. db연결 성공.!!");

        // 3. sql문을 만든다.
        String sql = "select * from bbs";
        PreparedStatement ps = con.prepareStatement(sql);

        // 4. sql문은 전송
        // select의 결과는 검색결과가 담긴 테이블(항목+내용)
        // 내용에는 없을 수도 있고, 많은 수도 있음.
        ResultSet rs = ps.executeQuery();
        System.out.println("4. SQL문 전송 성공.!!");
        while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
           BbsVO bag = new BbsVO();// 가방만들어서,
           int no2 = rs.getInt("no");
           String title = rs.getString("title");
           String content = rs.getString("content");
           String writer = rs.getString("writer");
           // 가방에 넣기 
           bag.setNo(no2); //커서(위치알려주는 역할)
           bag.setTitle(title);
           bag.setContent(content);
           bag.setWriter(writer);
           // 컨테이너에 넣기
           list.add(bag);
        }
        return list;
        // bag은 참조형 변수, 주소를 전달!
     }
    
    
    
    // id중복체크
    public int read(String id) throws Exception {
//       DB프로그램 절차에 맞추어서 코딩
//       1. connector설정
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("1. connector연결 성공.!!");

        // 2. db연결
//              String url = "연결하는방법://ip:port/db명";
        String url = "jdbc:mysql://localhost:3366/shop1";
        String user = "root";
        String password = "1234";
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("2. db연결 성공.!!");

        // 3. sql문을 만든다.(create)
        String sql = "select * from member where id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, id);

        // 4. sql문은 전송
        // select의 결과는 검색결과가 담긴 테이블(항목+내용)
        // 내용에는 없을 수도 있고, 많은 수도 있음.
        ResultSet rs = ps.executeQuery();
        System.out.println("4. SQL문 전송 성공.!!");
        int result = 0;// 없음.
        if (rs.next() == true) { // 결과가 있는지 없는지 체크해주는 메서드
            // if(rs.next())와 동일함.
            // if문은 rs.next()가 true때만 실행되므로!
            System.out.println("검색결과가 있어요.");
            result = 1; // 있음.
            String id2 = rs.getString("id");
            String pw = rs.getString("pw");
            String name = rs.getString("name");
            String tel = rs.getString("tel");
            System.out.println("검색결과 id: " + id2);
            System.out.println("검색결과 pw: " + pw);
            System.out.println("검색결과 name: " + name);
            System.out.println("검색결과 tel: " + tel);
        } else {
            System.out.println("검색결과가 없어요.");
        }
        return result;
        // 0이 넘어가면, 검색결과 없음.
        // 1이 넘어가면, 검색결과 있음.
    }

    // id, pw맞는지 로그인 처리
    public boolean read(String id, String pw) throws Exception {
//       DB프로그램 절차에 맞추어서 코딩
//       1. connector설정
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("1. connector연결 성공.!!");

        // 2. db연결
//              String url = "연결하는방법://ip:port/db명";
        String url = "jdbc:mysql://localhost:3366/shop1";
        String user = "root";
        String password = "1234";
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("2. db연결 성공.!!");

        // 3. sql문을 만든다.(create)
        String sql = "select * from member where id = ? and pw = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, id);
        ps.setString(2, pw);

        // 4. sql문은 전송
        // select의 결과는 검색결과가 담긴 테이블(항목+내용)
        // 내용에는 없을 수도 있고, 많은 수도 있음.
        ResultSet rs = ps.executeQuery();
        System.out.println("4. SQL문 전송 성공.!!");
        boolean result = false;// 로그인이 not!인 상태!
        if (rs.next() == true) { // 결과가 있는지 없는지 체크해주는 메서드
            System.out.println("로그인 ok.");
            result = true; // 있음.
        } else {
            System.out.println("로그인 not.");
        }
        return result;
        // false면 로그인not.
        // true면 로그인ok.
    }

//글수정    
    public void update(String content, int no) throws Exception {
        // DB프로그램 절차에 맞추어서 코딩
        // 1. connector설정
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("1. connector연결 성공.!!");

        // 2. db연결
//              String url = "연결하는방법://ip:port/db명";
        String url = "jdbc:mysql://localhost:3366/shop1";
        String user = "root";
        String password = "1234";
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("2. db연결 성공.!!");

        // 3. sql문을 만든다.(create)
        String sql = "update bbs set content = ? where no = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, content);
        ps.setInt(2, no);
        System.out.println("3. SQL생성 성공.!!");

        // 4. sql문은 전송
        ps.executeUpdate();
        System.out.println("4. SQL문 전송 성공.!!");
    }

    public void delete(int no) throws Exception {
//      DB프로그램 절차에 맞추어서 코딩
//              1. connector설정
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("1. connector연결 성공.!!");

        // 2. db연결
//             String url = "연결하는방법://ip:port/db명";
        String url = "jdbc:mysql://localhost:3366/shop1";
        String user = "root";
        String password = "1234";
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("2. db연결 성공.!!");

        // 3. sql문을 만든다.(create)
        String sql = "delete from bbs where no = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, no);
        System.out.println("3. SQL생성 성공.!!");

        // 4. sql문은 전송
        ps.executeUpdate();
        System.out.println("4. SQL문 전송 성공.!!");
    }
}