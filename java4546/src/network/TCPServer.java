package network;


import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
//서버1 클라이언트 다 서버가 먼저 켜져있어야함..
	public static void main(String[] args) throws Exception {
		// 1.연결 요청만 담당하는 서버용 socket 필요
		// protopype(프로토타입) <-> singltone(싱글톤)
		// 필요할때마다 객체 생성 <-> 하나만 객체 생성해서 주소를 가져다가 씀 
		// (class를 만들어두고 object생성해서 씀)	 <-> (서버에서는 싱글톤 사용해야함)
		
		ServerSocket server = new ServerSocket(9000); //ip안쓰면 내pc, 포트 4자리
		//클라이언트의 요청을 받기위핸 준비 , ip와 port로 설정해 서버를 생성
		System.out.println("TCP 서버 시작됨");
		System.out.println("클라이언트 요청을 기다리는 중...");
		
		int count = 0; //연결횟수를 카운트 하기 위한 변수
		while(true) { 
		Socket socket = server.accept(); //클라이언트의 연결 요청을 받는다
		System.out.println(count + "번 클라이언트와의 연결 성공");
		count++;
		
		//클라이언트에게 데이터 전송				socket을 통해 밖으로 보냄
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);		
		out.println("i am java programmer!!!");
		}
	}

}
