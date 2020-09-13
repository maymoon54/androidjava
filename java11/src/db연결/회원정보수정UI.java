package db연결;

import javax.swing.JOptionPane;

public class 회원정보수정UI {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
String id =JOptionPane.showInputDialog("id입력");
String tel =JOptionPane.showInputDialog("수정tel입력");


MemberDAO db = new MemberDAO();
db.update(tel, id);
	}

}
