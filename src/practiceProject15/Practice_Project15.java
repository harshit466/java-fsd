package practiceProject15;
import java.util.*;
import java.util.Scanner;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Practice_Project15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (number < 0) {
                throw new CustomException("Number cannot be negative");
            }
            System.out.println("You entered: " + number);
        } catch (CustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught exception: Invalid input");
        } finally {
            scanner.close();
            System.out.println("Finally block executed");
        }
    }
}
