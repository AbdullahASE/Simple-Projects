import java.util.Scanner;

public class Assignment2B {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the hit box bottom-left X coordinate: ");
        int xCoordinate = scan.nextInt();
        System.out.print("Enter the hit box bottom-left Y coordinate: ");
        int yCoordinate = scan.nextInt();
        System.out.print("Enter the width of the hit box: ");
        int width = scan.nextInt();
        System.out.print("Enter the height of the hit box: ");
        int height = scan.nextInt();
        System.out.println("[Hit Box Coordinates]");
        System.out.println("Bottom-left: " + xCoordinate +", " +  yCoordinate );
        System.out.println("Top-Left: " + xCoordinate + ", " + (yCoordinate + height));
        System.out.println("Bottom-Right: " + (xCoordinate + width) + ", " + yCoordinate);
        System.out.println("Top-Right: " + (xCoordinate +width) + ", " + (yCoordinate +height));

    }
}
