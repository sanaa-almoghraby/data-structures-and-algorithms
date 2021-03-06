/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ch26;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
  @Test
  void testsort(){
    Sort sort=new Sort();
    int [] newArr={10,4,23,8,16,79};
    int [] res={4, 8, 10, 16, 23, 79};
    assertEquals(Arrays.toString(res), Arrays.toString(sort.insertionSort(newArr)));
  }
  @Test
  void testMergesort(){
    Mergesort sort=new Mergesort();
    int [] newArr={10,4,23,8,16,79};
    int [] res={4, 8, 10, 16, 23, 79};
    assertEquals(Arrays.toString(res), Arrays.toString(sort.mergeSort(newArr)));
  }
  @Test
  void testQuicksort(){
    Quicksort sort=new Quicksort();
    int [] newArr={10,4,23,8,16,79};
    int [] res={4, 8, 10, 16, 23, 79};
    assertEquals(Arrays.toString(res), Arrays.toString(sort.quickSort(newArr,0, newArr.length-1)));
  }
}
