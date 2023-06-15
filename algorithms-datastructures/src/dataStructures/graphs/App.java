package dataStructures.graphs;

import java.util.Random;

public class App {
  public static void main(String[] args) {
    Graph<Integer> socialGraph = new Graph<Integer>();

    socialGraph.addNode(5);

    socialGraph.addNode(10);

    socialGraph.addEdge(1.5, 0, 1);
  }
}
