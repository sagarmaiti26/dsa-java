package LinkedList;

class LinkList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(int a) {
        Node newNode = new Node(a);

        if (head == null) {
            head = tail = newNode;
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

    public void zigZag() {
        // Base Case
        if (head == null || head.next == null) {
            return;
        }
        // Find Mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // Reverse the Second Half
        Node prevNode = null;
        Node currNode = slow.next;
        Node nextNode = null;
        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;

        }
        slow.next = null;

        // Connect two sides
        Node left = head;
        Node right = prevNode;

        Node nextLeft = null;
        Node nextRight = null;
        while (left != null && right != null) {
            nextLeft = left.next;
            left.next = right;
            nextRight = right.next;
            left = nextLeft;
            right.next = nextLeft;

            left = nextLeft;
            right = nextRight;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addLast(67);
        list.addLast(98);
        list.addLast(45);
        list.addLast(75);
        list.addLast(91);
        list.printList();
        list.zigZag();
        list.printList();
        System.out.println(head);

    }

}
