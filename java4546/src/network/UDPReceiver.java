package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiver {
//socket 프로그램 
	public static void main(String[] args) throws Exception {
		// 리시버를 먼저 돌림
		DatagramSocket socket = new DatagramSocket(7100); // 소켓생성
		System.out.println("받는쪽 소켓 시작");
		System.out.println("받을 준비 끝");
		// 빈 패킷 생성
		byte[] data = new byte[256];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		// 데이터 받아서 빈 패킷에 넣기
		socket.receive(packet);
		System.out.println("받은데이터 " + new String(data));
		socket.close();
	}

}
