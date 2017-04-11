/*
 * Cube class
 * @version 1.0 28 March 2017
 * @author  Songyi CHOI
 */
public class Cube extends ThreeDimensionalShape{
	
	//constant class name
	static final String CLASS_NAME = "Cube";
	
	
	//constructor. Cube is inherited from ThreeDimensionalShape. so use super().
	public Cube(String name, double side){
		super(name, side,0,0);
	}
	
	//Method to get class name
	public String getClassName(){
		return Cube.CLASS_NAME;
	}
	
	//Method to set Side
	public void setSide(double side){
		this.dimension1 = side;		
	} 
	//Method to get Side
	public double getSide(){
		return this.dimension1;
	}
	
	//Method to get volume
	public double getVolume(){
		return Math.pow(getSide(), 3);
	}
	
	//Method to get surface area
	public double getSurfaceArea(){
		return 6*Math.pow(getSide(),2);
	}
	
	//Method to toString
	@Override public String toString() {
		return String.format("myCube is a %s inherited from %s class. \n side = %.1f, \n surface area = %.2f, \n volume = %.3f.", this.getClassName(),super.getClassName(), getSide(),getSurfaceArea(),getVolume());
	}


}
