package practiceProject;
import java.util.*;

public class Practice_Project1 {
	    public static void main(String[] args) {
	    	
	        // Implicit Type Casting
	        int numInt = 100;
	        double numDouble = numInt; 
	        System.out.println("Implicit Type Casting - int to double: " + numDouble);

	        // Explicit Type Casting
	        double doubleNum1 = 123.45;
	        int intNum1 = (int) doubleNum1; 
	        System.out.println("Explicit Type Casting - double to int: " + intNum1);
	    }
}
