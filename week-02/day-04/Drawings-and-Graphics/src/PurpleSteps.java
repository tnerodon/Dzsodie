import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
  public static void mainDraw(Graphics graphics) {
    int squares = 16;
    int x = 10;
    int y = 10;
    int size = 10;
    graphics.setColor(new Color(120,130,180));
    for (int i = 0; i < squares; i++) {
      drawPurpleRect(graphics, size, x, y);
      x += size;
      y += size;
    }

  }

  public static void drawPurpleRect(Graphics graphics, int size, int x, int y) {

    graphics.fillRect(x,y,size,size);


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
