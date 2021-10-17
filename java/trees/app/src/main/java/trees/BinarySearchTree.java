package trees;

public class BinarySearchTree<T extends Comparable<T>> {

  private BinaryNode<T> root;

  public BinaryNode<T> getRoot() {
    return root;
  }

  public void setRoot(BinaryNode<T> root) {
    this.root = root;
  }

  public void add(T data) {
    if (isEmpty()) {
      root = new BinaryNode<>(data);
    } else {
      addHelper(data, root);
    }
  }

  private void addHelper(T data, BinaryNode<T> root) {
    BinaryNode<T> newNode = new BinaryNode<>(data);
    if (data.compareTo(root.getData()) < 0) {
      if (root.getLeftNode() == null) {
        root.setLeftNode(newNode);
      } else {
        addHelper(data, root.getLeftNode());

      }
    } else if(data.compareTo(root.getData()) > 0) {
      if (root.getRightNode() == null) {
        root.setRightNode(newNode);
      } else {
        addHelper(data, root.getRightNode());
      }
    }
  }



  public boolean contains(T item)
  {
    BinaryNode<T> node = root;
    return containsHelp(node , item);
  }

  private boolean containsHelp(BinaryNode<T> node, T item)
  {

    if(node == null) return false;
    if (node.getData() == item)
    {
      return true;
    }
    else
    {
      if (item.compareTo(node.getData()) > 0)
      {
        //root = node.Left;
        return(containsHelp(node.getRightNode(), item));
      }
      else
      {
        if (item.compareTo(node.getData()) < 0)
        {
          return(containsHelp(node.getLeftNode(), item));
        }
        else
        {
          return false;
        }
      }
    }
  }

  public boolean isEmpty() {
    return root == null;
  }
//==================================================================================
public Integer findMaxValue() {

  return maxValue(root);
}

  private Integer maxValue(BinaryNode<T> node ) {

    if(node.getRightNode() != null) {
      return maxValue(node.getRightNode());
    }
    return (Integer) node.getData();
  }
}
