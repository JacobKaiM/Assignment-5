import java.util.InputMismatchException;
import java.util.Scanner;

public class LibrarySystem {
	public static void main(String[] args) {
		Library library = new Library();
//All books in libary
		// Roleplaying Books / 1
		library.addBook(new Book("Players Handbook", "Gary Gygax", 1));
		library.addBook(new Book("The Monster Manual", "Gary Gygax", 1));
		library.addBook(new Book("Dungeon Masters Guide", "Gary Gygax", 1));
		// Horror Section / 2
		library.addBook(new Book("House of Leaves", "Mark Z. Danielewski", 2));
		library.addBook(new Book("The Shining", "Stephen King", 2));
		library.addBook(new Book("Dracula", "Bram Stoker", 2));
		// Manga / 3
		library.addBook(new Book("Haikyuu!", "Haruichi Furuda", 3));
		library.addBook(new Book("Fullmetal Alchemist", "Hiromu Arakawa", 3));
		library.addBook(new Book("One Piece", "Eiichiro Oda", 3));
		// Sci-Fi / 4
		library.addBook(new Book("Hyperion", "Dan Simmons", 4));
		library.addBook(new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 4));
		library.addBook(new Book("Neuromancer", "William Gibson", 4));
		// Classics / 5
		library.addBook(new Book("The Count of Monte Cristo", "Alexandre Dumas", 5));
		library.addBook(new Book("Moby Dick", "Herman Melville", 5));
		library.addBook(new Book("Farenheit 451", "Ray Bradbury", 5));
		// Fantasy / 6
		library.addBook(new Book("The Last Wish", "Andrzej Sapkowski", 6));
		library.addBook(new Book("The Lord of the Rings", "J.R.R. Tolkien", 6));
		library.addBook(new Book("Howl's Moving Castle", "Diana Wynne Jones", 6));
		// Philosophy / 7
		library.addBook(new Book("12 Rules for Life", "Jordan Peterson", 7));
		library.addBook(new Book("The 48 Laws of Power", "Robert Green", 7));
		library.addBook(new Book("Read People Like a Book", "Patrick King", 7));
		Scanner scanner = new Scanner(System.in);

		int choice = 0;
		//A try/catch for preventing mismatch input.
		try {
			while (choice != 4) {
				System.out.println("\nWelcome to the Library");
				System.out.println("1. Display Available Genres");
				System.out.println("2. Checkout a Book");
				System.out.println("3. Return a Book");
				System.out.println("4. Exit");
				System.out.print("Enter your choice: ");

				choice = scanner.nextInt();
				scanner.nextLine(); // Consume newline character

				if (choice == 1) {
					System.out.println("Available Genres: Classics, Fantasy, Manga, Roleplaying, Science Fiction, Philosophy");
					System.out.print("Enter the genre you want to view:");
					String genre = scanner.nextLine();
					library.displayGenres(genre);
				} else if (choice == 2) {
					System.out.print("Enter the title of the book you want to checkout: ");
					String checkoutTitle = scanner.nextLine();
					library.checkoutBook(checkoutTitle);
				} else if (choice == 3) {
					System.out.print("Enter the title of the book you want to return: ");
					String returnTitle = scanner.nextLine();
					library.returnBook(returnTitle);
				} else if (choice == 4) {
					System.out.println("Thank you for visiting the library. Goodbye!");
					scanner.close();
				} else if (choice != 4) {
					System.out.println("Invalid choice. Please enter a number between 1 and 4.");
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Input is not valid.");
		}
	}
}
