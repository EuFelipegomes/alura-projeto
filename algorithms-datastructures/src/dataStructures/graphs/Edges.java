package dataStructures.graphs;

public class Edges<T> {
  private Double weight;
  private Vertex<T> start;
  private Vertex<T> end;

  public Edges(Double weight, Vertex<T> start, Vertex<T> end) {
    this.weight = weight;
    this.start = start;
    this.end = end;
  }

  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public Vertex<T> getStart() {
    return start;
  }

  public void setStart(Vertex<T> start) {
    this.start = start;
  }

  public Vertex<T> getEnd() {
    return end;
  }

  public void setEnd(Vertex<T> end) {
    this.end = end;
  }
}
