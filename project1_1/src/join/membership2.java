package join;

import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class membership2 {

	public static void main(String[] args) {

		// 프레임
		JFrame f = new JFrame();

		// 페이지 제목
		JLabel title = new JLabel();
		title.setBounds(430, 43, 126, 68);
		title.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
		title.setText("회원가입");

		// 회원가입 메뉴
		JLabel lname = new JLabel();
		lname.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lname.setBounds(219, 145, 59, 41);
		JLabel lid = new JLabel();
		lid.setBounds(219, 216, 59, 41);
		lid.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		JLabel lpw = new JLabel();
		lpw.setBounds(219, 309, 98, 41);
		lpw.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		JLabel lpwc = new JLabel();
		lpwc.setBounds(219, 380, 107, 41);
		lpwc.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		JLabel lemail = new JLabel();
		lemail.setBounds(219, 448, 107, 41);
		lemail.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		JLabel lphone = new JLabel();
		lphone.setBounds(222, 512, 90, 41);
		lphone.setFont(new Font("맑은 고딕", Font.PLAIN, 15));

		lid.setText("아이디");
		lpw.setText("비밀번호");
		lpwc.setText("비밀번호 확인");
		lname.setText("이름");
		lemail.setText("이메일주소");
		lphone.setText("휴대폰번호");

		// 입력받기
		TextField inputid = new TextField();
		inputid.setBounds(376, 216, 252, 44);
		inputid.setFont(new Font("Arial", Font.PLAIN, 15));
		inputid.setColumns(20);
		TextField inputpw = new TextField();
		inputpw.setBounds(376, 309, 252, 41);
		inputpw.setFont(new Font("Arial", Font.PLAIN, 15));
		inputpw.setColumns(20);
		TextField inputpwc = new TextField();
		inputpwc.setBounds(376, 380, 252, 41);
		inputpwc.setFont(new Font("Arial", Font.PLAIN, 15));
		inputpwc.setColumns(20);
		TextField inputname = new TextField();
		inputname.setFont(new Font("Arial", Font.PLAIN, 15));
		inputname.setColumns(20);
		inputname.setBounds(376, 142, 252, 44);
		f.getContentPane().add(inputname);
		TextField inputemail = new TextField();
		inputemail.setBounds(376, 448, 252, 41);
		inputemail.setFont(new Font("Arial", Font.PLAIN, 15));
		inputemail.setColumns(20);
		TextField inputphone = new TextField();
		inputphone.setBounds(376, 512, 252, 41);
		inputphone.setFont(new Font("Arial", Font.PLAIN, 15));
		inputphone.setColumns(20);
		f.getContentPane().setLayout(null);

		// 라벨화면에 배치하기
		f.getContentPane().add(title);
		f.getContentPane().add(lid);
		f.getContentPane().add(inputid);
		f.getContentPane().add(lpw);
		f.getContentPane().add(inputpw);
		f.getContentPane().add(lpwc);
		f.getContentPane().add(inputpwc);
		f.getContentPane().add(lemail);
		f.getContentPane().add(inputemail);
		f.getContentPane().add(lphone);
		f.getContentPane().add(inputphone);
		f.getContentPane().add(lname);

		JButton btnNewButton = new JButton("ID중복체크");
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		btnNewButton.setBounds(644, 219, 120, 34);
		f.getContentPane().add(btnNewButton);

		JLabel idresult = new JLabel(""); // id중복체크 결과 보여주는 라벨
		idresult.setForeground(Color.RED);
		idresult.setFont(new Font("돋움", Font.PLAIN, 13));
		idresult.setBounds(376, 266, 252, 25);
		f.getContentPane().add(idresult);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 입력한 id 값을 가져옴
				String id = inputid.getText();

				// read()메소드 호출
				MembershipDAO dao = new MembershipDAO();

				// 반환값 넘겨받아서 처리
				try {
					boolean result = dao.read(id);
					if (result) {
						idresult.setText("아이디중복!! 다른아이디를 입력하세요");
					} else {
						idresult.setText("사용가능 아이디");
					}
				} catch (Exception e1) {

					e1.printStackTrace();
				}

			}
		});

		// 회원가입버튼
		JButton joinbt = new JButton("회원가입");
		joinbt.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		joinbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// membership 테이블에 자료를 전송하기전에 확인할 것
				// 필수로 적어야 하는 항목 
				// id중복체크
				// pw확인

				// 입력한 회원정보 가져오기
				String id = inputid.getText();
				String pw = inputpw.getText();
				String pwc = inputpwc.getText();
				String name = inputname.getText();
				String email = inputemail.getText();
				String phone = inputphone.getText();

				String con1 = idresult.getText();

				if (con1.equals("")) {
					JOptionPane.showMessageDialog(f, "아이디 중복체크를 해주세요");
					
				}else {
					// 가방을 만든다
					MembershipVO bag = new MembershipVO();

					// 가방에 값들을 하나씩 넣는다
					bag.setId(id);
					bag.setPw(pw);
					bag.setName(name);
					bag.setEmail(email);
					bag.setPhone(phone);

					// 가방을 DAO로 넘긴다
					MembershipDAO dao = new MembershipDAO();
					try {
						dao.create(bag);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}

			}
		});
		joinbt.setBounds(396, 599, 98, 35);
		f.getContentPane().add(joinbt);

		JButton joinbt_1 = new JButton("취소");
		joinbt_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		joinbt_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		joinbt_1.setBounds(522, 599, 90, 35);
		f.getContentPane().add(joinbt_1);

		f.setSize(1000, 800);

		f.setVisible(true);

	}
}