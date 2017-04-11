/*
 * Movie class
 * @version 1.0 6 April 2017
 * @author  Songyi CHOI
 */


public class Movie extends Item {

	
	//variables
	public String cdTitle; 
	public int pubYear;
	
	//constuctor
	Movie(String id, String title, int pubYear, int importPrice){
		super(id,importPrice);
		this.cdTitle = title;
		this.pubYear = pubYear;
		
	}
	
	
	//Method to get Title
	public String getTitle(){
		return this.cdTitle;
	}
	
	//Method to get Publish year
	public int getPublishYear(){
		return this.pubYear;
	}
	
	//Method to get sale price
	public int getSalePrice(){
		int val =  2017-this.getPublishYear();
		if (val<=1)
			return (int)(2.0*this.importPrice);
		else if(val>1)
			return (int)(0.5*this.importPrice);
		return 0;

	}
}