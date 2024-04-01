package practiceProject27;
import java.util.*;

public class Practice_Project27 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after insert Elements: " + stack);
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after remove Elements: " + stack);
    }
}
