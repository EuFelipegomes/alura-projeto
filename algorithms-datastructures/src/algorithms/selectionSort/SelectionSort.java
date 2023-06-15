package algorithms.selectionSort;

import java.lang.Math;
import java.util.Random;

public class SelectionSort {
  public static void main(String[] args) {
    long startTime = System.nanoTime();

    int[] array = new int[500];

    Random random = new Random();
    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt() * array.length;
    }

    sort(array);

    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }

    long endTime = System.nanoTime();
    long timeElapsed = endTime - startTime;
    long executionInMilliseconds = timeElapsed / 10000000;

    System.out.println("Execution in ms:" + " " + executionInMilliseconds);

  }

  public static int[] sort(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      int min = i;

      for (int j = i + 1; j < array.length; j++) {
        if (array[min] > array[j]) {
          min = j;
        }
      }
      int temp = array[min];
      array[min] = array[i];
      array[i] = temp;
    }
    return array;
  }

}
