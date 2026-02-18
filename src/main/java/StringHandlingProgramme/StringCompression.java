package StringHandlingProgramme;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        /**
         * String Compression :
         * aaabbbccd = a3b3c2d1
         * thats called SC
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        System.out.println("The compressed string of "+str+" is : "+compressed(str));
    }

    private static String compressed(String str) {

        if(str.isEmpty())
        {
            return str;
        }

        // Use String Builder
        StringBuilder sb = new StringBuilder();

        int count = 1;
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }
            else{
                sb.append(str.charAt(i-1));
                sb.append(count); // appending count after each char
                count = 1; // reset Count
            }
        }
        // Append the last char and count
        sb.append(str.charAt(str.length()-1));
        sb.append(count);
        return sb.toString();
    }
}
