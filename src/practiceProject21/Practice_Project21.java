package practiceProject21;
import java.util.*;

public class Practice_Project21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        if (list.size() < 4) {
            throw new IllegalArgumentException("List must have at least 4 elements");
        }
        TreeSet<Integer> set = new TreeSet<>(list);
        Iterator<Integer> iterator = set.iterator();
        int fourthSmallest = 0;
        for (int i = 0; i < 4; i++) {
            fourthSmallest = iterator.next();
        }
        System.out.println("The fourth smallest element in the list is: " + fourthSmallest);
    }
}
