package 크롤링;


import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class 네이버증권크롤링2 {
String result[] = null;
	public String[] crawl(String code) {
		
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code="+code);
		
		try {
			Document doc = con.get();
			Elements list = doc.select("h2>a");
			System.out.println("회사이름: " + list.get(0).text());
			String name =  list.get(0).text();
			
			Elements list2 = doc.select("span.code");
			System.out.println("코드 : " + list2.get(0).text());
			String c =  list2.get(0).text();
			
			Elements list3 = doc.select("div.today");
			//System.out.println(list3);
			Elements list4 = list3.select(".blind");
			//System.out.println(list4);
			String now = list4.get(0).text(); //현재가
			String dif = list4.get(1).text(); //차이
			String percent = list4.get(2).text(); //증감비율
			
			System.out.println("현재가 : " + now);
			System.out.println("어제와의 차이 : " + dif);
			System.out.println("증감비율 : " + percent);
			
			//전일가
			Elements list5 = doc.select("td.first");
			//System.out.println(list5);
			Elements list6 = list5.select(".blind");
			System.out.println("전일가 : " + list6.get(0).text());
			
			//고가, 거래량
			Elements list7 = doc.select(".no_info");
			Elements list8 = list7.select(".blind");
			//System.out.println(list8);
			System.out.println("고가 : " + list8.get(1).text());
			System.out.println("거래량 : " + list8.get(3).text());
			System.out.println("-------------------------------");
		result = new String[] {name,c,now,dif,percent};
		//교재21페이지

		} catch (IOException e) {
		
			e.printStackTrace();
		} 
		return result;

	}

}
