
public class UrlFixer {
  public static void main(String... args) {
    String url = "https//www.reddit.com/r/nevertellmethebots";

    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crutial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!

    int urlLength = url.length();
    String ending = "odds";
    String beginning = "https";
    String goodFirst = "https:";
    int replaceFirst = beginning.length();
    int word = ending.length();
    int index = urlLength - word;
    String newUrl = url.substring(0, index);
    String goodUrl = newUrl.concat(ending);
    String url2 = goodUrl.substring(replaceFirst);
    String workingUrl = goodFirst.concat(url2);

    System.out.println(workingUrl);
  }
}