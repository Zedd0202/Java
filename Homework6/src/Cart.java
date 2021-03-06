/*
 * Cart class
 * @version 1.0 6 April 2017
 * @author  Songyi CHOI
 */

public class Cart {

	//public variables
	public final int MAX_ITEM =100;
	public Item items[] =  new Item[MAX_ITEM];
	public int itemNum;
	public String buyerName;
	
	//constuctor
	public Cart(String buyerName){
		
		this.buyerName = buyerName;
	}
	
	//Method to Get Number of Item
	public int getNumberOfItems(){
		
		return items.length;
		
	}
	
	//Method to add item. if item's number is greater than MAX_ITEM, return false. else, return true.
	public boolean addItem(Item i){
		
		if(MAX_ITEM<itemNum)
			return false;
		else{
			
			items[itemNum]=i;
			itemNum++;
			return true;
		}
	}
	
	//Method to print Receipt
	public void printReceipt (){
		
		
		int sum=0;
		System.out.println("Receipt:");
		System.out.println("Buyer : "+this.buyerName);
		System.out.println("------------------------------------------");
		for(int i=0;i<itemNum;i++)
		{
			//if itemID is "CD"
			if(items[i].itemID=="CD"){
			System.out.format("%d. %s - %s %,20d W\n",i+1,((CD)items[i]).getTitle(),((CD)items[i]).getArtist(),items[i].getSalePrice());
			}
			
			//if itemID is "Movie"
			else if(items[i].itemID=="Movie"){
				
				if(i==2){
					System.out.format("%d. %s  %,17d W\n",i+1,((Movie)items[i]).getTitle(),items[i].getSalePrice());

				}
				else{
				System.out.format("%d. %s  %,8d W\n",i+1,((Movie)items[i]).getTitle(),items[i].getSalePrice());
				}
			}
			//calculate total price
			sum+=items[i].getSalePrice();

		}
		System.out.println("------------------------------------------");

		System.out.format("%s : %,32d W ", "Total", sum);
		
		

	}
	
}
