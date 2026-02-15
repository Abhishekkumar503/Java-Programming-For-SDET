package BasicAlgorithmsAndControlFlow;

public class CountSumOfDigitsInNumber {
    public static void main(String[] args) {
        int number = 12345678;
        System.out.println("Sum of digits of number : " + sumOfDigits(number));
    }

    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
