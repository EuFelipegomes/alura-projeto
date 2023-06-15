package dataStructures.queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
  public static void main(String[] args) {
    Queue<Integer> q = new PriorityQueue<>();

    for (int i = 0; q.size() <= 20; i++) {
      q.offer(i * i);
    }

    System.out.println(q);
  }
}
