import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {
  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 2 parameters:
    // the x and y coordinates of the square's top left corner
    // and draws a 50x50 square from that point.
    // draw 3 squares with that function.
    // avoid code duplication.
    int squares = 3;

    for (int i = 0; i < squares; i++) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please give me the x coordinate of the square!");
      int x = scanner.nextInt();
      System.out.println("Please give me the y coordinate of the square!");
      int y = scanner.nextInt();
      int a = ((int) (Math.random()*256));
      int g = ((int) (Math.random()*256));
      int b = ((int) (Math.random()*256));
      graphics.setColor(new Color(a, g, b));
      graphics.drawRect(x, y, 50, 50);


    }



  }

  //    Don't touch the code below
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}
