public class Driver2 {
  public static String printArray(int[] arr) {
    String output = "[";
    for (int idx = 0; idx < arr.length; idx ++) {
      output += arr[idx];
      if (idx < arr.length - 1) {
        output += ", ";
      }
    }
    output += "]";
    return output;
  }
  public static void main(String[] args) {
    int[] ary = {1,7,43,7,56,3,8,25345,8};
    int[] ary2 = {234762837, 23454, 345, 17, 853533535, -123};
    int[] ary3 = {1,7,43,7,56,3,8,25345,8};
    int[] ary4 = {234762837, 23454, 345, 17, 853533535, -123};
    System.out.println(printArray(ary3));
    Sorts.insertionSort(ary3);
    System.out.println(printArray(ary4));
    Sorts.insertionSort(ary4);
  }
}
