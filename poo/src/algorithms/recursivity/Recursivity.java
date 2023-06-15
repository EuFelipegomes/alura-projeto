package algorithms.recursivity;

import java.util.Random;

public class Recursivity {
  public static void main(String[] args) {
    int[] array = new int[8];

    System.out.println(array.length);

    Random random = new Random();
    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt();
    }

    System.out.println(sum(0, 0, array));
  }

  public static int sum(int sum, int index, int[] array) {

    if (index < array.length) {
      sum = sum + array[index];
      return sum(sum, index + 1, array);

    } else {
      return sum;
    }
  }
}