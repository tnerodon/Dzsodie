import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {
  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.
    // avoid code duplication.
    int shape = 4;
    for (int i = 0; i < shape; i++) {

      int a = ((int) (Math.random()*256));
      int g = ((int) (Math.random()*256));
      int b = ((int) (Math.random()*256));
      int x = ((int) (Math.random()*320));
      int y = ((int) (Math.random()*320));
      int x2 = ((int) (Math.random()*320));
      int y2 = ((int) (Math.random()*320));
      graphics.setColor(new Color(a, g, b));
      graphics.drawRect(x, y, x2, y2);

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
