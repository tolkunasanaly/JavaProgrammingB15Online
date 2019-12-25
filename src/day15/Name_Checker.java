package day15;
import java.util.Scanner;
public class Name_Checker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String myName=scan.next();

        //declare a variable to store your name
        //check whether your name length is less than 4
        //if so print short name
          // if it is within 4-11
           //if so print medium name
           //if it's more than 11
             //print longer name
        int lengthOfTheName = myName.length();
        System.out.println("length Of The Name = " + lengthOfTheName);

        if(lengthOfTheName<4){
            System.out.println("Short name");
        }else if(lengthOfTheName>=4 && myName.length()<=11){
            System.out.println("Medium Name");
        }else if(lengthOfTheName>11){
            System.out.println("Longer name");
        }
        //check whether your name has either character a or e
        //if so --->>>name contains a or e
        //if not  -->>>i dont have a or e in my name
        if(myName.contains("a") || myName.contains("e")){
            System.out.println("My name contains a or e");
        }else{
            System.out.println("I don't have a or e in My name");
        }
    }
}
