public class Task2 {
    public static void main(String[] args) {
        // loop from 1 to 1000
        for (int i = 1; i <= 100; i++) {
            // check if the number is prime
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    // function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}