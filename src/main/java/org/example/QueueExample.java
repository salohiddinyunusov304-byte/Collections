package org.example;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        /// Queue - navbat FIFO, Priority - ustuvorlik boyicha navbat

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(20);
        queue.add(5);
        queue.add(10);

        // eng kichik qiymat eng birinchi chiqadi
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
