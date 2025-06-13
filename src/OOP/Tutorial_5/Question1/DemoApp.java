package OOP.Tutorial_5.Question1;


import java.util.Scanner;

public class DemoApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        try {
            System.out.print("Enter username : ");
            String username = scanner.next();

            if (username.length() < 6)
                throw new InvalidUserName("Username must be at least 6 characters long");

            System.out.print("Enter password : ");
            String password = scanner.next();

            if (password.length() < 8)
                throw new InvalidPasswordLength("Password must be at least 8 characters long");

            System.out.println("Username and password valid");
        }
        catch (InvalidUserName e){
            System.out.println("Error : " + e);
        }
        catch (InvalidPasswordLength e){
            System.out.println("Error : " + e);
        }
        catch (Exception e){
            System.out.println("Error : " + e);
        }
    }
}
