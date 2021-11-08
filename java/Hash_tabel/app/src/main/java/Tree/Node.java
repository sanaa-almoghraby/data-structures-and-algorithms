package Tree;

public class Node<V> {
  public String key;
  public V value;
  public Node next;
  public Node leftChild;
  public Node rightChild;

  public Node(String key, V value) {
    this.key = key;
    this.value = value;
  }

  public Node() {}

  public Node(V value) {
    this.value = value;
  }

  public Node(V value, Node leftChild, Node rightChild) {
    this.value = value;
    this.leftChild = leftChild;
    this.rightChild = rightChild;
  }
}
