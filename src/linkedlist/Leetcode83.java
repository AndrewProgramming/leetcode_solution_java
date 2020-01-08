package linkedlist;


/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode(int
 * x) { val = x; } }
 */
public class Leetcode83 {

  public ListNode deleteDuplicates(ListNode head) {
    ListNode dummyHead = new ListNode(-1);
    dummyHead.next = head;

    ListNode pre = dummyHead;

    ListNode cur = head;

    boolean flag = false;
    while (cur != null && cur.next != null) {
      while ((cur != null && cur.next != null) && (cur.val == cur.next.val)) {
        cur = cur.next;
        flag = true;
      }
      if (flag) {
        pre.next = cur;
        flag = false;

      } else {
        pre = pre.next;
        cur = cur.next;
      }

    }

    return dummyHead.next;

  }
}
/**
 * Runtime: 1 ms, faster than 18.98% of Java online submissions for Remove Duplicates from Sorted
 * List. Memory Usage: 37.4 MB, less than 95.24% of Java online submissions for Remove Duplicates
 * from Sorted List.
 */