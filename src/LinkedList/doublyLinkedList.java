package LinkedList;

public class doublyLinkedList {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            next = null;
            prev = null;
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
        head.prev = newNode;
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

    }

    public void removeFirst() {
        if (head == null || head.next == null) {
            size = 0;
            head = null;
            tail = null;
            return;
        }
        head = head.next;
        head.prev = null;

    }

    public void removeLast() {
        if (head == tail || head == null) {
            head = tail = null;
            size = 0;
            return;
        }
        tail.prev.next = null;
        tail = tail.prev;
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

    public void reverse() {
        Node prevNode = null;
        Node currNode = head;
        Node nextNode;
        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            currNode.prev = nextNode;
            prevNode = currNode;

            currNode = nextNode;

        }
        head = prevNode;
    }

    private Node head;
    private Node tail;
    private int size;

    public static void main(String[] args) {
        doublyLinkedList dll = new doublyLinkedList();

        dll.addFirst(70);
        dll.addFirst(10);
        dll.addFirst(10);
        dll.addFirst(90);
        dll.printList();
        dll.removeLast();
        dll.printList();
        dll.reverse();
        dll.printList();
    }

}
