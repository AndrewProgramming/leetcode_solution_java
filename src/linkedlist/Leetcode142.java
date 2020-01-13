package linkedlist;

/**
 * Definition for singly-linked list. class ListNode { int val; ListNode next; ListNode(int x) { val
 * = x; next = null; } }
 */
//题解：https://leetcode-cn.com/problems/linked-list-cycle-ii/solution/linked-list-cycle-ii-kuai-man-zhi-zhen-shuang-zhi-/
public class Leetcode142 {

  public ListNode detectCycle(ListNode head) {
    ListNode fast = head, slow = head;
    while (true) {
      if (fast == null || fast.next == null) {
        return null;
      }
      fast = fast.next.next;
      slow = slow.next;
      if (fast == slow) {
        break;
      }
    }
    fast = head;
    while (slow != fast) {
      slow = slow.next;
      fast = fast.next;
    }
    return fast;
  }
}
