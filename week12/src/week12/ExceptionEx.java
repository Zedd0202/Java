package week12;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExceptionEx extends JFrame {

	private JPanel contentPane;
	private JPanel pinput;
	private JPanel pnDisplay;
	private JLabel lblInput;
	private JLabel lblNumber;
	private JTextField txtNumber;
	private JTextField txtInputField;
	private JLabel lblIndex;
	private JTextField txtIndex;
	private JLabel lblNewLabel_3;
	private int index;
	private int array[];
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExceptionEx frame = new ExceptionEx();
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
	public ExceptionEx() {
		
		array =  new int[10];
		index=0;
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pinput = new JPanel();
		contentPane.add(pinput, BorderLayout.CENTER);
		pinput.setLayout(new GridLayout(3, 2, 0, 0));
		
		lblInput = new JLabel("input number of array");
		lblInput.setHorizontalAlignment(SwingConstants.RIGHT);
		pinput.add(lblInput);
		
		txtInputField = new JTextField();
		txtInputField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try{
				int num =  Integer.parseInt(txtInputField.getText());//numberFormatException이 일어날 수 있음.
				for(int i=0;i<index;i++)
				{
					if(num == array[i])
					{
						txtInputField.setText("");
						throw new DuplicateValueException();
					}
				}
				array[index]= num;
				index++;
				String str="";
				for(int i=0;i<index;i++)
				{
					str=str+array[i]+" ";
				}
				lblNewLabel_3.setText(str);
				txtInputField.setText("");
				}catch(NumberFormatException ex)
				{
					JOptionPane.showMessageDialog(null,"Please enter only integer value!","Invalid input",JOptionPane.ERROR_MESSAGE);
					//(null, 메세지,제목,빨간거뜨게하는거(warning_message뜨게 할 수도 있음)		
				}
				catch(ArrayIndexOutOfBoundsException ex)
				{
					JOptionPane.showMessageDialog(null,"Array may contain only 10 elements","Array full",JOptionPane.ERROR_MESSAGE);
				}
				catch(DuplicateValueException ex)
				{
					JOptionPane.showMessageDialog(null,"This is duplicate Value","Duplicate Value",JOptionPane.ERROR_MESSAGE);

				}
				finally{
					String str="";
					for(int i=0;i<index;i++)
					{
						str=str+array[i]+" ";
					}
					lblNewLabel_3.setText(str);
					txtInputField.setText("");
					
				}
			}
		});
		txtInputField.setPreferredSize(new Dimension(100, 20));
		pinput.add(txtInputField);
		txtInputField.setColumns(10);
		
		lblNumber = new JLabel("Number");
		lblNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		pinput.add(lblNumber);
		
		txtNumber = new JTextField();
		txtNumber.setPreferredSize(new Dimension(100, 20));
		pinput.add(txtNumber);
		txtNumber.setColumns(10);
		
		lblIndex = new JLabel("Index");
		lblIndex.setHorizontalAlignment(SwingConstants.RIGHT);
		pinput.add(lblIndex);
		
		txtIndex = new JTextField();
		txtIndex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					int num =  Integer.parseInt(txtIndex.getText());//numberFormatException이 일어날 수 있음.
					if(num>index)
						throw new DuplicateValueException();
					txtNumber.setText(array[num]+"");
					txtIndex.setText("");
				}
				catch(DuplicateValueException ex){
					JOptionPane.showMessageDialog(null,"Not found the Value","NOT FIND VALUE",JOptionPane.ERROR_MESSAGE);
				}
				
				
				
			}
		});
		pinput.add(txtIndex);
		txtIndex.setColumns(10);
		
		pnDisplay = new JPanel();
		contentPane.add(pnDisplay, BorderLayout.SOUTH);
		
		lblNewLabel_3 = new JLabel("\"\"");
		pnDisplay.add(lblNewLabel_3);
	}

}
