import java.util.Scanner;

public class DivideByZero {
  // Create a function that takes a number
  // divides ten with it,
  // and prints the result.
  // It should print "fail" if the parameter is 0
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, give me a number to divide 10 by that number!");
    int numInput = scanner.nextInt();

    divideByZero(numInput);
  }

  private static void divideByZero(int numInput) {
    try {
    int result = 10 / numInput;
      System.out.println(result);
    }
    catch (ArithmeticException e) {
      System.out.println("fail");
    }

  }

}
