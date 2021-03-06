package hashtable;

import org.checkerframework.checker.units.qual.K;

public class HashNode<K,V> {

  K key;
  V value;
//  HashNode<K,V> head;

  final int hashCode;

  HashNode<K, V> next;

  public HashNode(K key, V value, int hashCode) {
    this.key = key;
    this.value = value;
    this.hashCode = hashCode;
  }
}
