package linkedlist.structure;

import linkedlist.data.LinkedListNode;

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


  public String stringOutput() {
    String output = "";
    if (head == null) {
      return "List is empty";
    } else {
      LinkedListNode current;
      current = head;

      while (current != null) {

        output += "{" + current.getData() + "}" + " -> ";
        current = current.getNext();
      }

      return "HEAD ->" + output + "NULL";
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
    while (current.getNext() != null) {
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

  //  public void merge(LinkedList q,LinkedList list2) {
//    LinkedListNode p_curr = head, q_curr = q.head;
//    LinkedListNode p_next, q_next;
//    // While there are available positions in p;
//    while (p_curr != null && q_curr != null) {
//      // Save next pointers
//      p_next = p_curr.getNext();
//      q_next = q_curr.getNext();
//      // make q_curr as next of p_curr
//      q_curr.setNext(p_next);
//      ; // change next pointer of q_curr
//      p_curr.setNext(q_curr);
//      // change next pointer of p_curr
//      // update current pointers for next iteration
//      p_curr = p_next;
//      q_curr = q_next;
//    }
//    q.head = q_curr;
//  }
  public LinkedListNode merge(LinkedList list1, LinkedList list2) {
    if (list1.head == null) {
      return list2.head;
    } else if (list2.head == null) {
      return list1.head;
    } else {
      LinkedListNode current1 = list1.head;
      LinkedListNode current2 = list2.head;
      LinkedListNode list1Next, list2Next;
      while (current1 != null && current2 != null) {
        list1Next = current1.getNext();
        list2Next = current2.getNext();
        current2.setNext(list1Next);
        current1.setNext(current2);
        current1 = list1Next;
        current2 = list2Next;
      }
      return list1.head;
    }
  }

  public LinkedList reverse(LinkedList list) {
    if (list.head == null) return null;
    int count = 0;
    LinkedListNode current = list.head;
    while (current != null) {
      count += 1;
      current = current.next;
    }
    String newArr[] = new String[count];
    current = list.head;
    for (int i = 0; i < count; i++) {
      newArr[i] = current.getData();
      current = current.next;
    }
    LinkedList newLinkedList = new LinkedList();
    for (int i = newArr.length - 1; i >= 0; i--) {
      newLinkedList.append(newArr[i]);
    }
    return newLinkedList;
  }


//  public static LinkedList zipLists(LinkedList list1, LinkedList list2) throws Exception {
//    if (list1.listSize == 0 && list2.listSize == 0) {
//      throw new Exception("You can't zip two empty lists");
//    } else if (list1.listSize == 0)
//      return list2;
//    else if (list2.listSize == 0)
//      return list1;
//    else {
//      LinkedListNode current = list1.head;
//      LinkedListNode current2 = list2.head;
//      int length1 = list1.listSize;
//      int length2 = list2.listSize;
//      int index = 0;
//
//      while (current.getNext() != null) {
//        list1.insertAfter(index, current2.getData());
//        if (current2.getNext() == null)
//          break;
//        else {
//          current2 = current2.getNext();
//          current = current.getNext().getNext();
//          index += 2;
//        }
//      }
//
//      if (length2 >= length1)
//        while (current2 != null) {
//          list1.append(current2.getData());
//          current2 = current2.getNext();
//        }
//
//      return list1;
//    }
//  }
//


}

