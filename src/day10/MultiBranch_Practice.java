package day10;

import jdk.swing.interop.SwingInterOpUtils;

public class MultiBranch_Practice {

    public static void main(String[] args) {

        //at McDonald Drive thru
        System.out.println("Welcome to McDonald, what can i get for you?");

        /*
        * 11. Burger
        * 5.French Fries
        * 8.Nuggets
        * 35.ICe Cream
        * 55.Coke
        * */
        String order ="";
        int itemNumber =77;

        if(itemNumber ==11){
            System.out.println("You have selected 11");
            order="Burger";
        }else if (itemNumber == 5){
            System.out.println("You have selected 5");
            order="French Fries";
        }else if (itemNumber == 8){
            System.out.println("You have selected 8");
            order="Nugget";
        }else if (itemNumber == 35){
            System.out.println("You have selected 35");
            System.out.println("Ymmyyyyyy!");
            order="Ice Cream";
        }else{
            System.out.println("YOU HAVE SELECTED UNKNOWN ITEM NUMBER!!!");
        }
        System.out.println("Your order is " + order);
    }
}
