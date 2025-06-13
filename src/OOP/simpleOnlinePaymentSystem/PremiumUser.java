package OOP.simpleOnlinePaymentSystem;

public class PremiumUser extends User {

    public PremiumUser(String name, double balance){
        super(name,balance);
    }

    @Override
    public void makePayment(double amount) {
        super.makePayment(amount);
    }
}
