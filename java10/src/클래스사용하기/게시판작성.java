package 클래스사용하기;

import 클래스만들기.Bbs;

public class 게시판작성 {

	public static void main(String[] args) {

		Bbs p1 = new Bbs();
		
		p1.no = 1;
		p1.title = "java";
		p1.content = "fun java";
		p1.writer = "park";
		
		
		
		Bbs p2 = new Bbs();
		p2.no = 2;
		p2.title = "jsp";
		p2.content = "fun jsp";
		p2.writer = "kim";
		
		
		System.out.println(p1);
		System.out.println(p2);
		
		
	}

}
