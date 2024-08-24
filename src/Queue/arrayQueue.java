package Queue;

public class arrayQueue {
    static class Queue {
        static int[] arr;
        static int size;
        static int rear;

        public Queue(int n) {
            size = n;
            arr = new int[n];
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue Full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public int remove() {
            if (rear == -1) {
                System.out.println("Queue Empty");
                return -1;
            }

            int x = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return x;
        }

        public int peek() {
            if (rear == -1) {
                System.out.println("Empty Queue");
                return -1;
            }

            return arr[0];
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        System.out.println(q.isEmpty());
        q.add(12);
        q.add(15);
        q.add(19);
        while (!q.isEmpty()) {
           System.out.println(q.peek());
            q.remove();
        }
        

    }

}
