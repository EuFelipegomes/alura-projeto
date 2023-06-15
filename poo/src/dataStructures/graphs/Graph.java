package dataStructures.graphs;

import java.util.ArrayList;

public class Graph<T> {
  private ArrayList<Vertex<T>> nodes;
  private ArrayList<Edges<T>> edges;
  private int[][] adjacencyMatrix;

  public Graph() {
    this.nodes = new ArrayList<Vertex<T>>();
    this.edges = new ArrayList<Edges<T>>();
    this.adjacencyMatrix = new int[0][0];
  }

  public void addNode(T data) {
    Vertex<T> newNode = new Vertex<T>(data);
    this.nodes.add(newNode);
    resizeAdjacencyMatrix();
  }

  private void resizeAdjacencyMatrix() {
    int size = this.nodes.size();
    int[][] newMatrix = new int[size][size];

    for (int i = 0; i < this.adjacencyMatrix.length; i++) {
      for (int j = 0; j < this.adjacencyMatrix[i].length; j++) {
        newMatrix[i][j] = this.adjacencyMatrix[i][j];
      }
    }

    this.adjacencyMatrix = newMatrix;
  }

  public void addEdge(double weight, T startData, T endData) {
    Vertex<T> start = this.getNode(startData);
    Vertex<T> end = this.getNode(endData);
    Edges<T> edge = new Edges<T>(weight, start, end);
    start.addEndEdge(edge);
    end.addStartEdge(edge);
    this.edges.add(edge);

    int startIndex = this.nodes.indexOf(start);
    int endIndex = this.nodes.indexOf(end);
    this.adjacencyMatrix[startIndex][endIndex] = 1;
    // Se o grafo for não direcionado, descomente a linha abaixo para definir a
    // aresta no sentido oposto:
    this.adjacencyMatrix[endIndex][startIndex] = 1;
  }

  public Vertex<T> getNode(T data) {
    Vertex<T> node = null;
    for (int i = 0; i < this.nodes.size(); i++) {
      if (this.nodes.get(i).getData().equals(data)) {
        node = this.nodes.get(i);
        break;
      }
    }

    if (node == null) {
      System.out.println("Not Found");
    }

    return node;
  }

  public void printAdjacencyMatrix() {
    for (int i = 0; i < this.adjacencyMatrix.length; i++) {
      for (int j = 0; j < this.adjacencyMatrix[i].length; j++) {
        System.out.print(this.adjacencyMatrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
