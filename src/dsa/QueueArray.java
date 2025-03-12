package dsa;

public class QueueArray<T> {

    Object[] ArrayQueue;
    int rear; //Last added item
    int front; //First added item
    int size;

    public QueueArray(int size) {
        this.size = size;
        ArrayQueue = new Object[this.size];
        front = -1;
        rear = -1;
    }

    public Boolean isFull() {
        return (rear == size - 1);
    }

    public Boolean isEmpty() {
        return (front == -1 || front > rear);
    }

    public void Queue(Object newItem) {//add
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        rear = rear + 1;
        ArrayQueue[rear] = newItem;
        if (front == -1) {
            front = 0;
        }
    }

    public T deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }
        T objectOut = (T) ArrayQueue[front];
        front = front + 1;
        return objectOut;
    }
}
