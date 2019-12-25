package day06;
import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // + - * /   %

        System.out.println(5/2);
        System.out.println(5.0/2);
        System.out.println(5.0/2f);

        //5 divided by 2 is 2 and remainder is 1
        //2*2 + 1= 5

        System.out.println(5%2);
        System.out.println(99%10);

        System.out.println(100%10);

        //declare a variable called minutes data type int
        //print the result in x hour y minute format
        //for example 135 minutes, 2 hours 15 minutes

        System.out.println("Please enter the minutes you want to convert?");
        int minutes = scan.nextInt();

        int timeInHours=minutes/60;
        int timeInMinutes=minutes % 60;

        System.out.println("You entered " + minutes + " minutes.  It is " + timeInHours + " hours and "
                + timeInMinutes + " minutes.");


    }
}
