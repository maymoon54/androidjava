package 그래픽Swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayer;
import javax.swing.JOptionPane;
import javax.xml.soap.Text;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 봄여름 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "선선해요");
			}
		});
		b1.setForeground(Color.BLUE);
		b1.setFont(new Font("굴림", Font.PLAIN, 30));
		b1.setBackground(Color.ORANGE);
		JButton b2 = new JButton();
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "더워요");
			}
		});
		b2.setFont(new Font("굴림", Font.PLAIN, 30));
		b2.setBackground(Color.PINK);
		b2.setForeground(new Color(0, 128, 0));
		b1.setText("봄");
		b2.setText("여름");
		f.getContentPane().add(b1); //만들어둔 틀 (f)안에 버튼을 배치시킴
		f.getContentPane().add(b2);

		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		f.setSize(200, 500);
		f.setVisible(true);
		
	}

}
