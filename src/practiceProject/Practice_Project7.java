package practiceProject;
import java.util.*;

public class Practice_Project7 {
    private int outerVar = 10;
    // Inner class
    class InnerClass {
        public void display() {
            System.out.println("InnerClass: outerVar = " + outerVar);
        }
    }

    public static void main(String[] args) {
        Practice_Project7 outerObject = new Practice_Project7();
        Practice_Project7.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.display();
    }
}
