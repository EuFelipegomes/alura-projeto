package dataStructures.queues;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
  public static void main(String[] args) {
    Queue<String> q = new LinkedList<String>();

    q.offer("Karen");
    q.offer("Felipe");
    q.offer("Cida");
    q.offer("Genilson");

    System.out.println(q);
    q.poll();
    System.out.println(q);

    System.out.println(q.isEmpty());

    System.out.println(q.contains("Felipe") ? "Contém" : "Não encontrado");

    System.out.println(q.peek());

  }
}
