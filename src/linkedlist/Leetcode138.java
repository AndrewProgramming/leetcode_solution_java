package linkedlist;

import java.util.HashMap;
import java.util.Map;

public class Leetcode138 {

  public Node copyRandomList(Node head) {
    if (head == null) {
      return head;
    }
    // map方法，空间复杂度O(n)
    Node node = head;
    // 使用hash表存储旧结点和新结点的映射
    Map<Node, Node> map = new HashMap<>();
    while (node != null) {
      Node clone = new Node(node.val, null, null);
      map.put(node, clone);
      node = node.next;
    }
    node = head;
    while (node != null) {
      map.get(node).next = map.get(node.next);
      map.get(node).random = map.get(node.random);
      node = node.next;
    }
    return map.get(head);
  }
}


class Node {

  int val;
  Node next;
  Node random;

  public Node(int val, Node next, Node random) {
    this.val = val;
    this.next = null;
    this.random = null;
  }
}
/**
 * 执行用时 : 1 ms , 在所有 Java 提交中击败了 89.12% 的用户 内存消耗 : 39.8 MB , 在所有 Java 提交中击败了 5.18% 的用户
 */