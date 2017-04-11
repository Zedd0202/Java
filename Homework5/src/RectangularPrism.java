/*
 * RectangularPrism class
 * @version 1.0 28 March 2017
 * @author  Songyi CHOI
 */
public class RectangularPrism extends ThreeDimensionalShape  {
	
	//constant class name
	static final String CLASS_NAME = "RectangularPrism";
	
	//constructor. RectangularPrism is inherited from ThreeDimensionalShape. so use super().
	public RectangularPrism(String name, double length, double width,double height){
		super(name, length,width,height);
	}
	
	//Method to get class name
	public String getClassName(){
		return RectangularPrism.CLASS_NAME;
	}
	
	//Method to set Length
	public void setLength(double length){
		this.dimension1 = length;
	} 
	
	//Method to get Length
	public double getLength(){
		return this.dimension1;
	}
	
	//Method to get Width
	public double getWidth(){
		return this.dimension2;
	}
	
	//Method to set Width
	public void setWidth(double width){
		this.dimension2 = width;	
	}
	
	//Method to set Height
	public void setHeight(double height){
		this.dimension3 = height;
	}
	
	//Method to get Height
	public double getHeight(){
		return this.dimension3;	
	}
	
	//Method to get Volume
	public double  getVolume(){
		return getLength()*getWidth()*getHeight();
	}
	
	//Method to get surface area
	public double getSurfaceArea(){
		return 2*getLength()*getWidth()+2*getLength()*getHeight()+2*getWidth()*getHeight();
	}
	
	//Method to toString
	@Override public String toString() {
		return String.format("myRectangularPrism is a %s inherited from %s class. \n length = %.1f, \n width = %.1f, \n height = %.1f, \n surface area = %.3f,\n volume = %.3f.", getClassName(),super.getClassName(), getLength(),getWidth(), getHeight(),getSurfaceArea(), getVolume());
				
	}


}
