package practiceProject11;
import java.util.*;

class MyThread extends Thread {
 public void run() {
     System.out.println("Thread created by extending Thread class");
 }
}

class MyRunnable implements Runnable {
 public void run() {
     System.out.println("Thread created by implementing Runnable interface");
 }
}

public class Practice_Project11 {
 public static void main(String[] args) {
     // Creating thread by extending Thread class
     MyThread thread1 = new MyThread();
     thread1.start();

     // Creating thread by implementing Runnable interface
     MyRunnable myRunnable = new MyRunnable();
     Thread thread2 = new Thread(myRunnable);
     thread2.start();
 }
}
