package dsa;

public class QueueLinkedList<T> {

    DoubleNode<T> rear;
    DoubleNode<T> front;

    public QueueLinkedList(DoubleNode newdNode) {
        rear = newdNode;
        front = newdNode;
    }

    public void queue(DoubleNode newdNode) {
        newdNode.next = null;
        newdNode.prevous = rear;
        rear.next = newdNode;
        rear = newdNode;
    }

    public T deQueue() {
        T value = front.value;
        front = front.next;
        front.prevous = null;
        return value;
    }

    public void Display() {
        DoubleNode dNode = front;
        while (dNode != null) {
            System.out.println(dNode.value);
            dNode = dNode.next;
        }
    }
}
