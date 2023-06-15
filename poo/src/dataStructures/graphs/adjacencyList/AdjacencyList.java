package dataStructures.graphs.adjacencyList;

import java.util.*;

public class AdjacencyList {
  private int numVertices;
  private List<List<Integer>> adjacencyList;

  public AdjacencyList(int numVertices) {
    this.numVertices = numVertices;
    this.adjacencyList = new ArrayList<>(numVertices);

    for (int i = 0; i < numVertices; i++) {
      adjacencyList.add(new ArrayList<>());
    }
  }

  public void addEdge(int source, int destination) {
    adjacencyList.get(source).add(destination);
  }

  public List<Integer> getAdjacentVertices(int vertex) {
    return adjacencyList.get(vertex);
  }

  public int getNumVertices() {
    return numVertices;
  }

  public static void main(String[] args) {
    int numVertices = 5;
    AdjacencyList graph = new AdjacencyList(numVertices);

    graph.addEdge(0, 1);
    graph.addEdge(0, 4);
    graph.addEdge(1, 2);
    graph.addEdge(1, 3);
    graph.addEdge(1, 4);
    graph.addEdge(2, 3);
    graph.addEdge(3, 4);

    int vertex = 3;

    List<Integer> adjacentVertices = graph.getAdjacentVertices(3);

    System.out.println("Adjacent vertices of " + vertex

        + ": " + adjacentVertices);
  }
}
