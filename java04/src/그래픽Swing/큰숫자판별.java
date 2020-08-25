package 그래픽Swing;

import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 큰숫자판별 {

	public static void main(String[] args) {
		//프레임
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(188, 143, 143));
		
		//라벨1 & 숫자입력1
		JLabel l1 = new JLabel();
		l1.setFont(new Font("굴림", Font.BOLD, 30));
		l1.setText("숫자1");
		TextField t1 = new TextField();
		t1.setColumns(10);
		t1.setFont(new Font("Dialog", Font.PLAIN, 30));
		
		//라벨2 & 숫자입력2
		JLabel l2 = new JLabel();
		l2.setFont(new Font("굴림", Font.BOLD, 30));
		l2.setText("숫자2");
		TextField t2 = new TextField();
		t2.setColumns(10);
		t2.setFont(new Font("Dialog", Font.PLAIN, 30));
		
		//결과창
				JLabel result = new JLabel();
				result.setFont(new Font("굴림", Font.BOLD, 30));
		
		//버튼1
		JButton	b1 = new JButton();
		b1.setText("큰 숫자는?");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//입력한 값 가지고 오기
			String s1 = t1.getText();
			String s2 = t2.getText();
			System.out.println("t1값 " + s1);
			System.out.println("t2값 " + s2);
			
			//입력한 값 숫자로 변환
			int num1 = Integer.parseInt(s1);				
			int num2 = Integer.parseInt(s1);
			
			//두개의 숫자 비교하기
			
			if (num1>num2) {
				result.setText(s1);
				System.out.println("큰값은 "+s1);
			}else {
				result.setText(s2);
				System.out.println("큰값은 "+s2);}
				
			}
		});
	
		
		
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		//레이아웃
		FlowLayout flow = new FlowLayout();
		f.setSize(1600, 1000);
		f.getContentPane().setLayout(flow);
		
		//프레임 안에 배치
		f.getContentPane().add(l1);
		f.getContentPane().add(t1);
		f.getContentPane().add(l2);
		f.getContentPane().add(t2);
		f.getContentPane().add(b1);
		f.getContentPane().add(result);
		
		
		
		
		
		f.setVisible(true);
	}

}
