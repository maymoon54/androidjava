package main;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class loginAfter2 extends JFrame{
	
	JPanel top;
	JPanel contents;
	JButton logout;
	JButton mypage;
	private JLabel loginID;
	
	
	public loginAfter2 (String id, String pw) {
		setSize(1000,800);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		
	//패널 1
		top = new JPanel();
		top.setSize(984, 66);

		getContentPane().setLayout(null);
		getContentPane().add(top);
		//로그아웃, 마이페이지 버튼
		logout = new JButton("로그아웃");
		logout.setBounds(731, 22, 97, 23);
		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new logoutAfter();
			
			}
		});
		mypage = new JButton("마이페이지");
		mypage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new join.memberinfo(id, pw);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				setVisible(false);
			}
		});
		mypage.setBounds(840, 22, 116, 23);
		top.setLayout(null);
		top.add(logout);
		top.add(mypage);
		
		//로그인한 아이디 출력
		loginID = new JLabel(id+" 님");
		loginID.setFont(new Font("나눔고딕", Font.BOLD, 15));
		loginID.setForeground(new Color(0, 0, 0));
		loginID.setBounds(628, 22, 126, 23);
		top.add(loginID);
		
		
		
	//패널2	
		contents = new JPanel();
		contents.setSize(960, 667);
		contents.setLocation(12, 84);

		getContentPane().add(contents);
		getContentPane().setLayout(null);
		
	}
	

}
