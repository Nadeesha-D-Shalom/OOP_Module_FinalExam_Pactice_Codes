package MOCK_Paper.Question3;

import java.util.Scanner;

public class DemoApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter the username: ");
            String username = scanner.next();

          //  System.out.println(username.length());

            if (username.length() < 6)
                throw new InvalidUserName("The user name cannot be less than 6 characters.");

            System.out.print("Enter the password: ");
            String password = scanner.next();

            if (password.length() < 8){
                throw new InvalidPasswordLength("The password must be more than 8 characters");
            }


            System.out.println("The user name and password is valid...!");


        } catch (InvalidUserName e) {
            System.out.println("Error " + e);

        }
        catch (InvalidPasswordLength e){
            System.out.println("Error " + e);
        } catch (Exception e) {
            System.out.println("Error " + e);
        }


    }
}
