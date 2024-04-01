package practiceProject20;
import java.util.*;
import java.util.Scanner;

public class Practice_Project20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of steps to right rotate: ");
        int steps = scanner.nextInt();

        System.out.println("\nInitial Array:");
        printArray(array);

        rightRotate(array, steps);

        System.out.println("\nArray after right rotation by " + steps + " steps:");
        printArray(array);

        scanner.close();
    }

    public static void rightRotate(int[] array, int steps) {
        int length = array.length;
        steps %= length;
        reverseArray(array, 0, length - 1);
        reverseArray(array, 0, steps - 1);
        reverseArray(array, steps, length - 1);
    }

    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
