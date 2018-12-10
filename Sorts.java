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
  //    System.out.println(Arrays.toString(ary));
    }
  }
  public static void bubbleSort(int[] ary) {
    for (int size = ary.length; size > 0; size --) { //Changes the size after going through an entire row so you don't have to go all the way to the end every time
      for (int idx = 1; idx < size; idx++) {
        if (ary[idx - 1] > ary[idx]) { //Compares the two adjacent values
          int value1 = ary[idx - 1];
          int value2 = ary[idx];
          ary[idx - 1] = value2;
          ary[idx] = value1; //Swaps places
        }
      }
//      System.out.println(Arrays.toString(ary)); //Prints after it completes each complete pass to see if it works
    }
  }
  public static void insertionSort(int[] ary) {
    int current;
    int curIdx;
    for (int idx = 1; idx < ary.length; idx++) {
      current = ary[idx]; // Storing value for later to move
      curIdx = idx - 1;
      while (curIdx >= 0 && ary[curIdx] > current) {
        ary[curIdx + 1] = ary[curIdx]; // Shifting values over
        curIdx--;
        }
        ary[curIdx + 1] = current;
    //    System.out.println(Arrays.toString(ary));
      }
    }
  }
