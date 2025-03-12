package dsa;

public class QueueArrayDemo {

    public static void main(String[] args) {
        QueueArray<String> queue = new QueueArray<String>(4);
        queue.Queue("A");
        queue.Queue("B");
        queue.Queue("C");
        queue.Queue("D");
        queue.Queue("E");
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}
