package StringHandlingProgramme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintCharactersInDescendingOrderOfFrequency {
    public static void main(String[] args) {
        /**
         *  Question : find count of char in a string
         * 1. Take Input from the user
         * 2. Count the frequency of each character in a String.
         * 3. Sort the character by frequency.
         * 4. Display the character along with the  frequency.
         */

        // take the input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        //Count the frequency of each character
        int[] frequency = new int[256];

        // Array to store frequency of each character (ASCII value)
        //Loop through each character in the input String
        for (int i = 0; i < input.length(); i++) {
            frequency[input.charAt(i)]++;
        }

        //Creating the list of the character and their frequencies to store in order
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                list.add((char)i);
            }
        }

        //Sort characters based on their frequency (use a simple sorting technque)
        // Sort character using bubble sort
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (frequency[list.get(j)] > frequency[list.get(i)]) {
                    char temp = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, temp);
                }
            }
        }
        System.out.println("Characters sorted by frequesncy in descending order: ");
        for (Character character : list) {
            System.out.println(character + " : "+frequency[character]);
        }
    }
}

/**
 * Output
 * Enter a string: Abhishek
 * Characters sorted by frequesncy in descending order:
 * h : 2
 * b : 1
 * e : 1
 * A : 1
 * i : 1
 * k : 1
 * s : 1
 */
