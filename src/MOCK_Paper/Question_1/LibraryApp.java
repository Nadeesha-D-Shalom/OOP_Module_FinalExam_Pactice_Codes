package MOCK_Paper.Question_1;

import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input details for first book
        System.out.println("Enter details for Book 1:");
        System.out.print("Book ID: ");
        String bookId1 = scanner.nextLine();
        System.out.print("Title: ");
        String title1 = scanner.nextLine();
        System.out.print("Author: ");
        String author1 = scanner.nextLine();
        System.out.print("Copies Available: ");
        int copies1 = scanner.nextInt();
        scanner.nextLine(); // clear newline

        LibraryBook book1 = new LibraryBook(bookId1,title1,author1,copies1);


        // Input details for second book
        System.out.println("\nEnter details for Book 2:");
        System.out.print("Book ID: ");
        String bookId2 = scanner.nextLine();
        System.out.print("Title: ");
        String title2 = scanner.nextLine();
        System.out.print("Author: ");
        String author2 = scanner.nextLine();
        System.out.print("Copies Available: ");
        int copies2 = scanner.nextInt();
        scanner.nextLine(); // clear newline

        LibraryBook book2 = new LibraryBook(bookId2,title2,author2,copies2);

        System.out.println("==========");
        System.out.print("Enter number of copies that you want from book 1: ");
        int borrowBooks1 = scanner.nextInt();
        book1.lendBook(borrowBooks1);

        System.out.println("==========");
        System.out.print("Enter number of copies that you want from book 2: ");
        int borrowBooks2 = scanner.nextInt();
        book2.lendBook(borrowBooks2);

        System.out.println("===============================================");
        System.out.println("Final Books Details : ");
        book1.printBookDetails();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        book2.printBookDetails();

    }
}
