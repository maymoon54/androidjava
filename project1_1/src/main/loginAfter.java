package main;

import java.awt.Dimension;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class loginAfter extends JFrame{
	
	JPanel top;
	JPanel contents;
	JButton logout;
	JButton mypage;
	private JLabel loginID;
	
	
	public loginAfter (String id, String pw) {
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
				setVisible(false);
			
			}
		});
		mypage = new JButton("마이페이지");
		mypage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new join.memberinfo(id, pw);
					setVisible(false);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
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
			contents.add(b[i]); //패널에 버튼 배치
			
			b[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JButton b = (JButton) e.getSource();
					Icon icon = b.getIcon();
					System.out.println(title);
				}
			});
		
	}
	
	}
}
