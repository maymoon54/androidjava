package db연결;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class BbsCrudUI {
   private static JTextField t1;
   private static JTextField t2;
   private static JTextField t3;
   private static JTextField t4;

   public static void main(String[] args) {
      JFrame f = new JFrame();
      f.getContentPane().setBackground(Color.MAGENTA);
      f.setSize(994, 700);
      f.getContentPane().setLayout(null);
      
      JLabel lblNewLabel = new JLabel("번호");
      lblNewLabel.setFont(new Font("굴림", Font.BOLD, 60));
      lblNewLabel.setBounds(27, 46, 182, 67);
      f.getContentPane().add(lblNewLabel);
      
      JLabel lblPw = new JLabel("제목");
      lblPw.setFont(new Font("굴림", Font.BOLD, 60));
      lblPw.setBounds(27, 132, 166, 67);
      f.getContentPane().add(lblPw);
      
      JLabel lblNewLabel_1_1 = new JLabel("내용");
      lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 55));
      lblNewLabel_1_1.setBounds(27, 226, 177, 67);
      f.getContentPane().add(lblNewLabel_1_1);
      
      JLabel lblNewLabel_1_1_1 = new JLabel("글쓴이");
      lblNewLabel_1_1_1.setFont(new Font("굴림", Font.BOLD, 60));
      lblNewLabel_1_1_1.setBounds(27, 316, 189, 67);
      f.getContentPane().add(lblNewLabel_1_1_1);
      
      t1 = new JTextField();
      t1.setForeground(Color.RED);
      t1.setBackground(Color.YELLOW);
      t1.setFont(new Font("굴림", Font.BOLD, 45));
      t1.setBounds(226, 58, 246, 41);
      f.getContentPane().add(t1);
      t1.setColumns(10);
      
      t2 = new JTextField();
      t2.setForeground(Color.RED);
      t2.setBackground(Color.YELLOW);
      t2.setFont(new Font("굴림", Font.BOLD, 45));
      t2.setColumns(10);
      t2.setBounds(226, 150, 246, 41);
      f.getContentPane().add(t2);
      
      t3 = new JTextField();
      t3.setForeground(Color.RED);
      t3.setBackground(Color.YELLOW);
      t3.setFont(new Font("굴림", Font.BOLD, 45));
      t3.setColumns(10);
      t3.setBounds(226, 238, 246, 41);
      f.getContentPane().add(t3);
      
      t4 = new JTextField();
      t4.setForeground(Color.RED);
      t4.setBackground(Color.YELLOW);
      t4.setFont(new Font("굴림", Font.BOLD, 45));
      t4.setColumns(10);
      t4.setBounds(226, 316, 246, 41);
      f.getContentPane().add(t4);
      
      JButton create = new JButton("글쓰기");
      create.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String no = t1.getText();
            String title = t2.getText();
            String content = t3.getText();
            String writer = t4.getText();
            BbsDAO dao = new BbsDAO();
            BbsVO bag = new BbsVO();
            bag.setNo(Integer.parseInt(no));
            bag.setTitle(title);
            bag.setContent(content);
            bag.setWriter(writer);
            try {
               dao.create(bag);
            } catch (Exception e1) {
               e1.printStackTrace();
            }
         }
      });
      create.setFont(new Font("굴림", Font.BOLD, 25));
      create.setBounds(38, 438, 124, 83);
      f.getContentPane().add(create);
      
      JTextArea all = new JTextArea();
      
      JButton read = new JButton("전체목록");
      read.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
               try {
                  BbsDAO dao = new BbsDAO();
                  ArrayList<BbsVO> list = dao.all();
                  System.out.println("게시판의 개수: " + list.size() + "개");
                  for (int i = 0; i < list.size(); i++) {//5
                     BbsVO bag = list.get(i);
                     all.append(bag.getNo() +", " + bag.getTitle() +", " + bag.getContent() + ", " +  bag.getWriter() + "\n");
                  }
               } catch (Exception e2) {
               }
         }
      });
      read.setFont(new Font("굴림", Font.BOLD, 25));
      read.setBounds(170, 438, 166, 83);
      f.getContentPane().add(read);
      
      JButton delete = new JButton("글삭제");
      delete.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            
         }
      });
      delete.setFont(new Font("굴림", Font.BOLD, 25));
      delete.setBounds(254, 543, 207, 83);
      f.getContentPane().add(delete);
      
      JButton update = new JButton("글수정");
      update.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String id = t1.getText();
            String tel = t4.getText();
            MemberDAO dao = new MemberDAO();
            try {
               dao.update(tel, id);
            } catch (Exception e1) {
               e1.printStackTrace();
            }
         }
      });
      update.setFont(new Font("굴림", Font.BOLD, 25));
      update.setBounds(38, 543, 204, 83);
      f.getContentPane().add(update);
      
      JButton read_1 = new JButton("검색");
      read_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String no = t1.getText();
            System.out.println("====" + no);
            BbsDAO dao = new BbsDAO();
            try {
               BbsVO bag = dao.one(Integer.parseInt(no));
               t1.setText(String.valueOf(bag.getNo()));
               t2.setText(bag.getTitle());
               t3.setText(bag.getContent());
               t4.setText(bag.getWriter());
            }catch (Exception e1) {
            }
         }
      });
      read_1.setFont(new Font("굴림", Font.BOLD, 25));
      read_1.setBounds(344, 438, 117, 83);
      f.getContentPane().add(read_1);
      
      
      all.setFont(new Font("Monospaced", Font.BOLD, 30));
      all.setRows(8);
      all.setColumns(30);
      all.setBounds(534, 46, 417, 406);
      f.getContentPane().add(all);
      f.setVisible(true);
   }
}