package mystack;

/**
 * Node
 */
public class Node <T> {

    private Node<T> next = null;
    public T data;

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    public T getData() {
        return data;
    }
}