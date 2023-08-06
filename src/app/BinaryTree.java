package app;

public class BinaryTree {
    TreeNode root;

    BinaryTree() {
        root = null;
    }

    private TreeNode insert(TreeNode current, int val) {
        if (current == null) {
            return new TreeNode(val);
        }

        if (val < current.val) {
            current.left = insert(current.left, val);
        } else if (val > current.val) {
            current.right = insert(current.right, val);
        }

        return current;
    }


    public void insert(int val) {
        root = insert(root, val);
    }


    private void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.val + " ");
            inorderTraversal(node.right);
        }
    }

    public void inorderTraversal() {
        System.out.println("Inorder traversal:");
        inorderTraversal(root);
        System.out.println();
    }

    private void preorderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.val + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    public void preorderTraversal() {
        System.out.println("Preorder traversal:");
        preorderTraversal(root);
        System.out.println();
    }

    private void postorderTraversal(TreeNode node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.val + " ");
        }
    }

    public void postorderTraversal() {
        System.out.println("Postorder traversal:");
        postorderTraversal(root);
        System.out.println();
    }
}

