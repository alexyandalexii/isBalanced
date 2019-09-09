import mystack.*;

/**
 * StackTest
 */
public class StackTest {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Stack is successfully created.");
        System.out.println("Stack is empty? " + stack.isEmpty());
        System.out.println("Adding 10 elements to stack:");

        for(int i = 0; i < 10; i++) {
            System.out.println("    stack <= " + i);
            stack.push(i);
        }
        System.out.println("Stack is empty? " + stack.isEmpty());
        System.out.println("Top of stack = " + stack.peek());
        System.out.println("Popping 3 elements from stack:");

        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("    stack => " + stack.pop());
            } catch (StackIsEmptyException e) {
                System.out.println("Popping from empty stack!");
            }
        }
        System.out.println("Stack is empty? " + stack.isEmpty());
        System.out.println("Top of stack = " + stack.peek());

        for (int i = 0; i < 7; i++) {
            try {
                System.out.println("    stack => " + stack.pop());
            } catch (StackIsEmptyException e) {
                System.out.println("Popping from empty stack!");
            }
        }
        System.out.println("Stack is empty? " + stack.isEmpty());
        System.out.println("Now popping an element from empty stack");
        try {
            stack.pop();
        } catch(StackIsEmptyException e) {
            System.out.println("An exception occured! Info:");
            System.out.println("    " + e.getMessage());
        }
    }
}