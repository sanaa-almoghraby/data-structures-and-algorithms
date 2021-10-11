package stack.queue.stack_queue;

import stack.queue.Node_data.Node;

public class Queue {


  private Node front;
  private Node back;

  public void enQueue(String data) {
    if (isEmpty()) {
      Node node = new Node(data);
      front = node;
      back = node;
    } else {
      Node node = new Node(data);
      back.setNext(node);
      back = node;
    }
  }

  public String deQueue() {
    if (isEmpty()) {
      return "empty";
    } else {
      String data = front.getData();
      front = front.getNext();
      return data;
    }
  }

  public String peek() {
    return front.getData();
  }

  public boolean isEmpty() {
    return front == null;
  }


}
