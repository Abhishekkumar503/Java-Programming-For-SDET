package numberBasedPrograms;

public class ReverseInteger {
    public static void main(String[] args) {
        int num =123456789;
        System.out.println("Reverse of " + num +" is " + reverseNum(num) );
    }
    private static int reverseNum(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
}

/**
 * Reverse of 123456789 is 987654321
 */
