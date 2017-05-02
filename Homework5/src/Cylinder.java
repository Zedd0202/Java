/*
 * Cylinder class
 * @version 1.0 28 March 2017
 * @author  Songyi CHOI
 */
public class Cylinder extends ThreeDimensionalShape{
	
	//constant class name
	static final String CLASS_NAME = "Cylinder";

	
	//constructor. Cylinder is inherited from ThreeDimensionalShape. so use super().
	public Cylinder(String name, double radius, double height){
		super(name, radius,height,0);
	}
	
	//Method to get class name
	public String getClassName(){
		return Cylinder.CLASS_NAME;
	}
	
	//Method to set Radius
	public void setRadius(double radius){
		this.dimension1 = radius;	
	}
	
	//Method to set Radius
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
	
	//Method to get Volume
	public double getVolume(){
		return Math.PI*Math.pow(getRadius(), 2)*getHeight();
	}
	
	//Method to get surface area
	public double getSurfaceArea(){
		return 2*Math.PI*Math.pow(getRadius(), 2)+2*Math.PI*getRadius()*getHeight();	
	}
	
	//Method to toString
	@Override public String toString() {
		return String.format("myCylinder is a %s inherited from %s class. \n height = %.1f, \n radius = %.1f, \n surface area = %.3f, \n volume = %.3f.", this.getClassName(),super.getClassName(), getHeight(),getRadius(),getSurfaceArea(),getVolume());
	}
}
