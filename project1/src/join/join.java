package join;

import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class join {

	public static void main(String[] args) {
	
	//프레임
	JFrame f = new JFrame();
	
	//페이지 제목
	JLabel title = new JLabel();
	title.setText("회원가입");
	
	//회원가입 메뉴
	JLabel id = new JLabel();
	JLabel pw = new JLabel();
	JLabel pwc = new JLabel();
	JLabel name = new JLabel();
	JLabel email = new JLabel();
	JLabel phone = new JLabel();
	
	id.setText("아이디");
	pw.setText("비밀번호");
	pwc.setText("비밀번호 확인");
	name.setText("이름");
	email.setText("이메일주소");
	phone.setText("휴대폰번호");
	
	//입력받기
	TextField inputid = new TextField();
	TextField inputpw = new TextField();
	TextField inputpwc = new TextField();
	TextField inputname = new TextField();
	TextField inputemail = new TextField();
	TextField inputphone = new TextField();

	
	
	
	//화면에 배치하기
	f.getContentPane().add(title);
	f.getContentPane().add(id);
	f.getContentPane().add(inputid);
	f.getContentPane().add(pw);
	f.getContentPane().add(inputpw);
	f.getContentPane().add(pwc);
	f.getContentPane().add(inputpwc);
	f.getContentPane().add(email);
	f.getContentPane().add(inputemail);
	f.getContentPane().add(phone);
	f.getContentPane().add(inputphone);
		
		
	//레이아웃	
	FlowLayout flow = new FlowLayout();
	f.setSize(1600, 1000);
	f.getContentPane().setLayout(flow);
	
	f.setVisible(true);	
		
	}

}
