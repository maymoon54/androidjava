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
	static int sum = 0; // 금액합산

	public static void main(String[] args) {

		// 음식이름, 음식이미지
		String[] titles = { "짬뽕", "우동", "짜장" };
		String[] imges = { "짬뽕.jpg", "우동.jpg", "짜장면.jpg" };

		// 전체 레이아웃
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		// 음식이미지가 들어갈곳 : foodimg
		JLabel foodimg = new JLabel("New label");
		foodimg.setIcon(new ImageIcon(imges[1]));
		foodimg.setBounds(36, 82, 408, 285);
		f.getContentPane().add(foodimg);

		// 음식수량 들어갈곳: count
		JLabel lblNewLabel = new JLabel("개수입력");
		lblNewLabel.setBounds(290, 16, 54, 25);
		f.getContentPane().add(lblNewLabel);
		
		count = new JTextField();
		count.setBounds(356, 18, 116, 21);
		f.getContentPane().add(count);
		count.setColumns(10);

		// 금액 들어갈곳: money
		JLabel lblNewLabel_2 = new JLabel("지불할 총 금액");
		lblNewLabel_2.setFont(new Font("바탕체", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(46, 401, 160, 36);
		f.getContentPane().add(lblNewLabel_2);

		JLabel money = new JLabel("0원");
		money.setFont(new Font("바탕체", Font.PLAIN, 20));
		money.setBounds(278, 400, 194, 39);
		f.getContentPane().add(money);

		// 버튼1
		JButton b1 = new JButton(titles[0]);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(imges[0]);
				foodimg.setIcon(icon);
				countfood++; //버튼을 누를때마다 1씩 증가
				count.setText(countfood + "개"); //count에 출력
				sum = sum + 5000; //음식가격 누적합산
				money.setText(sum+"원"); // money에 출력
			}
		});
		b1.setBounds(12, 10, 70, 36);
		f.getContentPane().add(b1);

		// 버튼2
		JButton b2 = new JButton(titles[1]);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(imges[1]);
				foodimg.setIcon(icon);
				countfood++;
				count.setText(countfood + "개");
				sum = sum + 5000; 
				money.setText(sum+"원"); 

			}
		});
		// 버튼3
		b2.setBounds(94, 10, 76, 36);
		f.getContentPane().add(b2);

		JButton b3 = new JButton(titles[2]);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(imges[2]);
				foodimg.setIcon(icon);
				countfood++;
				count.setText(countfood + "개");
				sum = sum + 5000; 
				money.setText(sum+"원"); 
			}
		});
		b3.setBounds(182, 10, 76, 36);
		f.getContentPane().add(b3);

		//화면에 보이기
		f.setVisible(true);

	}
}
