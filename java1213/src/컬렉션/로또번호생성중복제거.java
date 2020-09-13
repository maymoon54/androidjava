package 컬렉션;

import java.util.HashSet;
import java.util.Random;

public class 로또번호생성중복제거 {

	public static void main(String[] args) {

		// 랜덤숫자 생성
		Random r = new Random();
		HashSet lotto = new HashSet();
		// for (int i = 0; i < 6; i++) {
		// 고정으로 6번 돌리면, 중복값이 있을때 결과가 6개가 안됨

		while (lotto.size() < 6) {
			lotto.add(r.nextInt(45) + 1); // 1~45
		}
		System.out.println(lotto);

	}

}
