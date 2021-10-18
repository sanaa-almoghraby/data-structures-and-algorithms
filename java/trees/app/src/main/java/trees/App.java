/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());


      BinaryTree<Integer> newTrees = new BinaryTree<>();
      newTrees.add(30);
      newTrees.add(10);
      newTrees.add(40);
      newTrees.add(5);
      newTrees.add(30);


      BinaryTree<String> newTree2 = new BinaryTree<>();
      newTree2.add("S");
      newTree2.add("A");
      newTree2.add("N");
      newTree2.add("A");
      newTree2.add("O");
      newTree2.add("M");


//        System.out.println("Inorder traversal");
//        binarySearchTree.inorderTraversal();

      System.out.println("Inorder");
      System.out.println(newTree2.inorder());

      System.out.println("\nPreorder");
      System.out.println(newTree2.preOrder());

      System.out.println("\nPostorder");

      System.out.println(newTree2.postOrde());

      System.out.println(newTree2.contains("B"));

      System.out.println(newTrees.contains(90));
      //====================================================================
      System.out.println("****************************************************************");
      BinaryTree<String> newTree3 = new BinaryTree<>();
      newTree3.add(10);
      newTree3.add(20);
      newTree3.add(100);
      newTree3.add(8);
      newTree3.add(6);

      System.out.println("-------------------");
      System.out.println("Max value: "+newTree3.findMaxValue());



    }
}