package practiceProject;
import java.util.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Practice_Project6 {
    public static void main(String[] args) {

    	System.out.println("Implementations of Maps :");
        // HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        System.out.println("HashMap: " + hashMap);

        // LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Harshit", 1);
        linkedHashMap.put("Anshul", 2);
        linkedHashMap.put("Bani", 3);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Ekta", 1);
        treeMap.put("Kunal", 2);
        treeMap.put("Gurjot", 3);
        System.out.println("TreeMap: " + treeMap);
    }
}
