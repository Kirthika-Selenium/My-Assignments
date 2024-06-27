package homeAssignment.week1;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library Book1 = new Library(); //call methods using the object//
		Book1.addBook(null);
		Book1.issueBook();

	}
	//The method addBook//
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return(bookTitle);
	}
	//The method issueBook//
	public void issueBook() {
		System.out.println("Book issued successfully");

	}
	}

