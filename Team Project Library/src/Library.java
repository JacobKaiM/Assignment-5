import java.util.ArrayList;
/*
 * Library class represents the library itself 
 * used to keep track of A books genre and availability 
 * also when a book is checked out and returned.
 */
class Library {
	private ArrayList<Book> books;

	// initialize library ArrayList
	public Library() {
		this.books = new ArrayList<>(18);
	}
	
	// adds book to the list 
	public void addBook(Book book) {
			books.add(book);
	}
//This allows for the user to pick the genre of book they want to look at so it doesn't just throw 18 book entries at them.
	public void displayGenres(String genre) {
		if (genre.equalsIgnoreCase("Roleplaying")) {
			displayAvailableBooks(1);
		} else if (genre.equalsIgnoreCase("Horror")) {
			displayAvailableBooks(2);
		} else if (genre.equalsIgnoreCase("Manga")) {
			displayAvailableBooks(3);
		} else if (genre.equalsIgnoreCase("Science Fiction")) {
			displayAvailableBooks(4);
		} else if (genre.equalsIgnoreCase("Classics")) {
			displayAvailableBooks(5);
		} else if (genre.equalsIgnoreCase("Fantasy")) {
			displayAvailableBooks(6);
		}else if (genre.equalsIgnoreCase("Philosophy")) {
			displayAvailableBooks(7);
		}
	}
//This display the books based off what choice was made in the genre selector.
	public void displayAvailableBooks(int choice) {
		System.out.println("Available Books:");
		for (Book book : books) {
			if (!book.isCheckedOut() && book.getGenre() == choice) {
				System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
			}
		}
	}
	
	
	public void checkoutBook(String title) {
		// loop through books in list
		for (Book book : books) {
			// if title matches and is not checked out 
			// set Checked out to true 
			if (book.getTitle().equalsIgnoreCase(title) && !book.isCheckedOut()) {
				book.setCheckedOut(true);
				System.out.println("Thank you for checking out \"" + title + "\". Enjoy!");
				break;
			} 
			// if title matched but is already checked out tell user they cant check it out
			if (book.getTitle().equalsIgnoreCase(title) && book.isCheckedOut()) {
				System.out.println(title + " is currently checked out.");
				break;
			}
		}
	}

	public void returnBook(String title) {
		// if book is not found
		boolean found = false;
		// loop through books in list 
		for (Book book : books) {
			// if book title and is checked out reset checked out to false 
			// change found to true 
			if (book.getTitle().equalsIgnoreCase(title) && book.isCheckedOut()) {
				book.setCheckedOut(false);
				System.out.println("Thank you for returning \"" + title + "\".");
				found = true;
				break;
			}
		}
		
		// if not found error message
		if (!found) {
			String excep = "Sorry, \"" + title + "\" cannot be returned.";
			throw new IllegalArgumentException(excep);
		}
	}
}
