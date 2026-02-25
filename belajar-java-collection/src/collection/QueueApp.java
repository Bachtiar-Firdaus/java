package collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    static void main(String[] args) {

//        Queue<String> queue = new ArrayDeque<>();
//        Queue<String> queue = new PriorityQueue<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("lila");
        queue.add("daus");
        queue.add("kaya");

        for(String next = queue.poll(); next != null; next = queue.poll()){
            System.out.println(next);
        }

        // ini jadi 0 karna pol mengambil dan menghapus
        System.out.println(queue.size());

    }
}
