/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedlist;


import linkedlist.structure.LinkedList;


public class Main {

  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    LinkedList linkedList = new LinkedList();

    linkedList.insert("S");
    linkedList.insert("A");
    linkedList.insert("N");
    linkedList.insert("C");
    linkedList.insert("Q");
    LinkedList linkedList2 = new LinkedList();


    linkedList2.insert("K");
    linkedList2.insert("D");
    linkedList2.insert("O");
    linkedList2.insert("B");
    linkedList2.insert("Z");


//    linkedList.append("O");
//    linkedList.insertBefore("N","L");
//    linkedList.insertAfter("N","W");
//
    linkedList.stringOutput();
    linkedList2.stringOutput();


//    linkedList.merge(linkedList,linkedList2);
    System.out.println(linkedList.stringOutput());

//    String sss=linkedList.kthFromEnd(0);
//    System.out.println(sss);

    System.out.println(linkedList2.stringOutput());
    list.head = list.merge(linkedList, linkedList2);
    System.out.println("List for Zip function ==> ");
    System.out.println(list.stringOutput());
    System.out.println("  " + linkedList.includes("A") + "  ");

    System.out.println(list.reverse(linkedList).stringOutput());

//    stackDemo();
//    queueDemo();
  }
//  private static void stackDemo() {
//    Stack stackData = new Stack();
//
//    stackData.push("S");
//    stackData.push("A");
//    stackData.push("N");
//    stackData.push("A");
//    stackData.push("A");
//
//    System.out.println("The top of the stackData is => " + stackData.peek());
//
//    System.out.println(stackData.pop());
//
//    System.out.println("The top of the stackData is => " + stackData.peek());
//
//    System.out.println(stackData.pop());
//    System.out.println(stackData.pop());
//    System.out.println(stackData.pop());
//    System.out.println(stackData.pop());
//    System.out.println(stackData.pop()); // stackData empty
//  }
//
//  private static void queueDemo() {
//    Queue queueData = new Queue();
//
//    queueData.enqueue("S");
//    queueData.enqueue("A");
//    queueData.enqueue("N");
//    queueData.enqueue("A");
//    queueData.enqueue("A");
//
//    System.out.println(queueData.dequeue());
//    System.out.println(queueData.dequeue());
//    System.out.println(queueData.dequeue());
//    System.out.println("The front of the Queue is => " + queueData.peek());
//    System.out.println(queueData.dequeue());
//    System.out.println(queueData.dequeue());
//    System.out.println(queueData.dequeue()); // prints the queueData is empty
//  }
}

