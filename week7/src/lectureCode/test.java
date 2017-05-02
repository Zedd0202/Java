package lectureCode;

import javax.swing.*;
import java.awt.*;

public class test {
	public static void main(String[] args){
		
		JFrame j =  new JFrame();
		j.setSize(300, 300);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout g = new GridLayout(1,2);
		j.setLayout(g);
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		j.add(p1);
		j.add(p2);
		p1.setLayout(new FlowLayout());
		p2.setLayout(new GridLayout(2,2));
		
		j.setVisible(true);
		JButton button= new JButton("click");
		JButton button2= new JButton("click");

		p1.add(button);
		p2.add(button);
	}

}
