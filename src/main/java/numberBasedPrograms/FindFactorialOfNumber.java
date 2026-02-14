package numberBasedPrograms;

public class FindFactorialOfNumber {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of "+ num + " is " + factorialRecursive(num));
        System.out.println("Factorial of "+ num + " is " + factorial(num));
    }

    private static int factorial(int num) {
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    private static int factorialRecursive(int num) {
        if(num <= 0 || num == 1 ) return 1;
        else return num * factorialRecursive(num-1);
    }
}
