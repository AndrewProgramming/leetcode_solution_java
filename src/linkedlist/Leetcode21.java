package linkedlist;

public class Leetcode21 {

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode l3 = new ListNode(0);
    ListNode preHead = l3;
    while (l1 != null && l2 != null) {
      ListNode newNode = null;
      if (l1.val > l2.val) {
        newNode = new ListNode(l2.val);
        l2 = l2.next;
      } else {
        newNode = new ListNode(l1.val);
        l1 = l1.next;
      }
      l3.next = newNode;
      l3 = l3.next;
    }

    if (l1 == null) {
      l3.next = l2;
    }
    if (l2 == null) {
      l3.next = l1;
    }

    return preHead.next;
  }
}

//class ListNode {
//
//  int val;
//  ListNode next;
//
//  ListNode(int x) {
//    val = x;
//  }
//}

/**
 * 执行用时 : 1 ms , 在所有 Java 提交中击败了 82.46% 的用户 内存消耗 : 39 MB , 在所有 Java 提交中击败了 69.83% 的用户
 */