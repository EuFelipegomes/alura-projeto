package dataStructures.graphs;

import java.sql.Array;
import java.util.ArrayList;

import java.util.ArrayList;

public class Vertex<T> {
  private T data;
  private ArrayList<Edges<T>> startEdges;
  private ArrayList<Edges<T>> endEdges;

  public Vertex(T data) {
    this.data = data;
    this.startEdges = new ArrayList<Edges<T>>();
    this.endEdges = new ArrayList<Edges<T>>();
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public void addStartEdge(Edges<T> data) {
    this.startEdges.add(data);
  }

  public void addEndEdge(Edges<T> data) {
    this.endEdges.add(data);
  }
}
