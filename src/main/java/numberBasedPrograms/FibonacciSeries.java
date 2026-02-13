package numberBasedPrograms;

public class FibonacciSeries {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int num = 10;
        int thrid = 0;
        System.out.print("Fibonacci Series : "+ first + "," + second );
        for (int i = 2; i < num; i++) {

            thrid = first + second;
            System.out.print("," + thrid );
            first = second;
            second = thrid;

        }


    }
}
