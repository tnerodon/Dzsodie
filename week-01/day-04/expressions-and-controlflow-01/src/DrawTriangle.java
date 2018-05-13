import java.util.Scanner;

public class DrawTriangle {
    // Write a program that reads a number from the standard input, then draws a
    // triangle like this:
    //
    // *
    // **
    // ***
    // ****
    //
    // The triangle should have as many lines as the number was
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, give me a number!");
        int lineNum = scanner.nextInt();
        for (int i = 1; i <= lineNum; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}