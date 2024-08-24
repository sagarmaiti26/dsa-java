package Queue;

public class linkedListQueue {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

  static  class Queue {
        Node head = null;
        Node tail = null;

        public boolean isEmpty() {
            return head == null;
        }

        // add
        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // remove
        public int remove() {
            if (head == null) {

                return -1;
            }
            int x = head.data;
            if (head == tail) {
                head = tail = null;

            } else {
                head = head.next;

            }

            return x;
        }

        // peek
        public int peek() {
            return head.data;
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(40);
        q.add(19);
        q.add(15);
        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }

}
