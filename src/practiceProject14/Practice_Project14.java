package practiceProject14;
import java.util.*;
import java.util.Scanner;

public class Practice_Project14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        try {
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (Exception e) {
            System.out.println("Exception caught: Invalid input");
        } finally {
            scanner.close();
        }
    }
}
