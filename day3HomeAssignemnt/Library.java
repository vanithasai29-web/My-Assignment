package week2.day2HomeAssignemnt;

public class Library {
	
	//Create a method outside the main	
	public String addBook(String name) {
		System.out.println("Book added successfully");
		return name;
	}
	
	public void issueBook() {
		System.out.println("Book issued successfully");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library Book = new Library();
		String addBook = Book.addBook("BookTitle");
		System.out.println(addBook);
		Book.issueBook();
	}

}
