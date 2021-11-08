package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TreeIntersection {
  public static ArrayList treeIntersection(BinaryTree tree1, BinaryTree tree2) {
    if (tree1.root == null || tree2.root == null) return null;
    Map<String,String> storeMap = new HashMap();
    ArrayList<Object> arr = new ArrayList<>();
    for (Object oneItem : tree1.preOrder(tree1.root)) {
      storeMap.put(oneItem.toString(), null);
    }
    for (Object oneItem: tree2.preOrder(tree2.root)) {
      if (storeMap.containsKey(oneItem.toString()) && !arr.contains(oneItem)) arr.add(oneItem);
    }
    return arr;
  }
}
