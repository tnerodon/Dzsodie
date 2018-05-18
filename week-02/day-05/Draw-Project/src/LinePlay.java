import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {

    public static void mainDraw(Graphics graphics) {
      linePlay(graphics);
    }
    // Don't touch the code below
    static int WIDTH = 400;
    static int HEIGHT = 400;
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
    public static void linePlay(Graphics graphics) {
      graphics.setColor(new Color(41, 191, 185));
      for (int i = 0; i < 20; i++) {
        graphics.drawLine(0, 20 * i, 20 * i, 400);
      }
      graphics.setColor(new Color(144, 142, 219));
      for (int j = 0; j < 20; j++) {
        graphics.drawLine(20 * j, 0, 400, 20 * j);
      }
    }
  }