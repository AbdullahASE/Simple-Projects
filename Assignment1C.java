import java.util.Scanner;


public class Assignment1C {

    public static void main(String[] args)

    {


        Scanner scan = new Scanner(System.in);

        System.out.println("How far your donations goes ");

        System.out.print("How many cans of soups? ");
        int cans_of_soups = scan.nextInt();
        System.out.print("How many bags of rice? ");
        int bags_of_rice = scan.nextInt();
        System.out.print("How many cans of vegetables? ");
        int can_of_vegetables = scan.nextInt();
        System.out.print("How many cans of peanut butter? ");
        int cans_of_peanut = scan.nextInt();

        //System.out.println(2*cans_of_soups);
        float soup_result = 2*cans_of_soups;
        //System.out.println(4*bags_of_rice);
        float rice_result = 4*bags_of_rice;
        //System.out.println(3.5*can_of_vegetables);
        float vegetables_result = 3.5f*can_of_vegetables;
        //System.out.println(7*cans_of_peanut);
        float peanut_result = (7*cans_of_peanut);

        System.out.println("Your donation will help feed " + (soup_result + rice_result + vegetables_result + peanut_result) + " people!");
        System.out.println(soup_result + " people with the " + cans_of_soups + " can(s) of soup.");
        System.out.println(rice_result + " people with the " + bags_of_rice + " can(s) of rice ");
        System.out.println(vegetables_result + " people with the " + can_of_vegetables + " can(s) of vegetables");
        System.out.println(peanut_result + "people with the " + cans_of_peanut + " can(s) of peanut butter");


    }
}
