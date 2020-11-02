package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

//domain name : www.naver.com  //domain:범위 
//= DNS(domain name system) 서버가 IP주소로 변환
public class DomainToIP {

	public static void main(String[] args) throws Exception {
		String domain = "www.naver.com";
		InetAddress ip = InetAddress.getByName(domain);
		System.out.println("ip주소 " + ip.getHostAddress());

	}

}
