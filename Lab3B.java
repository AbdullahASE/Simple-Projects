import java.util.Scanner;

public class Lab3B {

    public static void main(String[] args) {


        Scanner Scan = new Scanner(System.in);


        System.out.print("Course 1 hours: ");
        float course1 = Scan.nextFloat();
        System.out.print("Grade for course 1: " );
        float grade1 = Scan.nextFloat();
        System.out.print("Course 2 hours: ");
        float course2 = Scan.nextFloat();
        System.out.print("Grade for course 2: " );
        float grade2 = Scan.nextFloat();
        System.out.print("Course 3 hours: ");
        float course3 = Scan.nextFloat();
        System.out.print("Grade for course 3: ");
        float grade3 = Scan.nextFloat();
        System.out.print("Course 4 hours: ");
        float course4 = Scan.nextFloat();
        System.out.print("Grade for course 4:");
        float grade4 = Scan.nextFloat();
        float totalHours = (course1 + course2 + course3 + course4);
        System.out.println("Total hours is: " + totalHours);
        float totalPoints = ((grade1*course1) + (grade2*course2) + (grade3*course3) + (grade4*course4));
        System.out.println("Total quality points is: " + totalPoints);
        System.out.println ("Your GPA for this semester is " +(totalPoints/totalHours));


    }
}
