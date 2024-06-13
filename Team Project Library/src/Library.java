import java.util.ArrayList;

class Library {
	private ArrayList<Book> books;

	public Library() {
		this.books = new ArrayList<>(18);
	}

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
		}else if (genre.equalsIgnoreCase("Philosophy"){
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
		for (Book book : books) {
			if (book.getTitle().equalsIgnoreCase(title) && !book.isCheckedOut()) {
				book.setCheckedOut(true);
				System.out.println("Thank you for checking out \"" + title + "\". Enjoy!");
				break;
			} 
			if (book.getTitle().equalsIgnoreCase(title) && book.isCheckedOut()) {
				System.out.println(title + " is currently checked out.");
				break;
			}
		}
	}

	public void returnBook(String title) {
		boolean found = false;
		for (Book book : books) {
			if (book.getTitle().equalsIgnoreCase(title) && book.isCheckedOut()) {
				book.setCheckedOut(false);
				System.out.println("Thank you for returning \"" + title + "\".");
				found = true;
				break;
			}
		}
		if (!found) {
			String excep = "Sorry, \"" + title + "\" cannot be returned.";
			throw new IllegalArgumentException(excep);
		}
	}
}
