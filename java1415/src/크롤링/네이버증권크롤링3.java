package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링3 {
	String result[] = null;

	public String[] crawl(String code) {

		Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + code);

		try {
			Document doc = con.get();
			// 회사이름
			Elements list = doc.select("h2>a");
			String name = list.get(0).text(); // 회사이름

			// 회사코드
			Elements list2 = doc.select("span.code");
			String c = list2.get(0).text(); // 회사코드

			// 현재가
			Elements list3 = doc.select("div.today");
			Elements list4 = list3.select(".blind");
			String np = list4.get(0).text(); // 현재가

			// 전일가
			Elements list5 = doc.select("td.first");
			Elements list6 = list5.select(".blind");
			String yp = list6.get(0).text();

			// 고가
			Elements list7 = doc.select(".no_info");
			Elements list8 = list7.select(".blind");
			String hp = list8.get(1).text();

			System.out.println(name);
			System.out.println("현재가 : " + np);
			System.out.println("전일가 : " + yp);
			System.out.println("고가 : " + hp);

			System.out.println("-------------------------------");

			result = new String[] { name, np, yp, hp };

		} catch (IOException e) {

			e.printStackTrace();
		}
		return result;

	}

}
