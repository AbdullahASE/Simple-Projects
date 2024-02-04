import java.util.Scanner;

public class Assignment2C {


    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        final float britisP = 0.79f;
        final float bisonDollar = 0.158f;
        System.out.println("Welcome to Bisonica! ");
        System.out.print("How many US Dollars do you have? ");
        int dollar = Scan.nextInt();
        float britishPound = (dollar*britisP);
        System.out.println(dollar + " US Dollar(s) is " + britishPound + " British Pound(s)," );
        System.out.print("which is " + (dollar*bisonDollar) + " Bison Dollar(S)!");

    }
}
