package dsa;

public class StackLinkedListArray {

    Node head;

    public StackLinkedListArray(Node head) {
        this.head = head;
    }

    public void push(Node newNode) {
        newNode.next = head;
        head = newNode;
    }

    public void pop() {
        head = head.next;
    }

    public void Display() {
        Node node = head;
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }
}
