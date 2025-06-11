package MOCK_Paper.Question1;

public class LibraryApp {

    public static void main(String[] args) {

        LibraryBook book1 = new LibraryBook("BK10012","Harry Potter","J K Rowlings",5);
        LibraryBook book2 = new LibraryBook("BK10055","Madolduwa","Marting Wikramasingha",25);

        book1.lendBook(2);  // request books 1
        book2.lendBook(2); // request book 2
        book1.lendBook(4);

        System.out.println();
        book1.printBookDetails();

        System.out.println();
        book2.printBookDetails();


    }
}
