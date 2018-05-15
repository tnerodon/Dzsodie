import java.util.Scanner;

public class PrintArguments {
  //  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printParams`
//   which prints the input String parameters
// - It can have any number of parameters

  public static void main(String[] args) {

    String animalOne = "saska, ";
    String animalTwo = "szocske, ";
    String animalThree = "bolha, ";
    String animalFour = "csotany, ";
    String animalFive = "pok";

    printParams(animalOne, animalTwo, animalThree, animalFour, animalFive);

  }

  public static void printParams(String... params) {

    for (String param : params) {
      System.out.print(param);
    }

  }



}