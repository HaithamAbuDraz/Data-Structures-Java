package graph;

import java.util.Queue;
import java.util.LinkedList;

public class BFSGraph {

    int size;
    adjList[] array;

    public BFSGraph(int size) {
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

    public void BFSExplore(int startVertax) {
        Boolean[] visited = new Boolean[size];
        for (int i = 0; i < size; i++) {
            visited[i] = false;
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(startVertax);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.println("Visit: " + node);
            visited[node] = true;
            Node head = array[node].head;
            while (head != null) {
                if (visited[head.dest] == false) {
                    queue.add(head.dest);
                    visited[head.dest] = true;
                } else {
                    head = head.next;
                }
            }//Inear while

        }//Outer while

    }

}
