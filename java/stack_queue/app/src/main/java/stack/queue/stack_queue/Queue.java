package stack.queue.stack_queue;

import stack.queue.Node_data.Node;

public class Queue<T> {

  private Node<T> front;
  private Node<T> rear;
  private int size;

  public int getSize() {
    return size;
  }

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
    size++;
  }

  public T dequeue() {
    if (isEmpty()) {
      return null;
    } else {
      T data = front.getData();
      front = front.getNext();
      size--;
      return data;
    }
  }

  public Node<T> getFront() {
    return front;
  }

  public void setFront(Node<T> front) {
    this.front = front;
  }

  public String peek() {
    return (String) front.getData();
  }

  public Node<T> getRear() {
    return rear;
  }

  public void setRear(Node<T> rear) {
    this.rear = rear;
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
