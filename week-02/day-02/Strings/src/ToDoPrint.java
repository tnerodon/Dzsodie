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
    todo.add (0, " - Download games\n");
    todo.add (1, "      - Diablo");
    todoText = todoText + todo.get(0) + todo.get(1);
    System.out.println(todoText);
  }
}
