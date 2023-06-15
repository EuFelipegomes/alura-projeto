package dataStructures.dynamicArrays;

public class App {
  public static void main(String[] args) {
    DynamicArray dynamicArray = new DynamicArray(20);

    dynamicArray.insert(10, 20);

    System.out.println(dynamicArray);

    dynamicArray.clear();

    System.out.println(dynamicArray);

    System.out.println(dynamicArray.isEmpty());

  }
}
