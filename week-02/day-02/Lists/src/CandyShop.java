import java.util.ArrayList;

public class CandyShop {

    public static void main(String... args) {
      ArrayList<Object> arrayList = new ArrayList<Object>();
      arrayList.add("Cupcake");
      arrayList.add(2);
      arrayList.add("Brownie");
      arrayList.add(false);

      System.out.println(sweets(arrayList));

    }

    public static String sweets(ArrayList inputArrayList) {

      inputArrayList.set(1, "Croissant");
      inputArrayList.set(3, "Ice cream");

      return inputArrayList.toString();
    }

  }
