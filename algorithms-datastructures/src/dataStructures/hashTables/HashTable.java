package dataStructures.hashTables;

import java.util.Arrays;
import java.util.LinkedList;

public class HashTable<K, V> {
  private LinkedList<Entry<K, V>>[] table;
  private int capacity;
  private int size;

  public HashTable(int capacity) {
    this.capacity = capacity;
    this.size = 0;
    this.table = new LinkedList[capacity];
  }

  private int hash(K key) {
    return key.hashCode() % capacity;
  }

  public void put(K key, V value) {
    int index = hash(key);

    if (table[index] == null) {
      table[index] = new LinkedList<>();
    }

    for (Entry<K, V> entry : table[index]) {
      if (entry.key.equals(key)) {
        entry.value = value; // Atualiza o valor se a chave já existir
        return;
      }
    }

    table[index].add(new Entry<>(key, value));
    size++;
  }

  public V get(K key) {
    int index = hash(key);

    if (table[index] != null) {
      for (Entry<K, V> entry : table[index]) {
        if (entry.key.equals(key)) {
          return entry.value;
        }
      }
    }

    return null; // Chave não encontrada
  }

  public void remove(K key) {
    int index = hash(key);

    if (table[index] != null) {
      for (Entry<K, V> entry : table[index]) {
        if (entry.key.equals(key)) {
          table[index].remove(entry);
          size--;
          return;
        }
      }
    }
  }

  public int size() {
    return size;
  }

  private static class Entry<K, V> {
    private K key;
    private V value;

    public Entry(K key, V value) {
      this.key = key;
      this.value = value;
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (LinkedList<Entry<K, V>> list : table) {
      if (list != null) {
        for (Entry<K, V> entry : list) {
          sb.append(entry.value).append(" ");
        }
      }
    }
    return sb.toString();
  }

}
