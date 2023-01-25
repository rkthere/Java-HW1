public class Task3 {
    public static void main(String[] args) {
        int a;
        int b;
        String op;

        System.out.println("Please enter two numbers:");
        a = Integer.parseInt(System.console().readLine());
        b = Integer.parseInt(System.console().readLine());
        System.out.println("Please enter an operation (+ - / *):");
        op = System.console().readLine();

        int result = 0;
        if (op.equals("+")) {
            result = a + b;
        } else if (op.equals("-")) {
            result = a - b;
        } else if (op.equals("/")) {
            result = a / b;
        } else if (op.equals("*")) {
            result = a * b;
        } else {
            System.out.println("Invalid operation!");
        }
        System.out.println("Result: " + result);
    }
}