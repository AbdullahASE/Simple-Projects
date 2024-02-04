import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab3A {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.print("Amount owed: $");
        int currentBalance = Scan.nextInt();
        System.out.print("APR: ");
        float apr = Scan.nextFloat();
        float percentageRate = (apr/12);
        System.out.print("Monthly percentage rate: ");
        System.out.printf(" %.3f %n", percentageRate);
        float minimumPayment = (currentBalance*apr/1200);
        System.out.print("Minimum payment: $");
        System.out.printf(" %.2f %n", minimumPayment);

    }
}