import java.util.Scanner;

public class Lab4A {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        System.out.print("Enter the score of your exam: ");
        double score = Scan.nextDouble();

        if (score >97 && score <=100){
            System.out.println("Letter grade is: A+");
        }
        else if (score >94 && score <=97){
            System.out.println("Letter grade is: A");
        }
        else if (score>91 && score <=94){
            System.out.println("Letter grade is: A-");
        }
        else if (score >88 && score <=91){
            System.out.println("Letter grade is: B+");
        }
        else if (score >85 && score <=88){
            System.out.println("Letter grade is: B");
        }
        else if (score >82 && score <=85){
            System.out.println("Letter grade is: B-");
        }
        else if (score >79 && score <=82){
            System.out.println("Letter grade is: C+");
        }
        else if (score >76 && score <=79){
            System.out.println("Letter grade is: C");
        }
        else if (score >73 && score <=76){
            System.out.println("Letter grade is: C-");
        }
        else if (score >70 && score <=73){
            System.out.println("Letter grade is: D+");
        }
        else if (score >67 && score <=70){
            System.out.println("Letter grade is: D");
        }
        else if (score >64 && score <=67){
            System.out.println("Letter grade is: D-");
        }
        else if (score >=0 && score <=64){
            System.out.println("Letter grade is: F");
        }
    }
}
