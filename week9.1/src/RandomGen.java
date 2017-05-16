import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingWorker;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import java.awt.GridLayout;
import javax.swing.JTextArea;

public class RandomGen extends JFrame {

	private JPanel contentPane;
	private JPanel pnInput;
	private JLabel lblNumberOfLoop;
	private JTextField textField;
	private JButton btnStart;
	private JButton btnStop;
	private JPanel pnState;
	private JProgressBar progressBar;
	private JLabel lblStatus;
	private JScrollPane scrollPane;
	private JTextArea textArea; 
	private Thread workThread;
	private Random ran;
	private SwingWorker<Integer,String> worker;//integer -> 모든게끝나면 스윙워커는 done을 호출한다. 


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RandomGen frame = new RandomGen();
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
	public RandomGen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		pnInput = new JPanel();
		contentPane.add(pnInput, BorderLayout.NORTH);
		pnInput.setLayout(new GridLayout(0, 4, 0, 0));

		lblNumberOfLoop = new JLabel("Number of Loops");
		lblNumberOfLoop.setHorizontalAlignment(SwingConstants.LEFT);
		pnInput.add(lblNumberOfLoop);

		textField = new JTextField();
		pnInput.add(textField);
		textField.setColumns(10);

		btnStart = new JButton("start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//inner annynomous class
				progressBar.setValue(0);
				textArea.setText("");
				lblStatus.setText("");
				btnStart.setEnabled(false);
				btnStop.setEnabled(true);
				//lblStatus.setText("Print " + cnt +"work");
				int number ;
				try{
					ran= new Random();
					number = Integer.parseInt(textField.getText());
				}
				catch(NumberFormatException ex){
					lblStatus.setText("Enter an integer!");
					return;
				}
				//workThread=new Thread(new CalculatorClass(number));
				//workThread.start();
				worker = new SwingWorker<Integer,String>()//스윙워커는 추상클래스인데 객체생성? 이럴때는 메소드를 구현해주면 허용된다.
						{

					int num;
					boolean stopped =  false;

					@Override
					protected Integer doInBackground() throws Exception {//thread의run과 같다. 
						lblStatus.setText("Running..");
						int cnt=0;
						try{
							for(int i=0;i<num;i++)
							{
								if(Thread.currentThread().isInterrupted())
								{
									break;
								}
								Thread.sleep(100);
								cnt++;

								progressBar.setValue((i+1)*100/num);
								textArea.append((i+1)+".Random number = "+ ran.nextInt()+"\n");
							}
							lblStatus.setText("Printed " + cnt+" number(s) ");
						}
						catch(InterruptedException ex){
							lblStatus.setText("Error performing computation");
						}

						return null;

					}
						};
						worker.execute();





						//				for(int i=0;i<number;i++)
						//					textArea.append((String.valueOf(ran.nextInt(number)+"\n")));




						pnInput.add(btnStart);

						btnStop = new JButton("stop");
						btnStop.setEnabled(false);
						btnStop.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {

								if(!worker.isCancelled())
									worker.cancel(true);
							}
						});
						pnInput.add(btnStop);


						//pnList.add(textArea, BorderLayout.NORTH);

						pnState = new JPanel();
						contentPane.add(pnState, BorderLayout.SOUTH);

						progressBar = new JProgressBar();
						pnState.add(progressBar);

						lblStatus = new JLabel("status");
						pnState.add(lblStatus);

						textArea = new JTextArea();
						scrollPane = new JScrollPane(textArea);
						contentPane.add(scrollPane, BorderLayout.CENTER);
			}

			//쓰레드 갯수= 메인쓰레드 +내가 선언한 쓰레드들..
			class CalculatorClass implements Runnable
			{
				int num;
				public CalculatorClass(int numOfWork)
				{
					this.num =  numOfWork;
				}
				@Override
				public void run() {
					lblStatus.setText("Running..");
					int cnt=0;
					try{
						for(int i=0;i<num;i++)
						{
							if(Thread.currentThread().isInterrupted())
							{
								break;
							}
							Thread.sleep(100);
							cnt++;

							progressBar.setValue((i+1)*100/num);
							textArea.append((i+1)+".Random number = "+ ran.nextInt()+"\n");
						}
						lblStatus.setText("Printed " + cnt+" number(s) ");
					}
					catch(InterruptedException ex){
						lblStatus.setText("Error performing computation");
					}
				}
			}
		});
	}
}
			

	
				
			
		
	





