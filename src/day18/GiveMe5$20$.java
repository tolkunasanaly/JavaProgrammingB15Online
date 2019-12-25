package day18;
import java.util.Scanner;
public class GiveMe5$20$ {
    public static void main(String[] args) {

        //keep asking for $5 or $20 until you get them
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me 5 or 20");

        int x =scan.nextInt();

        //if the bill not $5 and not $20
        //or negate the result of it's 5 or 20
           // !(x == 5 || x == 20)
       // while (x!=5 && x!=20) {
        while (!(x == 5 || x == 20) ) {

            System.out.println("Not the bill I am looking for");
            System.out.println("PLease, Give me 5 or 20");
            x=scan.nextInt();
        }
        System.out.println("The Happy Ending!! Got the Money");

    }
}
