import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        // Step 2: Create an empty LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Step 3: Insert elements
        list.add("A");
        list.add("B");
        list.addLast("C");
        list.addFirst("D");
        list.add(2, "E");
        list.add("F");
        list.add("G");

        // Step 4: Display the LinkedList
        System.out.println("Linked list : " + list);

        // Step 5: Remove elements
        list.remove("B");
        list.remove(3);
        list.removeFirst();
        list.removeLast();

        // Step 6: Display LinkedList after deletion
        System.out.println("Linked list after deletion: " + list);

        // Step 7: Check whether list contains "E"
        if (list.contains("E")) {
            System.out.println("List contains the element 'E'");
        } else {
            System.out.println("List doesn't contain the element 'E'");
        }

        // Step 8 & 9: Find and display size
        System.out.println("Size of linked list = " + list.size());

        // Step 10 & 11: Retrieve element at index 2
        String element = list.get(2);
        System.out.println("Element returned by get() : " + element);

        // Step 12: Replace element at index 2 with "Y"
        list.set(2, "Y");

        // Step 13: Display modified LinkedList
        System.out.println("Linked list after change : " + list);
    }
}