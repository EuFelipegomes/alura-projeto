package algorithms.mergeSort;

import java.util.Random;

public class MergeSort {
  public static void main(String[] args) {
    long startTime = System.nanoTime();
    int[] array = new int[2500];

    Random random = new Random();
    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt() * array.length;
    }

    sort(array);

    long endTime = System.nanoTime();
    long timeElapsed = endTime - startTime;
    long executionInMilliseconds = timeElapsed / 10000000;

    System.out.println("Execution in ms:" + executionInMilliseconds);
  }

  public static void sort(int[] array) {
    int length = array.length;

    if (length <= 1) {
      return;
    }

    int middle = length / 2;

    int[] leftArray = new int[middle];
    int[] rightArray = new int[length - middle];

    int i = 0;
    int j = 0;

    for (; i < length; i++) {
      if (i < middle) {
        leftArray[i] = array[i];
      } else {
        rightArray[j] = array[i];
        j++;
      }
    }
    sort(leftArray);
    sort(rightArray);
    merge(leftArray, rightArray, array);

  }

  public static void merge(int[] leftArray, int[] rightArray, int[] array) {
    int leftSize = array.length / 2;
    int rightSize = array.length - leftSize;

    int i = 0, l = 0, r = 0;

    while (l < leftSize && r < rightSize) {
      if (leftArray[l] < rightArray[r]) {
        array[i] = leftArray[l];
        i++;
        l++;
      } else {
        array[i] = rightArray[r];
        i++;
        r++;
      }
    }

    while (l < leftSize) {
      array[i] = leftArray[l];
      i++;
      l++;
    }

    while (r < rightSize) {
      array[i] = rightArray[r];
      i++;
      r++;
    }

  }
}
