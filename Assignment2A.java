import java.util.Scanner;

public class Assignment2A {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number you want to find a multiple of: ");
        int number1 = scan.nextInt();
        System.out.print("Enter a second number: ");
        int number2 = scan.nextInt();
        System.out.println("Calculating...");
        int calc = number2 - number2 % number1;
        System.out.println("The nearest multiple of " + number1 + " from " + number2 + " is " + calc +"!");

    }
}
