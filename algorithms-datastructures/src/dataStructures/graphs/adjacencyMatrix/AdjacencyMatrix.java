package dataStructures.graphs.adjacencyMatrix;

public class AdjacencyMatrix {
  private int numVertex;
  private int[][] matrix;

  public AdjacencyMatrix(int numVertex) {
    this.numVertex = numVertex;
    this.matrix = new int[numVertex][numVertex];
  }

  public void addEdge(int source, int end) {
    this.matrix[source][end] = 1;
    this.matrix[end][source] = 1;
  }

  public void removeEdge(int source, int end) {
    this.matrix[source][end] = 0;
    this.matrix[end][source] = 0;
  }

  public void printMatrix() {
    for (int i = 0; i < numVertex; i++) {
      for (int j = 0; j < numVertex; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
