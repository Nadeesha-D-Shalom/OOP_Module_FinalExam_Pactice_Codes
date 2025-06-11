package MOCK_Paper.Question1;

public class LibraryBook {
    private String bookID;
    private String title;
    private String author;
    private int copiesAvailable;

    public LibraryBook(){

    }

    public LibraryBook(String bookID, String title, String author, int copiesAvailable) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }


    public void  lendBook(int numberOfCopies){
        if (copiesAvailable <= numberOfCopies)
            System.out.println("Not enough copies available. Please check back later.");

        else {
            System.out.println("Book issued successfully!");
            this.copiesAvailable-= numberOfCopies;
        }
    }

    public void printBookDetails(){
        System.out.println("Book ID is: " + bookID);
        System.out.println("Book Title is: " + title);
        System.out.println("Book Author is: " + author);
        System.out.println("Book Available Copies: " + copiesAvailable);
    }

}
