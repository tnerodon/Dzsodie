import java.util.Scanner;

public class DrawPyramid {
    // Write a program that reads a number from the standard input, then draws a
    // pyramid like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //
    // The pyramid should have as many lines as the number was

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, give me the number of the levels of the pyramid!");
        int level = scanner.nextInt();

        for (int i = 0; i < level; i++) {
            for (int j = 0; j < level-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}

