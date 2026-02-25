package collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();

        stack.offerLast("bach");
        stack.offerLast("tiar");
        stack.offerLast("firdaus");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        Deque<String> queue = new LinkedList<>();

        queue.offerLast("bach");
        queue.offerLast("tiar");
        queue.offerLast("firdaus");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());

    }
}
