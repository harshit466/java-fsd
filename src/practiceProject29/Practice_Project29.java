package practiceProject29;
import java.util.*;
import java.util.Scanner;

public class Practice_Project29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=5;
        int[] arr = { 2, 3, 4, 10, 40 };
        System.out.println("Elements of the array:");
        for (int i = 0; i < n; i++) {
        	System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("Enter the  element to search: ");
        int target = scanner.nextInt();
        scanner.close();
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
            	result=i;
            }
        }
        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
