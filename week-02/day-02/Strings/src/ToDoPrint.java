import java.util.ArrayList;

public class ToDoPrint {
  public static void main(String[] args){
    String todoText = " - Buy milk\n";
    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText but with indention
    // Expected outpt:
    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo
    ArrayList todo = new ArrayList();
    todo.add (0, " My todo:\n");
    todo.add (1, " - Download games\n");
    todo.add (2, "      - Diablo");
    System.out.println(todo.get(0) + todoText + todo.get(1) + todo.get(2));
  }
}
