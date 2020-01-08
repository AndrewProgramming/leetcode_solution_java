package linkedlist;

public class Leetcode82 {


  public ListNode deleteDuplicates(ListNode head) {
    if (head == null) {
      return head;
    }

    ListNode dummyHead = new ListNode(-1);
    dummyHead.next = head;

    ListNode pre = dummyHead;

    ListNode cur = head;
    boolean flag = false;

    while (cur != null && cur.next != null) {
      while (cur.next != null && cur.next.val == cur.val) {
        cur = cur.next;
        flag = true;
      }
      if (flag) {
        pre.next = cur.next;
        cur = cur.next;
        flag = false;
      } else {
        cur = cur.next;
        pre = pre.next;
      }
    }

    return dummyHead.next;

  }
}

/**
 * Runtime: 1 ms, faster than 74.24% of Java online submissions for Remove Duplicates from Sorted List II.
 * Memory Usage: 37.3 MB, less than 95.35% of Java online submissions for Remove Duplicates from Sorted List II.
 */
