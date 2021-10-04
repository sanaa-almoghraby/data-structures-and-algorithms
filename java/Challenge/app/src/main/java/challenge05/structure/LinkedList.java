package challenge05.structure;

import challenge05.data.LinkedListNode;
import org.w3c.dom.Node;

public class LinkedList {

  public LinkedListNode head;
  int listSize = 0;

  public LinkedList() {
  }

  public void insert(String data) {
    if (head == null) {
      LinkedListNode node = new LinkedListNode(data);
      head = node;
    } else {
      // else traverse the list and get to the end
      // make last node point to the new node
      LinkedListNode current;
      current = head;
      while (current.getNext() != null) {
        // moves the current reference along the list
        current = current.getNext();
      }

      LinkedListNode node = new LinkedListNode(data);
      current.setNext(node);

    }
    listSize++;
  }


  public boolean includes(String val) {

    LinkedListNode current;
    current = head;
    while (current != null) // traversing the list
    {
      if (current.getData() == val) {
        return true;
      }
      current = current.getNext();
    }
    return false;
  }


  public void stringOutput() {

    if (head == null) {
      System.out.println("List is empty");
    } else {
      LinkedListNode current;
      current = head;


      System.out.print("HEAD -> ");

      while (current != null) {

        System.out.print("{" + current.getData() + "}" + " -> ");
        current = current.getNext();
      }

      System.out.println("NULL");
    }
  }

  public void append(String value) {
    LinkedListNode node = new LinkedListNode(value);

    if (head == null)
      head = node;
    else {
      LinkedListNode current = head;
      while (current.getNext() != null) {
        current = current.getNext();
      }
      current.setNext(node);


    }
  }

  public void insertBefore(String value, String newdata) {
    LinkedListNode node = new LinkedListNode(newdata);
    if (head == null) {
      head = node;
      node.setData(newdata);
      listSize++;
    } else if (head.getData() == value) {
      node.setNext(head);
      head = node;
    } else {
      LinkedListNode current = head;
      while (current.getNext() != null) {
        if (current.getNext().getData() == value) {
          node.setNext(current.getNext());
          current.setNext(node);
          listSize++;
          break;
        }
        current = current.getNext();
      }

    }

  }

  public void insertAfter(String value, String newdata) {
    LinkedListNode node = new LinkedListNode(newdata);
    if (head == null) {

    } else if (head.getData() == value) {
      head.setNext(node);
      head = node;

    } else {
      LinkedListNode current = head;
      while (current != null) {
        if (current.getData() == value) {
          node.setNext(current.getNext());
          current.setNext(node);

        }
        current = current.getNext();
      }

    }

  }

  public String kthFromEnd(int k) {
    LinkedListNode current = head;
    int counter = 0;
    while (current.getNext()!= null) {
      current = current.getNext();
      counter++;
    }
    if (k > counter || k < 0) {
      return "Exception";
    } else {
      current = head;
      for (int i = 0; i <= counter - k; i++) {
        if (i == counter - k) {
          return "{" + current.getData() + "}";
        }
        current = current.next;
      }
    }
    return "Exception";
  }


}
