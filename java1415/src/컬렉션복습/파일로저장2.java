package 컬렉션복습;

import java.io.FileWriter;
import java.util.ArrayList;

public class 파일로저장2 {
	public void save(ArrayList<계좌> list) {


		for (int i = 0; i < list.size(); i++) {
			// 컨테이너(리스트)에서
			계좌 account = list.get(i);// 포문으로 값을 하나씩 꺼내줌

			// 파일로 저장할 예정 ---> 예외처리
			try {
				// 파일을 만들어서 저장하는 부품써야함.
				FileWriter w = new FileWriter(account.name + ".txt");
				w.write(account.name+ "\n");
				w.write(account.field + "\n");
				w.write(account.money + "\n");
				w.close(); // 파일에다가 다 썼음. 이걸 안써주면 파일에 내용 안들어감.

			} catch (Exception e) {
				// try내에 있는 코드에서 에러가 발생했을 때, 대응처리 내용을 써줌.
				System.out.println("파일로 저장하다가 에러가 발생함!!");
			}
		}

	}
	
}
