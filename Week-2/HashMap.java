import java.util.HashMap;
import java.util.Map;

public class HashMapFrequency {

    // Method to print frequency of elements
    static void printFreq(int arr[]) {

        // Create an empty HashMap
        HashMap<Integer, Integer> hmap = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {

            Integer c = hmap.get(arr[i]);

            // If element is not present
            if (c == null) {
                hmap.put(arr[i], 1);
            }
            // If element is already present
            else {
                hmap.put(arr[i], c + 1);
            }
        }

        // Display frequencies
        for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
            System.out.println("Frequency of " + entry.getKey()
                    + " is " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        // Input array
        int arr[] = {10, 34, 5, 10, 3, 5, 10};

        // Call function
        printFreq(arr);
    }
}