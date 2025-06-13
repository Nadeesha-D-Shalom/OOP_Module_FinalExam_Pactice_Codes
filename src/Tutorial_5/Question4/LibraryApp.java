package Tutorial_5.Question4;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        ArrayList<Book> inventory = new ArrayList<Book>();

        while (true){

            System.out.println("Enter ISBN : ");
            String isbnNo = scanner.next();

            if (isbnNo.equals("-99"))
                break;

            System.out.println("Enter title : ");
            String title = scanner.next();


            Book book = new Book(isbnNo,title);
            inventory.add(book);


        }

        System.out.print("Enter remove ISBM number ro remove: ");
        String index = scanner.next();

        boolean isRemoved = false;

        for (int i = 0; i < inventory.size(); i++){
            if (inventory.get(i).getISBN().equals(index)){
                isRemoved = true;
                inventory.remove(i);
                System.out.println("Book removed successfully");
                break;
            }
        }

        if (!isRemoved)
            System.out.println("ISBN not found. No book removed");


        // display data

        for (Book book : inventory)
            book.displayDetails();

    }
}
