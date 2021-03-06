package week9;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Calculator extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JPanel panel;
	private JPanel panel_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private JButton btnNewButton_16;
	private JButton btnNewButton_17;
	private JButton btnNewButton_18;
	private JButton btnNewButton_19;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setFont(new Font("AppleGothic", Font.PLAIN, 20));
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 5, 0, 0));
		
		btnNewButton = new JButton("7");
		btnNewButton.addActionListener(this);
		panel_1.add(btnNewButton);
		
		btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(this);

		panel_1.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("9");
		btnNewButton_2.addActionListener(this);

		panel_1.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("*");

		panel_1.add(btnNewButton_3);
		
		btnNewButton_12 = new JButton("C");

		panel_1.add(btnNewButton_12);
		
		btnNewButton_10 = new JButton("4");
		btnNewButton_10.addActionListener(this);
		panel_1.add(btnNewButton_10);
		
		btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(this);
		panel_1.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(this);
		panel_1.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("-");
		panel_1.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("CE");
		panel_1.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("1");
		btnNewButton_8.addActionListener(this);
		panel_1.add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("2");
		btnNewButton_9.addActionListener(this);
		panel_1.add(btnNewButton_9);
		
		btnNewButton_11 = new JButton("3");
		btnNewButton_11.addActionListener(this);
		panel_1.add(btnNewButton_11);
		
		btnNewButton_13 = new JButton("+");
		panel_1.add(btnNewButton_13);
		
		btnNewButton_15 = new JButton("M");
		panel_1.add(btnNewButton_15);
		
		btnNewButton_14 = new JButton("0");
		btnNewButton_14.addActionListener(this);
		panel_1.add(btnNewButton_14);
		
		btnNewButton_16 = new JButton(".");
		panel_1.add(btnNewButton_16);
		
		btnNewButton_17 = new JButton("=");
		panel_1.add(btnNewButton_17);
		
		btnNewButton_18 = new JButton("/");
		panel_1.add(btnNewButton_18);
		
		btnNewButton_19 = new JButton("MC");
		panel_1.add(btnNewButton_19);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		System.out.println(s);
		if(s.compareToIgnoreCase("0")>=0 && s.compareToIgnoreCase("9")<=0)
		{
		 String oldText =  textField.getText();
		 textField.setText(oldText+s);
		}
	}

}
