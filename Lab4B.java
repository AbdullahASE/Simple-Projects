import java.util.Scanner;

public class Lab4B {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the day: ");
        String day = scan.nextLine();

        switch (day.toLowerCase())  {
            case"monday":
                System.out.println("I have class today!");
            break;
            case"tuesday":
                System.out.println("I should use this time to do my homework.");
            break;
            case "wednesday":
                System.out.println("I have class today!");
            break;
            case "thursday":
                System.out.println("I should use this time to do my homework.");
            break;
            case "friday":
                System.out.println("It's Friday! Friday! Gotta get down on Friday!");
            break;
            case "saturday":
                System.out.println("I should use this time to do my homework.");
            break;
            case "sunday":
                System.out.println("I should use this time to do my homework.");
            break;


        }
    }
}
