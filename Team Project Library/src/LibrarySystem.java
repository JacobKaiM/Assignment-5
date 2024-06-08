import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
    	 Library library = new Library();
         library.addBook(new Book("Player's HandBook", "Gary Gygax", "Fantasy"));
         library.addBook(new Book("House of Leaves", "Mark Z. Danielewski", "Horror"));
         library.addBook(new Book("Haikyuu!", "Haruichi Furuda", "Manga"));


        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        while (choice != 4) {
            System.out.println("\nWelcome to the Library Management System");
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
        System.out.println("Thank you for using the Library Management System. Goodbye!");
    }
}