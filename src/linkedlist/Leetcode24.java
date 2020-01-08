package linkedlist;

public class Leetcode24 {

  public ListNode swapPairs(ListNode head) {
    ListNode pre = new ListNode(-1);
    pre.next = head;
    ListNode dummyHead = pre;

    while (pre.next != null && pre.next.next != null) {
      ListNode node1 = pre.next;
      ListNode node2 = node1.next;
      ListNode lat = node2.next;

      pre.next = node2;
      node2.next = node1;
      node1.next =lat;

      pre = node1;

    }

    return dummyHead.next;
  }

}

/*
执行用时 :
0 ms
, 在所有 Java 提交中击败了
100.00%
的用户
内存消耗 :
34.4 MB
, 在所有 Java 提交中击败了
83.44%
的用户
 */