package linkedlist;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode(int
 * x) { val = x; } }
 */
public class Leetcode19 {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummyHead = new ListNode(0);
    dummyHead.next = head;

    ListNode start = dummyHead;
    ListNode end = dummyHead;

    while (n != 0) {
      start = start.next;
      n--;
    }

    while (start.next != null) {
      start = start.next;
      end = end.next;
    }

    end.next = end.next.next;
    return dummyHead.next;

  }
}

class ListNode {

  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
  }
}
