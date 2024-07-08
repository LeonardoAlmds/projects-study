import java.util.Scanner;

public class Main {
    static double sum(double x, double y) {
        return x + y;
    }

    static double sub(double x, double y) {
        return x - y;
    }

    static double mul(double x, double y) {
        return x * y;
    }

    static double div(double x, double y) {
        return x / y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number one: ");
        double x = sc.nextDouble();

        System.out.print("Enter the number two: ");
        double y = sc.nextDouble();

        System.out.println("\n--- Result --- \n");

        System.out.println("Sum: " + sum(x, y));
        System.out.println("Sub: " + sub(x, y));
        System.out.println("Mul: " + mul(x, y));
        System.out.println("Div: " + div(x, y));

        System.out.println("\nby: Leonardo Almeida\n");
    }
}