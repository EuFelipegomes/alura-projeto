package dataStructures.linkedlists;

import java.util.LinkedList;

public class App {
  public static void main(String[] args) {
    LinkedLists<Integer> ll = new LinkedLists<>();

    for (int i = 0; i <= 100; i++) {
      ll.add(i);
    }

    ll.print();

  }
}
