package 그래픽Swing;

import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 성인판별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//프레임
		JFrame f = new JFrame();
		
		//이름
		JLabel l1 = new JLabel();
		l1.setFont(new Font("굴림", Font.PLAIN, 30));
		l1.setText("이름");
		TextField t1 = new TextField();
		t1.setColumns(15);
		t1.setFont(new Font("Dialog", Font.PLAIN, 30));
	
		//태어난 년도
		JLabel l2 = new JLabel();
		l2.setFont(new Font("굴림", Font.PLAIN, 30));
		l2.setText("태어난년도");
		TextField t2 = new TextField();
		t2.setColumns(15);
		t2.setFont(new Font("Dialog", Font.PLAIN, 30));
		
		//결과
		JLabel rst = new JLabel();
		
		//버튼
		JButton	b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//입력한 값 가지고 오기
				
				String s1 = t1.getText();
				String s2 = t2.getText();
				System.out.println("t1값 " + s1);
				System.out.println("t2값 " + s2);
				
				//태어난 년도 숫자로 변환
				int birth = Integer.parseInt(s2);
				//나이계산
				int year = 2020 - birth +1;
				
				if (year>=18) {
					rst.setText(s1+"은 성인입니다");
					
				}else {
					rst.setText(s1+"은 미성년자입니다");
				}	
				}
		});
		b1.setText("성인인가요?");
		
		//레이아웃
		FlowLayout flow = new FlowLayout();
		f.setSize(300, 500);
		f.getContentPane().setLayout(flow);
		
		//프레임 안에 배치
		f.getContentPane().add(l1);
		f.getContentPane().add(t1);
		f.getContentPane().add(l2);
		f.getContentPane().add(t2);
		f.getContentPane().add(b1);
	
		f.getContentPane().add(rst);
		
		f.setVisible(true);
	}

}
