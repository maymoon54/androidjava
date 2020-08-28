package 클래스만들기;

public class Bbs {

	//멤버변수
	
	public int no; //글번호
	public String title; //글제목
	public String content; //내용
	public String writer; //작성자
	
	//멤버메서드
	
	public void 글을쓰다() {
		System.out.println("글을쓰다");
	}
	
	public void 글을삭제하다() {
		System.out.println("글을삭제하다");
	}
	
	public void 글을읽다() {
		System.out.println("글을읽다");
	}
	
	public void 글을수정하다() {
		System.out.println("글을수정하다");
		
		
		
	}

	@Override
	public String toString() {
		return "no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer;
	}
}
