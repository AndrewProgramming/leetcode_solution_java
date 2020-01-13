package linkedlist;

/**
 * Definition for singly-linked list. class ListNode { int val; ListNode next; ListNode(int x) { val
 * = x; next = null; } }
 */
public class Leetcode141 {

  public boolean hasCycle(ListNode head) {
    if (head == null || head.next == null) {
      return false;
    }
    ListNode slow = head;
    ListNode fast = head.next;
    while (slow != fast) {
      if (fast == null || fast.next == null) {//key line
        return false;
      }
      slow = slow.next;
      fast = fast.next.next;

    }
    return true;
  }
}
/**
 * 执行用时 : 0 ms , 在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗 : 38.1 MB , 在所有 Java 提交中击败了 94.20% 的用户
 */