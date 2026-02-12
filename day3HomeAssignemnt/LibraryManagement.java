package week2.day2HomeAssignemnt;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library Book = new Library();
		String addBook = Book.addBook("BookTitle");
		System.out.println(addBook);
		Book.issueBook();
	

	}

}
