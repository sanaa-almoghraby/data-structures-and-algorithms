package stack.queue.queue.stack_queue;

import stack.queue.queue.Node_data.Node;

public class Queue<T> {

  private Node<T> front;
  private Node<T> rear;

  public Queue() {
  }

  public void enqueue(T data) {
    if (isEmpty()) {
      Node<T> node = new Node(data);
      front = node;
      rear = node;
    } else {
      Node<T> node = new Node(data);
      rear.setNext(node);
      rear = node;
    }
  }

  public T dequeue() {
    if (isEmpty()) {
      return null;
    } else {
      T data = front.getData();
      front = front.getNext();
      return data;
    }
  }

  public String peek() {
    return (String) front.getData();
  }

  public boolean isEmpty() {
    return front == null;
  }

  @Override
  public String toString() {
    return "Queue{" +
      "front=" + front +
      ", rear=" + rear +
      '}';
  }
}
