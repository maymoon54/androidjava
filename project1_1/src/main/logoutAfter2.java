package main;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import join.login;
import join.membership;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class logoutAfter2 extends JFrame{
	
	JPanel top;
	JPanel contents;
	JButton logout;
	JButton mypage;

	
	
	public logoutAfter2 () {
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
		logout = new JButton("로그인");
		logout.setBounds(731, 22, 97, 23);
		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new login();
			
			}
		});
		mypage = new JButton("회원가입");
		mypage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new membership();				
				setVisible(false);
			}
		});
		mypage.setBounds(840, 22, 116, 23);
		top.setLayout(null);
		top.add(logout);
		top.add(mypage);
	//패널2	
		contents = new JPanel();
		contents.setSize(960, 667);
		contents.setLocation(12, 84);

		getContentPane().add(contents);
		getContentPane().setLayout(null);
		
	}
	

}
