package practiceProject12;
import java.util.*;

public class Practice_Project12 {
    public static void main(String[] args) {
        final Object lock = new Object(); 

        Thread sleepThread = new Thread(() -> {
            try {
                System.out.println("Sleeping for 2 seconds...");
                Thread.sleep(2000); 
                System.out.println("Sleep completed.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }             
        });

        Thread waitThread = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Waiting for notification...");
                    lock.wait(); 
                    System.out.println("Notification received.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        sleepThread.start();
        waitThread.start();

          try {
            Thread.sleep(3000);
            synchronized (lock) {
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
