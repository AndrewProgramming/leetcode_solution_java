package math;

import java.util.HashSet;
import java.util.Set;

/**
 * 首先定义一个Set集合，用来存放计算后的平方和m，如果m在Set中已存在，即进入了死循环，则退出； 如果m不存在Set，则将m放入Set； 直至找到平方和为1或者进入死循环就退出。
 */
public class Leetcode202 {

  public boolean isHappy(int n) {
    Set<Integer> set = new HashSet<>();
    int m = 0;
    while (true) {
      while (n != 0) {
        m += Math.pow(n % 10, 2);
        n /= 10;
      }
      if (m == 1) {
        return true;
      }
      if (set.contains(m)) {
        return false;
      } else {
        set.add(m);
        n = m;
        m = 0;
      }
    }


  }
}
