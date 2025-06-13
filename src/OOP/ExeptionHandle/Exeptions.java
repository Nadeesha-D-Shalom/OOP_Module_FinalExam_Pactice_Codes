package OOP.ExeptionHandle;

public class Exeptions {



    public static void main(String[] args) {

        int arr[] = new int[5];

        int a = 20;

        arr[0] = 1;
        arr[2] = 6;

        try{
           for (int i = 0; i <= 6; i++)
               System.out.println(arr[i]);



        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Sorry cannot display there is an error :-  " + e);
        }
    }
}
