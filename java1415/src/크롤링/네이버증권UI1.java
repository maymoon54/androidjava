package 크롤링;

import java.io.FileWriter;

public class 네이버증권UI1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] codes = { "005380", "000660", "068270", "051910", "005930" };
		//String[] names = { "현대차", "SK하이닉스", "셀트리온", "LG화학", "삼성전자" };

		네이버증권크롤링2 naver = new 네이버증권크롤링2();
		for (int i = 0; i < codes.length; i++) {
			//naver.crawl(codes[i]);
			String[] result = naver.crawl(codes[i]);
			try {
				FileWriter file = new FileWriter(result[0] + ".txt");
				file.write(result[0] + "\n");
				file.write(result[1] + "\n");
				file.write(result[2] + "\n");
				file.write(result[3] + "\n");
				file.write(result[4] + "\n");
				file.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

}
