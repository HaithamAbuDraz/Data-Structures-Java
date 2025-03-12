package dsa;

public class QueueLinkedListDemo {

    public static void main(String[] args) {
        DoubleNode<Integer> dNode = new DoubleNode<Integer>(12, null, null);
        QueueLinkedList<Integer> queueLs = new QueueLinkedList<Integer>(dNode);
        queueLs.queue(new DoubleNode<Integer>(11, null, null));
        queueLs.queue(new DoubleNode<Integer>(12, null, null));
        queueLs.queue(new DoubleNode<Integer>(13, null, null));
        System.out.println(queueLs.deQueue());
        System.out.println(queueLs.deQueue());
        System.out.println(queueLs.deQueue());
    }

}
