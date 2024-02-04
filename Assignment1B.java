import java.sql.SQLOutput;
import java.util.Scanner;


public class Assignment1B {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("First color");
        System.out.print("R: ");
        int R = scan.nextInt();
        System.out.print("G: ");
        int G = scan.nextInt();
        System.out.print("B: ");
        int B = scan.nextInt();

        System.out.println(" Second color");
        System.out.print("R: ");
        int R2 = scan.nextInt();
        System.out.print("G: ");
        int G2 = scan.nextInt();
        System.out.print("B: ");
        int B2 = scan.nextInt();

        double First_color = (R2-R)*(R2-R);
        double Second_color = (G2-G)*(G2-G);
        double Third_color = (B2-B)*(B2-B);
        double Result = Math.sqrt(First_color + Second_color + Third_color);
        System.out.println("Color Distance: " + Result);



    }

}
