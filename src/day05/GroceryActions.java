package day05;
import java.util.Scanner;

public class GroceryActions {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the price for potato?");
        double potatoPrice = scan.nextDouble();
        System.out.println("How many kg of potato you want to buy?");
        int potatoCount = scan.nextInt();
        System.out.println("Your total for potato is " + (potatoPrice*potatoCount));

        System.out.println("What is the price for tomato?");
        double tomatoPrice = scan.nextDouble();
        System.out.println("How many kg of tomato you want to buy?");
        int tomatoCount = scan.nextInt();
        System.out.println("Your total for tomato is " + (tomatoPrice*tomatoCount));

        System.out.println("What is the price of banana per kg?");
        double bananaPrice = scan.nextDouble();
        System.out.println("How many kg of banana you want to buy?");
        int bananaCount = scan.nextInt();
        System.out.println("Your total for banana is " + (bananaPrice*bananaCount));
        /*Task 5 : Grocery Shopping
    *   ask user whats the price of tomato and store it
        ask user how many tomato you want to buy and store it
    *   ask user whats the price of potato and store it
        ask user how many potato you want to buy and store it
    *   ask user whats the price of banana and store it
        ask user how many banana you want to buy and store it

        generate this example output
        You got 3 tomato price is 2.99 and total -->>
                You got 5 potato price is 3.49 and total -->>
                You got 2 banana price is 1.99 and total -->>

                Your grand total for this shopping is ????  */

    }
}
