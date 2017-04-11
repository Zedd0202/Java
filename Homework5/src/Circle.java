/*
 * Circle class
 * @version 1.0 28 March 2017
 * @author  Songyi CHOI
 */

public class Circle extends TwoDimensionalShape {
	
	static final String CLASS_NAME = "Circle";
	//super는 메인에서 못씀. child의 부분에서 쓸 수 있다. 오버라이딩한거 쓰고싶지않고 부모꺼 쓰는 방법은없음. 트릭이 있긴함 자식 메소드에서 super로 부르는 방법있긴
	
	String name;
	
	//constructor.
	public Circle(String name, double r) {
		super(name, r, r,0);
	}
	
	//Method to get class name
	public String getClassName(){
		
		return Circle.CLASS_NAME;
	}
	
	//Method to set Radius
	public void setRadius(double radius){
		this.dimension1 = radius;
	}
	
	//Method to get Radius
	public double getRadius(){
		return this.dimension1;
	}
	
	//Method to set Diameter
	public void setDiameter(double dimeter){
		this.dimension2 =  2*dimeter;
		
	}
	
	//Method to get diameter
	public double getDiameter(){
	return this.dimension2;
		
	}
	
	//Method to get area
	public double getArea(){
		return Math.PI*this.dimension1*this.dimension2;
	}
	
	//Method to toString
	@Override 
	public String toString() {
		return String.format("%s is a [%s], and is a [%s] \n CirObject1's area is %.2f, radius is %.2f, diameter is %.2f",super.getName(), getClassName(), super.getClassName(), getArea(),getRadius(),getDiameter());
	
		}

	
	
}
