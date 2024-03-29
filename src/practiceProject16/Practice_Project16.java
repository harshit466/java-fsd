package practiceProject16;
import java.util.*;
import java.util.Scanner;

public class Practice_Project16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            int result = divide(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Finally block executed");
        }
    }

    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
