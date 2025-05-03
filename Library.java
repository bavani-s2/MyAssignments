package week1.day2;

public class Library {

	
	public String addBook(String bookTitle) {
		System.out.println("Book added succesfully");
		return bookTitle;
		
	}

	public void issuebook()
	
	{
		
		System.out.println("Book issued successfully");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library lib = new Library();// Default Constructor
		System.out.println(lib.addBook("Ananda Vikatan"));
		lib.issuebook();

	}


}
