package Tree;

import java.util.ArrayList;

public class BinaryTree <V>{

  public ArrayList<V> preOrderList = new ArrayList<>();
  public Node<V> root;

  public BinaryTree() {}

  public BinaryTree(Node<V> root) {
    this.root = root;
  }

  public ArrayList<V> preOrder(Node<V> root) {
    try {
      preOrderList.add(root.value);
      if (root.leftChild != null) preOrder(root.leftChild);
      if (root.rightChild != null) preOrder(root.rightChild);
    } catch (NullPointerException exception) {
      System.out.println(exception.getMessage());
    }
    return preOrderList;
  }

  @Override
  public String toString() {
    if (preOrderList.isEmpty()) return "Empty List";
    return "preOrderList=" + preOrderList;
  }
}
