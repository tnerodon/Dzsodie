public class FizzBuzz {
    // Write a program that prints the numbers from 1 to 100.
    // But for multiples of three print “Fizz” instead of the number
    // and for the multiples of five print “Buzz”.
    // For numbers which are multiples of both three and five print “FizzBuzz”.
    public static void main(String[] args) {
       for (int line=1; line<101; line++){
                if (((line % 3) == 0) && ((line % 5) == 0)){
                System.out.println("FizzBuzz");
                }
                else if ((line % 3) == 0) {
                System.out.println("Fizz");
                }
                else if ((line % 5) == 0){
                System.out.println("Buzz");
                }
                else System.out.println(line);
        }
    }
}
