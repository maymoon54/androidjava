package 크롤링;


import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class 네이버영화크롤링 {

	public static void main(String[] args) {
		// 크롤링 
		//웹 사이트에서 정보를 가지고 오는것
		//단순 : 스크랩핑
		//단순 + @ : 크롤링
		
		//크롤링순서
		//1. 사이트 연결
		//2. 해당 페이지 다운로드 (html)
		//3. 원하는 위치의 정보를 추출해냄
		
		Connection con = Jsoup.connect("https://movie.naver.com/movie/bi/mi/basic.nhn?code=190010");
		System.out.println("1. 사이트 연결성공!!!");
		
		try {
			Document doc = con.get();
			System.out.println("2. 해당페이지 다운로드 성공!!");
			System.out.println("----------------------------");
			//System.out.println(doc);
			Elements list = doc.select("h3 a"); //html의 domtree구조를 이용해서
												//h3 아래 있는 a태그만 검색 : 자식, 자손 모두
												//자식만 찾을 경우 h3>a
			
			System.out.println(list.get(0).text());
			

			System.out.println("3. 원하는 위치의 정보를 추출 성공!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //index.html

	}

}
