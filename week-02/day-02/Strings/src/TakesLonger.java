import java.util.Arrays;

public class TakesLonger {
  public static void main(String[] args){
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    // When saving this quote a disk error has occured. Please fix it.
    // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
    // Using pieces of the quote variable (instead of just redefining the string)

    String missingPart = "It always takes longer than";
    String[] pieceOne = quote.split("It");
    quote = pieceOne[0] + missingPart + pieceOne[1];


    System.out.println(quote);
  }
}