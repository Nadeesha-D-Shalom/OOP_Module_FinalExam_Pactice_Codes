package Tutorial_5.Question2;

import java.util.Scanner;

public class InventoryProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter the price ");
            double price = scanner.nextDouble();

            if (price < 0)
                throw new NegativePriceException("Price cannot be negative. Please enter a " +
                        "valid amount");

            if (!(price >= 1 && price <= 10000))
                throw new PriceOutOfRangeException("Price out of range. Please enter a " +
                        "value between $1 and $10,000");

            if (!(Double.isFinite(price)))
                System.out.println("This is ");

            System.out.println("Nice price is : " + price);
        }
        catch (NegativePriceException e){
            System.out.println("Error : " + e);
        }
        catch (PriceOutOfRangeException e){
            System.out.println("Error : " + e);
        }
        catch (PriceNotNumericException e){
            System.out.println("Error : " + e);
        }
        catch (Exception e){
            System.out.println("Error : " + e);
        }


    }
}
