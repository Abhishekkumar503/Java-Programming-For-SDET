package numberBasedPrograms;

import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        int count = countOfDigitis(number);
        System.out.println("The Digits Of  " + number + ": " + count);
    }

    private static int countOfDigitis(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
