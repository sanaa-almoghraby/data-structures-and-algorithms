package Graph;

import java.util.Objects;

public class Node<T> {

  public T value;

  public Node() {}

  public Node(T value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "" + value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Node<T> node = (Node<T>) o;
    return Objects.equals(value, node.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

}
