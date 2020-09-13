package 크롤링;

import java.io.FileWriter;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 네이버증권UI3 {
	private static JTextField inputcode;

	public static void main(String[] args) {
		String[] codes = { "005380", "051910", "005930" };
		String[] names = { "현대차", "LG화학", "삼성전자" };
		
		JFrame finance = new JFrame();
		finance.setSize(400,700);
		finance.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton(names[0]);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//버튼을 누르면 input코드에 해당코드 입력
				inputcode.setText(codes[0]);
			}
		});
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		btnNewButton.setBounds(32, 10, 320, 50);
		finance.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(names[1]);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//버튼을 누르면 input코드에 해당코드 입력
				inputcode.setText(codes[1]);
			}
		});
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		btnNewButton_1.setBounds(32, 70, 320, 50);
		finance.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton(names[2]);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//버튼을 누르면 input코드에 해당코드 입력
				inputcode.setText(codes[2]);
				
			}
		});
		btnNewButton_1_1.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		btnNewButton_1_1.setBounds(32, 130, 320, 50);
		finance.getContentPane().add(btnNewButton_1_1);
		
		JLabel lblNewLabel = new JLabel("CODE : ");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblNewLabel.setBounds(32, 205, 71, 35);
		finance.getContentPane().add(lblNewLabel);
		
		inputcode = new JTextField();
		inputcode.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		inputcode.setBounds(115, 205, 241, 44);
		finance.getContentPane().add(inputcode);
		inputcode.setColumns(10);
		
		JTextArea rst = new JTextArea();
		rst.setBounds(32, 344, 320, 266);
		finance.getContentPane().add(rst);
		
		
		JButton btnNewButton_2 = new JButton("크롤링시작");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//회사코드 가져오기
				String code = inputcode.getText();
				네이버증권크롤링3 naver = new 네이버증권크롤링3();
				String result[] = naver.crawl(code);
				//결과출력
				rst.setText("\n"+result[0]+"\n" + "현재가 : "+ result[1] +"\n"+ "전일가 : "+result[2] + "\n"+ "고가 : "+result[3]);
				}
		});
		btnNewButton_2.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 20));
		btnNewButton_2.setBounds(115, 269, 241, 35);
		finance.getContentPane().add(btnNewButton_2);
		

		finance.setVisible(true);
		


			}
		}
	


