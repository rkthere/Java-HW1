import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        // Examples using n = 4
        System.out.println("enter n: ");
        int n = new Scanner(System.in).nextInt();

        // Calculate the nth triangular number
        int triangularNumber = 0;
        for (int i = 1; i <= n; i++) {
            triangularNumber += i;
        }
        System.out.println("The 4th triangular number is " + triangularNumber);

        // Calculate n!
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("The factorial of 4 is " + factorial);
    }
}