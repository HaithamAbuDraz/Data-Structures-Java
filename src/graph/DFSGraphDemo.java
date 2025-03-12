package graph;

public class DFSGraphDemo {

    public static void main(String[] args) {
        DFSGraph graph = new DFSGraph(6);
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
//        graph.DFSExplore(0);
        graph.DFSSearch(0, 5);
    }
}
