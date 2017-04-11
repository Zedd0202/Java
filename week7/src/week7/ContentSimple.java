package week7;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class ContentSimple extends JFrame{
	private JLabel label;
	private JTextField textField1;
	private JButton btton;
	private JTextField textField2;

	public ContentSimple()
	{
		super("converter");
		label= new JLabel("distance");
		textField1= new JTextField(10);
		btton =  new JButton("calculate");
		textField2 = new JTextField(50);
		textField2.setEditable(false);
		
		setLayout(new GridLayout(2,2));
		setSize(300,100);
		
		setTitle("Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);

		GridLayout layout = new GridLayout(2,2);
		setLayout(layout);
		
		
	
		JButton button = new JButton("Calculate");
		setVisible(true);
		add(label);
		add(textField1);
		add(button);
		add(textField2);

		
		//action 
		button.addActionListener(new CalculatorHandler());
		
		
	}
	public class CalculatorHandler implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			double km = Double.parseDouble(textField1.getText());//숫자만 입력가능해야함.아니면 런타임에러가 발생한다 .
		 
			String ret=String.format("%.3f mile(s)", km*0.621);
			textField2.setText(ret);
		}
		
	}

}
