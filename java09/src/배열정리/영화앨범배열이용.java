package 배열정리;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화앨범배열이용 {
	static int now = 2; //현재 위치를 체크할 수 있는 변수

	public static void main(String[] args) {
		
		
		//영화제목목록, 이미지목록, 감독목록,평점목록 
		String[] titles = {"다만 악에서 구하소서","나의 소녀시대","테넷","오케이 마담","강철비2"};
		String[] imges = {"1.jpg","2.jpg","3.jpg","4.jpg","5.jpg"};
		String[] director = {"홍원찬","프랭키 첸","크리스토퍼놀란","이철하","양우석"};
		double[] rates = {7.79,8.11,8.84,6.61,5.04};
		
		
		JFrame f = new JFrame();
		f.setTitle("나의 영화앨범");
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JLabel title = new JLabel(titles[2]);
		title.setFont(new Font("돋움체", Font.BOLD, 30));
		title.setBounds(108, 10, 267, 61);
		f.getContentPane().add(title);
		
		JLabel img = new JLabel("New label");
		img.setIcon(new ImageIcon(imges[2]));
		img.setBounds(69, 82, 205, 297);
		f.getContentPane().add(img);
		
		JLabel lblNewLabel_2 = new JLabel("감독");
		lblNewLabel_2.setFont(new Font("돋움체", Font.BOLD, 15));
		lblNewLabel_2.setBounds(284, 109, 78, 39);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel direct = new JLabel(director[2]);
		direct.setFont(new Font("돋움체", Font.PLAIN, 15));
		direct.setBounds(284, 143, 151, 39);
		f.getContentPane().add(direct);
		
		JLabel rate = new JLabel(rates[2]+"");
		rate.setFont(new Font("돋움체", Font.PLAIN, 15));
		rate.setBounds(284, 268, 59, 39);
		f.getContentPane().add(rate);
		
		JLabel lblNewLabel_2_2 = new JLabel("평점");
		lblNewLabel_2_2.setFont(new Font("돋움체", Font.BOLD, 15));
		lblNewLabel_2_2.setBounds(284, 233, 78, 39);
		f.getContentPane().add(lblNewLabel_2_2);
		
		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			if (now==0) {
				now = 5;
			}	
				
			now--; //1
			title.setText(titles[now]);
			ImageIcon icon = new ImageIcon(imges[now]);
			img.setIcon(icon);
			rate.setText(rates[now]+"");
			direct.setText(director[now]+"");
			}
		});
		btnNewButton.setBounds(0, 0, 49, 461);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (now==4) {
					now = -1;
				}
				
			now++; //3
			title.setText(titles[now]);
			ImageIcon icon = new ImageIcon(imges[now]);
			img.setIcon(icon);
			rate.setText(rates[now]+"");
			direct.setText(director[now]+"");
			}
		});
		btnNewButton_1.setBounds(435, 0, 49, 461);
		f.getContentPane().add(btnNewButton_1);
		f.setVisible(true);

	}
}
