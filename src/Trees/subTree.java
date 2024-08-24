package Trees;

import java.util.*;

public class subTree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {

        public static boolean isSubTree(Node tree, Node subTree) {
            Queue<Node> q = new LinkedList<>();
            q.add(tree);
            while (!q.isEmpty()) {
                Node temp = q.remove();
                if (temp.data == subTree.data) {
                    if (subCheck(temp, subTree)) {
                        return true;
                    }

                }
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }

            }

            return false;

        }

        static boolean subCheck(Node temp, Node subTree) {
            if (temp == null && subTree == null) {
                return true;
            }
            if (temp == null || subTree == null) {
                return false;
            }
            if (temp.data != subTree.data) {
                return false;
            }
            return subCheck(temp.left, subTree.left) && subCheck(temp.right, subTree.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
        System.out.println(BinaryTree.isSubTree(root, subRoot));

    }
}
