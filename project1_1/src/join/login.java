package join;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


import main.loginAfter;
import main.mainpage;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class login extends JFrame {
	private JTextField inputid;
	String id;
	String pw;
	private JPasswordField inputpw;


	
	public login() {

		setSize(1000, 800);
		getContentPane().setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null); //화면 가운데 창 띄우기
		setResizable(false);//창 크기 변환불가
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		

		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
		lblNewLabel.setBounds(68, 159, 115, 39);
		getContentPane().add(lblNewLabel);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
		lblPassword.setBounds(68, 224, 135, 39);
		getContentPane().add(lblPassword);

		inputid = new JTextField();
		inputid.setFont(new Font("굴림", Font.PLAIN, 30));
		inputid.setBounds(212, 159, 200, 39);
		getContentPane().add(inputid);

		JLabel error = new JLabel("");
		error.setForeground(Color.RED);
		error.setBounds(68, 294, 344, 25);
		getContentPane().add(error);

		JButton btnNewButton = new JButton("LogIn");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 입력한 id pw 값 가져오기
				id = inputid.getText();
				pw = inputpw.getText();

				// 로그인버튼 클릭시 read()메서드 호출
				MembershipDAO dao = new MembershipDAO();
				try {
					dao.read(id, pw);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			// ture일때 로그인 성공
				try {
					boolean loginrst = dao.read(id, pw);
					if (loginrst) {
						// 로그인한 페이지로 이동 
						new loginAfter(id, pw);
						
						//로그인창 닫기
						setVisible(false);
						
						//로그인전 페이지 닫아야함
						
						
					}else {
						//로그인 실패 메세지 출력
						error.setText("로그인 실패!!!!");
					}
				
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
//				Loginchk login = new Loginchk(id,pw);
//				System.out.println(login);
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton.setBounds(177, 345, 135, 48);
		getContentPane().add(btnNewButton);

		JLabel lblNewLabel_1 = new JLabel("영화예매를 위해 로그인을 먼저 해주세요!");
		lblNewLabel_1.setFont(new Font("나눔고딕", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(83, 55, 329, 48);
		getContentPane().add(lblNewLabel_1);
		
		inputpw = new JPasswordField();
		inputpw.setBounds(215, 224, 197, 39);
		getContentPane().add(inputpw);

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new login();
	}
}
