package graph;

public class BinaryTree {

    NodeTree root;

    public BinaryTree(NodeTree root) {
        this.root = root;
    }

    public void addNode(NodeTree newNode, NodeTree rootExplore) {
        if (rootExplore == null) {
            return;
        }
        if (newNode.value > rootExplore.value) {
            if (rootExplore.right == null) {
                rootExplore.right = newNode;
            } else {
                addNode(newNode, rootExplore.right);
            }
        }
        if (newNode.value < rootExplore.value) {
            if (rootExplore.left == null) {
                rootExplore.left = newNode;
            } else {
                addNode(newNode, rootExplore.left);
            }
        }
    }

    public void Search(int value, NodeTree rootExplore) {
        if (rootExplore == null) {
            System.out.println("Value can not founded");
            return;
        }
        
        if(rootExplore.value == value){
            System.out.println("Value is founded");
            return;
        }
        if (value > rootExplore.value) {
            Search(value, rootExplore.right);
        }
        if (value < rootExplore.value) {
            Search(value, rootExplore.left);
        }
    }
}
