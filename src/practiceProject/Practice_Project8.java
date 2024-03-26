package practiceProject;
import java.util.*;

public class Practice_Project8 {
    public static void main(String[] args) {
        // Create a string
        String str = "Harshit Goyal!";
        System.out.println("Original String: " + str);

        // Convert string to StringBuffer
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println("StringBuffer: " + stringBuffer);

        // Convert string to StringBuilder
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println("StringBuilder: " + stringBuilder);
    }
}

