package 그래픽Swing;

import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 계산기 {

	public static void main(String[] args) {
		
		// 프레임1
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(0, 128, 0));
		
		// 이미지1
		ImageIcon img = new ImageIcon("cal.png");
		// 라벨3
		JLabel l1 = new JLabel(); //계산기 이미지
		JLabel l2 = new JLabel(); //숫자1
		l2.setFont(new Font("돋움", Font.PLAIN, 51));
		JLabel l3 = new JLabel(); //숫자2
		JLabel result = new JLabel(); //결과값 
		result.setFont(new Font("굴림", Font.BOLD, 99));
		l3.setFont(new Font("돋움", Font.PLAIN, 51));
		// 텍스트 입력 2
		TextField t1 = new TextField(10);
		t1.setFont(new Font("Dialog", Font.PLAIN, 29));
		t1.setBackground(Color.ORANGE);
		TextField t2 = new TextField(10);
		t2.setFont(new Font("Dialog", Font.PLAIN, 29));
		t2.setBackground(Color.ORANGE);
		// 레이아웃1
		FlowLayout flow = new FlowLayout();
		f.setSize(350, 700);
		
		f.getContentPane().setLayout(flow);
		l1.setIcon(img); // l1에 이미지 삽입
		l2.setText("숫자1"); //라벨에 글자를 넣기
		l3.setText("숫자2");
		f.getContentPane().add(l1);
		f.getContentPane().add(l2);
		f.getContentPane().add(t1);
		f.getContentPane().add(l3);
		f.getContentPane().add(t2);
		
		
		// 버튼1
		JButton	plus = new JButton();
		plus.setFont(new Font("굴림", Font.BOLD, 30));
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//t1과 t2에 입력한 값을 가지고 와야함.
				//가지고 온 값의 데이터형(type)은 무조건 String!
				String s1 = t1.getText(); //t1부품에 있는 값을 가져와서 변수 s1에 저장해둠
				String s2 = t2.getText();
				System.out.println("t1값 " + s1);
				System.out.println("t2값 " + s2);
				
				//산술연산을 하려면, 숫자로 변환
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				
				//숫자로 변환한 값을 더하자.
				int sum = i1 + i2; 
				
				//처리한 결과를 사용자에게 보여줌(출력)
				//result.setText(sum+""); //스트링과 결합하여 전체 스트링으로 인식
				String sum2 = String.valueOf(sum);
				result.setText(sum2);
			}
		});
		
		//버튼2
		
		JButton m = new JButton();
		m.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s3 = t1.getText(); //t1부품에 있는 값을 가져와서 변수 s1에 저장해둠
				String s4 = t2.getText();
				System.out.println("t1값 " + s3);
				System.out.println("t2값 " + s4);
				
				//산술연산을 하려면, 숫자로 변환
				int i3 = Integer.parseInt(s3);
				int i4 = Integer.parseInt(s4);
				
				//숫자로 변환한 값을 더하자.
				int m = i3 - i4; 
				
				//처리한 결과를 사용자에게 보여줌(출력)
				//result.setText(sum+""); //스트링과 결합하여 전체 스트링으로 인식
				String m2 = String.valueOf(m);
				result.setText(m2);
				
			}
		});
		
		
		plus.setText("+");
		f.getContentPane().add(plus);
		m.setFont(new Font("굴림", Font.BOLD, 30));
		m.setText("-");
		f.getContentPane().add(m);
		
		JButton z = new JButton();
		z.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s5 = t1.getText(); //t1부품에 있는 값을 가져와서 변수 s1에 저장해둠
				String s6 = t2.getText();
				System.out.println("t1값 " + s5);
				System.out.println("t2값 " + s6);
				
				//산술연산을 하려면, 숫자로 변환
				int i5 = Integer.parseInt(s5);
				int i6 = Integer.parseInt(s6);
				
				//숫자로 변환한 값을 곱하자.
				int z = i5 * i6; 
				
				//처리한 결과를 사용자에게 보여줌(출력)
				//result.setText(sum+""); //스트링과 결합하여 전체 스트링으로 인식
				String z2 = String.valueOf(z);
				result.setText(z2);
				
			}
		});
		z.setFont(new Font("굴림", Font.BOLD, 30));
		z.setText("*");
		f.getContentPane().add(z);
		
		JButton n = new JButton();
		n.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s7 = t1.getText(); //t1부품에 있는 값을 가져와서 변수 s1에 저장해둠
				String s8 = t2.getText();
				System.out.println("t1값 " + s7);
				System.out.println("t2값 " + s8);
				
				//산술연산을 하려면, 숫자로 변환
				int i7 = Integer.parseInt(s7);
				int i8 = Integer.parseInt(s8);
				
				//숫자로 변환한 값을 곱하자.
				int n= i7 / i8; 
				
				//처리한 결과를 사용자에게 보여줌(출력)
				//result.setText(sum+""); //스트링과 결합하여 전체 스트링으로 인식
				String n2 = String.valueOf(n);
				result.setText(n2);
			}
		});
		n.setFont(new Font("굴림", Font.BOLD, 30));
		n.setText("/");
		f.getContentPane().add(n);
		f.getContentPane().add(result);
		
		
		
		f.setVisible(true);
		
	}

}
