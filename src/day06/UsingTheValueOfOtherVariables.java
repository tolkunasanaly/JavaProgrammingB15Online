package day06;
import java.util.Scanner;
public class UsingTheValueOfOtherVariables {
    public static void main(String[] args) {

//        int myFavoriteNumber =300;
//
//        int yourFavoriteNumber = myFavoriteNumber;
//
//
//
//        System.out.println("My favorite number " + myFavoriteNumber);
//        System.out.println("Your favorite number " + yourFavoriteNumber);
//
//        yourFavoriteNumber =100;
//        System.out.println("My favorite number " + myFavoriteNumber);
//        System.out.println("Your favorite number " + yourFavoriteNumber);

        //create a variable called yourOrder, type String and assign a value
        //create another variable called myOrder and assign the value
        //to same value as youOrder by copying
        //and just print them out
        Scanner scan = new Scanner(System.in);

        System.out.println("Your order: ");
        String youOrder = scan.nextLine();

        String myOrder = youOrder;



        System.out.println("Your order is: " +youOrder + ". \n My order is " + myOrder + " too.");

    }
}
