package 스레드;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 자동차경주게임 extends JFrame {
	public 자동차경주게임() {
	}

	
	public void 자동차경주게임() {
		setTitle("자동차 경주");
		setSize(1400,600);
		getContentPane().setLayout(null); //absolute layout

		Car car1 = new Car("car01.png",100,0);
		Car car2 = new Car("car02.png",100,150);
		Car car3 = new Car("car03.png",100,300);
		car1.start();
		car2.start();
		car3.start();
		
		setVisible(true);
	}
	//스레드 클래스를 내부클래스로 만듬
	public class Car extends Thread {
		//x축은 같고 y축이 달라짐
		//생성자를 만들어서 초기값을 넣어줌
		int x, y;
		JLabel label; //Car에서도 접근 가능하고, 런메소드에서 라벨 접근할수 있도록 전역변수화
		
		public Car(String file, int x, int y) {
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel(icon);
			this.x = x;
			this.y = y;
			label.setBounds(x, y, 150, 150);
			add(label);
		}
		
		@Override
		public void run() {
	Random r = new Random();
	for (int i = 0; i < 200; i++) {
		int move = r.nextInt(50);// 0~49
		x = x + move;
		label.setBounds(x, y, 150, 150);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
		}
		
	}
	
	
	public static void main(String[] args) {
		자동차경주게임 name = new 자동차경주게임(); 

	}

}
