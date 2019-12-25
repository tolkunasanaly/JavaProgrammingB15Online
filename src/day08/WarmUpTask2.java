package day08;
import java.util.Scanner;
public class WarmUpTask2 {
    public static void main(String[] args) {
        // TASK 2
        //Create  a program to guess your favorite number
        // Create a variable called myFavoriteNumber as int
        //ask user to guess your favorite number
        //if user guessed right then print Bingo!
        //if not print try again later
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your favorite number?");
        int myFavoriteNumber = scan.nextInt();

        if(myFavoriteNumber == 38){
            System.out.println("Bingo!");
        }
        else
        {
            System.out.println("Try again later");
        }

    }

}
