package hello;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonImageTest extends JFrame {

	public JButtonImageTest() {

		setSize(600, 600);

		setLayout(new FlowLayout());

		ImageIcon icon = new ImageIcon("1.jpg");
		

		JButton btn = new JButton();
		JButton btn2 = new JButton("¿øº»");
		
		Dimension d = btn.getPreferredSize();
		btn2.setIcon(icon);
		
		Image img = icon.getImage().getScaledInstance(185, 260, java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(img);
		btn.setIcon(icon);
		
		add(btn);
		add(btn2);

		setVisible(true);
	}

	public static void main(String[] args) {
		new JButtonImageTest();
	}

}