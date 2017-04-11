/*
 * Item class
 * @version 1.0 6 April 2017
 * @author  Songyi CHOI
 */

//Item class 
public class Item implements ForSale {
	
	
	//variables
	public String itemID; 
	public int importPrice;
	
	//constructor
	public Item(String id, int price){
		this.itemID = id;
		this.importPrice =price;
		
	}
	
	@Override
	public int getSalePrice() {
		return 0;
	}
	
	
}
