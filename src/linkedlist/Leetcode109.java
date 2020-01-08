package linkedlist;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode(int
 * x) { val = x; } }
 */

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode(int x) { val = x; } }
 */
public class Leetcode109 {

  public TreeNode sortedListToBST(ListNode head) {
    if (head == null) {
      return null;
    }

    ListNode mid = findMiddleElement(head);

    TreeNode treeNode = new TreeNode(mid.val);

    if (mid == head) {
      return treeNode;
    }

    treeNode.left = this.sortedListToBST(head);
    treeNode.right = this.sortedListToBST(mid.next);

    return treeNode;

  }


  private ListNode findMiddleElement(ListNode head) {

    // The pointer used to disconnect the left half from the mid node.
    ListNode prevPtr = null;
    ListNode slowPtr = head;
    ListNode fastPtr = head;

    // Iterate until fastPr doesn't reach the end of the linked list.
    while (fastPtr != null && fastPtr.next != null) {
      prevPtr = slowPtr;
      slowPtr = slowPtr.next;
      fastPtr = fastPtr.next.next;
    }

    // Handling the case when slowPtr was equal to head.
    if (prevPtr != null) {
      prevPtr.next = null;
    }

    return slowPtr;
  }
}

class TreeNode {

  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
}
/**
 * 执行用时 : 1 ms , 在所有 Java 提交中击败了 99.94% 的用户
 * 内存消耗 : 39.1 MB , 在所有 Java 提交中击败了 97.64% 的用户
 */