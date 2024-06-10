import java.util.ArrayList;

class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (!book.isCheckedOut()) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Genre: " + book.getGenre());
            }
        }
    }

public void checkoutBook(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isCheckedOut()) {
                book.setCheckedOut(true);
                System.out.println("Thank you for checking out \"" + title + "\". Enjoy!");
                found = true;
                break;
            }
            if(book.getTitle().equalsIgnoreCase(title) && book.isCheckedOut()) {
            	System.out.println(title + " is currently checked out.");
            	break;
            }
            else {
            	String excep = "Sorry, \"" + title + "\" is not in this library.";
                throw new IllegalArgumentException(excep);
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
