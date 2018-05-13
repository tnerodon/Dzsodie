import java.util.Scanner;

public class PartyIndicator {
    // Write a program that asks for two numbers
    // Thw first number represents the number of girls that comes to a party, the
    // second the boys
    // It should print: The party is exellent!
    // If the the number of girls and boys are equal and there are more people coming than 20
    //
    // It should print: Quite cool party!
    // It there are more than 20 people coming but the girl - boy ratio is not 1-1
    //
    // It should print: Average party...
    // If there are less people coming than 20
    //
    // It should print: Sausage party
    // If no girls are coming, regardless the count of the people

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me the number of girls coming to the party!");
        int girls = scanner.nextInt();

        System.out.println("Please give me the number of boys coming to the party!");
        int boys = scanner.nextInt();

        int attendantNumber = (girls + boys);
        int ratio = (girls - boys);

        if (attendantNumber < 20)
            System.out.println("Average party...");

        if (attendantNumber > 20)
            System.out.println("The party is excellent!");


        if ((ratio <= 0) & (attendantNumber > 20))
            System.out.println("Quite cool party!");

        if (girls <= 0)
            System.out.println("Sausage party");
    }
}
