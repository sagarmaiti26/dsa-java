package LinkedList;

class Linked_List {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

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

    public Node mergeMid(Node head) {
        Node slow = head;
        Node fast = head.next; // Head.next bcz if size is even consider left parts last element as mid
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node first, Node second) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (first != null && second != null) {
            if (first.data <= second.data) {
                temp.next = first;
                first = first.next;

            } else {
                temp.next = second;
                second = second.next;

            }
            temp = temp.next;
        }
        while (first != null) {
            temp.next = first;
            first = first.next;
            temp = temp.next;
        }
        while (second != null) {
            temp.next = second;
            second = second.next;
            temp = temp.next;
        }

        return mergeLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = mergeMid(head);

        // left and right half
        Node firstHalf = head;
        Node secondHalf = mid.next;
        mid.next = null;
        Node first = mergeSort(firstHalf);
        Node second = mergeSort(secondHalf);

        // merge
        return merge(first, second);

    }

    public static void main(String[] args) {
        Linked_List list = new Linked_List();
        list.addLast(67);
        list.addLast(98);
        list.addLast(45);
        list.addLast(75);
        list.addLast(91);
        list.printList();
        list.head = list.mergeSort(list.head);
        list.printList();

    }

}
