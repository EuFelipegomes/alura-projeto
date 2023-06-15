package dataStructures.hashTables;

import java.util.Hashtable;

public class App {
  public static void main(String[] args) {
    Hashtable<Integer, Integer> table = new Hashtable<>(200000);

    for (int i = 0; i < 200000; i++) {
      table.put(i * i, i + i);
    }

    System.out.println(table.get(100));

  }
}
