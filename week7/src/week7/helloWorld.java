package week7;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class helloWorld {
	public static void main(String[] args) {
		
		//set up the window
		JFrame frame = new JFrame();
		frame.setTitle("Java window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//add a label
		JLabel label = new JLabel("Hello world");
		//frame.getContentPane().add(label);
		//오리지날 패널 
		frame.add(label); //-> 이것도 된다.

		
		//show the window
		frame.setSize(300, 100);
		frame.setBounds(10000,10,300,100);//스타트 위치. 어디서 시작해서 볼건지
		
		frame.setVisible(true);
		//mvc패턴 : 
		
	}
}