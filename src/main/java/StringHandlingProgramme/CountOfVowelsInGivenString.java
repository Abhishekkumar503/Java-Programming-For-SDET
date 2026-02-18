package StringHandlingProgramme;

import java.util.Scanner;

public class CountOfVowelsInGivenString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        int vowelsCount = vowelCount(str);
        System.out.println("The vowels count in "+ str + " is " + vowelsCount);
    }

    private static int vowelCount(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
            || str.charAt(i) == 'i' || str.charAt(i) == 'o'
            || str.charAt(i) == 'u')
                count++;
        }
        return count;
    }
}
