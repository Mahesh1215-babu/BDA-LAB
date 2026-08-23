import java.util.Queue;
import java.util.LinkedList;

public class QueueDemo {
    public static void main(String[] args) {

        // Create an empty Queue
        Queue<Integer> q = new LinkedList<>();

        // Insert elements 0 to 4
        for (int i = 0; i <= 4; i++) {
            q.add(i);
        }

        // Display queue elements
        System.out.println("Elements of queue-" + q);

        // Remove the head element
        int removedele = q.remove();
        System.out.println("removed element-" + removedele);

        // Display remaining queue
        System.out.println(q);

        // Peek the head element
        int head = q.peek();
        System.out.println("head of queue-" + head);

        // Find size of queue
        int size = q.size();
        System.out.println("Size of queue-" + size);
    }
}