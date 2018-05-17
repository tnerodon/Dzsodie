import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredBoxes {
  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 1 parameter:
    // the square size
    // and draws a square of that size to the center of the canvas.
    // draw 3 squares with that function.
    // avoid code duplication.

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please give me the size of the square!");
    int size = scanner.nextInt();
    graphics.setColor(Color.BLUE);
    graphics.drawRect(((320-size)/2), ((320-size)/2), size, size);

    int squares = 3;

    for (int i = 0; i < squares; i++) {
      int x = ((int) (Math.random()*(320-size)));
      int y = ((int) (Math.random()*(320-size)));
      graphics.setColor(Color.RED);
      graphics.drawRect(x, y, size, size);
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
