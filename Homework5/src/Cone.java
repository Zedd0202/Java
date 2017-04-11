/*
 * Cone class
 * @version 1.0 28 March 2017
 * @author  Songyi CHOI
 */
public class Cone extends ThreeDimensionalShape{
	
	//constant class name
	static final String CLASS_NAME = "Cone";
	
	//constructor. Cone is inherited from ThreeDimensionalShape. so use super().
	public Cone(String name, double radius, double height){
		super(name, radius,height,0);
	}
	
	//Method to get class name
	public String getClassName(){
		return Cone.CLASS_NAME;
	}
	
	//Method to set Radius
	public void setRadius(double radius){
		this.dimension1 = radius;
	}
	
	//Method to get Radius
	public double getRadius(){
		return this.dimension1;
	}
	
	//Method to set Height
	public void setHeight(int height){
		this.dimension2 = height;
	}
	
	//Method to get Height
	public double getHeight(){
		return this.dimension2;
	}
	
	//Method to set Side
	public void setSide(int side){
		this.dimension3 = side;	
	}
	
	//Method to get Side
	public double getSide(){
		double side = Math.sqrt((getRadius() * getRadius()) + (getHeight() * getHeight()));
		return side;
	}
	
	//Method to get Volume
	public double getVolume(){
		return Math.PI*Math.pow(getRadius(), 2)*getHeight()*1/3;
	}
	
	//Method to get surface area
	public double getSurfaceArea(){
		return Math.PI*Math.pow(getRadius(), 2)+Math.PI*getRadius()*getSide();
	}
	
	//Method to toString
	public String toString() {
		return String.format("myCone is a %s inherited from %s class. \n height = %.1f, \n radius = %.1f, \n surface area = %.3f,\n volume = %.3f.", this.getClassName(),super.getClassName(), getHeight(),getRadius(), getSurfaceArea(), getVolume());
	}

}
