/*
 * Test class
 * @version 1.0 28 March 2017
 * @author  Songyi CHOI
 */
public class Test {
	public static void main(String[] args)
	{
		//create objects
		Cube cube1 = new Cube("CubeObject1", 0.4);
		Sphere sp1 = new Sphere("SphereObject1", 0.3);
		Cone cone1 = new Cone("ConeObject1",0.7,1.2 );
		RectangularPrism rp1 = new RectangularPrism("RectangularPrismObject1", 0.7,0.8,0.9);
		Cylinder cy1 = new Cylinder("CylinderObject1",0.7,1.2);

		//print 
		System.out.println("five shapes have been created: ");
		System.out.println("1."+ cube1.toString());
		System.out.println();
		System.out.println("2."+ sp1.toString());
		System.out.println();

		System.out.println("3."+ cone1.toString());
		System.out.println();

		System.out.println("4."+ cy1.toString());
		System.out.println();

		System.out.println("5."+ rp1.toString());


	}
}
