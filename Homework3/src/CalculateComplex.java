/*
 * CalculateComplex class
 * @version 1.0 16 March 2017
 * @author  Songyi CHOI
 */
import java.util.Scanner;

public class CalculateComplex {

	public static void main(String[] args) {
		
		/*
		 * !!!!!caution!!!!!
		 * My code input does not process whitespace.
		 * example) -1 + 2i ==> X
		 *     		-1+2i   ==> O
		 */

		//Creates Complex object.
		Complex complex1 = new Complex();
		Complex complex2 = new Complex(); 
		Complex solution = new Complex();
		
		//Scanner object for receiving input
		Scanner input = new Scanner(System.in);
		
		//Receive the first complex number
		System.out.print("First complex is :");
		String input1 =  input.nextLine();
		
		//Receive the second complex number
		System.out.print("Second complex is :");
		String input2 =  input.nextLine();
		
		//Split the input complex number with sign
		String[] splitComplex1 = input1.split("[0-9]+(?<=[-+*i/()])|(?=[-+i*/()])");
		String[] splitComplex2 = input2.split("[0-9]+(?<=[-+*i/()])|(?=[-+i*/()])");
		
		//Put the 0th index of the split string in the real part of the first complex number.
		complex1.realNumber = Integer.parseInt(splitComplex1[0]);
		
		//Handling exceptions if imaginary part is just i or -i.
		if(splitComplex1[1].charAt(0)=='+'&&splitComplex1[1].length()==1)
			complex1.imaginaryNumber = 1;
		else if(splitComplex1[1].charAt(0)=='-'&&splitComplex1[1].length()==1)
			complex1.imaginaryNumber = -1;
		else
			complex1.imaginaryNumber = Integer.parseInt(splitComplex1[1]);
		
		
		//Put the 0th index of the split string in the real part of the first complex number.
		complex2.realNumber = Integer.parseInt(splitComplex2[0]);
		
		//Handling exceptions if imaginary part is just i or -i.
		if(splitComplex2[1].charAt(0)=='+'&&splitComplex2[1].length()==1)
			complex2.imaginaryNumber = 1;
		else if(splitComplex2[1].charAt(0)=='-'&&splitComplex2[1].length()==1)
			complex2.imaginaryNumber = -1;
		else 
			complex2.imaginaryNumber = Integer.parseInt(splitComplex2[1]);
		
		//Call the print function to print addition, subtraction, and multiplication.
		solution.printComplex(complex1,complex2);
		
		System.out.println("-------------------------------------------------");
		
		//Call a function that calculates an absolute value
		System.out.println("Result of First complex's Absolute value is : " + solution.getAbs(complex1));
		System.out.println("Result of Second complex's Absolute value is : " + solution.getAbs(complex2));
		
	}
}
