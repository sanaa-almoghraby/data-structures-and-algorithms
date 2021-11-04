package hashtable;

import java.util.ArrayList;
import java.util.Objects;

public class HashTable <K,V>{
  public ArrayList<HashNode<K, V>> bucketArray;
  private int numBuckets;
  public int size;
  public HashTable() {
    bucketArray = new ArrayList<>();
    numBuckets = 10;
    size = 0;

    for (int index = 0; index < numBuckets; index++) {
      bucketArray.add(null);
    }
  }
  private int hashCode(K key) {
    return Objects.hashCode(key);
  }

  private int getBucketIndex(K key) {
    int hashCode = hashCode(key);
    int index = hashCode % numBuckets;
    index = index < 0 ? index * -1 : index;
    return index;
  }


  public void add(K key, V value) {

    int bucketIndex = getBucketIndex(key);
    int hashCode = hashCode(key);

    HashNode<K, V> head = bucketArray.get(bucketIndex);
    while (head != null) {
      if (head.key.equals(key) && head.hashCode == hashCode) {
        head.value = value;
        return;
      }
      head = head.next;
    }


    size++;
    head = bucketArray.get(bucketIndex);
    HashNode<K, V> newNode = new HashNode<>(key, value, hashCode);
    newNode.next = head;
    bucketArray.set(bucketIndex, newNode);

    if ((1.0 * size) / numBuckets >= 0.7) {
      ArrayList<HashNode<K, V>> temp = bucketArray;
      bucketArray = new ArrayList<>();
      numBuckets = 2 * numBuckets;
      size = 0;

      for (int index = 0; index < numBuckets; index++) {
        bucketArray.add(null);
      }

      for (HashNode<K, V> headNode : temp) {
        while (headNode != null) {
          add(headNode.key, headNode.value);
          headNode = headNode.next;
        }
      }
    }
  }

  public V get(K key) {
    int bucketIndex = getBucketIndex(key);
    int hashCode = hashCode(key);

    HashNode<K, V> head = bucketArray.get(bucketIndex);

    while (head != null) {
      if (head.key.equals(key) && head.hashCode == hashCode) {
        return head.value;
      }
      head = head.next;
    }
    return null;
  }
  public int hash(K key) {
    int idx = 0;
    char[] charArr = key.toString().toCharArray();
    for (int oneChar : charArr) {
      idx += oneChar;
    }
    return idx % bucketArray.toArray().length;
  }

  public boolean contains(K key) {
    int index = hash(key);
    if (bucketArray.get(index) == null) return false;
    if (key == bucketArray.get(index).key) return true;
    HashNode<K, V> current = bucketArray.get(index);
    while (current != null) {
      if (key == current.key) return true;
      current = current.next;
    }
    return false;
  }
}
