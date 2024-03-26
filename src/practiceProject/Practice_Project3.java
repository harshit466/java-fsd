package practiceProject;
import java.util.*;

public class Practice_Project3 {
    public static void main(String[] args) {
        Practice p = new Practice();
        int sum = p.add(7, 3);
        System.out.println("Sum: " + sum);
        double pi = p.getPi();
        System.out.println("Value of Pi: " + pi);

    }
}

class Practice {
    public int add(int a, int b) {
        return a + b;
    }

    public double getPi() {
        return 3.14159;
    }
}
