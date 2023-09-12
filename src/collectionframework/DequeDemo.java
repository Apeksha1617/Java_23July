package collectionframework;
import java.util.*;

import java.util.ArrayDeque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.addFirst(5);
        deque.addLast(2);
        deque.offer(50);
        deque.offerFirst(55);
        deque.offerLast(55);

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque.poll());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.element());
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());

        System.out.println(deque);
    }
}
