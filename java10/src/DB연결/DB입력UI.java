package DB연결;

import javax.swing.JOptionPane;

public class DB입력UI {

	public static void main(String[] args) throws Exception {

		String id = JOptionPane.showInputDialog("ID입력");
		String pw = JOptionPane.showInputDialog("비밀번호입력");
		String name = JOptionPane.showInputDialog("이름입력");
		String tel = JOptionPane.showInputDialog("전화번호입력");
		
		DB처리전담 db = new DB처리전담();
		db.create(id, pw, name, tel);
		
	}

}
