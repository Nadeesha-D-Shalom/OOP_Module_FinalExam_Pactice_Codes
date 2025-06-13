package Tutorial_5.Question4;

public class Book {
    private String ISBN;
    private String title;

    public Book(String ISBN, String title) {
        this.ISBN = ISBN;
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void displayDetails(){
        System.out.println("\nBook Details:_____________");
        System.out.println("ISBN  is : " + ISBN);
        System.out.println("Title is : " + title);
    }
}
