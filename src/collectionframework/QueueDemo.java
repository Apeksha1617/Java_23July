package collectionframework;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println(queue.peek());
        System.out.println(queue.element());

        System.out.println(queue.poll());
        System.out.println(queue.remove());

        System.out.println(queue);

    }
}


