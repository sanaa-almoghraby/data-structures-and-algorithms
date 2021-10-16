package trees;



public class BinaryTree<T extends Comparable<T>> extends BinarySearchTree {

  public String  inorder() {
    if (isEmpty()) {
      return " Empty";
    }

    return traverseInorder(getRoot());
  }

  private String traverseInorder(BinaryNode<T> root) {
     String inOrderData = "";
    if (root.getLeftNode() != null) {
      traverseInorder(root.getLeftNode());
    }

    inOrderData += root.getData() + " -> ";

    if (root.getRightNode() != null) {
      traverseInorder(root.getRightNode());
    }
    return inOrderData;
  }




  public String  preOrder() {
    if (isEmpty()) {
      return "Empty";
    }
    return traversePreOrder(getRoot());
  }

  private String traversePreOrder(BinaryNode<T> root) {
    String preOrderData = "";

    preOrderData += root.getData() + " -> ";
    if (root.getLeftNode() != null) {
      traversePreOrder(root.getLeftNode());
    }
    if (root.getRightNode() != null) {
      traversePreOrder(root.getRightNode());
    }
    return preOrderData;
  }


  public String  postOrde() {
    if (isEmpty()) {
      return " Empty";
    }

    return traversePostOrder(getRoot());
  }

  private String traversePostOrder(BinaryNode<T> root) {
     String postOrderData = "";

    if (root.getLeftNode() != null) {
      traversePostOrder(root.getLeftNode());
    }
    if (root.getRightNode() != null) {
      traversePostOrder(root.getRightNode());

    }
    postOrderData += root.getData() + " -> ";
    return postOrderData;
  }
}
