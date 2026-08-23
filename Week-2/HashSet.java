import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

        // Step 2: Initialize a HashSet
        HashSet<String> hash_Set = new HashSet<>();

        // Step 3: Add elements to HashSet
        hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks"); // Duplicate
        hash_Set.add("Example");
        hash_Set.add("Set");

        // Step 5: Print HashSet
        System.out.println("Set output without the duplicates: " + hash_Set);

        // Step 6: Initialize and populate a TreeSet
        TreeSet<String> tree_Set = new TreeSet<>(hash_Set);

        // Step 8: Print TreeSet
        System.out.println("Sorted Set after passing into TreeSet: " + tree_Set);
    }
}