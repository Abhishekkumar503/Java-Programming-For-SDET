package ArraysAndCollections;

import java.util.Arrays;

public class SortsNameInAnArray {
    public static void main(String[] args) {
        String[] names = {"Zara","Sandeep","Udai"};

        System.out.println("Before sorting:");
        Arrays.stream(names).forEach(System.out::println);
        System.out.println();

        System.out.println("After sorting:");
        Arrays.sort(names);
        Arrays.stream(names).forEach(System.out::println);
    }
}

/**
 * O/P
 *Before sorting:
 * Zara
 * Sandeep
 * Udai
 *
 * After sorting:
 * Sandeep
 * Udai
 * Zara
 */