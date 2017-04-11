/*
 * Complex class
 * @version 1.0 16 March 2017
 * @author  Songyi CHOI
 */
public class Complex {
	
	//class variables of Complex.(Complex numbers consist of real and imaginary parts.)
	public int realNumber;
	public int imaginaryNumber;

	//Default constructor of Complex.
	public Complex(){
		
		//initialize to 0
		realNumber = 0;
		imaginaryNumber = 0;
	}

	//Constructor with parameters
	public Complex(int realNumber, int imaginarNumber) {
		super();
		//Attach this -> because they have the same name.
		this.realNumber = realNumber;
		this.imaginaryNumber = imaginarNumber;
	}

	//Function to get real part
	public int getRealNumber() {
		return realNumber;
	}

	//Function to set real part
	public void setRealNumber(int realNumber) {
		this.realNumber = realNumber;
	}

	//Function to get Imaginary part
	public int getImaginaryNumber() {
		return imaginaryNumber;
	}

	//Function to set Imaginary part
	public void setImaginarNumber(int imaginarNumber) {
		this.imaginaryNumber = imaginarNumber;
	}

	//Function to add complex numbers
	public String add(Complex a, Complex b){
		
		//Initialize the string to return
		String addStr = "";
		
		//Add real and imaginary parts of each complex number
		int realSum = a.realNumber + b.realNumber;
		int imaginSum = a.imaginaryNumber + b.imaginaryNumber;
		
		//If all the values are 0, return 0
		if(realSum==0 && imaginSum ==0)
			return "0";
		
		//If realpart's Sum is not 0, Put it in a string.
		if(realSum!=0)
			addStr = Integer.toString(realSum);

		//If imaginary's Sum is 1 or -1, Put it in a string just +i or -i.
		if(imaginSum==1)
			addStr += "+i";
		else if(imaginSum ==-1)
			addStr += "-i";
		
		//If imaginSum is not 1 and -1 and 0, Execute.
		if(imaginSum!=1 && imaginSum != -1 && imaginSum !=0)
		{
			//imaginSum is bigger than 0, Put imaginSum in a string with i.
			if(imaginSum>0)
				addStr+="+"+Integer.toString(imaginSum)+"i";
			
			//imaginSum is less than 0, Put imaginSum in a string with i.
			else
				addStr+=Integer.toString(imaginSum)+"i";
		}

		//return
		return addStr;

	}

	//Function to subtract complex numbers
	public String subtract(Complex a, Complex b){
		
		//Initialize the string to return
		String subStr = "";

		//subtract real and imaginary parts of each complex number
		int realSum = a.realNumber - b.realNumber;
		int imaginSum = a.imaginaryNumber - b.imaginaryNumber;

		//If all the values are 0, return 0
		if(realSum==0 && imaginSum ==0)
			return "0";
		
		//If realpart's Sum is not 0, Put it in a string.
		if(realSum!=0)
			subStr = Integer.toString(realSum);

		//If imaginary's Sum is 1 or -1, Put it in a string just +i or -i.
		if(imaginSum==1)
			subStr += "+i";
		else if(imaginSum ==-1)
			subStr += "-i";

		//If imaginSum is not 1 and -1 and 0, Execute.
		if(imaginSum!=1 && imaginSum != -1 && imaginSum !=0)
		{
			//imaginSum is bigger than 0, Put imaginSum in a string with i.
			if(imaginSum>0)
				subStr+="+"+Integer.toString(imaginSum)+"i";
			
			//imaginSum is less than 0, Put imaginSum in a string with i.
			else
				subStr+=Integer.toString(imaginSum)+"i";
		}

		//return 
		return subStr;

	}

	//Function to multiply complex numbers
	public String multiply(Complex a, Complex b){
		
		//Initialize the string to return
		String mulStr = "";

		//Since the square of i is -1, it is a real number. So it adds to the real part.
		int realSum = (a.realNumber * b.realNumber)+ (a.imaginaryNumber * b.imaginaryNumber)*-1;
		int imaginSum =  (a.realNumber*b.imaginaryNumber) + (a.imaginaryNumber*b.realNumber);
		
		//If all the values are 0, return 0
		if(realSum==0 && imaginSum ==0)
			return "0";
		
		//If realpart's Sum is not 0, Put it in a string.
		if(realSum!=0)
			mulStr = Integer.toString(realSum);

		//If imaginary's Sum is 1 or -1, Put it in a string just +i or -i.	
		if(imaginSum==1)
			mulStr += "+i";
		else if(imaginSum ==-1)
			mulStr += "-i";

		//If imaginSum is not 1 and -1 and 0, Execute.
		if(imaginSum!=1 && imaginSum != -1 && imaginSum !=0)
		{
			//imaginSum is bigger than 0, Put imaginSum in a string with i.
			if(imaginSum>0)
				mulStr+="+"+Integer.toString(imaginSum)+"i";
			
			//imaginSum is less than 0, Put imaginSum in a string with i.
			else
				mulStr+=Integer.toString(imaginSum)+"i";
		}

		//return 
		return mulStr;
	}
	
	//Function to calculate an absolute value
	public String getAbs(Complex a){
		
		//Initialize the string to return
		String absStr = "";
		
		//If parameter's real part is less than 0, multiply -1.
		if(a.realNumber <0)
			a.realNumber *=-1;
		
		//If parameter's imaginary part is less than 0, multiply -1.
		if(a.imaginaryNumber <0)
			a.imaginaryNumber *=-1;
		
		//If parameter's imaginary part is not equal 1, Put it in a string.
		if(a.imaginaryNumber!=1)
			absStr = a.realNumber + "+" + a.imaginaryNumber +"i";
		
		//If parameter's imaginary part is 1, just put 1 in a string.
		else
			absStr = a.realNumber + "+"+"i";

		//return the string
		return absStr;
	}
	
	//Functions to output. 
	public void printComplex(Complex a, Complex b){
		
		//It takes parameters and calls the addition, subtraction, and multiplication functions.
		System.out.println("Result of addition is: "+add(a,b ));
		System.out.println("Result of subtraction is: "+ subtract(a,b ));
		System.out.println("Result of multiplication is: "+multiply(a,b ));
	}
}


