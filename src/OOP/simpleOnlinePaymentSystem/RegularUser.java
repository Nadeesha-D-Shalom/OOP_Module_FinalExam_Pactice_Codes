package OOP.simpleOnlinePaymentSystem;

public class RegularUser extends User {

    public RegularUser(String name, double balance){
        super(name,balance);
    }

    @Override
    public void makePayment(double amount) {
        amount = amount - (amount * 2 /100);
        System.out.println("Generic payment made : " + amount);
    }
}
