package app;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] nodes = {5, 3, 8, 2, 4, 7, 9, 1, 6, 10, 11, 12};


        for (int nodeValue : nodes) {
            tree.insert(nodeValue);
        }


        tree.inorderTraversal();
        tree.preorderTraversal();
        tree.postorderTraversal();
    }
}
