package graph;

public class BinaryTreeDemo {

    public static void main(String[] args) {
        NodeTree root = new NodeTree(7, null, null);
        BinaryTree binaryTree = new BinaryTree(root);
        for (int i = 0; i < 10; i++) {
            NodeTree newNode = new NodeTree(i, null, null);
            binaryTree.addNode(newNode, binaryTree.root);
        }

        binaryTree.Search(4, binaryTree.root);
        binaryTree.Search(15, binaryTree.root);
    }
}
