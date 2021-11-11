package Graph;

import java.util.*;

public class Graph<T> {

  public Map< Node<T> , List<Node<T>>> nodeList= new HashMap<>();

  public Graph() {}

  public Node<T> addNode(T value) {
    Node<T> newNode = new Node<T>(value);
    nodeList.put(newNode, new ArrayList<>());
    return newNode;
  }

  public void addEdge(T value1, T value2) {
    Node<T> varNode1 = new Node<T>(value1);
    Node<T> varNode2 = new Node<T>(value2);
      nodeList.get(varNode1).add(varNode2);
      nodeList.get(varNode2).add(varNode1);

  }

  public Set<Node<T>> getNodes() {
    return nodeList.keySet();
  }

  public List<Node<T>> getNeighbors(T value) {
    return nodeList.get(new Node<T>(value));
  }

  public int size() {
    return nodeList.size();
  }

  @Override
  public String toString() {
    if (nodeList.isEmpty()) return null;
    return "" + nodeList;
  }
}
