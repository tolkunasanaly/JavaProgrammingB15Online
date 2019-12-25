package day18;

import java.util.Scanner;

public class SmartLock_DoWhile_Version {
    public static void main(String[] args) {

        //smart lock door has password
        //unless you enter correct password
        //it keeps locking you out
        //assuming correct password is B15
        //keep asking until user enter correct one

        Scanner scan =new Scanner(System.in);

        System.out.println("Knock Knock");

        String password;

        do{
            System.out.println("What is the Password?");
            password=scan.next();
        }while (!password.equals("B15"));

        System.out.println("DOOR IS OPEN");
    }
}
