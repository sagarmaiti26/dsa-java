package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTrees {
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
        static int idx = -1;

        public Node buildTree(int[] node) {
            idx++;
            if (node[idx] == -1) {
                return null;
            }
            Node newNode = new Node(node[idx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);
            return newNode;
        }

        public void preTraversal(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preTraversal(root.left);
            preTraversal(root.right);
        }

        public void inTraversal(Node root) {
            if (root == null) {
                return;
            }

            inTraversal(root.left);
            System.out.print(root.data + " ");
            inTraversal(root.right);
        }

        public void postTraversal(Node root) {
            if (root == null) {
                return;
            }

            postTraversal(root.left);

            postTraversal(root.right);
            System.out.print(root.data + " ");
        }

        public void levelOrder(Node root) {
            Queue<Node> q = new LinkedList<>();

            q.add(root);

            while (!q.isEmpty()) {

                System.out.print(q.peek().data + " ");
                Node newNode = q.remove();
                if (newNode.left != null) {

                    q.add(newNode.left);

                }
                if (newNode.right != null) {
                    q.add(newNode.right);
                }

            }

        }

        public static int maxHeight(Node root) {
            if (root == null) {
                return 0;
            }

            int leftSide = maxHeight(root.left);
            int rightSide = maxHeight(root.right);

            return Math.max(leftSide, rightSide) + 1;

        }

        public int size(Node root) {
            if (root == null) {
                return 0;
            }
            int leftSize = size(root.left);
            int rightSize = size(root.right);

            return leftSize + rightSize + 1;
        }

        public int sumNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftSum = sumNodes(root.left);
            int rightSum = sumNodes(root.right);
            return leftSum + rightSum + root.data;
        }

        public static int diaMeter(Node root) {
            if (root == null) {
                return 0;
            }
            int leftHeight = maxHeight(root.left);
            int rightHeight = maxHeight(root.right);
            int leftDia = diaMeter(root.left);
            int rightDia = diaMeter(root.right);
            int mainDia = leftHeight + rightHeight + 1;
            return Math.max(rightDia, Math.max(mainDia, leftDia));

        }

    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, 5, -1, -1, -1 };
        // 1
        // / \
        // 2 3
        // / \ \
        // 4 5 6

        // int[] nodes = { 1, 2, 4, 6, -1, -1, -1, 5, 7, 8, -1, -1, -1, -1, 3, -1, -1 };
        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(nodes);
        System.out.println(root.data);
        // bt.preTraversal(root);
        // System.out.println();
        // bt.inTraversal(root);
        // System.out.println();
        // bt.postTraversal(root);
        // System.out.println();
        bt.levelOrder(root);
        System.out.println();
        System.out.println(bt.maxHeight(root));
        System.out.println(bt.size(root));
        System.out.println(bt.sumNodes(root));
        System.out.println(bt.diaMeter(root));

    }
}
