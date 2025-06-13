package OOP.ExeptionHandle;

import java.util.Scanner;

public class Exercise01 {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);



        try {
            System.out.print("Enter number 1 ");
            int num1 = scanner.nextInt();

            System.out.print("Enter number 2 ");
            int num2 = scanner.nextInt();

            int tot = num1 / num2;

            System.out.println(tot);

        }
        catch (ArithmeticException e) {
            System.out.println("You are try to do wrong mathematical thing : " + e);
        }

        catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
