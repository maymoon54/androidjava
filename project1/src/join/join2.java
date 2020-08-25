package join;

import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class join2 {

	public static void main(String[] args) {
	
	//프레임
	JFrame f = new JFrame();
	
	//페이지 제목
	JLabel title = new JLabel();
	title.setBounds(471, 80, 126, 68);
	title.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
	title.setText("회원가입");
	
	//회원가입 메뉴
	JLabel id = new JLabel();
	id.setBounds(314, 199, 59, 41);
	id.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
	JLabel pw = new JLabel();
	pw.setBounds(311, 264, 98, 41);
	pw.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
	JLabel pwc = new JLabel();
	pwc.setBounds(311, 335, 107, 41);
	pwc.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
	JLabel name = new JLabel();
	JLabel email = new JLabel();
	email.setBounds(311, 403, 107, 41);
	email.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
	JLabel phone = new JLabel();
	phone.setBounds(314, 467, 90, 41);
	phone.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
	
	id.setText("아이디");
	pw.setText("비밀번호");
	pwc.setText("비밀번호 확인");
	name.setText("이름");
	email.setText("이메일주소");
	phone.setText("휴대폰번호");
	
	//입력받기
	TextField inputid = new TextField();
	inputid.setBounds(430, 196, 252, 44);
	inputid.setFont(new Font("Arial", Font.PLAIN, 15));
	inputid.setColumns(20);
	TextField inputpw = new TextField();
	inputpw.setBounds(430, 264, 252, 41);
	inputpw.setFont(new Font("Arial", Font.PLAIN, 15));
	inputpw.setColumns(20);
	TextField inputpwc = new TextField();
	inputpwc.setBounds(430, 335, 252, 41);
	inputpwc.setFont(new Font("Arial", Font.PLAIN, 15));
	inputpwc.setColumns(20);
	TextField inputname = new TextField();
	TextField inputemail = new TextField();
	inputemail.setBounds(430, 403, 252, 41);
	inputemail.setFont(new Font("Arial", Font.PLAIN, 15));
	inputemail.setColumns(20);
	TextField inputphone = new TextField();
	inputphone.setBounds(430, 467, 252, 41);
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
	
	JButton joinbt = new JButton("회원가입");
	joinbt.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
	joinbt.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	joinbt.setBounds(448, 558, 98, 35);
	f.getContentPane().add(joinbt);
	
	JButton joinbt_1 = new JButton("취소");
	joinbt_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	joinbt_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
	joinbt_1.setBounds(574, 558, 90, 35);
	f.getContentPane().add(joinbt_1);
	
	JButton btnNewButton = new JButton("ID중복체크");
	btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
	btnNewButton.setBounds(688, 202, 120, 34);
	f.getContentPane().add(btnNewButton);
	f.setSize(1200, 800);
	
	f.setVisible(true);	
		
	}
}
