package graph;

import java.util.Stack;

public class DFSGraph {

    int size;
    adjList[] array;

    public DFSGraph(int size) {
        this.size = size;
        array = new adjList[this.size];
        for (int i = 0; i < size; i++) {
            array[i] = new adjList();
            array[i].head = null;
        }
    }

    public void addNode(int src, int dest) {
        Node node = new Node(dest, null);
        node.next = array[src].head;
        array[src].head = node;
    }

    public void DFSExplore(int startVertax) {
        Boolean[] visited = new Boolean[size];
        for (int i = 0; i < size; i++) {
            visited[i] = false;
        }
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(startVertax);
        while (!stack.isEmpty()) {
            int node = stack.pop();
            stack.push(node);
            visited[node] = true;
            Node head = array[node].head;
            Boolean isDone = true;
            while (head != null) {
                if (visited[head.dest] == false) {
                    stack.push(head.dest);
                    visited[head.dest] = true;
                    isDone = false;
                    break;
                } else {
                    head = head.next;
                }

            }//Inear while
            if (isDone == true) {
                int outNode = stack.pop();
                System.out.println("Visit node: " + outNode);
            }

        }//Outer while

    }

    public void DFSSearch(int startVertax, int search) {
        Boolean[] visited = new Boolean[size];
        Boolean isFound = false;
        for (int i = 0; i < size; i++) {
            visited[i] = false;
        }
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(startVertax);
        while (!stack.isEmpty()) {
            int node = stack.pop();
            stack.push(node);
            visited[node] = true;
            Node head = array[node].head;
            Boolean isDone = true;
            while (head != null) {
                if (search == head.dest) {
                    System.out.println("Node is founded");
                    isFound = true;
                    break;
                }
                if (visited[head.dest] == false) {
                    stack.push(head.dest);
                    visited[head.dest] = true;
                    isDone = false;
                    break;
                } else {
                    head = head.next;
                }

            }//Inear while
            if (isFound == true) {
                break;
            }
            if (isDone == true) {
                int outNode = stack.pop();
                System.out.println("Visit node: " + outNode);
            }

        }//Outer while
        if (isFound == false) {
            System.out.println("Node can not found");
        }

    }
}
