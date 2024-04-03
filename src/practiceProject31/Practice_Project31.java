package practiceProject31;
import java.util.*;
import java.util.Scanner;

public class Practice_Project31 {
    public static int exponentialSearch(int[] arr, int target) {
        if (arr[0] == target) {
            return 0; 
        }
        int i = 1;
        while (i < arr.length && arr[i] <= target) {
            i *= 2; 
        }
        return binarySearch(arr, target, i / 2, Math.min(i, arr.length - 1));
    }

    public static int binarySearch(int[] arr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid; 
            }
            if (arr[mid] < target) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=5;
        int[] arr = { 2, 3, 4, 10, 40 };
        System.out.println("Elements of the array:");
        for (int i = 0; i < n; i++) {
        	System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.print("Enter the  element to search: ");
        int target = scanner.nextInt();
        scanner.close();
        int result = exponentialSearch(arr, target);
        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
