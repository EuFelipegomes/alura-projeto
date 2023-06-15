package dataStructures.linkedlists;

import java.util.LinkedList;

public class LinkedLists<T> {
  private Node<T> first;

  public void add(T data) {
    Node<T> nNode = new Node<>(data);

    if (first == null) {
      first = nNode;
    } else {
      Node<T> current = first;
      while (current.next != null) {
        current = current.next;
      }
      current.next = nNode;
    }
  }

  public void print() {
    Node<T> current = first;

    while (current != null) {
      System.out.println(current.data);
      current = current.next;
    }
  }

  private static class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data) {
      this.data = data;
    }
  }
}