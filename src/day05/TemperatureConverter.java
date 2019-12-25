package day05;
import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       // System.out.println("What is the temperature in F?");

        //double fahrenheit = scan.nextDouble();
        //double celsius = (5.0 / 9) * (fahrenheit - 32);
         //fahrenheit 80 is 23 in celsius
        //System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in celsius " );


        //Task 3
        System.out.println("How many hours in 1 day?");
        int hours =scan.nextInt();
        int minutes = (24*60);
        System.out.println("In 1 day there are " + hours + " hours ");

        System.out.println("So it means in 1 day there are " + minutes + " minutes ");

        //task 4
        System.out.println("What is your hourly wage?");
        float wagePerHour = scan.nextFloat();
        float yearlySalary = (2080 * wagePerHour);
        System.out.println("Your Annual salary is $" + yearlySalary);





    }
}
