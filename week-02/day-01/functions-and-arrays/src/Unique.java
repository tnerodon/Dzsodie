import java.util.Arrays;

public class Unique {
  public static void main(String[] args) {
      //  Create a function that takes a list of numbers as a parameter
      //  Returns a list of numbers where every number in the list occurs only once

      //  Example
     // System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
      //  should print: `[1, 11, 34, 52, 61]`
    int[] uniqueList = {1, 7, 90, 14, 23, 77, 7, 90};
   int[] sortList = sortArray(uniqueList);

   uniqueList = sortList;

   System.out.println(Arrays.toString(uniqueList));

  }

  private static int[] sortArray(int[] uniqueList) {
    sortList = 0;
    for (int i = 0; i < uniqueList.length - 1; i++) {
      int j = i;
      if (uniqueList[i] == uniqueList[i + 1]) {
        sortList[j] = uniquelist[i];
      }
      else {
        sortList[j] = uniqueList[i];
      }
    }
    return sortList;
  }


  }