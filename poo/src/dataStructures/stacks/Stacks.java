package dataStructures.stacks;

import java.util.Stack;

public class Stacks {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<String>();

    stack.push("Minecraft");
    stack.push("COD MW2");
    stack.push("Forza Horizon 5");

    System.out.println(stack);

    stack.pop();

    System.out.println(stack);

    System.out.println(stack.peek());

    System.out.println(stack.search("COD MW2"));

  }
}
