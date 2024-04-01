package practiceProject28;
import java.util.*;

public class Practice_Project28 {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Queue after insert elements: " + queue);
        int removedElement1 = queue.dequeue();
        int removedElement2 = queue.dequeue();
        System.out.println("Removed elements: " + removedElement1 + ", " + removedElement2);
        System.out.println("Queue after remove elements: " + queue);
    }
}
