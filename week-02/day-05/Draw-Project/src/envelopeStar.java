import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class envelopeStar {


  public static void mainDraw(Graphics graphics) {
    envelopeStar(graphics);
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

  public static void envelopeStar(Graphics graphics) {

    int division = 2;
    int screen = WIDTH / division;
    int distance = 5;
    graphics.drawRect(0, 0, 400, 400);

    for (int n = 0; n < division; n++) {
      //for (int k = 0; k < division; k++) {
      graphics.setColor(new Color(41, 191, 185));
      for (int i = 0; i < screen / distance; i++) {
        graphics.drawLine(
                0 + screen,
                (distance * i + screen) * -n,
                distance * i + screen,
                (screen + screen) * -n);
      }
      graphics.setColor(new Color(144, 142, 219));
      for (int j = 0; j < screen / distance; j++) {
        graphics.drawLine(
                distance * j + screen,
                0 + screen,
                screen + screen,
                distance * j + screen);
      }
      graphics.setColor(new Color(180, 62, 191));
      for (int i = 0; i < screen / distance; i++) {
        graphics.drawLine(
                0 + screen,
                distance * i + screen,
                distance * i + screen,
                screen + screen);
      }
      graphics.setColor(new Color(35, 17, 127));
      for (int j = 0; j < screen / distance; j++) {
        graphics.drawLine(
                distance * j + screen,
                0 + screen,
                screen + screen,
                distance * j + screen);
      }
    }
  }
}