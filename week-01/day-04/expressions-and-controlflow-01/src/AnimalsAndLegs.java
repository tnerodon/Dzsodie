import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number of chickens on your farm!");
        int chick = scanner.nextInt();
        System.out.println("Type the number of pigs on your farm!");
        int pigs= scanner.nextInt();
        int legs = (chick * 2) + (pigs * 4);
        System.out.println("The animals of your farm have " + legs + "legs all together.");



    }
}