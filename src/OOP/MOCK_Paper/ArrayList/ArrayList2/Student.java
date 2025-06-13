package OOP.MOCK_Paper.ArrayList.ArrayList2;

import java.util.ArrayList;

public class Student {

    public static void main(String[] args) {



        ArrayList testArrayList = new ArrayList();    // none generic


        testArrayList.add("String1"); // 0
        testArrayList.add("String1"); // 1

        testArrayList.add('S'); // 2

        testArrayList.add(234);
        testArrayList.add(false);

        testArrayList.add(2,"New added String");


        System.out.println(testArrayList);

        testArrayList.set(5,true);

        System.out.println("With  New added one  " + testArrayList);

        testArrayList.remove(2);
        System.out.println(testArrayList);

        testArrayList.removeAll(testArrayList);
        System.out.println(testArrayList);


        System.out.println("==================Generic ArrayList ==========================");

        ArrayList<String> myString = new ArrayList<String>();

        myString.add("String1");
        myString.add("String2");
        myString.add("String3");

        myString.add("String4");




        System.out.println("\n\n===================== for each loop ================");

        for (Object obj : myString)
            System.out.println(obj);


        System.out.println("===================== for each loop ================\n\n\n");

        System.out.println(myString);

        myString.remove(2);
        System.out.println(myString);


        myString.removeAll(myString);
        System.out.println(myString);

    }
}


