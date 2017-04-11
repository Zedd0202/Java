/*
 * Test class
 * @version 1.0 6 April 2017
 * @author  Songyi CHOI
 */


public class Test {
	public static void main(String[] args) {
		
		//create new Item array
		Item item[] = new Item[100];
		
		//create new cart with buyer name
		Cart cart = new Cart("Tamer");

		//use polymorphism concept.
		item[0] = new CD("CD","Alive","Big Bang",2012,40000);
		item[1] = new CD("CD","To Anyone","2NE1",2010,36858);
		item[2] = new Movie("Movie","Lord of the Ring 2",2002,24000);
		item[3] = new Movie("Movie","Jang ok-jung living by love",2013,26200);
		
		
		//add to the cart
		for(int i=0;i<4;i++)
		{
			cart.addItem(item[i]);
		}
		
		
		//print.
		cart.printReceipt();
		
		
	}
}
