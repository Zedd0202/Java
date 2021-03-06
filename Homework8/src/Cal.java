/*
 * Cal clss
 * @version 1.0 29 April 2017
 * @author  Songyi CHOI
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;

/*
 * warnig!!!!! : if you start this program and input is from the keyboard then, click the jlist part. if you don't this action, Values are duplicated.
 * I asked my friends to solve this problem, but my friends were having the same problem. 
 * I tried several ways to solve the problem with my friends, but we could not solve it.
 */

@SuppressWarnings("serial")
public class Cal extends JFrame implements ActionListener,
      ListSelectionListener {

   private JPanel contentPane;
   private JPanel pnDisplay;
   private JPanel pnInput;
   private JPanel pnHistory;
   private JScrollPane scrollPane;
   private JTextField textField;
   private JButton btn7;
   private JButton btn8;
   private JButton btn9;
   private JButton btnAdd;
   private JButton btnClearAll;
   private JButton btn4;
   private JButton btn5;
   private JButton btn6;
   private JButton btnMinus;
   private JButton btnClearText;
   private JButton btn1;
   private JButton btn2;
   private JButton btn3;
   private JButton btnMultiply;
   private JButton btnMemSet;
   private JButton btn0;
   private JButton btnDot;
   private JButton btnEqual;
   private JButton btnDivide;
   private JButton btnMemRead;
   private JList list;

   // String to store input data
   private String num1;
   private String num2;
   private String operator;
   private final String NONE = "NONE";
   private DefaultListModel<String> listData;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Cal frame = new Cal();
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
   public Cal() {

      /*
       * GUI code
       */
      setTitle("Simple Calculator");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 900, 600);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      contentPane.setLayout(new BorderLayout(0, 0));
      setContentPane(contentPane);

      pnDisplay = new JPanel();
      contentPane.add(pnDisplay, BorderLayout.NORTH);
      pnDisplay.setLayout(new GridLayout(0, 1, 0, 0));

      textField = new JTextField();
      textField.setHorizontalAlignment(SwingConstants.RIGHT);
      textField.setFont(new Font("Courier New", Font.PLAIN, 28));
      pnDisplay.add(textField);
      textField.setColumns(10);

      pnInput = new JPanel();
      contentPane.add(pnInput, BorderLayout.CENTER);
      pnInput.setLayout(new GridLayout(4, 5, 5, 5));

      btn7 = new JButton("7");
      btn7.setFont(new Font("占쏙옙占쏙옙", Font.BOLD, 14));
      btn7.addActionListener(this);
      pnInput.add(btn7);

      btn8 = new JButton("8");
      btn8.setFont(new Font("占쏙옙占쏙옙", Font.BOLD, 14));
      btn8.addActionListener(this);
      pnInput.add(btn8);

      btn9 = new JButton("9");
      btn9.setFont(new Font("占쏙옙占쏙옙", Font.BOLD, 14));
      btn9.addActionListener(this);
      pnInput.add(btn9);

      btnAdd = new JButton("+");
      btnAdd.setFont(new Font("占쏙옙占쏙옙", Font.BOLD, 14));
      btnAdd.addActionListener(this);
      pnInput.add(btnAdd);

      btnClearAll = new JButton("C");
      btnClearAll.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            // reset all the data
            textField.setText("");
            num1 = NONE;
            num2 = NONE;
            operator = NONE;
         }
      });
      btnClearAll.setFont(new Font("占쏙옙占쏙옙", Font.BOLD, 14));
      pnInput.add(btnClearAll);

      btn4 = new JButton("4");
      btn4.setFont(new Font("占쏙옙占쏙옙", Font.BOLD, 14));
      btn4.addActionListener(this);
      pnInput.add(btn4);

      btn5 = new JButton("5");
      btn5.setFont(new Font("占쏙옙占쏙옙", Font.BOLD, 14));
      btn5.addActionListener(this);
      pnInput.add(btn5);

      btn6 = new JButton("6");
      btn6.setFont(new Font("占쏙옙占쏙옙", Font.BOLD, 14));
      btn6.addActionListener(this);
      pnInput.add(btn6);

      btnMinus = new JButton("-");
      btnMinus.setFont(new Font("占쏙옙占쏙옙", Font.BOLD, 14));
      btnMinus.addActionListener(this);
      pnInput.add(btnMinus);

      btnClearText = new JButton("CE");
      btnClearText.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // reset the textfield only
            textField.setText("");
            textField.setEditable(true);
         }
      });
      btnClearText.setFont(new Font("占쏙옙占쏙옙", Font.BOLD, 14));
      pnInput.add(btnClearText);

      btn1 = new JButton("1");
      btn1.setFont(new Font("占쏙옙占쏙옙", Font.BOLD, 14));
      btn1.addActionListener(this);
      pnInput.add(btn1);

      btn2 = new JButton("2");
      btn2.setFont(new Font("占쏙옙占쏙옙", Font.BOLD, 14));
      btn2.addActionListener(this);
      pnInput.add(btn2);

      btn3 = new JButton("3");
      btn3.setFont(new Font("占쏙옙占쏙옙", Font.BOLD, 14));
      btn3.addActionListener(this);
      pnInput.add(btn3);

      btnMultiply = new JButton("*");
      btnMultiply.setFont(new Font("占쏙옙占쏙옙", Font.BOLD, 14));
      btnMultiply.addActionListener(this);
      pnInput.add(btnMultiply);

      btnMemSet = new JButton("MS");
      btnMemSet.setFont(new Font("占쏙옙占쏙옙", Font.BOLD, 14));
      pnInput.add(btnMemSet);

      btn0 = new JButton("0");
      btn0.setFont(new Font("占쏙옙占쏙옙", Font.BOLD, 14));
      btn0.addActionListener(this);
      pnInput.add(btn0);

      btnDot = new JButton(".");
      btnDot.setFont(new Font("占쏙옙占쏙옙", Font.BOLD, 14));
      pnInput.add(btnDot);

      btnEqual = new JButton("=");
      btnEqual.setFont(new Font("占쏙옙占쏙옙", Font.BOLD, 14));
      btnEqual.addActionListener(this);
      pnInput.add(btnEqual);

      btnDivide = new JButton("/");
      btnDivide.setFont(new Font("占쏙옙占쏙옙", Font.BOLD, 14));
      btnDivide.addActionListener(this);
      pnInput.add(btnDivide);

      btnMemRead = new JButton("MR");
      btnMemRead.setFont(new Font("占쏙옙占쏙옙", Font.BOLD, 14));
      pnInput.add(btnMemRead);
      
      listData = new DefaultListModel();
      list = new JList(listData);

      list.addListSelectionListener(this); // connect the list with
                                    // ListSelectionListener
      scrollPane = new JScrollPane(list); // add the list to the constructor of the JScrollPane, so the list will be inside the JScrollPane
      getContentPane().add(scrollPane, BorderLayout.EAST);

      KeyboardFocusManager.getCurrentKeyboardFocusManager() // this code to catch the keyboard pressed keys
            .addKeyEventDispatcher(new KeyEventDispatcher() {
               @Override
               public boolean dispatchKeyEvent(KeyEvent e) {

                  if (e.getID() == KeyEvent.KEY_RELEASED) {// if you press any key, print on the console
                     System.out.println("Got key event from "+ e.getKeyChar());

                     actionPerformed(e.getKeyChar());
                     if (e.getKeyCode() == KeyEvent.VK_ENTER) { // if you pressed enter
                        System.out.println("Got key event from ENTER");
                        listData.addElement(textField.getText());
                     }
                  }

                  return false;
               }
            });

      /*
       * End of GUI code
       */

      // initialize data
      num1 = NONE;
      num2 = NONE;
      operator = NONE;

   }

   public void actionPerformed(char keyChar) {
      // TODO Auto-generated method stub

      scrollPane.getVerticalScrollBar().setValue(scrollPane.getVerticalScrollBar().getMaximum());

      String s = "" + keyChar;

      // Check if the button is number
      if (s.compareToIgnoreCase("0") >= 0 && s.compareToIgnoreCase("9") <= 0) {
         // if textFiled is for inputting (editable) then append the number
         // else the set editable and set the number to the text
         if (textField.isEditable()) {
            // insert the number to last position of textField
            String curText = textField.getText();
            textField.setText(curText + s);
         } else {
            textField.setEditable(true);
            textField.setText(s);
         }
      }
      // Check if the button is operator
      else if (s.equals("+") || s.equals("-") || s.equals("*")
            || s.equals("/")) {
         // check if there is operator exist
         if (operator.equals(NONE)) {
            // update the data
            num1 = textField.getText();
         } else {
            // get the number2
            num2 = textField.getText();
            // calculate the previous operator before store the new one
            num1 = doMath(num1, operator, num2);
         }
         listData.addElement(textField.getText());
         listData.addElement(s);
         // display the result
         textField.setText(num1);
         textField.setEditable(false);

         // reset the input filed
         operator = s;
         num2 = NONE;
      }
      // check if button is '='
      else if (s.equals("=")) {
         // get the number2
         listData.addElement(textField.getText());
         listData.addElement(s);

         num2 = textField.getText();

         // calculate the previous operator before store the new one
         num1 = doMath(num1, operator, num2);
         listData.addElement(num1);

         // display the result
         textField.setText(num1);
         textField.setEditable(false);

         // reset the input filed
         operator = NONE;
         num1 = NONE;
         num2 = NONE;
         

         listData.addElement("---------");
      }
   }

   /**
    * Do the operator and return the value in String.
    * 
    * @param num1
    *            1st number
    * @param num2
    *            2nd number
    * @param op
    *            the operator
    * @return result
    */
   private String doMath(String num1, String op, String num2) {
      // convert to number
      int number1 = Integer.parseInt(num1);
      int number2 = Integer.parseInt(num2);

      // do the operator
      switch (op.charAt(0)) {
      case '+':
         number1 = number1 + number2;
         break;
      case '-':
         number1 = number1 - number2;
         break;
      case '*':
         number1 = number1 * number2;
         break;
      case '/':
         number1 = number1 / number2;
         break;
      default:
         break;
      }

      // convert to string and return it
      return ("" + number1);
   }

   @Override
   public void valueChanged(ListSelectionEvent evt) {
      // TODO Auto-generated method stub
      if (!evt.getValueIsAdjusting()) {// This line prevents double events
         textField.setText(list.getSelectedValue().toString());
         System.out.println("You select from the Jlist: "+ list.getSelectedValue().toString());
      }
   }

   // Receive the events from all buttons
   @Override
   public void actionPerformed(ActionEvent e) {
      // Get the string from the button
      
      scrollPane.getVerticalScrollBar().setValue(scrollPane.getVerticalScrollBar().getMaximum());

      
      String s = e.getActionCommand();

      // Check if the button is number
      if (s.compareToIgnoreCase("0") >= 0 && s.compareToIgnoreCase("9") <= 0) {
         // if textFiled is for inputting (editable) then append the number
         // else the set editable and set the number to the text
         if (textField.isEditable()) {
            // insert the number to last position of textField
            String curText = textField.getText();
            textField.setText(curText + s);
         } else {
            textField.setEditable(true);
            textField.setText(s);
         }
      }
      // Check if the button is operator
      else if (s.equals("+") || s.equals("-") || s.equals("*")
            || s.equals("/")) {
         // check if there is operator exist
         if (operator.equals(NONE)) {
            // update the data
            num1 = textField.getText();
         } else {
            // get the number2
            num2 = textField.getText();
            // calculate the previous operator before store the new one
            num1 = doMath(num1, operator, num2);
         }
         listData.addElement(textField.getText());
         listData.addElement(s);
         // display the result
         textField.setText(num1);
         textField.setEditable(false);

         // reset the input filed
         operator = s;
         num2 = NONE;
      }
      // check if button is '='
      else if (s.equals("=")) {
         // get the number2
         listData.addElement(textField.getText());
         listData.addElement(s);

         num2 = textField.getText();

         // calculate the previous operator before store the new one
         num1 = doMath(num1, operator, num2);
         listData.addElement(num1);

         // display the result
         textField.setText(num1);
         textField.setEditable(false);

         // reset the input filed
         operator = NONE;
         num1 = NONE;
         num2 = NONE;
         
         listData.addElement("---------");
      }
   }
}