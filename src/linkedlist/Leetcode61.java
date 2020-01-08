package linkedlist;

public class Leetcode61 {

  public static void main(String[] args) {
    Leetcode61 ins = new Leetcode61();
    int a[] = {1, 2, 3, 4, 5};

    ListNode pre = new ListNode(-1);
    ListNode dummyHead = pre;

    for (int i = 0; i < a.length; i++) {
      ListNode node = new ListNode(a[i]);
      pre.next = node;
      pre = pre.next;
    }
    ins.rotateRight(dummyHead.next, 2);
  }

  public ListNode rotateRight(ListNode head, int k) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode dummyHead = head;
    ListNode cur = head;
    int listLength = 1;
    while (cur.next != null) {
      cur = cur.next;
      listLength++;
    }
    cur.next = dummyHead;
    //到此为止完成了环的构建

    int step = listLength - k%listLength;
    while (step-- > 0) {
      head = head.next;
    }

    dummyHead = head;
    while (head.next != dummyHead) {
      head = head.next;
    }
    head.next = null;

    return dummyHead;

  }
}
/**
 * 执行用时 :1 ms, 在所有 Java 提交中击败了99.97%的用户
 * 内存消耗 :37.5 MB, 在所有 Java 提交中击败了70.66%的用户
 */

