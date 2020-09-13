package join;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class memberinfo2 {
	private static JTextField name;
	private static JTextField pw;
	private static JTextField pwc;
	private static JTextField email;
	private static JTextField phone;

	public static void main(String[] args) {

		JFrame main = new JFrame();
		main.setSize(1000, 800);
		main.getContentPane().setLayout(null);

		JPanel title = new JPanel();// 상단 패널 (페이지제목)
		title.setBounds(0, 0, 984, 66);
		main.getContentPane().add(title);
		title.setLayout(null);

		JLabel lblNewLabel = new JLabel("마이페이지");
		lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 30));
		lblNewLabel.setBounds(41, 32, 182, 34);
		title.add(lblNewLabel);

		JPanel contents = new JPanel();// 하단 패널 (내용)
		contents.setBackground(SystemColor.menu);
		contents.setBounds(238, 84, 734, 667);
		main.getContentPane().add(contents);
		contents.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(190, 113, 104, 37);
		contents.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("이름");
		lblNewLabel_1_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(190, 169, 104, 37);
		contents.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("비밀번호");
		lblNewLabel_1_1_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(190, 229, 104, 37);
		contents.add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("비밀번호 확인");
		lblNewLabel_1_1_1_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1.setBounds(190, 290, 104, 37);
		contents.add(lblNewLabel_1_1_1_1);

		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("이메일 주소");
		lblNewLabel_1_1_1_1_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_1.setBounds(190, 353, 104, 37);
		contents.add(lblNewLabel_1_1_1_1_1);

		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("휴대폰 번호");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_1_1.setBounds(190, 415, 104, 37);
		contents.add(lblNewLabel_1_1_1_1_1_1);

		name = new JTextField();
		name.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		name.setBounds(345, 171, 179, 31);
		contents.add(name);
		name.setColumns(10);

		pw = new JTextField();
		pw.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		pw.setColumns(10);
		pw.setBounds(345, 231, 179, 31);
		contents.add(pw);

		pwc = new JTextField();
		pwc.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		pwc.setColumns(10);
		pwc.setBounds(345, 287, 179, 31);
		contents.add(pwc);

		email = new JTextField();
		email.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		email.setColumns(10);
		email.setBounds(345, 350, 179, 31);
		contents.add(email);

		phone = new JTextField();
		phone.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		phone.setColumns(10);
		phone.setBounds(345, 412, 179, 31);
		contents.add(phone);

		JLabel loginID = new JLabel("testid");
		loginID.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		loginID.setBounds(345, 113, 179, 25);
		contents.add(loginID);

		JButton btnNewButton_2 = new JButton("저장");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}

			// 1.로그인된 회원의 id로 검색해서 회원정보 화면에 보여줌
			String id = loginID.getText();

			MembershipDAO dao = new MembershipDAO();
			
			
		

			// 2.수정한 정보 db로 전송

		});
		btnNewButton_2.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		btnNewButton_2.setBounds(420, 495, 104, 37);
		contents.add(btnNewButton_2);

		JLabel lblNewLabel_3 = new JLabel("회원정보수정");
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel_3.setBounds(190, 27, 179, 44);
		contents.add(lblNewLabel_3);

		JPanel side = new JPanel();
		side.setBounds(10, 84, 216, 152);
		main.getContentPane().add(side);
		side.setLayout(null);

		JButton btnNewButton = new JButton("예매내역확인");
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		btnNewButton.setBounds(12, 10, 192, 60);
		side.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("회원정보수정");
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		btnNewButton_1.setBounds(12, 80, 192, 60);
		side.add(btnNewButton_1);

		main.setVisible(true);

	}
}
