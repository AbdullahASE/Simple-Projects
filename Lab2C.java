import java.util.Scanner;

public class Lab2C {


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a width: ");
        int width = scan.nextInt();
        System.out.print("Enter a height: ");
        int height = scan.nextInt();
        int area = (height*width);
        int perimeter = 2*(height+width);
        System.out.println ("The area is " + area );
        System.out.print("The perimeter is " + perimeter );





    }
}
