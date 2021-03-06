/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import org.w3c.dom.Node;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
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

//===========================================================================
      BinaryTree<Integer> newTree4 = new BinaryTree<>();
      newTree4.add(44);
      newTree4.add(4);
      newTree4.add(5);
      newTree4.add(63);
      newTree4.add(22);
      System.out.println(BinaryTree.breadthFirst(newTree4));
      //=================================================================

//      BinaryTree<Integer> newTree5 = new BinaryTree<>();
//      newTree5.add(10);
//      newTree5.add(20);
//      newTree5.add(5);
//      newTree5.add(8);
//      newTree5.add(6);
//      System.out.println(BinaryTree.getSumOdd(newTree5));

//      BinaryNode<Integer> node4 = new BinaryNode(7);
//      BinaryNode<Integer> node5 = new BinaryNode(8);
//      BinaryNode<Integer> node6 = new BinaryNode(11);
//      BinaryNode<Integer> node2 = new BinaryNode(2, node4, node5);
//      BinaryNode<Integer> node3 = new BinaryNode(12, node6, null);
//      BinaryNode<Integer> root = new BinaryNode(10, node2, node3);
//      BinaryTree binaryTree = new BinaryTree();
//
//      System.out.println(BinaryTree.countOdd_rek(root));
      //====================================================================

      kTree ktree = new kTree();
      NodeK root = new NodeK("4");
      NodeK node1 = new NodeK("15");
      NodeK node2 = new NodeK("16");
      NodeK node3 = new NodeK("65");
      NodeK node4 = new NodeK("5");
      NodeK node5 = new NodeK("1");
      NodeK node6 = new NodeK("50");

      ktree.root = root;
      root.children.add(node1);
      root.children.add(node2);
      node1.children.add(node3);
      node1.children.add(node4);
      node1.children.add(node5);
      node2.children.add(node6);
      System.out.println(ktree.fizzBuzz(root));
    }

}
