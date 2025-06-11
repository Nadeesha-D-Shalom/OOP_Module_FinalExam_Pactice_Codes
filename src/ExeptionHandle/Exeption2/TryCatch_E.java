package ExeptionHandle.Exeption2;

import java.util.Scanner;

public class TryCatch_E  {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


         String name = "Samindi";
         String password = "1234";


         int num1 = 0;
         int num2 = 0;

        int result = 0;


        System.out.println("Name        : " + name);
        System.out.println("Password    : " + password);


        try{

                System.out.print("Enter number 1 : ");
                num1 = sc.nextInt();

                System.out.print("Enter number 2 : ");
                num2 = sc.nextInt();



            result = num1/num2;
            System.out.println("Result is : " + result);



        }

        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Error  ");
        }

//        catch ( e){
//            System.out.println("Oops! Array out of boundary");
//        }

        catch (Exception e){
            System.out.println("Oops Some error - " + e);
        }

        finally {
            System.out.println("This this finally blog");

            int a = 9;
            int b = 10;

            int tot = a + b;

            System.out.println("Total " + tot);
        }

        System.out.println("=================   After the Error Handle ==============");

    }
}


