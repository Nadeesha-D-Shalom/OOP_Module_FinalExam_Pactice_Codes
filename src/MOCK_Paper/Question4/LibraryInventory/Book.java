package MOCK_Paper.Question4.LibraryInventory;

public class Book {

    private String isbn;
    private String title;



    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }


    public String getIsbn() {
        return isbn;
    }



    public void displayDetails(){
        System.out.println("Book Details ----- ");
        System.out.println("Book ISBN   : " + isbn);
        System.out.println("Book Title  : " + title);

    }
}
