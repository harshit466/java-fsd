package practiceProject;
import java.util.*;

public class Practice_Project2 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.publicMethod();
        myClass.protectedMethod();
        myClass.defaultMethod();     
    }
}

class MyClass {
    public void publicMethod() {
        System.out.println("Public method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    void defaultMethod() {
        System.out.println("Default method");
    }

    private void privateMethod() {
        System.out.println("Private method");
    }
}
