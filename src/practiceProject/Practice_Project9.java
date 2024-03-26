package practiceProject;
import  java.util.*;

public class Practice_Project9 {
    public static void main(String[] args) {

    	System.out.println("Implementations of Arrays :");
        // Creating an array of integers
        int[] intArray = new int[5];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (i+1) * 2;
        }
        System.out.print("Elements of intArray: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        // Creating an array of strings
        String[] stringArray = { "Harshit", "Anshul", "Kunal"};
        System.out.print("Elements of stringArray: ");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i] + " ");
        }
        System.out.println();

        // Multi-dimensional array
        int[][] multiArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("Elements of multiArray:");
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
