/*
 *TestBook class
 * @version 1.0 24 March 2017
 * @author  Songyi CHOI
 */
import java.util.Scanner;

public class TestBook{
	public static void main(String[] args)
	{

		//Create new book.(three)
		Book book= new Book("Harry Potter And The Sorcerer's Stone",new String[] { "J.K.Rowling" },428,1998);
		Book book2 =  new Book("Harry Potter And The Goblet Of Fire",new String[] { "J.K.Rowling", "Mary GrandePre" },752,2002);
		Book book3 =  new Book("The Casual Vacancy",new String[] { "J.K.Rowling" },513,2012);

		//Create Bookshelf type variable. and Created books pass by parameter.
		Bookshelf bookshelf =  new Bookshelf(book, book2,book3);

		//Create input variable.
		Scanner input = new Scanner(System.in);

		
		while(true){
			
			//user's input print code
			System.out.println("Choose 1 option to search \n 1. Search by title \n 2. Search by author\n 3. Search by both");
			System.out.print("User input: ");

			//choose 1,2,3.
			int in = input.nextInt();
			
			//if choose 1,
			if(in==1)
			{
				//Create new Book type array.
				Book[] seached = new Book[3];
				System.out.print("Insert title keyword: ");
				
				//input keyword.
				String str = input.next();
				
				//call searchByTitle method with keyword.
				seached = bookshelf.searchByTitle(str);
				for(int i=0; i<seached.length; i++){
					if(seached[i] != null){
						
						//call toString method 
						System.out.println(seached[i]);
					}
				}


			}
			
			//if choose 2,
			if(in==2)
			{
				//Create new Book type array.
				Book[] seached = new Book[3];
				
				//input keyword.
				System.out.print("Insert author keyword: ");
				String str = input.next();
				
				//call searchByAuthor method with keyword.
				seached = bookshelf.searchByAuthor(str);
				for(int i=0; i<seached.length; i++){
					if(seached[i] != null){
						
						//call toString method 
						System.out.println(seached[i]);
					}
				}


			}
			
			//if choose 3,
			if(in==3)
			{
				//Create new Book type array.
				Book[] seached = new Book[3];
				System.out.print("Insert author keyword: ");
				
				//input keyword.
				String str = input.next();
				
				//call searchByBoth method with keyword.
				seached = bookshelf.searchByBoth(str);
				for(int i=0; i<seached.length; i++){
					if(seached[i] != null){
						
						//call toString method 
						System.out.println(seached[i]);
					}
				}
			}
			System.out.println("-----------------------------");
		}

	}

}