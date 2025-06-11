package MOCK_Paper.Question1;

public class AyyarTEst {

    public static void main(String[] args) {
        int arr[] = {1,23,5,754,3};


        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Max value is " + max);

    }
}
