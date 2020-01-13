import java.util.Arrays;

public class Utils {

  public static void main(String[] args) {
    /**
     * Parameters
     * src - Source array (Object type)
     *
     * srcPos - Starting position in Source array (Integer type)
     *
     * dest - Destination array (Object Type)
     *
     * destpos - Starting position in destination array (Integer type)
     *
     * length - Number of elements to be copied (Integer type)
     */
    int[] arr = {1, 2, 3, 4, 5};

    int[] copied = new int[10];
    System.arraycopy(arr, 0, copied, 1, 5);//5 is the length to copy

    System.out.println(Arrays.toString(copied));

    int[] a = new int[5];
    a[8] = 1;
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }

//
//    int[] copied = Arrays.copyOf(arr, 10); //10 the the length of the new array
//    System.out.println(Arrays.toString(copied));
//
//    copied = Arrays.copyOf(arr, 3);
//    System.out.println(Arrays.toString(copied));
  }
}
