package dsa;

public class LinkedList {

    Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    public void add(Node newNode) {
        newNode.next = head;
        head = newNode;
    }

    public void Delete() {
        head = head.next;
    }
    
    public void Display(){
        Node node = head;
        while(node != null){
            System.out.println(node.value);
            node = node.next;
        }
    }
}
