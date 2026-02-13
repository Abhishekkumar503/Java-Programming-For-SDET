package numberBasedPrograms;

import java.util.Scanner;

public class ProgrammeToSwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two Numbers : ");
        int first = sc.nextInt();
        int second = sc.nextInt();
        swapUsingAdditionSubtraction(first, second);

    }
    public static void swapUsingAdditionSubtraction(int a, int b) {
        // Using thrid variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping a = " + a + " and b = " + b);

//        swap in same line
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping a = " + a + " and b = " + b);
    }
}
