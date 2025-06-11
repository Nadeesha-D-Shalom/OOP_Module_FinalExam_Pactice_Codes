package MOCK_Paper.Question4.LibraryInventory;

public class Book {

    private String isbn;
    private String title;

    Book(){

    }

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void displayDetails(){
        System.out.println("Book Details ----- ");
        System.out.println("Book ISBN   : " + isbn);
        System.out.println("Book Title  : " + title);

    }
}
