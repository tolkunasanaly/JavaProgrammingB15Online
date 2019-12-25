package day06;
import java.util.Scanner;
public class ScannerCapturingSentence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //System.out.println("What is your name?");
        //nextLine method of Scanner is used to capture whole sentence

        //String name = scan.nextLine();
        //System.out.println("You have entered " + name);

        //Task 4
        //use nextLine to ask your bio
        //whats your name
        //which city you live in, including state
        //what is your street address

        System.out.println("What is your full name?");
        String name = scan.nextLine();
        System.out.println("You have entered " + name);


        System.out.println("In what city you live, including your state?");
        String cityState = scan.nextLine();
        System.out.println("You have entered " + cityState);


        System.out.println("What is your address?");
        String address = scan.nextLine();
        System.out.println("You have entered " + address);

        System.out.println("Your name is " + name + ". Your city and State "
                + cityState + ". Your address is " + address +".");


    }
}
