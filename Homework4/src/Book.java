/*
 * Book class
 * @version 1.0 24 March 2017
 * @author  Songyi CHOI
 */
public class Book {
	
	//variables
	public String title;
	public String[] authors;
	public int page;
	public int pubYear;
	
	//constructor. initialize variables.
	public Book(String title, String[] authors, int page, int year)
	{
		this.title = title;
		this.page = page;
		this.pubYear = year;
		this.authors = authors;
		
	}
	

	//Function to get title
	public String getTitle() {
		return title;
	}

	//Function to set title
	public void setTitle(String title) {
		this.title = title;
	}

	//Function to get authors
	public String[] getAuthors() {

		return authors;
	}

	//Function to set Authors
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}

	//Function to get page
	public int getPage() {
		return page;
	}

	//Function to set page
	public void setPage(int page) {
		this.page = page;
	}

	//Function to get pubYear
	public int getPubYear() {
		return pubYear;
	}

	//Function to set pubYear
	public void setPubYear(int pubYear) {
		this.pubYear = pubYear;
	}
	
	//Function to toString.
	public String toString()
	{
		//print code. authors is array. So This should be handled with a for statement.
		String ret =  " . "+title + " - ";
	      for(int i=0;i<authors.length;i++){
	         ret += authors[i];
	         if(i != authors.length-1)
	            ret += ", ";
	      }
	      ret += " - " + page + "pages, " + pubYear + ".";
	      
	      return ret;		
	}

}
