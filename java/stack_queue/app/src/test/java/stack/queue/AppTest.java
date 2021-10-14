/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.queue;


import org.junit.jupiter.api.Test;
import stack.queue.stack_queue.StackQueueBrackets;
import stack.queue.stack_queue.pseudoQueue;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
  @Test
  void pseudoQueueTest() {


    pseudoQueue testqueue = new pseudoQueue();

    testqueue.enQueue("ssss");
    testqueue.enQueue("nnnn");


    assertEquals("ssss", testqueue.deQueue());


  }

  @Test
  public void testStackQueueBrackets(){
    StackQueueBrackets data2=new StackQueueBrackets();
    assertFalse(data2.stackQueueBrackets("[({}]"),"false");
    assertTrue(data2.stackQueueBrackets("()[]"),"true");

  }
}
