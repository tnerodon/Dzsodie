import java.util.Scanner;

public class CountFromTo {
    // Create a program that asks for two numbers
    // If the second number is not bigger than the first one it should print:
    // "The second number should be bigger"
    //
    // If it is bigger it should count from the first number to the second by one
    //
    // example:
    //
    // first number: 3, second number: 6, should print:
    //
    // 3
    // 4
    // 5
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me two numbers!");
        int inputNumOne = scanner.nextInt();
        int inputNumTwo = scanner.nextInt();
        if (inputNumTwo <= inputNumOne){
            System.out.println("The second number should be bigger");
        }
        for (int i = inputNumOne; i <= inputNumTwo; i++) {
            System.out.println(i);
        }

        }
    }

