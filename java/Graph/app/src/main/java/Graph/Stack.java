package Graph;

public class Stack<T> {

  private Node<T> top;

  public Node<T> getTop() {
    return top;
  }

  public void setTop(Node<T> top) {
    this.top = top;
  }

  private Node<T> head;

  public Stack() {
  }


  public void push(T data) {
    if (isEmpty()) {
      Node<T> node = new Node<>(data);
      top = node;
    } else {
      Node<T> node = new Node<>(data);
      node.setNext(top);
      top = node;
    }
  }
  public T pop() {
    if (isEmpty()) {
      return (T) "The stack is empty";
    } else {
      T data = top.getValue();
      top = top.getNext();
      return data;
    }
  }
  public T peek() {
    if (isEmpty()) {
      return (T) "The stack is empty";
    } else {
      return top.getValue();
    }
  }
  public boolean isEmpty() {
    return top == null;
  }

  @Override
  public String toString() {
    return "Stack{" +
      "top=" + top +
      ", head=" + head +
      '}';
  }
}
