package Ex2;

public class Book implements Printable{

    private String Bookname;
    private String pages;

    public Book(String Bookname, String pages){
        this.Bookname = Bookname;
        this.pages = pages;
    }


    @Override
    public void print() {
        System.out.println("Student name : " + Bookname);
        System.out.println("Student ID : " + pages);
    }
}
