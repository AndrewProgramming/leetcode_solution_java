import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class Leetcode242 {


  public boolean isAnagram(String s, String t) {
    char[] s1 =s.toCharArray();
    char[] t1 =t.toCharArray();

    Arrays.sort(s1);
    Arrays.sort(t1);

    return Arrays.equals(s1,t1);
  }
}

/*
执行用时 :
7 ms
, 在所有 Java 提交中击败了
40.36%
的用户
内存消耗 :
38 MB
, 在所有 Java 提交中击败了
95.65%
的用户
 */