import java.util.Scanner;

public class AvarageOfInput {
    // Write a program that asks for 5 integers in a row,
    // then it should print the sum and the average of these numbers like:
    //
    // Sum: 22, Average: 4.4
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me five numbers and I will tell their sum and avarage.");
        System.out.println("How many months in a year?");
        int firstNumber = scanner.nextInt();
        System.out.println("How many days in a week?");
        int secondNumber = scanner.nextInt();
        System.out.println("What is your favorite number?");
        int thirdNumber = scanner.nextInt();
        System.out.println("How many letters are in the alphabet?");
        int fourthNumber = scanner.nextInt();
        System.out.println("How many legs does a normal dog have?");
        int fifthNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
        float average = sum / 5;
        System.out.println("Sum: " + sum + ", Average: " + average);

    }
}
