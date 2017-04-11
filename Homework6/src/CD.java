/*
 * CD class
 * @version 1.0 6 April 2017
 * @author  Songyi CHOI
 */

//CD class is inherited from Item.
public class CD extends Item{

	//Variables.
	public String cdTitle; 
	public String cdArtist; 
	public int pubYear;
	
	//constructor
	public CD(String id, String title, String artist, int pubYear, int importPrice){
		super(id,importPrice);
		this.cdTitle = title;
		this.cdArtist = artist;
		this.pubYear = pubYear;
		
	}
	
	
	//Method to get Title
	public String getTitle(){
		
		return this.cdTitle;
	}
	
	//Method to get Artist
	public String getArtist(){
		return this.cdArtist;
	}
	
	//Method to get Publish Year
	public int getPublishYear(){
		return this.pubYear;
	}
	
	
	//Method to get Sale Price
	public int getSalePrice(){
		int val = 2017-getPublishYear();
		if(val <= 1)
			return (int) (1.5*this.importPrice);
		else if(val > 1 && val <=2)
			return (int)(this.importPrice);
		else if(val > 2)
			return (int)(0.7*this.importPrice);
		return 0;
	}
}
