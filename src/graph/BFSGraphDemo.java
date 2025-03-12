package graph;

public class BFSGraphDemo {

    public static void main(String[] args) {
        BFSGraph graph = new BFSGraph(6);
        graph.addNode(0, 2);
        graph.addNode(0, 1);
        graph.addNode(1, 4);
        graph.addNode(1, 3);
        graph.addNode(1, 0);
        graph.addNode(3, 1);
        graph.addNode(4, 1);
        graph.addNode(2, 5);
        graph.addNode(2, 0);
        graph.addNode(5, 2);
        graph.BFSExplore(0);
    }
}
