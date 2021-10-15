package stack.queue.stack_queue;

import stack.queue.Node_data.Node;


public class Stack<T> {
  private Node<T> top;
  private int size;

  public Stack() {
  }

  public void push(T data) {
    if (isEmpty()) {
      top= new Node(data);
    } else {
      Node<T> node = new Node(data);
      node.setNext(top);
      top = node;
    }
    size++;
  }

  public T pop() {
    if (isEmpty()) {
      return null;
    } else {
      T data = top.getData();
      top = top.getNext();
      size--;
      return data;
    }

  }

  public T peek() {
    if (isEmpty()) {
      return null;
    } else {
      return top.getData();
    }
  }

  public boolean isEmpty() {
    return top == null;
  }

  public Node getTop() {
    return top;
  }

  public int getSize() {
    return size;
  }
}
