package join;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;

import main.logoutAfter;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JPasswordField;

public class memberinfo extends JFrame{
	private JTextField name;
	private JTextField email;
	private JTextField phone;
	private JPasswordField mpw;
	private JPasswordField mpwc;
	
	
	
	public memberinfo (String id, String pw) throws Exception {
		
		setSize(1000, 800);
		setVisible(true);
		setLocationRelativeTo(null); //화면 가운데 창 띄우기
		setResizable(false);//창 크기 변환불가
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		getContentPane().setLayout(null);
		
		//id로 회원정보 검색
		join.MembershipDAO dao = new join.MembershipDAO();
		
		//가방을 가져옴
		MembershipVO bag = dao.one(id);
		
		//패널생성
		JPanel change1 = new JPanel();
		JPanel change2 = new JPanel();
		
		
		//패널1 : 예매내역 (초기화면)
		change1.setBounds(266, 98, 567, 627);
		getContentPane().add(change1);
		change1.setLayout(null);
		change1.setVisible(true);
		change2.setVisible(false);
		
		JLabel lblNewLabel_4 = new JLabel("예매내역");
		lblNewLabel_4.setBounds(253, 5, 136, 60);
		lblNewLabel_4.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		change1.add(lblNewLabel_4);

        
		//패널2 : 회원정보 수정
		JLabel blNewLabel = new JLabel("회원정보");
		blNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		blNewLabel.setBounds(31, 10, 78, 41);
		change2.add(blNewLabel);
		
		change2.setBounds(266, 99, 716, 535);
		getContentPane().add(change2);
		change2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblNewLabel.setBounds(137, 93, 157, 28);
		change2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호 변경");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(137, 214, 157, 28);
		change2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("비밀번호 확인");
		lblNewLabel_1_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(137, 258, 157, 28);
		change2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("이메일 주소");
		lblNewLabel_1_1_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(137, 318, 157, 28);
		change2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("휴대폰 번호");
		lblNewLabel_1_1_1_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1.setBounds(137, 377, 157, 28);
		change2.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("이름");
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(137, 148, 157, 28);
		change2.add(lblNewLabel_3);
		
		JLabel readId = new JLabel(id);
		readId.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		readId.setBounds(300, 93, 121, 24);
		change2.add(readId);
		
		name = new JTextField(bag.getName());//이름
		name.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		name.setBounds(300, 148, 170, 28);
		change2.add(name);
		name.setColumns(10);
		
		email = new JTextField(bag.getEmail());//이메일
		email.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		email.setColumns(10);
		email.setBounds(300, 319, 233, 28);
		change2.add(email);
		
		phone = new JTextField(bag.getPhone()); //휴대폰번호
		phone.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		phone.setColumns(10);
		phone.setBounds(300, 377, 233, 28);
		change2.add(phone);
		
		mpw = new JPasswordField(bag.getPw()); //비밀번호
		mpw.setBounds(300, 214, 170, 28);
		change2.add(mpw);
		
		mpwc = new JPasswordField(); //비밀번호 재입력해서 동일해야 회원정보 수정 가능
		mpwc.setBounds(300, 261, 170, 28);
		change2.add(mpwc);
		
		JButton btnNewButton_1 = new JButton("회원정보 수정");
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		btnNewButton_1.setBounds(300, 480, 170, 37);
		change2.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("로그아웃");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new logoutAfter();
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		btnNewButton.setBounds(845, 34, 105, 37);
		getContentPane().add(btnNewButton);
		
		JLabel loginID = new JLabel(id +"님");
		loginID.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		loginID.setBounds(707, 36, 126, 35);
		getContentPane().add(loginID);
		
		//사이드메뉴
		JButton btn1 = new JButton("예매내역 확인");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				change1.setVisible(true);
				change2.setVisible(false);
			}
		});
		btn1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		btn1.setBounds(27, 99, 215, 56);
		getContentPane().add(btn1);
		
		JButton btn2 = new JButton("회원정보수정");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				change2.setVisible(true);
				change1.setVisible(false);
				
			}
		});
		btn2.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		btn2.setBounds(27, 165, 215, 56);
		getContentPane().add(btn2);		
		
		JLabel lblNewLabel_2 = new JLabel("마이페이지");
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		lblNewLabel_2.setBounds(27, 21, 350, 68);
		getContentPane().add(lblNewLabel_2);

		
	}
}
