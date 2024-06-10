import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
    	 Library library = new Library();
          //Roleplaying Books
         library.addBook(new Book("Players Handbook", "Gary Gygax", "RolePlaying"));
         library.addBook(new Book("The Monster Manual","Gary Gygax","Roleplaying"));
         library.addBook(new Book("Dungeon Masters Guide","Gary Gygax","Roleplaying"));
         //Horror Section
         library.addBook(new Book("House of Leaves", "Mark Z. Danielewski", "Horror"));
         library.addBook(new Book("The Shining","Stephen King","Horror"));
         library.addBook(new Book("Dracula","Bram Stoker","Horror"));
         //Manga
         library.addBook(new Book("Haikyuu!", "Haruichi Furuda", "Manga"));
         library.addBook(new Book("Fullmetal Alchemist","Hiromu Arakawa","Manga"));
         library.addBook(new Book("One Piece","Eiichiro Oda","Manga"));
         //Sci-Fi
         library.addBook(new Book("Hyperion","Dan Simmons","Science Fiction"));
         library.addBook(new Book("The Hitchhiker's Guide to the Galaxy","Douglas Adams","Science Fiction"));
         library.addBook(new Book("Neuromancer","William Gibson","Science Fiction"));
         //Classics
         library.addBook(new Book("The Count of Monte Cristo","Alexandre Dumas","Classic"));
         library.addBook(new Book("Moby Dick","Herman Melville","Classic"));
         library.addBook(new Book("Farenheit 451","Ray Bradbury","Classic"));
         //Fantasy
         library.addBook(new Book("The Last Wish","Andrzej Sapkowski", "Fantasy"));
         library.addBook(new Book("The Lord of the Rings","J.R.R. Tolkien", "Fantasy"));
         library.addBook(new Book("Howl's Moving Castle","Diana Wynne Jones", "Fantasy"));


        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        while (choice != 4) {
            System.out.println("\nWelcome to the Library");
            System.out.println("1. Display Available Books");
            System.out.println("2. Checkout a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            if (choice == 1) {
                library.displayAvailableBooks();
            } else if (choice == 2) {
                System.out.print("Enter the title of the book you want to checkout: ");
                String checkoutTitle = scanner.nextLine();
                library.checkoutBook(checkoutTitle);
            } else if (choice == 3) {
                System.out.print("Enter the title of the book you want to return: ");
                String returnTitle = scanner.nextLine();
                library.returnBook(returnTitle);
            } else if (choice != 4) {
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
        System.out.println("Thank you for visiting the library. Goodbye!");
        scanner.close();
    }
}
