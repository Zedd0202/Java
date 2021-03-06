package week7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Converter {
	
	static JTextField textField =  new JTextField();
	static	JLabel label2 =  new JLabel();

	public static void main(String args[])
	{
		JFrame frame =  new JFrame();
		frame.setTitle("Converter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);

		GridLayout layout = new GridLayout(2,2);
		frame.setLayout(layout);
		JLabel label1 =  new JLabel();
		label1.setText("Distance in Km");
	
		JButton button = new JButton("Calculate");
		frame.setVisible(true);
		frame.add(label1);
		frame.add(textField);
		frame.add(button);
		frame.add(label2);

		
		//action 
		button.addActionListener(new Converter().new CalculatorHandler());//inner class 
		

	}
	public class CalculatorHandler implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			double km = Double.parseDouble(textField.getText());//스트링을 가져온다. "1.5" -> double.pareDouble로 더블로 가져온더.
			//string y="3217"
			//int y = integer.parseint(y);-> 인트로 가져온다. 
			String ret=String.format("%.3f mile(s)", km*0.621);
			label2.setText(ret);
		}
		
	}
	//class context extends JFrame{}가능.생성자에 
}
