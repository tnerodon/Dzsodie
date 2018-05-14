import java.util.Scanner;

public class Summing {
  //  Create the usual class wrapper
  //  and main method on your own.

  // - Write a function called `sum` that sum all the numbers
  //   until the given parameter and returns with an integer

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Pleas give the number to add to the sum of all the previous numbers!");
    int number = scanner.nextInt();
    int sum = addNumbers(number);
    System.out.println(sum);
  }

  public static int addNumbers(int number) {
    int sum = 0;
    for (int i = 0; i < number; i++) {
      sum += number;
      }
    return sum;
  }
}

