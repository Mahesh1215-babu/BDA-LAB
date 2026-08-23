import java.util.Stack;

public class StackDemo {

    // Method to push elements into stack
    static void stack_push(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    // Method to pop elements from stack
    static void stack_pop(Stack<Integer> stack) {
        System.out.println("Pop :");
        for (int i = 0; i < 5; i++) {
            System.out.println(stack.pop());
        }
    }

    // Method to peek top element
    static void stack_peek(Stack<Integer> stack) {
        int top = stack.peek();
        System.out.println("Element on stack top : " + top);
    }

    // Method to search an element
    static void stack_search(Stack<Integer> stack, int element) {
        int position = stack.search(element);

        if (position == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element is found at position " + position);
        }
    }

    public static void main(String[] args) {

        // Create an empty stack
        Stack<Integer> stack = new Stack<>();

        // Push elements 0 to 4
        stack_push(stack);

        // Pop all elements
        stack_pop(stack);

        // Push again
        stack_push(stack);

        // Peek top element
        stack_peek(stack);

        // Search elements
        stack_search(stack, 2);
        stack_search(stack, 6);
    }
}