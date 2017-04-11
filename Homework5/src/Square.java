

/*
 * Square class
 * @version 1.0 28 March 2017
 * @author  Songyi CHOI
 */
public class Square extends Rectangle {
	//class name. constant variable.
	static final String CLASS_NAME = "Square";
	
	//constructor
	public Square(String name, double side){
		super(name, side,side);
		
	}
	
	///Method to get class name
	public String getClassName(){
		
		return Square.CLASS_NAME;
	}
	
	//Method to set side
	public void setSide(double side){
		this.dimension1 = side;
		
	}
	
	//Method to get side
	public double getSide(){
		return this.dimension1;
	}
	
	//Method to toString
	@Override public String toString() {
		return String.format("%s is a [%s], and is a [%s] \n  SquareObject1's area is %.2f, side is %.2f",super.getName(), getClassName(), super.getClassName(),getArea(),getSide());		
		}
}
