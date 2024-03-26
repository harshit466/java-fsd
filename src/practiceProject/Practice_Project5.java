package practiceProject;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Practice_Project5 {
    public static void main(String[] args) {

    	System.out.println("Implementations of collections :");
    	// ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("ArrayList: " + arrayList);

        // LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Blue");
        System.out.println("LinkedList: " + linkedList);

        // HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Cat");
        hashSet.add("Dog");
        hashSet.add("Elephant");
        System.out.println("HashSet: " + hashSet);

        // HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        System.out.println("HashMap: " + hashMap);
    }
}
