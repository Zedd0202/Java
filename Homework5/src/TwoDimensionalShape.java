/*
 * TwoDimensionalShape class
 * @version 1.0 28 March 2017
 * @author  Songyi CHOI
 */
public class TwoDimensionalShape {

	//class name. constant variable
	static final String CLASS_NAME = "2D Shape";
	
	//variables.
	String name;
	double dimension1;
	double dimension2;
	double dimension3;
	
	//constructor.
	TwoDimensionalShape (String name, double d1, double d2,double d3){
		this.name = name;
		this.dimension1 = d1;
		this.dimension2 = d2; 
		this.dimension3 = d3;
	}
	
	//Method to get class name
	public String getClassName(){
		return TwoDimensionalShape.CLASS_NAME;
	}
	
	//Method to get name
	public String getName(){
		return this.name;
	}

	
	//Method to get Dimension1
	public double getDimension1() {
		return dimension1;
	}
	
	//Method to set Dimension1
	public void setDimension1(double dimension1) {
		this.dimension1 = dimension1;
	}
	
	//Method to get Dimension2
	public double getDimension2() {
		return dimension2;
	}
	
	//Method to set Dimension2
	public void setDimension2(double dimension2) {
		this.dimension2 = dimension2;
	}
	
	//Method to set Dimension3
	public void setDimension3(double dimension3){
		this.dimension3 = dimension3;
	}
	
	//Method to get Dimension3
	public double getDimension3(){
		return this.dimension3;
	}
	
	//Method to get area
	public double getArea(){
		return 0.0;
	}



}
