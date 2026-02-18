package StringHandlingProgramme;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicateWordsInGivenString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        System.out.println("Duplicate words: ");
        duplicateWords(str);
    }

    private static void duplicateWords(String str) {
        str = str.toLowerCase();

        // Use Regular expression to split the string into words
        String[] arr = str.split("[\\W_]+");

        // Create a HashMap to store the count of each word
        Map<String, Integer> map = new HashMap<>();

        // Loop through the array
        for (String word : arr) {
            if (!word.isEmpty()) {
                map.put(word, map.getOrDefault(word,0) + 1);
            }
        }

        // This will print only duplicate word
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
