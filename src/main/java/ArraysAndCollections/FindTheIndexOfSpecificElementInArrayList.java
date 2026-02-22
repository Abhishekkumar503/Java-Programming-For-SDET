package ArraysAndCollections;

import java.util.ArrayList;

public class FindTheIndexOfSpecificElementInArrayList {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // insert elements
        list.add(1);
        list.add(23);
        list.add(53);
        list.add(65);
        list.add(187);

        // Print the original list
        list.forEach(System.out::println);

        //Define the element which we want to find the index
        int findIndex = 53;

        //Finding the index
        int index = list.indexOf(findIndex);

        if (index != -1)
        System.out.println("Element " + findIndex + " found at index " + index);
        else
        System.out.println("Element " + findIndex + " not found");

    }
}
