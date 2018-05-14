public class DoubleItems {
// - Create an array variable named `numList`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array
public static void main(String[] args) {
  int[] numList = {3, 4, 5, 6, 7};
  int[] doubleList = new int[numList.length];
  for (int i = 0; i < numList.length ; i++) {
  doubleList[i] = (numList[i] * 2);
  }
}
}
