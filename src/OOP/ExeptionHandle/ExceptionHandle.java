package OOP.ExeptionHandle;


import java.util.Scanner;

public class ExceptionHandle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int num1 = 10;
        int num2 = 0;
        int result = 0;

        int arr[] = {1,2,3,4};


        try{

            try {
                System.out.print("Enter Number 1: ");
                num1 = scanner.nextInt();

                System.out.print("Enter Number 2: ");
                num2 = scanner.nextInt();
            }
            catch (Exception e) {
                System.out.println("Invalid input " + e);
            }

            result = num1 / num2;


        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException  e){
            System.out.println("Canot devide by zero " + e);
        }
        catch (Exception e) {
            System.out.println("EEEEEEEEEEEEEEEError " + e);
        }


        System.out.println("\nResult is --- " + result);
        System.out.println("This is after result");

    }
}

