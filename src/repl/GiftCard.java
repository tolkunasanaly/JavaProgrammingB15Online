package repl;
import java.util.*;
public class GiftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String items= scan.next();


        if (items.equalsIgnoreCase("Smartphone")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if (items.equalsIgnoreCase("Laptop")){
           System.out.println("Sorry, not enough funds on your gift card!");
        }else if(items.equalsIgnoreCase("Charger")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-15));
        }else if(items.equalsIgnoreCase("USB cable")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-10));
        }else if(items.equalsIgnoreCase("Headphones")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-30));
        }else if(items.equalsIgnoreCase("Pants")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-50));
        }else if(items.equalsIgnoreCase("Hat")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-25));
        }else if(items.equalsIgnoreCase("Socks")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-5));
        }else if(items.equalsIgnoreCase("Blanket")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-60));
        }else if(items.equalsIgnoreCase("Pillow")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-40));

        }else{
            System.out.println("Invalid item!");
        }
    }
}
