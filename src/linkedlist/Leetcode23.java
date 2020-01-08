package linkedlist;

public class Leetcode23 {


  public ListNode mergeKLists(ListNode[] lists) {

    if (lists == null || lists.length == 0) {
      return null;
    }
    int left = 0;
    int right = lists.length - 1;
    while (right > 0) {
      while (left < right) {
        lists[left] = mergeTwoSortedList(lists[left], lists[right]);
        left++;
        right--;
      }
      left = 0;
    }
    return lists[0];

  }


  public ListNode mergeTwoSortedList(ListNode l1, ListNode l2) {
    ListNode l3 = new ListNode(-1);
    ListNode dummyHead = l3;

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

    return dummyHead.next;
  }
}


