package day06;
import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Your name is " + name);

        System.out.println("What is your age?");
       // String age = scan.nextLine();
        ///notice wea re not storing this into variable
        // we just want below line to capture ENTER keyboard input
        //so that it does not accidentally get captured by
        //nextLine we use to capture address

        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Your age is " + age);

        System.out.println("What is the address?");
        String address = scan.nextLine();
        System.out.println("Your address is " + address);

    }

}
