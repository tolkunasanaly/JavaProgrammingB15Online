package day18;
import java.util.Scanner;
public class SmartLockOpener {

    public static void main(String[] args) {

        //smart lock door has password
        //unless you enter correct password
        //it keeps locking you out
        //assuming correct password is B15
        //keep asking until user enter correct one

        Scanner scan =new Scanner(System.in);

        System.out.println("Knock Knock");
        System.out.println("What is the Password?");

        //Entering password for the first time
        String password = scan.next();

        while (! password.equals("B15")){
            // while (! password.equalsIgnoreCase("B15"))

            System.out.println("Wrong password!!! Try again!!");
            password=scan.next();
        }
        System.out.println("Open Sesame!!!");

    }

}
