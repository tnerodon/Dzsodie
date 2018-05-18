import javax.swing.*;
import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBox {
  public static void mainDraw(Graphics graphics) {
    // Create a square drawing function that takes 2 parameters:
    // The square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares.



    int size = 10;
    String color = "red";
    int posX = (320-size)/2;
    int posY = (320-size)/2;
    graphics.drawRect(posX, posY, size, size);

    for (int i = 0; i < WIDTH/size; i++) {
      size = (int) (Math.random() * 100);
       color = ((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
      drawSquare(graphics, size, color);
    }

  }

  public static void drawSquare(Graphics graphics, int size, int[] color) {

    int posX = (int)(Math.random()*(320-size)/2);
    int posY = (int)(Math.random()*(320-size)/2);
    graphics.setColor(new Color(color[0], color[1], color[2]));
    graphics.drawRect(posX, posY, size, size);


  }
    graphics.setColor(new Color);
    graphics.fillRect(posX, posY, size, size);
    for (int i = 0; i < size; i++) {
      graphics.setColor (new Color();
      graphics.fillRect((1+size), (1+size), WIDTH-size*2, HEIGHT-size*2);
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
