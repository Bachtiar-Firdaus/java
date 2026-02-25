package collection;

import collection.collection.SingleQueue;

import java.util.Queue;

public class SingleQueueApp {
    static void main(String[] args) {

        Queue<String> queue = new SingleQueue<>();

        System.out.println(queue.size());

        System.out.println(queue.offer("Bachtiar"));
        System.out.println(queue.offer("Firdaus"));

        System.out.println(queue.size());

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.size());

    }
}
