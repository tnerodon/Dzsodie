import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
  // Write a function that copies a file to an other
  // It should take the filenames as parameters
  // It should return a boolean that shows if the copy was successful
  public static void main(String[] args) {
    try {
      Path sourcePath = Paths.get("my-file.txt");
      Path destPath = Paths.get("file.txt");
      Files.copy(sourcePath, destPath);
      System.out.println(true);
    }
    catch (IOException e){
      System.out.println(false);
    }

  }

}
