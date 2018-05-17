import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Horizontal {

  public static void mainDraw(Graphics graphics) {
    // Create a line drawing function that takes 2 parameters:
    // The x and y coordinates of the line's starting point
    // and draws a 50 long horizontal line from that point.
    // Draw 3 lines with that function. Use loop for that.

    Scanner scanner = new Scanner(System.in);
    int a = 3;
    for (int i = 0; i < a; i++) {
      System.out.println("Please, give me the X coordinate from 320 to 343!");
      int x = scanner.nextInt();
      System.out.println("Please, give me the Y coordinate from 320 to 343!");
      int y = scanner.nextInt();
      graphics.setColor(Color.BLUE);
      graphics.drawLine(x, y, x + 50, y);
    }
  }


  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}

