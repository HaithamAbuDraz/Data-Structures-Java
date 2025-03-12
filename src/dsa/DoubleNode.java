package dsa;

public class DoubleNode<T> {

    T value;
    DoubleNode next;
    DoubleNode prevous;

    public DoubleNode(T value, DoubleNode next, DoubleNode prevous) {
        this.value = value;
        this.next = next;
        this.prevous = prevous;
    }
}
