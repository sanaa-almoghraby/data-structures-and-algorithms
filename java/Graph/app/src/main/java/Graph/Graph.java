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



  public List<Node<T>> breadthFirst(T value) {

    Node<T> node = new Node(value);
    if (node.value == null) return null;
    List<Node<T>> nodes = new ArrayList<>();
    Queue<T> breadth = new Queue<T>();
    Set<Node<T>> visited = new HashSet<>();

    breadth.enqueue((T) node);
    visited.add(node);

    while (!breadth.isEmpty()) {
      Node<T> front = (Node<T>) breadth.dequeue();
      nodes.add(front);
      for (Node<T> neighbor : getNeighbors(front.value)) {
        if (!visited.contains(neighbor)) {
          visited.add(neighbor);
          breadth.enqueue((T) neighbor);
        }
      }
    }
    return nodes;
  }

  @Override
  public String toString() {
    if (nodeList.isEmpty()) return null;
    return "" + nodeList;
  }
}
