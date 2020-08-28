package mainpage;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;

public class main {

	public static void main(String[] args) {
		
		
		// 프레임
		JFrame main = new JFrame();
		main.setSize(1000, 800);
		main.getContentPane().setLayout(null);
		
		
		//페이지 제목
		JLabel lblNewLabel = new JLabel("예매순위");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		lblNewLabel.setBounds(57, 34, 182, 38);
		main.getContentPane().add(lblNewLabel);
		
		//영화 목록 (포스터)
		
		JButton btnNewButton = new JButton("New button");
		
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\83327_320.jpg"));
		btnNewButton.setBounds(57, 95, 169, 230);
		main.getContentPane().add(btnNewButton);

		
		main.setVisible(true);	
		
	}
}
