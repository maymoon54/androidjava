package main;

import javax.swing.JFrame;
import javax.swing.JPanel;

import join.membership;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class mainpage {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(1000, 800);
		f.setLocationRelativeTo(null); //화면 가운데 창 띄우기
		f.setResizable(false);//창 크기 변환불가
		
		
		
		JButton login = new JButton("로그인");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//로그인창 호출
				new join.login();
				f.setVisible(false);

			}
		});
		login.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		login.setBounds(766, 22, 97, 23);
		f.getContentPane().setLayout(null);
		JButton join = new JButton("회원가입");
		join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//회원가입창 호출
				new membership();
				f.setVisible(false);
				
			}
		});
		join.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		join.setBounds(875, 22, 97, 23);
		f.getContentPane().add(join);
		f.getContentPane().add(login);
		
		JPanel panel = new JPanel();//패널생성
		panel.setBounds(24, 89, 932, 648);
		f.getContentPane().add(panel);
		
//		JButton btnNewButton = new JButton("New button");
//		panel.add(btnNewButton);
		
		// 버튼을 배열에 저장하기
		JButton[] b = new JButton[3];

		// 버튼에 들어갈 이미지
		String[] img = { "다만.png", "오케이.png", "짱구.png" };

		// 영화제목
		String[] titles = { "다만악에서구하소서", "오케이마담", "짱구" };

		// for문으로 버튼 여러개 만들기
		for (int i = 0; i < b.length; i++) {
			b[i] = new JButton();
			ImageIcon icon = new ImageIcon(img[i]);
			b[i].setIcon(icon);
			//포스터를 클릭하면 해당영화 타이틀 값 변수에 저장
			String title = titles[i];
			panel.add(b[i]); //패널에 버튼 배치
			
			b[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JButton b = (JButton) e.getSource();
					Icon icon = b.getIcon();
					System.out.println(title);
				}
			});

		}

		f.setVisible(true);

	}
}
