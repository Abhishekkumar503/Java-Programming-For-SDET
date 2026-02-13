package numberBasedPrograms;

public class DigitsEvenOddCounts {
    public static void main(String[] args) {
        int evenCount = 0;
        int oddCount = 0;
        int number = 1234567891;
        while (number != 0) {
            int digit = number % 10;
            switch((digit % 2) != 0 ? oddCount++ : evenCount++){};
            number/=10;
        }
        System.out.println("Even Count: " + evenCount + "\n"+" Odd Count: " + oddCount);
    }
}
