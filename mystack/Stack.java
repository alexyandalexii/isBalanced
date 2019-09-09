package mystack;
/**
 * Stack
 */
public class Stack <T> {

    private Node<T> node = null;
    private int N = 0;

    public boolean isEmpty() {
        if(node == null) return true;
        return false;
    }

    public void push(T data) {
        node = new Node<T>(data, node);
        N++;
    }

    public T peek() {
        return node.getData();
    }

    public T pop() throws StackIsEmptyException {
        if(isEmpty()) throw new StackIsEmptyException();

        T data = node.getData();
        node = node.getNext();
        N--;
        return data;
    }
}