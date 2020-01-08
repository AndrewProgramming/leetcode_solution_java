package linkedlist;

public class Leetcode206 {

  /**
   * https://blog.csdn.net/qq_17550379/article/details/80647926
   * @param head
   * @return
   */
  public ListNode reverseList(ListNode head) {

    ListNode pre = null;
    ListNode cur = head;

    while (cur != null) {
      ListNode lat = cur.next;
      cur.next = pre;
      pre = cur;
      cur = lat;
    }
    return pre;

  }
}
/**
 * 执行用时 :
 * 0 ms
 * , 在所有 Java 提交中击败了
 * 100.00%
 * 的用户
 * 内存消耗 :
 * 37.3 MB
 * , 在所有 Java 提交中击败了
 * 25.03%
 * 的用户
 */
