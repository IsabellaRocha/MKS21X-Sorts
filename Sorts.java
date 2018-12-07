import java.util.Arrays;
public class Sorts {
  public static void selectionSort(int[] ary) {
    for (int idx = 0; idx < ary.length; idx++) {
      int place = idx; //Tells you where to replace the original value
      int og = ary[idx]; //Saves the original value for use later
      int small = ary[idx]; //Sets the value for you to use and change to the smallest value
      for (int x = idx; x < ary.length; x++) {
        if (ary[x] < small) {
          small = ary[x]; //Set small to new smallest value
          place = x; //Change place to current index because that's where you're going to move the original value to
        }
      }
      ary[idx] = small;
      ary[place] = og; //Swaps places
    }
  }
  public static void bubbleSort(int[] ary) {
    for (int size = ary.length; size > 0; size --) {
      for (int idx = 1; idx < size; idx++) {
        if (ary[idx - 1] > ary[idx]) {
          int value1 = ary[idx - 1];
          int value2 = ary[idx];
          ary[idx - 1] = value2;
          ary[idx] = value1;
        }
      }
      System.out.println(Arrays.toString(ary));
    }
  }
}
