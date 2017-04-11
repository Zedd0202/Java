/*
 * ThreeDimensionalShape class
 * @version 1.0 28 March 2017
 * @author  Songyi CHOI
 */
public class ThreeDimensionalShape extends TwoDimensionalShape{
	
	//constant class name
	static final String CLASS_NAME = "3D Shape";
	
	//variables

	
	//constructor
	ThreeDimensionalShape (String name, double d1, double d2,double d3){
		super(name,d1,d2,d3);
	}
	
	//Method to get class name
	public String getClassName(){
		return ThreeDimensionalShape.CLASS_NAME;
	}
	
	//Method to get name
	public String getName(){
		return this.name;
	}
	
	//Method to get demension1
	public double getDimension1() {
		return dimension1;
	}
	
	//Method to set demension1
	public void setDimension1(double dimension1) {
		this.dimension1 = dimension1;
	}
	
	//Method to get demension2
	public double getDimension2() {
		return dimension2;
	}
	
	//Method to set demension2
	public void setDimension2(double dimension2) {
		this.dimension2 = dimension2;
	}
	
	//Method to get demension3
	public double getDimension3() {
		return dimension3;
	}
	
	//Method to set demension3
	public void setDimension3(double dimension3) {
		this.dimension3 = dimension3;
	}
	
	//Method to get volume
	public double getVolume(){
		return 0.0;
	}
	
	//Method to get surfaceArea
	public double getSurfaceArea(){
		return 0.0;
	}
}
