package com.atguigu01.datastruc;

/**
 * ClassName: BinaryTree
 * Package: com.atguigu01.datastruc
 * Description:
 *
 * @Author gyq
 * @Create 2023/7/2 15:59
 * @Version 1.0
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int val) {
        root = insertRecursive(root, val);
    }

    private TreeNode insertRecursive(TreeNode current, int val) {
        if (current == null) {
            return new TreeNode(val);
        }

        if (val < current.val) {
            current.left = insertRecursive(current.left, val);
        } else if (val > current.val) {
            current.right = insertRecursive(current.right, val);
        }

        return current;
    }

    public void printPreorder() {
        System.out.print("Preorder traversal: ");
        printPreorderRecursive(root);
        System.out.println();
    }

    private void printPreorderRecursive(TreeNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.val + " ");
        printPreorderRecursive(node.left);
        printPreorderRecursive(node.right);
    }

    public void printInorder() {
        System.out.print("Inorder traversal: ");
        printInorderRecursive(root);
        System.out.println();
    }

    private void printInorderRecursive(TreeNode node) {
        if (node == null) {
            return;
        }

        printInorderRecursive(node.left);
        System.out.print(node.val + " ");
        printInorderRecursive(node.right);
    }

    public void printPostorder() {
        System.out.print("Postorder traversal: ");
        printPostorderRecursive(root);
        System.out.println();
    }

    private void printPostorderRecursive(TreeNode node) {
        if (node == null) {
            return;
        }

        printPostorderRecursive(node.left);
        printPostorderRecursive(node.right);
        System.out.print(node.val + " ");
    }
}

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(8);
        binaryTree.insert(3);
        binaryTree.insert(10);
        binaryTree.insert(1);
        binaryTree.insert(6);
        binaryTree.insert(14);
        binaryTree.insert(4);
        binaryTree.insert(7);
        binaryTree.insert(13);

        binaryTree.printPreorder();  // 前序遍历
        binaryTree.printInorder();   // 中序遍历
        binaryTree.printPostorder(); // 后序遍历
    }
}

