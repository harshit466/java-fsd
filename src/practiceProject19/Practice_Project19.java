package practiceProject19;
import java.util.*;
interface Animal {
 default void eat() {
     System.out.println("Animal is eating");
 }
}

interface Herbivore extends Animal {
 default void eat() {
     System.out.println("Herbivore is eating");
 }
}

interface Carnivore extends Animal {
 default void eat() {
     System.out.println("Carnivore is eating");
 }
}

class Omnivore implements Herbivore, Carnivore {
 @Override
 public void eat() {
     System.out.println("Omnivore is eating");
 }
}

public class Practice_Project19 {
 public static void main(String[] args) {
     Omnivore omnivore = new Omnivore();
     omnivore.eat(); 
 }
}
