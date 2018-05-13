import java.util.Scanner;

public class PrintBigger {
    // Write a program that asks for two numbers and prints the bigger one
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me two numbers!");
        double numberOne = scanner.nextDouble();
        double numberTwo = scanner.nextDouble();
        if (numberOne > numberTwo){
            System.out.println("This is the bigger number: " + numberOne);
        }
        else{
            System.out.println("This is the bigger number: " + numberTwo);
        }



    }
}
