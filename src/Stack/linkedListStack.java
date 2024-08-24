package Stack;
public class linkedListStack {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        Node head = null;

        boolean isEmpty() {
            return head == null;
        }

        void push(int a) {
            Node newNode = new Node(a);
            if (head == null) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;

        }

        int pop() {
            if (head == null) {
                return -1;
            }
            int a = head.data;
            head = head.next;
            return a;
        }

        int peek() {
            if (head == null) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();
        s.push(12);
        s.push(14);
        s.push(19);
        s.push(32);
        s.push(152);

        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
        System.out.println();
        System.out.println(s.peek());

    }
}
