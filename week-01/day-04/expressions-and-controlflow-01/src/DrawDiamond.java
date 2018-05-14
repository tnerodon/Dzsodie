import java.util.Scanner;

public class DrawDiamond {
    // Write a program that reads a number from the standard input, then draws a
    // diamond like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //  *****
    //   ***
    //    *
    //
    // The diamond should have as many lines as the number was
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, give me a number!");
        int level = scanner.nextInt();
        for (int i = 0; i < level; i++){
            for (int j = 0; j < level-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int j = 0; j > level+i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k >= i; k--) {
                System.out.print("* ");
            }
        }
            System.out.println(" ");
        }

    }
