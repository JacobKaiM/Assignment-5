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
                System.out.println("You have successfully checked out \"" + title + "\".");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Sorry, \"" + title + "\" is either not available or already checked out.");
        }
    }

    public void returnBook(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isCheckedOut()) {
                book.setCheckedOut(false);
                System.out.println("You have successfully returned \"" + title + "\".");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Sorry, \"" + title + "\" cannot be returned as it is either not found or not checked out.");
        }
    }
}