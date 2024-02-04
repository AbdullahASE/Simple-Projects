import java.util.Scanner;

public class Lab3C {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        System.out.print("Enter the number of quarters: ");
        int quarters = Scan.nextInt();
        System.out.print("Enter the number of dimes: ");
        int dimes = Scan.nextInt();
        System.out.print("Enter the number of nickels: ");
        int nickels = Scan.nextInt();
        System.out.print("Enter the number of pennies: ");
        int pennies = Scan.nextInt();

        System.out.println("You entered " + quarters + " quarters.");
        System.out.println("You entered " + dimes + " dimes.");
        System.out.println("You entered " + nickels + " nickels.");
        System.out.println("You entered " + pennies + " pennies.");

        quarters *= 25;
        dimes *= 10;
        nickels *= 5;
        pennies *= 1;

        int totalAmount = (quarters + dimes + nickels + pennies);
        int totalCents = totalAmount%100;
        int totalDollars = totalAmount/100;

        System.out.println("Your total is " +  totalDollars + " dollars and " + totalCents + " cents.");

    }
}
