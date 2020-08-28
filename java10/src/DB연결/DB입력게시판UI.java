package DB연결;

import javax.swing.JOptionPane;

public class DB입력게시판UI {

	public static void main(String[] args) throws Exception {

		String title = JOptionPane.showInputDialog("글제목");
		String content = JOptionPane.showInputDialog("내용");
		String writer = JOptionPane.showInputDialog("작성자");
		
		
		DB처리게시판전담 db = new DB처리게시판전담();
		db.create(title, content, writer);		
	}

}
