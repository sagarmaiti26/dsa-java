package PriorityQueue;

import java.util.*;

public class PriorityQueueImp {
    public static class Student implements Comparable<Student> {
        String name;
        int rank;

        Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }

    }

    public static void main(String[] args) {

        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("Sagar", 12));
        pq.add(new Student("Ram", 42));
        pq.add(new Student("Jatin", 10));
        pq.add(new Student("Sam", 22));
        while (!pq.isEmpty()) {
            System.out.print(pq.peek().name + " -> " + pq.remove().rank);
            System.out.println();
        }

    }
}
