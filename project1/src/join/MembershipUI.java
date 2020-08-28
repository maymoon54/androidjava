package join;

import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MembershipUI {

	public static void main(String[] args) {
	
	//프레임
	JFrame f = new JFrame();
	
	//페이지 제목
	JLabel title = new JLabel();
	title.setBounds(430, 43, 126, 68);
	title.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
	title.setText("회원가입");
	
	//회원가입 메뉴
	JLabel id = new JLabel();
	id.setBounds(219, 216, 59, 41);
	id.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
	JLabel pw = new JLabel();
	pw.setBounds(216, 281, 98, 41);
	pw.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
	JLabel pwc = new JLabel();
	pwc.setBounds(216, 352, 107, 41);
	pwc.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
	JLabel name = new JLabel();
	JLabel email = new JLabel();
	email.setBounds(216, 420, 107, 41);
	email.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
	JLabel phone = new JLabel();
	phone.setBounds(219, 484, 90, 41);
	phone.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
	
	id.setText("아이디");
	pw.setText("비밀번호");
	pwc.setText("비밀번호 확인");
	name.setText("이름");
	email.setText("이메일주소");
	phone.setText("휴대폰번호");
	
	//입력받기
	TextField inputid = new TextField();
	inputid.setBounds(376, 216, 252, 44);
	inputid.setFont(new Font("Arial", Font.PLAIN, 15));
	inputid.setColumns(20);
	TextField inputpw = new TextField();
	inputpw.setBounds(376, 284, 252, 41);
	inputpw.setFont(new Font("Arial", Font.PLAIN, 15));
	inputpw.setColumns(20);
	TextField inputpwc = new TextField();
	inputpwc.setBounds(376, 355, 252, 41);
	inputpwc.setFont(new Font("Arial", Font.PLAIN, 15));
	inputpwc.setColumns(20);
	TextField inputname = new TextField();
	inputname.setFont(new Font("Arial", Font.PLAIN, 15));
	inputname.setColumns(20);
	inputname.setBounds(376, 142, 252, 44);
	f.getContentPane().add(inputname);
	TextField inputemail = new TextField();
	inputemail.setBounds(376, 423, 252, 41);
	inputemail.setFont(new Font("Arial", Font.PLAIN, 15));
	inputemail.setColumns(20);
	TextField inputphone = new TextField();
	inputphone.setBounds(376, 487, 252, 41);
	inputphone.setFont(new Font("Arial", Font.PLAIN, 15));
	inputphone.setColumns(20);
	f.getContentPane().setLayout(null);

	
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
	
	
	//회원가입버튼
	JButton joinbt = new JButton("회원가입");
	joinbt.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
	joinbt.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		MembershipDB db = new MembershipDB();
		
		String id = inputid.getText();
		String pw = inputpw.getText();
		String name = inputname.getText();
		String email = inputemail.getText();
		String phone = inputphone.getText();
		System.out.println(name);
		db.create(id, pw, name, email, phone);	
		}
	});
	joinbt.setBounds(395, 564, 98, 35);
	f.getContentPane().add(joinbt);
	
	JButton joinbt_1 = new JButton("취소");
	joinbt_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	joinbt_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
	joinbt_1.setBounds(521, 564, 90, 35);
	f.getContentPane().add(joinbt_1);
	
	JButton btnNewButton = new JButton("ID중복체크");
	btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
	btnNewButton.setBounds(644, 219, 120, 34);
	f.getContentPane().add(btnNewButton);
	
	

	JLabel lblDlfma = new JLabel();
	lblDlfma.setText("이름");
	lblDlfma.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
	lblDlfma.setBounds(219, 145, 59, 41);
	f.getContentPane().add(lblDlfma);
	

	f.setSize(1000, 800);
	
	f.setVisible(true);	
		
	}
}
