package db연결;

import javax.swing.JOptionPane;

public class 회원가입UI2 {

	public static void main(String[] args) throws Exception {
		String id =JOptionPane.showInputDialog("id입력");
		String pw =JOptionPane.showInputDialog("pw입력");
		String name =JOptionPane.showInputDialog("name입력");
		String tel =JOptionPane.showInputDialog("tel입력");

		
		MemberVO bag = new MemberVO();//가방을 만들고
		bag.setId(id); //set메서드를 통해서 가방에 각 값들을 하나씩 넣음
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
		
		MemberDAO dao = new MemberDAO();
		dao.create(bag); //가방 만든것 dao로 넘김
	}

}
