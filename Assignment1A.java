import java.util.Scanner;


public class Assignment1A {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Scheme: ");
        String scheme = scan.nextLine();
        System.out.println("Subdomain: ");
        String Subdomain = scan.nextLine();
        System.out.println("Second-level domain: ");
        String second_level_domain = scan.nextLine();
        System.out.println("Top-level domain:");
        String top_level_domain = scan.nextLine();
        System.out.println("Subdirectory: ");
        String subdirectory = scan.nextLine();
        System.out.println("Your URL is ");
        System.out.println(scheme + "://" + Subdomain + "." + second_level_domain + "." + top_level_domain + "/" + subdirectory);



    }
}
