import java.util.Scanner;

public class Factorial {
  //  Create the usual class wrapper
  //  and main method on your own.

  // - Create a function called `factorio`
  //   that returns it's input's factorial
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please give me the number to tell the factorial!");
    int num = scanner.nextInt();
    num = factorial(num);
    System.out.println("The factorial of the given number is: " + num);

  }

  private static int factorial(int num) {
    if (num == 1) {
      return 1;
    }
      else{
        return num * factorial(num-1);
    }

  }
}
