package MOCK_Paper.Question_1;

public class LibraryBook {

    private String bookId;
    private String title;
    private String author;
    private int copiesAvailable;


    public LibraryBook(String bookId, String title, String author, int copiesAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }


    public void lendBook(int requestCopies){
        if (copiesAvailable < requestCopies)
            System.out.println("Not enough copies available. Please check back later.");

        else {
            copiesAvailable -= requestCopies; //  copiesAvailable =  copiesAvailable - requestCopies;
            System.out.println("Book issued successfully!");
        }

    }

    public void printBookDetails(){
        System.out.println("\nBook ID     : " + bookId);
        System.out.println("Book Title  : " + title);
        System.out.println("Book Author  : " + author);
        System.out.println("Copies Available  : " + copiesAvailable);
        System.out.println("-------------------------------------------");
    }

}
