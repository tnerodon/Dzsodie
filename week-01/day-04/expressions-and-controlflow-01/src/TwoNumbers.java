public class TwoNumbers {
    public static void main(String[] args) {
        // Create a program that prints a few operations on two numbers: 22 and 13
        int a = 22;
        int b = 13;

        // Print the result of 13 added to 22
        int result1 = a + b;
        System.out.println(result1);

        // Print the result of 13 substracted from 22
        int result2 = a - b;
        System.out.println(result2);

        // Print the result of 22 multiplied by 13
        int result3 = a * b;
        System.out.println(result3);

        // Print the result of 22 divided by 13 (as a decimal fraction)
        float result4 = a % b;
        System.out.println(result4);

        // Print the integer part of 22 divided by 13
        int result5 = a / b;
        System.out.println(result5);

        // Print the reminder of 22 divided by 13
        int result6 = a - (b * result5);
        System.out.println(result6);

    }
}
