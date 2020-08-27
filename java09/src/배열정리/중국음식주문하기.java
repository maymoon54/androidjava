package 배열정리;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 중국음식주문하기 {
	private static JTextField count;
	
	static int countfood = 0; // 주문수량 체크

	public static void main(String[] args) {
		
		//음식이름, 음식이미지
		String[] titles = {"짬뽕","우동","짜장"};
		String[] imges = {"짬뽕.jpg","우동.jpg","짜장면.jpg"};
		
		
		
		 JFrame f = new JFrame();
		 f.setSize(500,500);
		 f.getContentPane().setLayout(null);
		 
		 JLabel foodimg = new JLabel("New label");
		 foodimg.setIcon(new ImageIcon(imges[1]));
		 foodimg.setBounds(36, 82, 408, 285);
		 f.getContentPane().add(foodimg);
		 
		 JButton btnNewButton = new JButton(titles[0]);
		 btnNewButton.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 	countfood++;
		 	ImageIcon icon = new ImageIcon(imges[0]);
		 	foodimg.setIcon(icon);
		 	}
		 });
		 btnNewButton.setBounds(12, 10, 70, 36);
		 f.getContentPane().add(btnNewButton);
		 
		 JButton btnNewButton_1 = new JButton(titles[1]);
		 btnNewButton_1.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		ImageIcon icon = new ImageIcon(imges[1]);
			 	foodimg.setIcon(icon);
		 		
		 	}
		 });
		 btnNewButton_1.setBounds(94, 10, 76, 36);
		 f.getContentPane().add(btnNewButton_1);
		 
		 JButton btnNewButton_2 = new JButton(titles[2]);
		 btnNewButton_2.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		ImageIcon icon = new ImageIcon(imges[2]);
			 	foodimg.setIcon(icon);
		 	}
		 });
		 btnNewButton_2.setBounds(182, 10, 76, 36);
		 f.getContentPane().add(btnNewButton_2);
		 
		 JLabel lblNewLabel = new JLabel("개수입력");
		 lblNewLabel.setBounds(290, 16, 54, 25);
		 f.getContentPane().add(lblNewLabel);
		 
		 count = new JTextField();
		 
		 count.setBounds(356, 18, 116, 21);
		 f.getContentPane().add(count);
		 count.setColumns(10);
		 
		 
		 
		 JLabel lblNewLabel_2 = new JLabel("지불할 총 금액");
		 lblNewLabel_2.setFont(new Font("바탕체", Font.PLAIN, 20));
		 lblNewLabel_2.setBounds(46, 401, 160, 36);
		 f.getContentPane().add(lblNewLabel_2);
		 
		 JLabel money = new JLabel("15000원");
		 money.setFont(new Font("바탕체", Font.PLAIN, 20));
		 money.setBounds(278, 400, 194, 39);
		 f.getContentPane().add(money);
		 f.setVisible(true);

	}
}
