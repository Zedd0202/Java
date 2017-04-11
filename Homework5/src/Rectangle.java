
/*
 * Rectangle class
 * @version 1.0 28 March 2017
 * @author  Songyi CHOI
 */
public class Rectangle extends TwoDimensionalShape {
	
	//class name. constant variable
	static final String CLASS_NAME = "Rectangle";
	
	//constructor
	public Rectangle(String name, double width, double height){
		super(name, width,height,0);
	}
	
	//Method to get class name
	public String getClassName(){
		
		return Rectangle.CLASS_NAME;
	}
	
	//Method to set width
	public void setWidth(double width){
		this.dimension1 = width;
		
	} 
	
	//Method to get width
	public double getWidth(){
		return this.dimension1;
	}
	
	//Method to set height
	public void setHeight(int height){
		this.dimension2 = height;
		
	}
	
	//Method to get height
	public double getHeight(){
		return this.dimension2;
	}
	
	//Method to get area
	public double getArea(){
		return this.dimension1*this.dimension2;
	}
	
	//Method to toString
	@Override public String toString() {
		return String.format("%s is a [%s], and is a [%s] \n  RecObject1's area is %.2f, width is %.2f, height is %.2f",super.getName(), getClassName(), super.getClassName(),getArea(),getWidth(),getHeight());
	}

}
