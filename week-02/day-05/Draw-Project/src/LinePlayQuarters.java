import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {

  public static void mainDraw(Graphics graphics) {
    linePlay4(graphics);
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

  public static void linePlay4(Graphics graphics) {

    int division = 4;
    int screen = WIDTH / division;
    int distance = 5;
    graphics.drawRect(0, 0, 400, 400);

    for (int n = 0; n < division; n++) {
      for (int k = 0; k < division; k++) {
        graphics.setColor(new Color(144, 191, 113));
        for (int i = 0; i < screen / distance; i++) {
          graphics.drawLine(
                  0 + screen * n,
                  distance * i + screen * k,
                  distance * i + screen * n,
                  screen + screen * k);
        }
        graphics.setColor(new Color(52, 94, 127));
        for (int j = 0; j < screen / distance; j++) {
          graphics.drawLine(
                  distance * j + screen * n,
                  0 + screen * k,
                  screen + screen * n,
                  distance * j + screen * k);
        }
      }
    }
  }
}