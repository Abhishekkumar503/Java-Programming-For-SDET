package BasicAlgorithmsAndControlFlow;

import java.util.Scanner;

public class FindTheLargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int first = sc.nextInt();
        System.out.println("Enter the second number:");
        int second = sc.nextInt();
        System.out.println("Enter the third number:");
        int third = sc.nextInt();

        // using ternary opertor
        int largest = ((first > second) ?
                ((first > third) ? first : third) :
                ((second > third) ? second : third));
        System.out.println("The largest number is " + largest);

        // using Math function
        int largestbyFunction = Math.max(first, Math.max(second, third));
        System.out.println("The largest number is " + largestbyFunction);

        // Using if else ledder
        int largestbyIf;
        if (first > second && first > third) {
            largestbyIf = first;
        } else if (second > third) {
            largestbyIf = second;
        } else {
            largestbyIf = third;
        }
        System.out.println("The largest number is " + largestbyIf);
        sc.close();

    }
}
