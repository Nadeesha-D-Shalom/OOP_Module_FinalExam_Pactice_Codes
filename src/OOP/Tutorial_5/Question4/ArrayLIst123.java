package OOP.Tutorial_5.Question4;

import java.util.ArrayList;

public class ArrayLIst123 {
    public static void main(String[] args) {

        ArrayList myList = new ArrayList();

        myList.add("String 1");
        myList.add(123);
        myList.add(12.45);
        myList.add(false);

        System.out.println(myList);
        myList.add(0,"New added string");

        System.out.println(myList);

        myList.remove(0);
        System.out.println(myList);

        myList.removeAll(myList);
        System.out.println(myList);


        ArrayList<String> newArrayList = new ArrayList<String>();

        newArrayList.add("test");
        newArrayList.add("test2");

     //   newArrayList.add(123);

        System.out.println(newArrayList);
        newArrayList.remove(1);
        System.out.println(newArrayList);
        newArrayList.removeAll(newArrayList);
        System.out.println(newArrayList);


    }
}
