package algorithms.quickSort;

import java.util.Random;

public class QuickSort {

  public static void main(String[] args) {
    long startTime = System.nanoTime();

    int[] array = new int[2500];

    Random random = new Random();
    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt() * array.length;
    }

    sort(array, 0, array.length - 1);

    long endTime = System.nanoTime();
    long timeElapsed = endTime - startTime;
    long executionInMilliseconds = timeElapsed / 10000000;

    System.out.println("Execution in ms:" + executionInMilliseconds);
  }

  public static int[] sort(int[] array, int left, int right) {
    if (left < right) {
      int p = merge(array, left, right);
      sort(array, left, p);
      sort(array, p + 1, right);

    }
    return array;
  }

  public static int merge(int[] array, int left, int right) {
    int middle = (int) (left + right) / 2;
    int pivot = array[middle];

    int i = left - 1;
    int j = right + 1;

    while (true) {
      do {
        i++;
      } while (array[i] < pivot);
      do {
        j--;
      } while (array[j] > pivot);
      if (i >= j) {
        return j;
      }
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
    }

  }

}
