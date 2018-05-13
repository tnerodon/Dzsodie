import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        System.out.println("Please give the number of kilometers! ");
        Scanner scanner = new Scanner(System.in);
        int kiloMeter = scanner.nextInt();
        double miles = kiloMeter * 0.621371192;

        System.out.println("The given kilometers are: " + miles + "miles");
    }
}
