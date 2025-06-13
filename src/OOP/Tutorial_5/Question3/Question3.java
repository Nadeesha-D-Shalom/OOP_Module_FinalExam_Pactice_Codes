package OOP.Tutorial_5.Question3;

import java.util.ArrayList;
import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList myList = new ArrayList();


        while (true){

            System.out.print("Enter values : ");
            String userInput = scanner.next();

            if (userInput.equals("-99"))
                break;

            myList.add(userInput);
        }

        System.out.print("Enter the index that you need to remove : ");
        int index = scanner.nextInt();

        if (index <= 0 && index > myList.size()-1) {
            System.out.println("Task removed successfully.");
            myList.remove(index);
        }

        else
            System.out.println("Invalid index. No task removed.");


    }
}
