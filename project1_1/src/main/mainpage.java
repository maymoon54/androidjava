package main;

import javax.swing.JFrame;
import javax.swing.JPanel;

import join.membership;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame main = new JFrame();

		main.setSize(1000,800);
		main.setVisible(true);
		main.getContentPane().setLayout(null);
		main.setLocationRelativeTo(null); //화면 가운데 창 띄우기
		main.setResizable(false);//창 크기 변환불가

		
		JPanel top = new JPanel();//상단 회원가입과 로그인 버튼
		top.setBounds(0, 0, 984, 66);
		main.getContentPane().add(top);
		top.setLayout(null);
		
		JButton join = new JButton("회원가입");
		join.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						new membership();
						main.setVisible(false);

			
			}
		});
		join.setBounds(875, 22, 97, 23);
		top.add(join);
		
		JButton login = new JButton("로그인");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

		new join.login();
		main.setVisible(false);
				
			}
		});
		login.setBounds(766, 22, 97, 23);
		top.add(login);
		
		JPanel contents = new JPanel();//하단 패널
		contents.setBounds(12, 84, 960, 667);
		main.getContentPane().add(contents);
		contents.setLayout(new FlowLayout());

		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\kimno\\Desktop\\다만.png"));
		contents.add(btnNewButton);
		
		//버튼을 배열에 저장하기
				JButton[] b = new JButton[3];
				
				//버튼에 들어갈 이미지
				String[] img = {"다만.png","오케이.png","짱구.png"};
				
				//영화제목
				String[] titles = {"다만악에서구하소서","오케이마담","짱구"};
						
				//for문으로 버튼 5개 만들기
				for (int i = 0; i < b.length; i++) {
					b[i] = new JButton();
					ImageIcon icon = new ImageIcon(img[i]);
					b[i].setIcon(icon);		
					contents.add(b[i]);
				}
		
				contents.setVisible(true);
		
				
	}
}
