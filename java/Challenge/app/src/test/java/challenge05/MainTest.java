/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge05;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import linkedlist.structure.LinkedList;
import queue.Queue;
import stack.Stack;

class MainTest {
  //    @Test void appHasAGreeting() {
//        Main classUnderTest = new Main();
//        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
  @Test
  void testJoin() {
    LinkedList fun = new LinkedList();

    LinkedList linkedList1 = new LinkedList();
    linkedList1.insert("S");
    linkedList1.insert("A");
    linkedList1.insert("N");
    linkedList1.insert("A");
    linkedList1.insert("A");

    LinkedList linkedList2 = new LinkedList();

    linkedList2.insert("K");
    linkedList2.insert("D");
    linkedList2.insert("O");
    linkedList2.insert("B");
    linkedList2.insert("Z");
    fun.head = fun.merge(linkedList1, linkedList2);
    assertEquals("HEAD ->{S} -> {K} -> {A} -> {D} -> {N} -> {O} -> {A} -> {B} -> {A} -> {Z} -> NULL", fun.stringOutput());
  }

  @Test
  public void insertData() {
    LinkedList list = new LinkedList();
    list.insert("sanaa");
    assertTrue(list.includes("sanaa"), "The method should return true");
  }
  @Test
  public void first() {
    LinkedList list = new LinkedList();
    list.insert("A");
    list.insert("B");
    list.insert("C");
    assertEquals("A", list.head.getData(), "The method should return 'C'");
  }
  @Test
  public void printList() {
    LinkedList list = new LinkedList();
    list.insert("S");
    list.insert("o");
    list.insert("s");
    list.insert("o");
    assertEquals("HEAD -> {S} -> {o} -> {s} -> {o} -> NULL", list.stringOutput(), "");
  }
  @Test
  public void addAtEnd() {
    LinkedList list = new LinkedList();
    list.append("S");
    list.append("A");

    assertEquals("HEAD -> {S} -> {A} -> NULL", list.stringOutput(), "Method should insert at the end of the liked list");
  }

  @Test
  public void insertBefore() {
    LinkedList list = new LinkedList();
    list.append("s");
    list.append("a");
    list.append("n");
list.insertBefore("a","w");
    assertEquals("HEAD -> {s} -> {w} -> {a} -> {n} -> NULL",list.stringOutput(), "Method should insert 'W' before 'Y'");
    System.out.println(list);
  }

  @Test
  public void insertAfter() {
    LinkedList list = new LinkedList();
    list.append("s");
    list.append("a");
    list.append("n");
    list.insertAfter("a", "w");
    assertEquals("HEAD -> {s} -> {a} -> {w} -> {n} -> NULL",list.stringOutput(), "Method should insert 'W' after 'Y'");
    System.out.println(list);
  }

  @Test
  public void testkthFromEnd() {
    LinkedList list = new LinkedList();
    list.append("s");
    list.append("a");
    list.append("n");

    assertEquals("{s}", list.kthFromEnd(2), "return first element in the list");
  }



  @Test
  void stackTest() {

    Stack stack = new Stack();
    assertTrue(stack.isEmpty());
    assertEquals(" stack is empty", stack.pop());

    stack.push("sanaa");
    stack.push("good");


    assertEquals("good", stack.peek());
    assertFalse(stack.isEmpty());

    assertEquals("good",stack.pop());
    assertEquals("sanaa", stack.peek());

  }
  @Test
  void queueTest() {

    Queue queue = new Queue();
    assertTrue(queue.isEmpty());
    assertEquals("Queue is empty", queue.dequeue());

    queue.enqueue("sanaa");
    queue.enqueue("good");


    assertEquals("sanaa", queue.peek());
    assertFalse(queue.isEmpty());

    assertEquals("sanaa",queue.dequeue());
    assertEquals("good", queue.peek());


  }


}
