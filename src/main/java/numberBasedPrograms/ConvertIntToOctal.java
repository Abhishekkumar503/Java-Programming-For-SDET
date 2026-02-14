package numberBasedPrograms;

import java.util.Scanner;

public class ConvertIntToOctal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = input.nextInt();
        System.out.println("Octal number: " + Integer.toOctalString(num));

        System.out.println("Octal number: " + octalValue(num));
    }

    private static int octalValue(int num) {
        int sum = 0, i = 1;
        while (num != 0) {
            sum += i * (num % 8);
            i *= 10;
            num /= 8;
        }
        return sum;
    }
}
