package mystack;

/**
 * StackIsEmptyException
 */
public class StackIsEmptyException extends Exception {

    public StackIsEmptyException() {
        super("Stack is empty.");
    }
}