package algorithms.bubbleSort;

import java.util.Random;

public class BubbleSort {
  public static void main(String[] args) {
    long startTime = System.nanoTime();

    int[] array = new int[500];

    Random random = new Random();

    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt() * array.length;
    }

    System.out.println(array.length);

    sort(array);

    for (int num : array) {
      System.out.print(num + " ");
    }

    long endTime = System.nanoTime();
    long timeElapsed = endTime - startTime;
    long executionInMilliseconds = timeElapsed / 10000000;
    System.out.println("Execution in ms:" + " " + executionInMilliseconds);

  }

  public static int[] sort(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 0; j < array.length - 1; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
    return array;
  }
}
