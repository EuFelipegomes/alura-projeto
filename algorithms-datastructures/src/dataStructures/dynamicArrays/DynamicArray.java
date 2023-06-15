package dataStructures.dynamicArrays;

import java.util.Arrays;

public class DynamicArray {
  int capacity = 10;
  int size;
  Object[] array;

  public DynamicArray() {
    this.array = new Object[capacity];
  }

  public DynamicArray(int capacity) {
    this.capacity = capacity;
    this.array = new Object[capacity];
  }

  public void add(Object data) {
    if (size >= capacity) {
      grow();
    }
    array[size] = data;
    size++;
  }

  public void insert(int index, Object data) {
    if (size >= capacity) {
      grow();
    } else {
      for (int i = size; i > index; i--) /* O(N) */ {
        array[i] = array[i - 1];
      }
      array[index] = data;
      size++;
    }
  }

  public void delete(Object data) {
    for (int i = 0; i < size; i++) /* O(n) */ {
      if (array[i] == data) {
        for (int j = 0; j < (size - i - 1) /* O(n) */; j++) {
          array[i + j] = array[i + j + 1];
        }
        array[size - 1] = null;
        size--;
        if (size <= (int) (capacity / 3)) {
          shrink();
        }
        break;
      }
    }
  }

  public void clear() {
    for (int i = 0; i < size && size > 0; i++) {
      array[i] = null;
    }
  }

  public int search(Object data) {
    for (int i = 0; i < size; i++) {
      if (array[i] == data) {
        return i;
      }
    }
    return -1;
  }

  public boolean isEmpty() {
    if (size == 0) {
      return true;
    } else {
      return false;
    }
  }

  public void grow() {
    int newCapacity = (int) capacity * 2;
    Object[] newArray = new Object[newCapacity];

    for (int i = 0; i < size; i++) {
      newArray[i] = array[i];
    }
    capacity = newCapacity;
    array = newArray;
  }

  public void shrink() {
    int newCapacity = (int) capacity / 2;
    Object[] newArray = new Object[newCapacity];

    for (int i = 0; i < size; i++) {
      newArray[i] = array[i];
    }
    capacity = newCapacity;
    array = newArray;
  }

  @Override
  public String toString() {
    return Arrays.toString(array);
  }

}
