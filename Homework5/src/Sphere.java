/*
 * Sphere class
 * @version 1.0 28 March 2017
 * @author  Songyi CHOI
 */
public class Sphere extends ThreeDimensionalShape{
	
	//constant class name
	static final String CLASS_NAME = "Sphere";

	//constructor. Sphere is inherited from ThreeDimensionalShape. so use super().
	public Sphere(String name, double radius){
		super(name, radius,0,0);
	}
	
	//Method to get class name
	public String getClassName(){
		return Sphere.CLASS_NAME;
	}
	
	//Method to get Radius
	public double getRadius(){
		return this.dimension1;
	}
	
	//Method to set Radius
	public void setRadius(int radius){
		this.dimension1 = radius;	
	}
	
	//Method to get Volume
	public double getVolume(){
		return Math.pow(dimension1, 3)*4/3*Math.PI;
	}
	
	//Method to get surface area
	public double getSurfaceArea(){
		return 4*Math.PI*Math.pow(getRadius(),2);
	}
	
	//Method to toString
	@Override public String toString() {
		return String.format("mySphere is a %s inherited from %s class. \n radius = %.1f, \n surface area = %.3f, \n volume = %.3f.", this.getClassName(),super.getClassName(), getRadius(),getSurfaceArea(),getVolume());
	}
}
