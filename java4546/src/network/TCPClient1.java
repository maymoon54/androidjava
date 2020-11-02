package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient1 {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 1000; i++) { //반복문을 통해 1000개의 클라이언트용 소켓을 만든다
			Socket socket = new Socket("localhost", 9000); //localhost 9000번 서버 접속
			System.out.println("client " + i + " 서버와 연결됨.");
			
		//socket으로 가지고 들어옴
			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//row 데이터를 문자형태로 취급하기 위해 BufferedReader씀
			//InputStreamReader가 브릿지 역할 (바로 문자로 인식 x)
			//stream은 1byte    Reader는 2byte
			String data = input.readLine();
			System.out.println("받은데이터: " + data);
		}

		System.exit(0);
	}

}

//https://jink1982.tistory.com/182