/*
 * Prime class
 * @version 1.0 04 May 2017
 * @author Songyi CHOI
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.concurrent.ExecutionException;
import java.util.List;
import org.apache.commons.math3.primes.Primes;//import to find Prime number


public class Prime extends JFrame {

	//variables
	private JPanel contentPane;
	private JTextField textField;
	JButton btnStop;
	JButton btnStart;
	JTextArea txtArea;
	JProgressBar progressBar;
	private JScrollPane scrollPane;

	//threads
	Thread workThread;
	WorkerClass worker;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;


	//check Prime number
	public static boolean isPrime(int number) {
		return Primes.isPrime(number);
	}

	public static int primeCount(int number, int number2) {
		int cnt = 0 ;
		for(int i = number; i<=number2; i++){
			if(isPrime(i)) cnt++;
		}
		return cnt;
	}


	//Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prime frame = new Prime();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//set the Frame
	public Prime() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		//create the JPanel
		JPanel pnInput = new JPanel();
		contentPane.add(pnInput, BorderLayout.NORTH);
		pnInput.setLayout(new GridLayout(0, 6, 0, 0));

		//initialize the label
		JLabel lblNewLabel = new JLabel("Find Prime from");
		lblNewLabel.setFont(new Font("Kohinoor Telugu", Font.PLAIN, 10));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pnInput.add(lblNewLabel);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		pnInput.add(textField);
		textField.setColumns(10);

		btnStart = new JButton("Run");

		//when click on start button
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// reset all views
				progressBar.setValue(0); // reset JProgressBar
				txtArea.setText(""); // clear JTextArea

				// get user input
				int number1;
				try {
					number1 = Integer.parseInt(textField.getText());
				} catch (NumberFormatException ex) {
					return;
				}

				int number2;
				try {
					number2 = Integer.parseInt(textField_1.getText());
				} catch (NumberFormatException ex) {
					return;
				}

				//new class with input numbers
				worker = new WorkerClass(number1, number2);
				worker.addPropertyChangeListener(new PropertyChangeListener() {

					@Override
					public void propertyChange(PropertyChangeEvent e) {
						if (e.getPropertyName().equals("progress")) {
							int newValue = (Integer) e.getNewValue();
							progressBar.setValue(newValue);
						}

					}

				});

				worker.execute();

			}
		});

		//label
		lblNewLabel_1 = new JLabel("to");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		pnInput.add(lblNewLabel_1);

		//textField
		textField_1 = new JTextField();
		pnInput.add(textField_1);
		textField_1.setColumns(10);
		pnInput.add(btnStart);

		btnStop = new JButton("Stop");

		//when click on stop button
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				worker.stopWork();
			}
		});
		btnStop.setEnabled(false);
		pnInput.add(btnStop);

		//list
		JPanel pnList = new JPanel();
		contentPane.add(pnList, BorderLayout.CENTER);
		SpringLayout sl_pnList = new SpringLayout();
		pnList.setLayout(sl_pnList);

		txtArea = new JTextArea();
		txtArea.setEditable(false);

		scrollPane = new JScrollPane(txtArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		sl_pnList.putConstraint(SpringLayout.NORTH, scrollPane, 5, SpringLayout.NORTH, pnList);
		sl_pnList.putConstraint(SpringLayout.WEST, scrollPane, 0, SpringLayout.WEST, pnList);
		sl_pnList.putConstraint(SpringLayout.SOUTH, scrollPane, -5, SpringLayout.SOUTH, pnList);
		sl_pnList.putConstraint(SpringLayout.EAST, scrollPane, 0, SpringLayout.EAST, pnList);

		pnList.add(scrollPane);

		JPanel pnStatus = new JPanel();
		contentPane.add(pnStatus, BorderLayout.SOUTH);
		pnStatus.setLayout(new GridLayout(0, 1, 10, 0));

		progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		pnStatus.add(progressBar);
	}




	//use swing worker.
	public class WorkerClass extends SwingWorker<Integer, String> {
		int num, num2;
		int count;
		int numcnt;
		boolean stopped;



		//worker class constructor
		public WorkerClass(int number, int number2) {
			num = number;
			num2 = number2;
			count = 0;
			numcnt = 0;
			stopped = false;

		}


		@Override
		protected Integer doInBackground() throws Exception {
			// disable Start button and enable Cancel button
			btnStart.setEnabled(false);
			btnStop.setEnabled(true);
			//lblNewLabel_1.setText("Running...");
			count = 0;
			numcnt = primeCount(num, num2);
			try {
				for (int i = num; i <= num2; i++) {
					if (stopped) {
						break;
					}
					if(!isPrime(i)) continue;
					// do some complex work here
					Thread.sleep(10);

					//update the result
					count++;

					// update the view
					setProgress( count * 100 / numcnt);
					
					//show the numbers
					publish(i + " ");
				}
				
			} catch (InterruptedException e) {
				// update the status
				lblNewLabel_1.setText("Error performing computation.");
			}
			return count;
		}


		// displays published values
		protected void process(List<String> publishedVals) {
			for (int i = 0; i < publishedVals.size(); i++) {
				txtArea.append(publishedVals.get(i) + "\n");
				txtArea.setCaretPosition(txtArea.getDocument().getLength());
			}
		} // end method process

		// code to execute when doInBackground completes
		protected void done() {
			// disable Start button and enable Cancel button
			btnStart.setEnabled(true);
			btnStop.setEnabled(false);
			int retNum = 0;
			try {
				retNum = get();

			} catch (InterruptedException ex) {

			}catch (ExecutionException ex) {

			} // end try catch
		}

		//Method to stop function.
		public void stopWork() {
			stopped = true;
		}

	}
}
