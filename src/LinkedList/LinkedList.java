package LinkedList;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int a) {

        Node newNode = new Node(a);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int a) {
        Node newNode = new Node(a);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printList() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    public void insert(int index, int data) {

        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node node = head;
        int temp = 0;
        while (temp != index - 1) {
            node = node.next;
            temp++;
        }

        newNode.next = node.next;
        node.next = newNode;
        size++;
    }

    public void removeFirst() {
        if (size == 0) {
            return;
        } else if (size == 1) {

            head = tail = null;
            size--;
            return;
        }
        head = head.next;
        size--;
    }

    public void removeLast() {
        if (size == 0) {
            return;
        } else if (size == 1) {
            head = tail = null;
            size--;
            return;

        }
        Node node = head;
        while (node.next != tail) {
            node = node.next;
        }
        node.next = null;
        tail = node;
        size--;
    }

    public int search(int elemnt) {
        Node node = head;
        int index = 0;
        if (size == 0) {
            return -1;
        }
        while (node.next != null) {

            if (node.data == elemnt) {
                return index;
            }
            node = node.next;
            index++;
        }

        return -1;
    }

    public void reverse() {
        if (head == null) {
            return;
        }

        Node currNode = head;
        Node prevNode = null;
        Node nextNode = null;
        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;

        }
        head = prevNode;
    }

    public void removeNthElementLast(int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (size == n) {
            head = head.next;
            return;
        }
        Node prevNode = head;
        size = size - n;
        int i = 1;
        while (i < size) {
            prevNode = prevNode.next;
            i++;
        }
        prevNode.next = prevNode.next.next;
        return;

    }

    // Slow - Fast Approach
    public Node findMid(Node node) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // Step -1 Find the Mid
        Node midNode = findMid(head);

        // Step - 2 Reverse the Second Half
        Node prevNode = null;
        Node currNode = midNode;
        Node nextNode = null;
        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        Node rightHead = prevNode;
        Node leftHead = head;
        // Step - 3 Check Left and Right Half
        while (rightHead != null) {
            if (rightHead.data != leftHead.data) {
                return false;
            }
            rightHead = rightHead.next;
            leftHead = leftHead.next;
        }

        return true;
    }

    // Floyd’s Cycle Finding Algorithm:
    public boolean isCycle() {

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public void removeCycle() {
        // Check there is a cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (!cycle) {
            return;
        }
        // find meeting point
        slow = head;
        Node prevFast = null;
        while (slow != head) {
            slow = slow.next;
            prevFast = fast;
            fast = fast.next;

        }
        // remove cycle last.next =null
        prevFast.next = null;

    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    public static void main(String[] args) {

    }
}
