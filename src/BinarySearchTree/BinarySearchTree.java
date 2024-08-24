package BinarySearchTree;

import java.util.ArrayList;

public class BinarySearchTree {
    public static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (root.data > value) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public static boolean search(Node root, int target) {
        if (root == null) {
            return false;
        }

        if (root.data == target) {
            return true;
        }
        if (root.data > target) {
            return search(root.left, target);
        } else {
            return search(root.right, target);
        }
    }

    public static Node delete(Node root, int target) {
        if (root.data < target) {
            root.right = delete(root.right, target);
        }

        if (root.data > target) {
            root.left = delete(root.left, target);
        }

        else {
            // 1st Case If it's a Leaf
            if (root.left == null && root.right == null) {
                return null;
            }
            // 2nd Case If It's a Single Child Node
            if (root.right == null) {
                return root.left;
            } else if (root.left == null) {
                return root.right;
            }
            // 3rd If it's has two child
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;

    }

    public static Node findInorderSuccessor(Node root) {
        if (root.left == null) {
            return root;
        }
        return findInorderSuccessor(root.left);
    }

    public static void printOnRange(Node root, int start, int end) {
        if (root == null) {
            return;
        }
        if (root.data >= start && root.data <= end) {
            printOnRange(root.left, start, end);
            System.out.print(root.data + " ");
            printOnRange(root.right, start, end);
        } else if (root.data < start) {
            printOnRange(root.right, start, end);

        } else {
            printOnRange(root.left, start, end);

        }
    }

    public static void rootToLeaf(Node root, ArrayList<Integer> arrList) {

        if (root == null) {

            return;
        }
        arrList.add(root.data);
        if (root.left == null && root.right == null) {
            for (Integer data : arrList) {
                System.out.print(data + " ");
            }
            System.out.println();

        } else {
            rootToLeaf(root.left, arrList);

            rootToLeaf(root.right, arrList);

        }
        arrList.remove(arrList.size() - 1);
    }
    //Validate BST
    public static boolean validateBST(Node root,Node max, Node min){
     if (root==null) {
        return true;
     }
     if(min==null&&root.data>max.data){
        return false;
     }
   

     



        return validateBST(root.left, root, null)&&validateBST(root.right, null, root);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 1, 4, 8, 7, 6, 9, 10 };
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = insert(root, arr[i]);
        }

        inOrder(root);
        System.out.println();
        int target = 8;
        System.out.println(search(root, target));

        // delete(root, target);
        inOrder(root);
        System.out.println();
        printOnRange(root, 4, 9);
        ArrayList<Integer> arrList = new ArrayList<>();
        System.out.println();
        System.out.println("Root to Leaf");
        rootToLeaf(root, arrList);
    }
}
