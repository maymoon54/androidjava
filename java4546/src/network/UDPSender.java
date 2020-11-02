package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
DatagramSocket socket = new DatagramSocket();
String str = "i am a android programmer!";
byte[] data= str.getBytes(); //스트링을 byte로 배열로 만들기 (byte단위로 전송)
InetAddress ip = InetAddress.getByName("127.0.0.1"); //가상 아이피: locallhost와 같음?
//스트링이 아닌 IP로 인식시키기 위해 객체화 시킴 ex)파일이름,sql문

//패킷생성
DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7100);

//소켓을 통해 패킷 전송
socket.send(packet);
socket.close();
	}

}
