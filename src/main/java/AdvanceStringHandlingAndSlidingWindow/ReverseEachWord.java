package AdvanceStringHandlingAndSlidingWindow;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(new StringBuilder(word).reverse()).append(" ");
        }
        System.out.println(sb.toString());
    }
}

/**
 * Output
 * java is awesome
 * avaj si emosewa 
 */
