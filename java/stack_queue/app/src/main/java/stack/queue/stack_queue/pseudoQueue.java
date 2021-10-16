package stack.queue.stack_queue;
import stack.queue.Node_data.Node;

//import stack.queue.Node_data.Node;


public class pseudoQueue<T>{

  private Stack<T> stack1 = new Stack();
  private Stack<T> stack2 = new Stack();
  private Node head;


  public void enQueue(T data){

    stack1.push(data);
  }

  public T deQueue() {
    while(stack1.getTop() != null){
      stack2.push(stack1.pop());
    }
    T value = stack2.pop();
    while(stack2.getTop() != null){
      stack1.push(stack2.pop());
    }
    return value;
  }
//  public String stringOutput() {
////    Node head=new Node(data);
//    String output = "";
//    if (head == null) {
//      return "List is empty";
//    } else {
//      Node current;
//      current = head;
//
//      while (current != null) {
//
//        output += "{" + current.getData() + "}" + " -> ";
//        current = current.getNext();
//      }
//
//      return "HEAD -> " + output + "NULL";
//    }
//  }

  public String printData() {
    StringBuilder queueStr = new StringBuilder();
    if(!stack1.isEmpty()){
      Node current = stack1.getTop();
      while(current != null){
        queueStr.append(current.getData());
        if(current.getNext() != null)
          queueStr.append(" <- ");
        current = current.getNext();
      }
    }
    return queueStr.toString();
  }
}
