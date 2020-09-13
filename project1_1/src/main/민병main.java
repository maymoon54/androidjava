package main;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class 민병main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame name = new JFrame();
		name.setSize(1000, 800);
		name.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 984, 84);
		name.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(12, 10, 100, 64);
		panel.add(panel_3);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBounds(113, 10, 100, 64);
		panel.add(panel_3_1);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBounds(767, 10, 205, 64);
		panel.add(panel_3_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 94, 418, 584);
		name.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(440, 94, 532, 584);
		name.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(766, 688, 206, 63);
		name.getContentPane().add(panel_4);
		name.setVisible(true);
		
	}
}
