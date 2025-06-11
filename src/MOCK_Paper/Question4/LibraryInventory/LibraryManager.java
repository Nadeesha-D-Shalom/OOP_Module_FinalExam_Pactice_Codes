package MOCK_Paper.Question4.LibraryInventory;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> bookArrayList = new ArrayList<>();


        String bookISBN;
        String bookTitle;


        while (true){
            System.out.print("Enter the Book ISBN   : ");
            bookISBN = scanner.next();

            if (bookISBN.equals("-99"))
                break;



            System.out.print("Enter the Book Title   : ");
            bookTitle = scanner.next();

            bookArrayList.add(new Book(bookISBN,bookTitle));

            System.out.println("\nEnter -99 to ISBN to tnd the program..!\n");
        }

        ///  to remove

        System.out.print("\nEnter the ISBN to remove book : ");
        String isbn2Remove = scanner.next();

        boolean removedItem = false;

        for (int i = 0; i <bookArrayList.size(); i++){
            if (bookArrayList.get(i).getIsbn().equals(isbn2Remove)){
                System.out.println("\nBook removed Success ! : " + bookArrayList.get(i).getIsbn());
                bookArrayList.remove(i);
                removedItem = true;
                break;

            }
            System.out.println("Book ISBN is not found ! ");

        }


//        for (Book book : bookArrayList)
//            System.out.println(book.displayDetails());





    }
}
