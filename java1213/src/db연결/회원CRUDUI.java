package db연결;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 회원CRUDUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		
		
		f.setSize(500,700);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setBounds(88, 103, 86, 62);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PW");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(88, 191, 86, 62);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("NAME");
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1_1_1.setBounds(88, 284, 104, 62);
		f.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("TEL");
		lblNewLabel_1_1_1_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1_1_1_1.setBounds(88, 376, 86, 62);
		f.getContentPane().add(lblNewLabel_1_1_1_1);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 20));
		t1.setBounds(230, 121, 176, 30);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 20));
		t2.setColumns(10);
		t2.setBounds(230, 204, 176, 30);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.PLAIN, 20));
		t3.setColumns(10);
		t3.setBounds(230, 295, 176, 30);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.PLAIN, 20));
		t4.setColumns(10);
		t4.setBounds(230, 387, 176, 30);
		f.getContentPane().add(t4);
		
		JButton create = new JButton("가입");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//회원가입할 정보 4개의 입력값을 가지고 와서,
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				
				
				//db처리(MemberDAO), create() 메서드 호출
				MemberDAO dao = new MemberDAO();
				try {
					dao.create(id, pw, name, tel);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		create.setFont(new Font("굴림", Font.PLAIN, 20));
		create.setBounds(88, 515, 86, 51);
		f.getContentPane().add(create);
		
		JButton read = new JButton("중복체크");
		read.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//검색할 id 가져오기
				String id = t1.getText();
				MemberDAO dao = new MemberDAO();
				try {
					int result = dao.read(id);
					if (result ==1) {//검색결과 있음
						
					}else {//검색결과 없음
						t1.setText("없음");
						t2.setText("없음");
						t3.setText("없음");
						t4.setText("없음");
						t1.setBackground(Color.BLUE);
						t2.setBackground(Color.BLUE);
						t3.setBackground(Color.BLUE);
						t4.setBackground(Color.BLUE);
						
						
					}
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		read.setFont(new Font("굴림", Font.PLAIN, 20));
		read.setBounds(196, 515, 131, 51);
		f.getContentPane().add(read);
		
		JButton update = new JButton("회원수정");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//수정할 id,tel 가져오기
				String id = t1.getText();
				String tel = t4.getText();
				
				//tel수정 update() 메서드 호출
				MemberDAO dao = new MemberDAO();
				try {
					dao.update(tel, id);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		update.setFont(new Font("굴림", Font.PLAIN, 20));
		update.setBounds(88, 576, 131, 51);
		f.getContentPane().add(update);
		
		JButton delete = new JButton("회원삭제");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//삭제할 id값을 가져오기
				String id = t1.getText();
				
				//delete() 메서드 호출
				MemberDAO dao = new MemberDAO();
				try {
					dao.delete(id);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		delete.setFont(new Font("굴림", Font.PLAIN, 20));
		delete.setBounds(265, 576, 131, 51);
		f.getContentPane().add(delete);
		
		
		

		
		JLabel loginrs = new JLabel("New label");
		loginrs.setBounds(265, 454, 131, 51);
		f.getContentPane().add(loginrs);
		f.setVisible(true);
		
		JButton login = new JButton("로그인");
		login.setFont(new Font("굴림", Font.PLAIN, 20));
		login.setBounds(88, 454, 131, 51);
		f.getContentPane().add(login);
	
	//id로 검색하여 UI에 정보 보여주기 (검색버튼)
		
		JButton read_1 = new JButton("검색");
		read_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String id = t1.getText(); //입력한 id값을 가져온다
				MemberDAO dao = new MemberDAO();
				try {
					MemberVO bag = dao.one(id);
					t1.setText(bag.getId());
					t2.setText(bag.getPw());
					t3.setText(bag.getName());
					t4.setText(bag.getTel());
					
					
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			}
		});
		read_1.setFont(new Font("굴림", Font.PLAIN, 20));
		read_1.setBounds(351, 515, 86, 51);
		f.getContentPane().add(read_1);
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//입력한 id pw 값 가져오기
				String id = t1.getText();
				String pw = t2.getText();
				
				//로그인버튼 클릭시 read()메서드 호출
				MemberDAO dao = new MemberDAO();
				try {
					dao.read(id, pw);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				//true일때 로그인 성공
				
				try {
					boolean loginresult = dao.read(id, pw);
					if (loginresult) { 
					//()안에 있는 조건이 true 아니면 false 이므로 (논리형)
					//변수안에 들어있는 값이 true니?? 라고 체크만 하면 됨 (cpu작업량 적음)
						
					//loginresult==true 로 하면 true == true 같니 다시한번 확인하는것 (비교연산자)
						loginrs.setText("로그인성공");
					}else {
						loginrs.setText("로그인실패");
					}
					
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});

	}
		

		
	
}
