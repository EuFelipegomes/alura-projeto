package algorithms.binarySearch;

public class BinarySearch {
  public static void main(String[] args) {
    long startTime = System.nanoTime();
    int[] array = new int[500];

    for (int i = 0; i < array.length; i++) {
      array[i] = i;
    }

    System.out.println(search(array, 258));
    long endTime = System.nanoTime();
    long timeElapsed = endTime - startTime;

    System.out.println("Execution time in nanoseconds: " + timeElapsed);
    System.out.println("Execution time in milliseconds: " + timeElapsed / 10000000);

  }

  public static long search(int[] array, long target) {
    int startPosition = 0;
    int midPosition;
    int finalPosition = array.length - 1;

    while (startPosition < finalPosition) {
      midPosition = (int) (startPosition + finalPosition) / 2;

      if (array[midPosition] == target) {
        return array[midPosition];
      } else if (array[midPosition] > target) {
        finalPosition = midPosition - 1;
      } else if (array[midPosition] < target) {
        startPosition = midPosition + 1;
      }
    }

    return -1;

  }

}
