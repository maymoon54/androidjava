package 순차문;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의윈도우1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame b = new JFrame();
		b.setSize(500, 500);
		
		JButton btnNewButton = new JButton("버튼");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			JOptionPane.showMessageDialog(b, "누르지마");
			}
		});
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 35));
		b.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		b.setVisible(true);
	}

}
