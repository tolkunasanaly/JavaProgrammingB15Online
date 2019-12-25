package officehour;
import java.util.Scanner;
public class Practice_12_04 {
    public static void main(String[] args) {


        //HOMEWORK
        //CREATE AN INTERACTIVE PROGRAM TO ASK USER
        //STARTING CHARACTER AND ENDING CHARACTER
        //THEN PRINT EVERYTHING IN BETWEEN
        //IT COULD BE STARTING CHARACTER IS AFTER ENDING CHARACTER
        //FOR EXAMPLE USER CAN ENTER Z A, OR A K
        //Can we ask user to enter a character? NO!!!!
        //Ask user for String and pick first character by charAt(0)

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1st word with single character to start with");
        String first = scan.next();
        char firstAsChar = first.charAt(0);


        System.out.println("Enter 2nd word with single character to end with");
        String second = scan.next();
        char secondAsChar = second.charAt(0);

        //user enter A for first part
        //user enter C for second part
        //expected result should be A B C

        for (char iChar = firstAsChar; iChar <= secondAsChar; iChar++){
            System.out.print(iChar+ " ");
        }

        //WHAT IF WE DON'T WANT TO INCLUDE USERS STARTING POINT???
//        for (char iChar = (char)(firstAsChar+1); iChar < secondAsChar; iChar++){
//            System.out.print(iChar+ " ");
//        }


        //user enter D for first part
        //user enter A for second part
        //expected result should be D C B A




    }
}
