package Library;

public class Book extends Items {
	
	//Variables 
	String Author;
	String Genre;
	
	//Constructor
	public Book (String Name,int ID, String Author, String Genre ) {
		super(Name, ID); 
		this.Author = Author;
		this.Genre = Genre;
		
	}
	
	

}
