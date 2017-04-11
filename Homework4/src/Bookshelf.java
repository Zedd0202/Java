/*
 * Bookshelf class
 * @version 1.0 24 March 2017
 * @author  Songyi CHOI
 */
public class Bookshelf {
	public int bookCapacity;
	public int bookHave;
	int cnt;
	public Book[] books;
	int idx;

	//Bookshelf Constructor. Since the number of books can be increased, 
	//we can put as many books as you want in the number of parameters.
	public Bookshelf(Book...arg)
	{
		for(int i=0;i<arg.length;i++)
		{
			books=arg;
			bookHave++;		
		}
	}

	//Function to search By Title. 
	public Book[] searchByTitle(String keyword)
	{
		//If you find a title that contains a keyword, increase the count by 1.
		for(int i=0;i<bookHave;i++)
			if(books[i].title.contains(keyword))
				cnt++;


		//Insert the book object corresponding to the newly created array.
		Book[] searchedBook = new Book[cnt];
		for(int i=0;i<bookHave;i++)
			if(books[i].title.contains(keyword))
				searchedBook[idx++]=books[i];

		//print code
		System.out.println("Found "+cnt+" book(s).");
		return searchedBook;

	}

	//Function to search By Author. 
	public Book[] searchByAuthor(String keyword)
	{

		cnt=0;
		idx=0;
		//call the check method. if check method is returned true, increase the count by 1.
		for(int i=0;i<bookHave;i++)
			if(check(keyword))
				cnt++;

		//Insert the book object corresponding to the newly created array.
		Book[] searchedBook = new Book[cnt];
		for(int i=0;i<bookHave;i++)
			if(check(keyword))
				searchedBook[idx++]=books[i];
		
		//print code
		System.out.println("Found "+cnt+" book(s).");
		
		return searchedBook;
	}
	
	//	//Function to search By Author and Title.
	public Book[] searchByBoth(String keyword)
	{
		cnt=0;
		idx=0;
		//call the check method. if check method is returned true or If you find a title that contains a keyword, 
		//increase the count by 1.
		for(int i=0;i<bookHave;i++)
			if(check(keyword)||books[i].title.contains(keyword))
				cnt++;
		
		//Insert the book object corresponding to the newly created array.
		Book[] searchedBook = new Book[cnt];
		for(int i=0;i<bookHave;i++)
			if(check(keyword)||books[i].title.contains(keyword))
				searchedBook[idx++]=books[i];
		
		//print code
		System.out.println("Found "+cnt+" book(s).");
		return searchedBook;
		
	}

	//check method.
	public boolean check(String str)
	{
		//Authors is array. All arrays must be checked. use Double for statement.
		for(int i=0;i<bookHave;i++)
		{
			for(int j=0;j<books[i].authors.length;j++)
			{
				if(books[i].authors[j].contains(str))
					return true;
			}
		}
		return false;
	}

}

