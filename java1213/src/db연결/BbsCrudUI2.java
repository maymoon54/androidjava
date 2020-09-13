package db연결;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BbsCrudUI2 {
	private static JTextField no;
	private static JTextField title;
	private static JTextField writer;
	private static JTextField content;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JFrame f = new JFrame();
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("no");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel.setBounds(56, 21, 33, 38);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblTitle = new JLabel("title");
		lblTitle.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblTitle.setBounds(56, 69, 127, 38);
		f.getContentPane().add(lblTitle);
		
		JLabel lblContent = new JLabel("content");
		lblContent.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblContent.setBounds(56, 117, 127, 38);
		f.getContentPane().add(lblContent);
		
		JLabel lblWriter = new JLabel("writer");
		lblWriter.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblWriter.setBounds(182, 21, 58, 38);
		f.getContentPane().add(lblWriter);
		
		no = new JTextField();
		no.setBounds(101, 32, 58, 21);
		f.getContentPane().add(no);
		no.setColumns(10);
		
		title = new JTextField();
		title.setColumns(10);
		title.setBounds(101, 80, 284, 21);
		f.getContentPane().add(title);
		
		writer = new JTextField();
		writer.setColumns(10);
		writer.setBounds(269, 32, 116, 21);
		f.getContentPane().add(writer);
		
		content = new JTextField();
		content.setColumns(10);
		content.setBounds(101, 165, 284, 140);
		f.getContentPane().add(content);
		
		JButton create = new JButton("글쓰기");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//글쓰기 버튼 클릭
				//입력값 가져오기
				String no1 = no.getText();
				String title1 = title.getText();
				String content1 = content.getText();
				String writer1 = writer.getText();
				
				BbsDAO2 dao = new BbsDAO2();
				BbsVO bag = new BbsVO();

				bag.setNo(Integer.parseInt(no1));
				bag.setTitle(title1);
				bag.setContent(content1);
				bag.setWriter(writer1);	
				
				try {
					dao.create(bag);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
			}
		});
		create.setBounds(288, 350, 97, 23);
		f.getContentPane().add(create);
		
		JButton create_1 = new JButton("검색");
		create_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no1 = no.getText();
				BbsDAO2 dao = new BbsDAO2();
				
				try {
					BbsVO bag = new BbsVO();
					no.setText(String.valueOf(bag.getNo()));
					title.setText(bag.getTitle());
					content.setText(bag.getContent());
					writer.setText(bag.getWriter());	
	
				} catch (Exception e2) {
					
				}
				
							}
		});
		create_1.setBounds(288, 383, 97, 23);
		f.getContentPane().add(create_1);
		f.setVisible(true);

	}
}
