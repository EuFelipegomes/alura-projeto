package algorithms.insertionSort;

import java.util.Random;

public class InsertionSort {
  public static void main(String[] args) {
    long startTime = System.nanoTime();

    int[] array = new int[1000];

    Random random = new Random();
    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt() * array.length;
    }

    sort(array);

    for (int i : array) {
      System.out.println(i);
    }

    long endTime = System.nanoTime();
    long timeElapsed = endTime - startTime;
    long executionInMilliseconds = timeElapsed / 10000000;

    System.out.println("Execution in ms: " + " " + executionInMilliseconds);
  }

  public static int[] sort(int[] array) {
    for (int i = 1; i < array.length; i++) {
      int temp = array[i];
      int j = i - 1;

      while (j >= 0 && array[j] > temp) {
        array[j + 1] = array[j];
        j--;
      }

      array[j + 1] = temp;
    }
    return array;
  }
}
