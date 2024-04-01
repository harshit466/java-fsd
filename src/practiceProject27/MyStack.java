package practiceProject27;
import java.util.EmptyStackException;

public class MyStack {
    private static final int MAX_SIZE = 1000;
    private int top;
    private int[] stackArray;

    public MyStack() {
        top = -1;
        stackArray = new int[MAX_SIZE];
    }

    public void push(int element) {
        if (top == MAX_SIZE - 1) {
            throw new StackOverflowError();
        }
        stackArray[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top];
    }

    public int size() {
        return top + 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= top; i++) {
            sb.append(stackArray[i]);
            if (i < top) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
