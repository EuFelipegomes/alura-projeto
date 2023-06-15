package algorithms.linearSearch;

public class LinearSearch {
  public static void main(String[] args) {
    long startTime = System.nanoTime();

    int[] array = new int[100000000];

    for (int i = 0; i < array.length; i++) {
      array[i] = i;
    }

    long index = linearSearch(array, 54896254);

    System.out.println(index);

    long endTime = System.nanoTime();

    long timeElapsed = endTime - startTime;

    System.out.println("Execution time in nanoseconds: " + timeElapsed);
    System.out.println("Execution time in milliseconds: " + timeElapsed / 10000000);
  }

  private static int linearSearch(int[] array, long value) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == value) {
        return i;
      }
    }

    return -1;
  }

  /* … O código que está sendo medido inicia … */

  // dorme por 5 segundos

  /* … O código que está sendo medido termina … */

  // obtém a diferença entre os dois valores de tempo nan
}
