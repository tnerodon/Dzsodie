

public class TicTacToe {
  // Write a function that takes a filename as string,
  // open and read it. The file data represents a tic-tac-toe
  // game result. Return 'X'/'O'/'draw' based on which player
  // has winning situation.
  //System.out.println(ticTacResult("win-o.txt"))
  // should print O
  // System.out.println(ticTacResult("win-x.txt"))
  // should print X
  // System.out.println(ticTacResult("draw.txt"))
  // should print draw

  public static void main(String[] args) {
    String fileName = "win-o.txt";
    if (fileName.equals("win-o.txt")) {
      System.out.println(ticTacResult("win-o.txt"));
    } else if (fileName.equals("win-x.txt")) {
      System.out.println(ticTacResult("win-x.txt"));
    } else if (fileName.equals("draw.txt")) {
      System.out.println(ticTacResult("draw.txt"));
    } else {
      System.out.println("Unable to read file");
    }

  }

  public static void ticTacResult(String fileName) {


  }
}