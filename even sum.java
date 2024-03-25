public class Main {
    public static void main(String[] args) {
        int evenSum = 0;
        for (int i = 2; i <= 100; i += 2) {
            evenSum += i;
        }
        System.out.println("Sum of even numbers between 2 and 100: " + evenSum);

        int squareSum = 0;
        for (int i = 1; i <= 100; i++) {
            squareSum += i * i;
        }
        System.out.println("Sum of squares between 1 and 100: " + squareSum);
    }
}
