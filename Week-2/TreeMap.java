import java.util.TreeMap;
import java.util.Map;

public class TreeMapFrequency {

    public static void main(String[] args) {

        // Step 2: Create an integer array
        int arr[] = {10, 34, 5, 10, 3, 5, 10};

        // Step 3: Create an empty TreeMap
        TreeMap<Integer, Integer> tmap = new TreeMap<>();

        // Step 4 & 5: Count frequencies
        for (int i = 0; i < arr.length; i++) {

            if (!tmap.containsKey(arr[i])) {
                tmap.put(arr[i], 1);
            } else {
                tmap.put(arr[i], tmap.get(arr[i]) + 1);
            }
        }

        // Step 6 & 7: Display frequencies
        for (Map.Entry<Integer, Integer> entry : tmap.entrySet()) {
            System.out.println("Frequency of " + entry.getKey()
                    + " is " + entry.getValue());
        }
    }
}